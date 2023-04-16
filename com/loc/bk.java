package com.loc.bk;
import javax.net.ssl.SSLSocketFactory;
import android.content.Context;
import javax.net.ssl.SSLContext;
import java.lang.Throwable;
import java.lang.String;
import com.loc.an;
import javax.net.SocketFactory;
import java.net.Socket;
import com.loc.m$f;
import javax.net.ssl.SSLSocket;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.Object;
import com.loc.x;
import java.lang.Boolean;
import java.lang.reflect.Method;
import android.net.SSLSessionCache;
import javax.net.ssl.SSLSessionContext;
import java.lang.reflect.Field;
import java.io.IOException;
import java.net.UnknownHostException;
import java.net.InetAddress;

public final class bk extends SSLSocketFactory	// class@00139c
{
    public SSLSocketFactory a;
    public Context b;
    public SSLContext c;

    public void bk(Context p0,SSLContext p1){
       super();
       if (p0 != null) {
          this.b = p0.getApplicationContext();
       }
       this.c = p1;
       if (p1 != null) {
          this.a = p1.getSocketFactory();
       }
       if (this.c == null) {
          this.c = SSLContext.getDefault();
       }
       if (this.a == null) {
          this.a = SSLSocketFactory.getDefault();
       }
       return;
    }
    public static Socket a(Socket p0){
       if (m$f.b && p0 instanceof SSLSocket) {
          String[] stringArray = new String[]{"TLSv1.2"};
          p0.setEnabledProtocols(stringArray);
       }
    label_001d :
       return p0;
    }
    public static void b(Socket p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (!m$f.c || !m$f.e) {
          return;
       }
       if (!p0 instanceof SSLSocket) {
          return;
       }
       int f = m$f.f;
       int d = m$f.d;
       if (f > d) {
          f = d;
       }
       if (f > 17 && sDK_INT > f) {
          return;
       }else {
          Class[] uClassArray = new Class[]{Boolean.TYPE};
          Object[] objArray = new Object[]{Boolean.TRUE};
          p0.getClass().getMethod(x.c("Cc2V0VXNlU2Vzc2lvblRpY2tldHM"), uClassArray).invoke(p0, objArray);
          return;
       }
    }
    public final void a(){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (!m$f.c) {
          return;
       }
       if (this.b != null && this.c != null) {
          int d = m$f.d;
          if (d > 17 && sDK_INT > d) {
             return;
          }else {
             SSLSessionCache sSLSessionCa = new SSLSessionCache(this.b);
             if (sDK_INT < 28) {
                Class[] uClassArray = new Class[]{SSLSessionCache.class,SSLContext.class};
                Object[] objArray = new Object[]{sSLSessionCa,this.c};
                sSLSessionCa.getClass().getMethod(x.c("MaW5zdGFsbA"), uClassArray).invoke(sSLSessionCa, objArray);
                return;
             }else {
                this.a(sSLSessionCa);
             }
          }
       }
       return;
    }
    public final void a(SSLSessionCache p0){
       object oobject;
       bk tc = this.c;
       if (tc == null) {
          return;
       }
       SSLSessionContext clientSessio = tc.getClientSessionContext();
       Field declaredFiel = p0.getClass().getDeclaredField(x.c("UbVNlc3Npb25DYWNoZQ"));
       declaredFiel.setAccessible(true);
       p0 = declaredFiel.get(p0);
       Method[] methods = clientSessio.getClass().getMethods();
       String str = x.c("Yc2V0UGVyc2lzdGVudENhY2hl");
       int len = methods.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          oobject = methods[i];
          if ((oobject.getName()).equals(str)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       Object[] objArray = new Object[true];
       objArray[0] = p0;
       oobject.invoke(clientSessio, objArray);
       return;
    }
    public final Socket createSocket(){
       bk ta = this.a;
       if (ta == null) {
          return null;
       }
       Socket socket = bk.a(ta.createSocket());
       bk.b(socket);
       return socket;
    }
    public final Socket createSocket(String p0,int p1){
       bk ta = this.a;
       if (ta == null) {
          return null;
       }
       Socket socket = bk.a(ta.createSocket(p0, p1));
       bk.b(socket);
       return socket;
    }
    public final Socket createSocket(String p0,int p1,InetAddress p2,int p3){
       bk ta = this.a;
       if (ta == null) {
          return null;
       }
       Socket socket = bk.a(ta.createSocket(p0, p1, p2, p3));
       bk.b(socket);
       return socket;
    }
    public final Socket createSocket(InetAddress p0,int p1){
       bk ta = this.a;
       if (ta == null) {
          return null;
       }
       Socket socket = bk.a(ta.createSocket(p0, p1));
       bk.b(socket);
       return socket;
    }
    public final Socket createSocket(InetAddress p0,int p1,InetAddress p2,int p3){
       bk ta = this.a;
       if (ta == null) {
          return null;
       }
       Socket socket = bk.a(ta.createSocket(p0, p1, p2, p3));
       bk.b(socket);
       return socket;
    }
    public final Socket createSocket(Socket p0,String p1,int p2,boolean p3){
       bk ta = this.a;
       if (ta == null) {
          return null;
       }
       p0 = bk.a(ta.createSocket(p0, p1, p2, p3));
       bk.b(p0);
       return p0;
    }
    public final String[] getDefaultCipherSuites(){
       bk ta = this.a;
       if (ta != null) {
          return ta.getDefaultCipherSuites();
       }
       String[] stringArray = new String[0];
       return stringArray;
    }
    public final String[] getSupportedCipherSuites(){
       bk ta = this.a;
       if (ta != null) {
          return ta.getSupportedCipherSuites();
       }
       String[] stringArray = new String[0];
       return stringArray;
    }
}
