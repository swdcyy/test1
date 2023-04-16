package com.gifshow.kanim.a$a;
import bh.n;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ih.c;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import javax.net.ssl.SSLException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import ih.b;

public final class a$a implements n	// class@0015ad
{

    public void a$a(){
       super();
    }
    public void onResult(Object p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else if(!p0 instanceof SocketException && (!p0 instanceof ClosedChannelException && (!p0 instanceof InterruptedIOException && (!p0 instanceof ProtocolException && (!p0 instanceof SSLException && (p0 instanceof UnknownHostException || p0 instanceof UnknownServiceException)))))){
          str = 1;
       }else {
          str = null;
       }
       if (str) {
          b.b("Unable to load composition.", p0);
       }else {
          b.b("Unable to parse composition", p0);
       }
       return;
    }
}
