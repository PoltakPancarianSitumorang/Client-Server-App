/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.gui.client;

import helloguiapi.Hello;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.SwingUtilities;

/**
 *
 * @author 12059842
 */
public class Main {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        
        Registry registry = LocateRegistry.getRegistry("localhost", Registry.REGISTRY_PORT);
        
        Hello hello = (Hello) registry.lookup("hello");
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Form form = new Form (hello);
               form.setVisible(true);
            }
        });
    }
}
