package j8a.d1;
import j8a.e0;
import vl8.c;
import msd.a;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.lang.IllegalArgumentException;
import qrd.l1;
import java.lang.IllegalStateException;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.widget.ImageView;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import j8a.d1$b;
import w4.j;
import j8a.d1$c;
import android.view.View;
import android.view.View$OnTouchListener;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.robust.PatchProxyResult;
import j8a.d1$a;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;

public abstract class d1 extends c implements e0	// class@00294a
{
    public View c;
    public LottieAnimationView d;
    public boolean e;
    public boolean f;
    public final int g;

    public void d1(int p0){
       super();
       this.g = p0;
    }
    public void E(a p0,a p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d1.class, "3")) {
          return;
       }
       if (VisitorModeManager.f()) {
          return;
       }
       if (!this.N()) {
          if (p2 != null) {
             p2.invoke(new IllegalArgumentException("miss necessary view"));
          }
          return;
       }else if(this.d()){
          if (p2 != null) {
             p2.invoke(new IllegalStateException("The guide is showing"));
          }
          return;
       }else {
          this.e = true;
          if (p0 != null) {
             l1 ol1 = p0.invoke();
          }
          d1 td = this.d;
          if (td == null) {
             a.S("mGuideLottieView");
          }
          a.h(td.getContext(), this.g).addListener(new d1$b(this, p1, p2)).addFailureListener(new d1$c(this, p2));
          return;
       }
    }
    public abstract boolean N();
    public void O(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d1.class, "7")) {
          return;
       }
       d1 tc = this.c;
       if (tc != null) {
          tc.setVisibility(8);
          tc.setOnTouchListener(objArray);
       }
       tc = this.d;
       if (tc == null) {
          a.S("mGuideLottieView");
       }
       tc.f();
       tc.t();
       tc.setVisibility(8);
       return;
    }
    public final View P(){
       return this.c;
    }
    public final LottieAnimationView Q(){
       d1 obj = PatchProxy.apply(null, this, d1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mGuideLottieView");
       }
       return obj;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, d1.class, "5")) {
          return;
       }
       d1 tc = this.c;
       a.m(tc);
       int i = 0;
       tc.setVisibility(i);
       tc = this.d;
       if (tc == null) {
          a.S("mGuideLottieView");
       }
       tc.setVisibility(i);
       tc = this.c;
       a.m(tc);
       tc.setOnTouchListener(new d1$a(this));
       return;
    }
    public final void S(){
       this.f = false;
    }
    public final void T(View p0){
       this.c = p0;
    }
    public final void U(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public boolean d(){
       return this.e;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, d1.class, "6")) {
          return;
       }
       if (this.d()) {
          this.f = true;
          this.e = false;
          this.O();
          SlideGuideManager.m.a().f(false);
       }
       return;
    }
}
