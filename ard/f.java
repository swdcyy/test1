package ard.f;
import ard.c;
import java.lang.StringBuffer;
import java.lang.System;
import java.io.PrintStream;
import ard.f$a;
import java.io.OutputStream;
import java.lang.String;
import exd.a;
import org.slf4j.a;
import gxd.a;
import java.lang.Object;
import java.lang.NoClassDefFoundError;
import java.lang.Error;
import java.lang.Throwable;
import ard.b;
import io.netty.util.internal.logging.Slf4JLogger;
import exd.c;

public class f extends c	// class@00022c
{
    public static final boolean b;

    public void f(){
       super();
    }
    public void f(boolean p0){
       super();
       StringBuffer str = "";
       try{
          PrintStream err = System.err;
          System.setErr(new PrintStream(new f$a(this, str), true, "US-ASCII"));
          if (a.e() instanceof a) {
             throw new NoClassDefFoundError(str);
          }
          err.print(str);
          err.flush();
          System.setErr(err);
          return;
       }catch(java.io.UnsupportedEncodingException e6){
          throw new Error(e6);
       }
    }
    public b c(String p0){
       return new Slf4JLogger(a.g(p0));
    }
}
