package com.cmic.sso.sdk.e.e;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import com.cmic.sso.sdk.auth.TokenListener;
import java.lang.Object;

public class e	// class@000f5d
{
    public static ConcurrentHashMap a;

    static {
       e.a = new ConcurrentHashMap(16);
    }
    public static void a(String p0,TokenListener p1){
       e.a.put(p0, p1);
    }
    public static boolean a(){
       return e.a.isEmpty();
    }
    public static boolean a(String p0){
       return (e.a.containsKey(p0) ^ 0x01);
    }
    public static void b(String p0){
       e.a.remove(p0);
    }
    public static TokenListener c(String p0){
       return e.a.get(p0);
    }
}
