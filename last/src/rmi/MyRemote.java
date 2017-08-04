package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * TODO()
 * Created by zqq on 2017/8/1 0001.
 */
public interface MyRemote extends Remote {
     String sayHello() throws RemoteException;//所有接口中方法要声明该异常
}

class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{//UnicastRemoteObject是创建远程对象最简单的方式

    public MyRemoteImpl() throws RemoteException {
    }

    public String sayHello(){
        return "Server says,'Hey'";
    }

    public static void main(String[] args) {

        try {
            java.rmi.registry.LocateRegistry.createRegistry(9999);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote Hello",service);//注册名称，给客户端查询
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}

class MyRemoteClient{

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go(){
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://192.168.210.240/Remote Hello");//查询结果是Object

            String s = service.sayHello();//如同调用本机方法
            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

