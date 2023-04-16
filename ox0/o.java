package ox0.o;
import android.view.View;
import lp3.e;
import android.app.Activity;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ekd.m1;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ox0.o$a;
import java.lang.Boolean;
import p51.c;
import ox0.p;
import java.nio.ByteBuffer;
import java.lang.Integer;
import d22.k;
import rd1.b0;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import or5.d;
import lp3.c;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ga1.c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Float;
import android.opengl.GLSurfaceView;
import fe1.a;
import com.yxcorp.utility.n;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ox0.o$b;

public final class o	// class@0035ca
{
    public final LivePlayGLSurfaceView a;
    public final View b;
    public final View c;
    public final View d;
    public ViewTreeObserver$OnGlobalLayoutListener e;
    public o$a f;
    public float g;
    public boolean h;
    public final View i;
    public final e j;
    public final Activity k;
    public final a l;
    public final a m;

    public void o(View p0,e p1,Activity p2,a p3,a p4){
       a.p(p0, "rootView");
       a.p(p1, "serviceManager");
       a.p(p3, "isFromLiveMate");
       a.p(p4, "isMultiTabStyle");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       View view = m1.f(p0, R.id.livetalk_surfaceview);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.livetalk_surfaceview\)");
       this.a = view;
       view = m1.f(p0, R.id.play_view_wrapper);
       a.o(view, "ViewBindUtils.bindWidget¡­, R.id.play_view_wrapper\)");
       this.b = view;
       view = m1.f(p0, R.id.play_view);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.play_view\)");
       this.c = view;
       p0 = m1.f(p0, R.id.top_bar);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.top_bar\)");
       this.d = p0;
    }
    public final void a(){
       o tk;
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       if (this.g - 0x3f800000 < 0) {
          return;
       }
       if (this.f == null) {
          tk = this.k;
          o ta = this.a;
          o tb = this.b;
          p op = PatchProxy.applyThreeRefs(tk, ta, tb, this, o.class, "9");
          if (op != PatchProxyResult.class) {
          }else {
             op = new p(this, tk, c.d(tk, ta, tb, this.m.invoke().booleanValue()));
          }
          this.f = op;
       }
       tk = this.f;
       if (tk != null) {
          tk.a(this.g);
       }
       return;
    }
    public final void b(ByteBuffer p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, o.class, "2")) {
          return;
       }
       this.a.getRenderer().a(p0, p1, p2, p3);
       return;
    }
    public final void c(int p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oo, "7")) {
          return;
       }
       b0 a = b0.a;
       Objects.requireNonNull(a);
       c obj = PatchProxy.apply(null, a, b0.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableChatFixSurfaceView", 0);
       if (b) {
          obj = this.j.a(d.class);
          a.o(obj, "serviceManager.getServic¡­eInfoManager::class.java\)");
          QLivePlayConfig qLivePlayCon = obj.C0();
          a.o(qLivePlayCon, "serviceManager.getServic¡­\)\n        .livePlayConfig");
          if (!qLivePlayCon.isLandscape()) {
             obj = this.j.a(c.class);
             a.o(obj, "serviceManager.getServic¡­yViewService::class.java\)");
             if (obj.getVideoSizeRatio() - 0x3f800000 > 0) {
                ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   b.Z(LiveLogTag.CHAT, "fitSurfaceViewOnPlayerHorizontalStream:"+p0+' '+p1);
                   this.h = true;
                   layoutParams.topMargin = 0;
                   layoutParams.width = p0;
                   layoutParams.height = p1;
                   this.b.requestLayout();
                }
             }
          }
       }
       return;
    }
    public final View d(){
       return this.i;
    }
    public final void e(float p0){
       ViewGroup$LayoutParams layoutParams;
       int i;
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oo, "1")) {
          return;
       }
       this.c.setVisibility(4);
       this.a.setVisibility(0);
       if (!PatchProxy.isSupport(oo) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oo, "6")) {
          if (p0 - 0x3f800000 > 0 && this.l.invoke().booleanValue()) {
             this.g = p0;
             this.a();
          }else {
             oo = this.k;
             if (oo != null) {
                c uoc = this.j.a(a.class);
                a.o(uoc, "serviceManager.getServic¡­creenService::class.java\)");
                int screenWidth = uoc.getScreenWidth();
                float f = (float)screenWidth;
                if (((float)uoc.getScreenHeight() * p0) - f >= 0) {
                   layoutParams = this.a.getLayoutParams();
                   a.o(layoutParams, "mLivePlayGLSurfaceView.layoutParams");
                   layoutParams.width = (int)(p0 * (float)n.l(oo));
                   i = n.l(oo);
                   layoutParams.height = i;
                   this.c(layoutParams.width, i);
                }else {
                   ViewGroup$LayoutParams layoutParams1 = this.a.getLayoutParams();
                   a.o(layoutParams1, "mLivePlayGLSurfaceView.layoutParams");
                   layoutParams1.width = screenWidth;
                   i = (int)(f / p0);
                   layoutParams1.height = i;
                   this.c(screenWidth, i);
                }
             }
          }
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       boolean b = false;
       if (this.h != null) {
          this.j.a(c.class).n3();
          this.h = b;
       }
       this.c.setVisibility(b);
       this.a.setVisibility(4);
       return;
    }
    public final void g(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "4")) {
          return;
       }
       if (this.j.a(d.class).r2(AudienceBizRelation.CHAT)) {
          if (!PatchProxy.applyVoid(objArray, this, oo, "5")) {
             oo = this.e;
             if (oo != null) {
                ViewTreeObserver viewTreeObse = this.i.getViewTreeObserver();
                if (viewTreeObse != null) {
                   viewTreeObse.removeGlobalOnLayoutListener(oo);
                   this.e = objArray;
                }
             }
          }
          this.e = new o$b(this);
          this.i.getViewTreeObserver().addOnGlobalLayoutListener(this.e);
       }
       return;
    }
}
