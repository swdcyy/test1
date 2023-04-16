package ltd.h0;
import java.lang.Runtime;
import java.lang.String;
import java.lang.System;

public final class h0	// class@001e07
{
    public static final int a;

    static {
       h0.a = Runtime.getRuntime().availableProcessors();
    }
    public static final int a(){
       return h0.a;
    }
    public static final String b(String p0){
       try{
          p0 = System.getProperty(p0);
       }catch(java.lang.SecurityException e0){
          p0 = null;
       }
       return p0;
    }
}
