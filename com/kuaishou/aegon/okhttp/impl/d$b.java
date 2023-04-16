package com.kuaishou.aegon.okhttp.impl.d$b;
import okhttp3.Connection;
import okhttp3.Request;
import java.net.Proxy;
import okhttp3.Protocol;
import java.net.InetSocketAddress;
import java.lang.Object;
import okhttp3.Address;
import okhttp3.HttpUrl;
import java.lang.String;
import okhttp3.Dns;
import javax.net.SocketFactory;
import okhttp3.Authenticator;
import java.util.List;
import java.util.Collections;
import okhttp3.ConnectionSpec;
import java.net.ProxySelector;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import okhttp3.CertificatePinner;
import okhttp3.Route;
import okhttp3.Handshake;
import java.net.Socket;

public class d$b implements Connection	// class@0005f0
{
    public Protocol a;
    public Route b;

    public void d$b(Request p0,Proxy p1,Protocol p2,InetSocketAddress p3){
       int i = this;
       super();
       Address uAddress = new Address(p0.url().host(), p0.url().port(), Dns.SYSTEM, SocketFactory.getDefault(), null, null, null, Authenticator.NONE, p1, Collections.singletonList(p2), Collections.singletonList(ConnectionSpec.CLEARTEXT), ProxySelector.getDefault());
       i.b = new Route(v14, p1, p3);
       i.a = p2;
    }
    public Handshake handshake(){
       return null;
    }
    public Protocol protocol(){
       return this.a;
    }
    public Route route(){
       return this.b;
    }
    public Socket socket(){
       return null;
    }
}
