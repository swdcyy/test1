package com.kuaishou.webkit.ClientCertRequest;
import java.lang.Object;
import java.lang.String;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public abstract class ClientCertRequest	// class@001244
{

    public void ClientCertRequest(){
       super();
    }
    public abstract void cancel();
    public abstract String getHost();
    public abstract String[] getKeyTypes();
    public abstract int getPort();
    public abstract Principal[] getPrincipals();
    public abstract void ignore();
    public abstract void proceed(PrivateKey p0,X509Certificate[] p1);
}
