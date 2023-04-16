package com.android.kwai.foundation.network.https.TrustAllHostnameVerifier;
import javax.net.ssl.HostnameVerifier;
import java.lang.Object;
import java.lang.String;
import javax.net.ssl.SSLSession;

public class TrustAllHostnameVerifier implements HostnameVerifier	// class@000efc
{

    public void TrustAllHostnameVerifier(){
       super();
    }
    public boolean verify(String p0,SSLSession p1){
       return true;
    }
}
