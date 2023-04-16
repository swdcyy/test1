package f21.b;
import f21.a;
import z61.b;
import java.util.ArrayList;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f21.d;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import java.lang.Boolean;
import f21.b$e;
import java.util.List;
import f21.b$a;
import android.graphics.drawable.Drawable;
import f21.b$f;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bottombar.component.widget.d;
import z61.c;
import f21.b$b;
import android.view.View$OnClickListener;
import f21.b$d;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;
import f21.b$c;
import f21.b$g;
import com.google.gson.JsonObject;

public final class b extends b implements a	// class@00229d
{
    public d b;
    public final ArrayList c;

    public void b(){
       super();
       this.c = new ArrayList();
    }
    public final void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       if (this.b != null) {
          p0.run();
       }else {
          this.c.add(p0);
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
          return;
       }
       b tb = this.b;
       if (tb == null || (tb != null && !PatchProxy.applyVoid(objArray, tb, d.class, "11"))) {
          d o = tb.o;
          if (o == null) {
             a.S("giftAnimationView");
          }
          o.b();
       }
    label_0029 :
       return;
    }
    public void d(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "5")) {
          return;
       }
       this.a(new b$e(this, p0));
       return;
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "cdnUrls");
       this.a(new b$a(this, p0));
       return;
    }
    public void g(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.a(new b$f(this, p0));
       return;
    }
    public View getView(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.f();
       }
       return objArray;
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b$b(this);
    }
    public void h(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       this.a(new b$d(this, p0));
       return;
    }
    public void i(LiveGuideGiftAnimationView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       this.a(new b$c(this, p0));
       return;
    }
    public void j(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "7")) {
          return;
       }
       b tb = this.b;
       if (tb == null || (tb != null && !PatchProxy.applyVoid(objArray, tb, d.class, "12"))) {
          d o = tb.o;
          if (o == null) {
             a.S("giftAnimationView");
          }
          o.a();
       }
    label_0029 :
       return;
    }
    public void k(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "4")) {
          return;
       }
       this.a(new b$g(this, p0));
       return;
    }
    public void update(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       a.p(p0, "jsonObject");
       return;
    }
}
