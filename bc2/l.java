package bc2.l;
import bc2.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bc2.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class l implements d	// class@0003d7
{
    public d a;

    public void l(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l.class, "7")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
    public void b(){
       c.a(this);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.c();
       }
       return;
    }
    public boolean d(){
       l obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.d();
       }
       return false;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.e(p0);
       }else {
          b.B(LiveLogTag.LUCKY_STAR, "showCurrentInfoDialog when mediator is null");
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.f();
       }else {
          b.B(LiveLogTag.LUCKY_STAR, "showResultLuckyUserDialog when mediator is null");
       }
       return;
    }
    public boolean g(){
       l obj = PatchProxy.apply(null, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.g();
       }
       return false;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.h();
       }else {
          b.B(LiveLogTag.LUCKY_STAR, "showResultRollUserDialog when mediator is null");
       }
       return;
    }
    public void i(d p0){
       this.a = p0;
    }
}
