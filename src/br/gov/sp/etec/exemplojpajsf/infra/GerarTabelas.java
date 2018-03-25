package br.gov.sp.etec.exemplojpajsf.infra;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelas {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.
                    createEntityManagerFactory("EXEMPLO");

        factory.close();
    }
}
