/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveur;

import javax.xml.ws.Endpoint;
import service.EtudiantService;

/**
 *
 * @author TCHECHE NJINANG ERIC ROMEO
 */
public class EtudiantSrvr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String url = "http://localhost:8085/";
        
        Endpoint.publish(url, new EtudiantService());
        
        System.err.println(url);
        
    }
}
