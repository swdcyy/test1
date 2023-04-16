package ced.p1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import nfd.t0;
import ced.p1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.ReboundBehavior;
import com.google.android.material.appbar.ReboundBehavior$b;
import java.lang.Float;
import android.view.View;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import ded.g;
import android.widget.TextView;
import android.widget.RelativeLayout;
import ekd.m1;
import com.google.android.material.appbar.AppBarLayout;
import com.yxcorp.plugin.search.widget.AutoMarqueeTextView;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import io.reactivex.subjects.PublishSubject;

public class p1 extends PresenterV2	// class@000573
{
    public View A;
    public ImageView B;
    public TagInfo C;
    public SearchResultExtParams D;
    public PublishSubject E;
    public final ReboundBehavior$b F;
    public AppBarLayout p;
    public View q;
    public View r;
    public AutoMarqueeTextView s;
    public KwaiActionBar t;
    public View u;
    public CollectAnimationView v;
    public LottieAnimationView w;
    public KwaiImageView x;
    public View y;
    public SearchSwitcherEntryView z;
    public static final int G;
    public static int H;

    static {
       p1.G = a1.e(180.00f);
       p1.H = t0.k;
    }
    public void p1(){
       super();
       this.F = new p1$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p1.class, "3")) {
          return;
       }
       this.R8(0);
       CoordinatorLayout$Behavior uBehavior = this.p.getLayoutParams().f();
       if (uBehavior instanceof ReboundBehavior) {
          uBehavior.U(this.F);
       }
       return;
    }
    public void P8(float p0,float p1){
       p1 op1 = p1.class;
       if (PatchProxy.isSupport(op1) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, op1, "5")) {
          return;
       }
       this.y.setAlpha(p0);
       boolean i = 0x3f19999a;
       boolean b = true;
       boolean b1 = ((v4 = p0 - i) > 0)? true: false;
       this.z.setClickable(b1);
       p1 tz = this.z;
       int i1 = 8;
       int i2 = ((v6 = p0) > 0)? 0: 8;
       tz.setVisibility(i2);
       TagInfo mTagType = this.C.mTagType;
       if (mTagType == 3 || mTagType == 4) {
          tz = (g.a(mTagType))? this.x: this.w;
          if (!PatchProxy.isSupport(op1) || !PatchProxy.applyVoidTwoRefs(tz, Float.valueOf(p0), this, op1, "6")) {
             tz.setAlpha(p0);
             boolean b2 = (v4 > 0)? true: false;
             tz.setEnabled(b2);
             b2 = (v4 > 0)? true: false;
             tz.setClickable(b2);
             if (v6 > 0) {
                i1 = 0;
             }
             tz.setVisibility(i1);
          }
       }
       p1 tA = this.A;
       if (tA != null) {
          tA.setAlpha(p1);
       }
       this.s.setAlpha(p1);
       tA = this.t;
       v0 = p1 - i;
       i = (op1 > 0)? true: false;
       tA.setClickable(i);
       if (g.a(this.C.mTagType)) {
          this.u.setAlpha(p1);
          tA = this.u;
          i = (op1 > 0)? true: false;
          tA.setClickable(i);
          tA = this.u;
          i = (op1 > 0)? true: false;
          tA.setEnabled(i);
       }
       this.v.setAlpha(p1);
       tA = this.v;
       if (op1 <= 0) {
          b = false;
       }
       tA.setEnabled(b);
       return;
    }
    public void R8(float p0){
       p1 op1 = p1.class;
       if (PatchProxy.isSupport(op1) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, op1, "4")) {
          return;
       }
       this.r.setAlpha((0x3f800000 - p0));
       this.t.setClickable(false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0225);
       this.q = m1.f(p0, 0x7f0a126b);
       this.r = m1.f(p0, 0x7f0a125b);
       this.s = m1.f(p0, 0x7f0a3f7b);
       this.t = m1.f(p0, 0x7f0a3f6a);
       this.v = m1.f(p0, 0x7f0a3cd2);
       this.w = m1.f(p0, 0x7f0a2cfe);
       this.x = m1.f(p0, 0x7f0a3656);
       this.y = m1.f(p0, 0x7f0a3d20);
       this.z = m1.f(p0, 0x7f0a3d1e);
       this.A = m1.f(p0, 0x7f0a3b84);
       this.B = m1.f(p0, 0x7f0a369a);
       this.u = m1.f(p0, 0x7f0a3643);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p1.class, "1")) {
          return;
       }
       this.C = this.r8("TagInfo");
       this.D = this.r8("TagInfoExtParams");
       this.E = this.r8("KEY_TITLE_ALPHA_SUBJECT");
       return;
    }
}
