package com.med;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        // I create a middleware
        BanqueService stub = new BanqueWS().getBanqueServicePort(); // BanqueWS() c'est le nom du web service
        System.out.println(stub.conversionEuroToDh(23));
        Compte cp = stub.getCompte(3);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
