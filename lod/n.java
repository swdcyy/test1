package lod.n;
import mn9.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn9.b$a;
import brd.v;
import mn9.a;
import java.lang.Boolean;
import bod.c;
import bod.d;

public final class n implements b	// class@001c8a
{
    public final TextTemplateRepo a;
    public final boolean b;

    public void n(TextTemplateRepo p0,boolean p1){
       a.p(p0, "repo");
       super();
       this.a = p0;
       this.b = p1;
    }
    public List a(List p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemList");
       a.p(p1, "payload");
       return b$a.f(this, p0, p1);
    }
    public void b(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.a.i(p0, false);
       return;
    }
    public void c(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "8")) {
          return;
       }
       a.p(p0, "emitter");
       b$a.e(this, p0);
       return;
    }
    public boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       boolean b = true;
       if (p0 instanceof c) {
          if (this.b == null || p0.c()) {
          label_0045 :
             return b;
          }
       }else if(p0 instanceof d){
          if (!p0.j() || (this.b != null && !p0.c())) {
             b = false;
          }
          return b;
       }
       b = false;
       goto label_0045 ;
    }
    public boolean e(a p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return b$a.b(this, p0, p1);
    }
    public void f(a p0,v p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "emitter");
       this.a.a(p0, this.b, p1);
       return;
    }
    public void g(v p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "4")) {
          return;
       }
       a.p(p0, "emitter");
       a.p(p1, "payload");
       b$a.d(this, p0, p1);
       return;
    }
    public void h(a p0,Object p1,v p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "5")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "emitter");
       b$a.c(this, p0, p1, p2);
       return;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, n.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
}
