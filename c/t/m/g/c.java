package c.t.m.g.c;
import java.lang.String;
import java.lang.Object;
import android.os.Build;
import c.t.m.g.cb;

public class c	// class@000c00
{
    public String a;
    public String b;
    public String c;

    public void c(String p0,String p1,String p2){
       super();
       this.a = p1;
       this.b = p0;
       this.c = p2;
    }
    public String a(){
       return "1.7.1";
    }
    public final String a(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public String b(){
       return this.a(this.a);
    }
    public String c(){
       return this.a(this.b);
    }
    public String d(){
       return this.a(this.c);
    }
    public String e(){
       return this.a(Build.MANUFACTURER);
    }
    public String f(){
       return this.a(cb.g());
    }
}
