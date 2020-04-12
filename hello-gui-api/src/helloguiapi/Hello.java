/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloguiapi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author 12059842
 */
public interface Hello extends Remote{
    
    String sayHello ( String name) throws RemoteException;
    
}
