/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.gui.server;

import helloguiapi.Hello;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author 12059842
 */
public class HelloServer extends UnicastRemoteObject implements Hello{

    public HelloServer() throws RemoteException {
    }

    
    
    
    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello" + name;
    }
    
}
