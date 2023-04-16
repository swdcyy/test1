package gxd.d;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;

public final class d	// class@000f6f
{
    public static d$b a;
    public static boolean b;

    public void d(){
       super();
    }
    public static final void a(String p0){
       System.err.println("SLF4J: "+p0);
    }
    public static final void b(String p0,Throwable p1){
       System.err.println(p0);
       System.err.println("Reported exception:");
    }
    public static String c(String p0){
       if (p0 == null) {
          throw new IllegalArgumentException("null input");
       }
       String str = null;
       try{
          str = System.getProperty(p0);
          return e0;
       }catch(java.lang.SecurityException e0){
       }
    }
}
