package be6.d;
import com.google.gson.Gson;
import fg6.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import be6.d$a;
import java.lang.Runnable;
import t45.c;
import be6.d$b;
import be6.d$c;

public final class d	// class@00046c
{

    public static final Gson a(){
       return a.a;
    }
    public static final void b(String p0,boolean p1,String p2,long p3,int p4,String p5,String p6){
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p6;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),oobject1,Long.valueOf(p3),Integer.valueOf(p4),p5,oobject2};
          if (PatchProxy.applyVoid(objArray, null, uod, "3")) {
             return;
          }
       }
       a.p(p0, "fileName");
       a.p(p2, "downloadType");
       a.p(oobject2, "downloadPriority");
       d$a uoa = new d$a(p0, p1, p2, p3, p4, p5, p6);
       c.a(v9);
       return;
    }
    public static final void c(String p0,boolean p1,String p2,long p3,int p4,String p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,Long.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uod, "4")) {
             return;
          }
       }
       a.p(p0, "fileName");
       a.p(p2, "source");
       d$b uob = new d$b(p0, p1, p2, p3, p4, p5);
       c.a(uod);
       return;
    }
    public static final void d(){
       if (PatchProxy.applyVoid(null, null, d.class, "2")) {
          return;
       }
       c.a(d$c.b);
       return;
    }
}
