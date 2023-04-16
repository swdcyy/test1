package cz2.b;
import com.kuaishou.live.viewcontroller.ViewController;
import dz2.a;
import dz2.c$a;
import zy2.a;
import hz2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import java.util.List;
import pp.c;
import cz2.b$a;
import cz2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dz2.c;
import fz2.a;
import android.content.Context;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView;
import gz2.a;
import gz2.h;
import cz2.d;
import android.view.View;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import d61.j0;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;

public final class b extends ViewController	// class@00240c
{
    public final List j;
    public i k;
    public a l;
    public final b$a m;
    public final a n;
    public final c$a o;
    public final a p;
    public final a q;

    public void b(a p0,c$a p1,a p2,a p3){
       a.p(p0, "localRenderConfig");
       a.p(p1, "renderContextDependency");
       a.p(p2, "delegate");
       a.p(p3, "renderLogDependency");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.j = LiveEffectLogTag.LIVE_EFFECT_ENGINE.appendTag("LiveEffectLocalRenderVC");
       this.m = new b$a(this);
    }
    public static final a V2(b p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("localRenderer");
       }
       return p0;
    }
    public void F2(){
       a a;
       a b;
       a uoa2;
       a uoa3;
       a uoa = this;
       if (PatchProxy.applyVoid(null, uoa, b.class, "1")) {
          return;
       }
       a c = uoa.n.c;
       if (c != null) {
          uoa.l = c;
       }else {
          c uoc = new c(uoa.o);
          a = a.a;
          Context uContext = this.D2();
          b n = uoa.n;
          a a1 = n.a;
          b = n.b;
          Objects.requireNonNull(a);
          a uoa1 = a.class;
          if (PatchProxy.isSupport(uoa1)) {
             uoa2 = uoa1;
             uoa3 = PatchProxy.applyFourRefs(uContext, uoc, Integer.valueOf(a1), Long.valueOf(b), a, a.class, "1");
             if (uoa3 != PatchProxyResult.class) {
             }else {
             label_0054 :
                a.p(uContext, "context");
                a.p(uoc, "renderContext");
                LiveGiftEffectLocalRenderTextureView liveGiftEffe = PatchProxy.applyOneRefs(uContext, a, uoa2, "2");
                if (liveGiftEffe != PatchProxyResult.class) {
                }else {
                   liveGiftEffe = new LiveGiftEffectLocalRenderTextureView(uContext);
                }
                Object obj = liveGiftEffe;
                if (b - null > 0) {
                   uoa3 = new a(obj, a1, b, uoc);
                }else {
                   uoa3 = new h(obj, a1, uoc);
                }
             }
          }else {
             uoa2 = uoa1;
             goto label_0054 ;
          }
          uoa.l = uoa3;
       }
       b o = uoa.o;
       b l = uoa.l;
       String str = "localRenderer";
       if (l == null) {
          a.S(str);
       }
       o.a(l);
       o = uoa.l;
       if (o == null) {
          a.S(str);
       }
       o.g(uoa.m);
       o = uoa.l;
       if (o == null) {
          a.S(str);
       }
       View renderView = o.getRenderView();
       renderView.setTag(d.a, LayoutViewType.GiftEffect.name());
       uoa.R2(renderView);
       if (!PatchProxy.applyVoidOneRefs(renderView, null, j0.class, "10")) {
          ViewGroup$LayoutParams layoutParams = renderView.getLayoutParams();
          int i = 17;
          if (layoutParams instanceof FrameLayout$LayoutParams) {
             layoutParams.gravity = i;
          }else if(layoutParams instanceof RelativeLayout$LayoutParams){
             layoutParams.addRule(13, -1);
          }else if(layoutParams instanceof LinearLayout$LayoutParams){
             layoutParams.gravity = i;
          }else if(layoutParams instanceof ConstraintLayout$LayoutParams){
             ViewGroup$LayoutParams layoutParams1 = layoutParams;
             layoutParams1.h = 0;
             layoutParams1.k = 0;
             layoutParams1.q = 0;
             layoutParams1.s = 0;
          }
          renderView.setLayoutParams(layoutParams);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tl = this.l;
       if (tl == null) {
          a.S("localRenderer");
       }
       tl.g(null);
       return;
    }
}
