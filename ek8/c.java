package ek8.c;
import ek8.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ek8.a;

public final class c	// class@0021cf
{
    public static a a;
    public static final c b;

    static {
       c.b = new c();
       c.a = new b();
    }
    public void c(){
       super();
    }
    public final void a(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "message");
       c.a.b(p0, p1);
    }
    public final void b(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "message");
       c.a.logI(p0, p1);
    }
}
