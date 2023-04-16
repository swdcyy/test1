package com.kwai.library.wolverine.utility.a$a;
import java.lang.Thread;
import com.kwai.library.wolverine.utility.a$a$a;
import nsd.u;
import java.io.InputStream;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;

public final class a$a extends Thread	// class@000ad0
{
    public final InputStream b;
    public static final a$a$a c;

    static {
       a$a.c = new a$a$a(null);
    }
    public void a$a(InputStream p0){
       a.p(p0, "mInputStream");
       super("NoopStreamConsumer");
       this.b = p0;
    }
    public void run(){
       try{
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(this.b));
          Throwable throwable = null;
          do {
          } while (uBufferedRea.readLine() != null);
          b.a(uBufferedRea, throwable);
          return;
       }catch(java.io.IOException e0){
       }
    }
}
