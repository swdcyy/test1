package rn.b;
import qn.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import rn.g$c;
import java.lang.ref.WeakReference;
import qn.j;
import qn.l;
import java.lang.Integer;
import rn.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class b	// class@002db1
{
    public String a;
    public String b;
    public Integer c;
    public WeakReference d;
    public Bundle e;
    public boolean f;
    public float g;
    public long h;
    public l i;
    public j j;
    public Drawable k;
    public g l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final m p;

    public void b(m p0){
       a.p(p0, "showType");
       super();
       this.p = p0;
       this.g = 0x3f800000;
       this.h = -1;
       this.l = g$c.a;
    }
    public final WeakReference a(){
       return this.d;
    }
    public final m b(){
       return this.p;
    }
    public final j c(){
       return this.j;
    }
    public final l d(){
       return this.i;
    }
    public final boolean e(){
       return this.o;
    }
    public final void f(Integer p0){
       this.c = p0;
    }
    public final void g(boolean p0){
       this.m = p0;
    }
    public final void h(String p0){
       this.a = p0;
    }
    public final void i(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.l = p0;
       return;
    }
    public final void j(j p0){
       this.j = p0;
    }
    public final void k(l p0){
       this.i = p0;
    }
}
