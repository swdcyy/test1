package l5.c;
import android.util.JsonReader;
import a5.e;
import l5.s;
import java.util.List;
import l5.l;
import h5.a;
import l5.d;
import h5.b;
import m5.f;
import l5.g;
import h5.c;
import l5.h;
import h5.d;
import l5.i;
import h5.f;
import l5.p;
import h5.h;
import l5.r;

public class c	// class@002519
{

    public static List a(JsonReader p0,float p1,e p2,s p3){
       return l.a(p0, p2, p1, p3);
    }
    public static List b(JsonReader p0,e p1,s p2){
       return l.a(p0, p1, 0x3f800000, p2);
    }
    public static a c(JsonReader p0,e p1){
       return new a(c.b(p0, p1, d.a));
    }
    public static b d(JsonReader p0,e p1){
       return c.e(p0, p1, true);
    }
    public static b e(JsonReader p0,e p1,boolean p2){
       float f = (p2)? f.c(): 0x3f800000;
       return new b(c.a(p0, f, p1, g.a));
    }
    public static c f(JsonReader p0,e p1,int p2){
       return new c(c.b(p0, p1, new h(p2)));
    }
    public static d g(JsonReader p0,e p1){
       return new d(c.b(p0, p1, i.a));
    }
    public static f h(JsonReader p0,e p1){
       return new f(c.a(p0, f.c(), p1, p.a));
    }
    public static h i(JsonReader p0,e p1){
       return new h(c.a(p0, f.c(), p1, r.a));
    }
}
