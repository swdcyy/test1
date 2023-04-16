package jy1.e;
import java.lang.String;
import java.lang.StringBuilder;
import jy1.b$c;
import jy1.c;

public final class e	// class@002c37
{

    public static String a(String p0,String p1,String p2){
       return e.c(p0, p1, p2);
    }
    public static String b(String p0,String p1,String p2){
       return e.d(p0, p1, p2);
    }
    public static String c(String p0,String p1,String p2){
       return p0+"-uid="+p1;
    }
    public static String d(String p0,String p1,String p2){
       return p0+"-uid="+p1+"-liveStreamId="+p2;
    }
    public static b$c e(String p0){
       return new c(p0);
    }
}
