package com.mycompany.app;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.openshift.client.OpenShiftClient;
import org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider;

import java.security.Security;

/**
 * Hello world!
 *
 */
public class App {
    static {
        Security.addProvider(new BouncyCastleFipsProvider());
    }
    public static void main( String[] args )
    {
        OpenShiftClient osClient = new KubernetesClientBuilder().build().adapt(OpenShiftClient.class);

        try{
            KubernetesClient client = new KubernetesClientBuilder().build();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("CLIENT BUILD SUCCESS");
    }
}
