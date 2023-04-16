package c.t.m.g.bu;
import java.lang.String;
import java.security.MessageDigest;
import c.t.m.g.bd;
import c.t.m.g.bt;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class bu	// class@000bf8
{

    public static String a(String p0,String p1){
       byte[] bytes = p0.getBytes("UTF-8");
       return bu.a(bytes, p1);
    }
    public static String a(byte[] p0,String p1){
       MessageDigest instance = MessageDigest.getInstance(p1);
       instance.update(p0);
       return bd.a(instance.digest(), "");
    }
}
