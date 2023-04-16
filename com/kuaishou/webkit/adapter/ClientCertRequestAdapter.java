package com.kuaishou.webkit.adapter.ClientCertRequestAdapter;
import com.kuaishou.webkit.ClientCertRequest;
import android.webkit.ClientCertRequest;
import java.lang.String;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class ClientCertRequestAdapter extends ClientCertRequest	// class@0012a3
{
    public ClientCertRequest mStub;

    public void ClientCertRequestAdapter(ClientCertRequest p0){
       super();
       this.mStub = p0;
    }
    public void cancel(){
       this.mStub.cancel();
    }
    public String getHost(){
       return this.mStub.getHost();
    }
    public String[] getKeyTypes(){
       return this.mStub.getKeyTypes();
    }
    public int getPort(){
       return this.mStub.getPort();
    }
    public Principal[] getPrincipals(){
       return this.mStub.getPrincipals();
    }
    public void ignore(){
       this.mStub.ignore();
    }
    public void proceed(PrivateKey p0,X509Certificate[] p1){
       this.mStub.proceed(p0, p1);
    }
}
