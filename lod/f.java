package lod.f;
import mn9.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn9.b$a;
import brd.v;
import java.lang.Integer;
import mn9.a;
import java.lang.Boolean;
import bod.a;
import java.util.Objects;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import d0c.a;
import brd.t;
import t45.d;
import brd.z;
import lod.g;
import lod.h;
import erd.g;
import crd.b;
import crd.a;

public final class f implements b	// class@001c80
{
    public final TextFontRepoV3 a;
    public final int b;

    public void f(TextFontRepoV3 p0,int p1){
       a.p(p0, "repo");
       super();
       this.a = p0;
       this.b = p1;
    }
    public List a(List p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemList");
       a.p(p1, "payload");
       return b$a.f(this, p0, p1);
    }
    public void b(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.a.d(p0, Integer.valueOf(this.b));
       return;
    }
    public void c(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       a.p(p0, "emitter");
       b$a.e(this, p0);
       return;
    }
    public boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       if (p0 instanceof a) {
          return p0.c();
       }
       return false;
    }
    public boolean e(a p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return b$a.b(this, p0, p1);
    }
    public void f(a p0,v p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       String str = "item";
       a.p(p0, str);
       String str1 = "emitter";
       a.p(p1, str1);
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, TextFontRepoV3.class, "4")) {
          a.p(p0, str);
          a.p(p1, str1);
          ta.a.c(ta.b().a(p0.b()).subscribeOn(d.c).observeOn(d.a).subscribe(new g(p0, p1), new h(p1)));
       }
       return;
    }
    public void g(v p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "4")) {
          return;
       }
       a.p(p0, "emitter");
       a.p(p1, "payload");
       b$a.d(this, p0, p1);
       return;
    }
    public void h(a p0,Object p1,v p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "5")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "emitter");
       b$a.c(this, p0, p1, p2);
       return;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
}
