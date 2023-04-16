package c.t.m.g.cs;
import android.os.Bundle;
import android.location.Location;
import java.lang.String;
import java.lang.StringBuilder;
import c.t.m.g.q;
import c.t.m.g.ed;

public class cs	// class@000c21
{
    public static final Bundle a;
    public static final Location b;

    static {
       cs.a = new Bundle();
       cs.b = new Location("EMPTY");
    }
    public static String a(int p0,int p1,int p2){
       StringBuilder str = "";
       StringBuilder str1 = "http";
       String str2 = (q.a().d("https"))? "s": "";
       str2 = str1+str2+"://lbs.map.qq.com/loc";
       if (ed.a) {
          ed.a("NATIVE_TEST", "getUrl fun_d url: "+str2);
       }
       return str+str2+"?"+"c="+p0+"&"+"mars="+p1+"&"+"obs="+p2;
    }
}
