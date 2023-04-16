package bh3.l$a;
import bh3.s$c;
import bh3.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import bh3.j;
import z1.a;
import oh3.a;
import bh3.g;
import bh3.h;
import bh3.i;
import bh3.k;

public class l$a implements s$c	// class@0003c3
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1,String p2,String p3,boolean p4,Throwable p5){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }
       if (!p4) {
          this.a.S(p1);
       }
       j oj = new j(p0, p1, p2, p3, p4, p5);
       this.a.Q(v8);
       return;
    }
    public void b(int p0,String p1,String p2){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, l$a.class, "1")) {
          return;
       }
       this.a.Q(new g(p0, p1, p2));
       return;
    }
    public void c(int p0,String p1,String p2){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, l$a.class, "3")) {
          return;
       }
       this.a.S(p1);
       this.a.Q(new h(p0, p1, p2));
       return;
    }
    public void d(int p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, l$a.class, "2")) {
          return;
       }
       this.a.S(p1);
       this.a.Q(new i(p0, p1, p2, p3));
       return;
    }
    public void e(int p0,String p1,String p2,boolean p3,boolean p4,Throwable p5){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             return;
          }
       }
       if (p3 || p4) {
          this.a.S(p1);
       }
       k ok = new k(p0, p1, p2, p3, p5);
       this.a.Q(v6);
       return;
    }
}
