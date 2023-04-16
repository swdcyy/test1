package w2b.b;
import w2b.a;
import android.content.Context;
import java.lang.Object;
import w2b.c;
import w2b.g;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.vader.Channel;
import ar.b;
import java.lang.Integer;
import java.lang.Boolean;

public class b implements a	// class@00270f
{
    public c a;

    public void b(Context p0){
       super();
       c uoc = g.n();
       this.a = uoc;
       uoc.k(p0);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       this.a.a(p0);
       return;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.a.c();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       this.a.d();
       return;
    }
    public b e(Channel p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.e(p0, p1);
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.f();
    }
    public void g(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "11")) {
          return;
       }
       this.a.g(p0);
       return;
    }
    public String getSessionId(){
       Object obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getSessionId();
    }
    public void h(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "7")) {
          return;
       }
       this.a.h(p0);
       return;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       this.a.i(p0);
       return;
    }
    public void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.a.j(p0);
       return;
    }
    public void k(Channel p0,byte[] p1,String p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidFourRefs(p1, p0, p2, p3, this, b.class, "15")) {
          this.a.l(p1, p0, p2, p3);
       }
       return;
    }
    public void l(boolean p0,byte[] p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, b.class, "2")) {
          return;
       }
       this.a.m(p1, p0, p2);
       return;
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.p();
    }
}
