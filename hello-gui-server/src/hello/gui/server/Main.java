/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.gui.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author 12059842
 */
public class Main {
    public static void main(String[] args) throws RemoteException {
        
        Registry server = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        
        HelloServer hello = new HelloServer();
        server.rebind("hello", hello);
        
        System.err.println("Successfully, server is running");
        
    }
}
