package k3a.a;
import j3a.a;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k3a.b;
import com.yxcorp.gifshow.detail.player.panel.elements.ActionType;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import msd.p;

public final class a extends a	// class@002bc2
{
    public boolean e;
    public boolean f;
    public String g;
    public Drawable h;
    public String i;
    public boolean j;
    public p k;
    public l l;
    public a m;
    public ActionType n;

    public void a(){
       super();
       this.g = "";
       this.i = "";
       this.b = false;
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public final boolean g(){
       return this.j;
    }
    public final boolean h(){
       return this.f;
    }
    public final ActionType i(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj == null) {
          a.S("type");
       }
       return obj;
    }
    public final void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.i = p0;
       return;
    }
    public final void k(Drawable p0){
       this.h = p0;
    }
    public final void l(p p0){
       this.k = p0;
    }
    public final void m(boolean p0){
       this.j = p0;
    }
    public final void n(boolean p0){
       this.e = p0;
    }
    public final void o(boolean p0){
       this.f = p0;
    }
    public final void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public final void q(ActionType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.n = p0;
       return;
    }
}
