package b9d.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import k85.c;
import b9d.i$a;
import b9d.i$b;
import b9d.i$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b9d.e;
import erd.o;
import brd.t;
import b9d.h;
import erd.r;
import b9d.f;
import b9d.d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9d.g;
import b9d.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import nfd.v3;
import nfd.t3;
import fw8.r;
import fw8.r$a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.entity.HomeGuideConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.plugin.search.homepage.widget.guide.HomeGuideLayout;
import android.view.ViewGroup$LayoutParams;
import b9d.b;
import com.yxcorp.plugin.search.homepage.widget.guide.HomeGuideLayout$b;
import b9d.i$d;
import v9d.b;
import b9d.a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import java.util.Objects;
import android.view.ViewParent;
import android.animation.Animator;
import com.yxcorp.plugin.search.homepage.widget.guide.b;
import android.animation.Animator$AnimatorListener;
import uy5.b;
import java.lang.StringBuilder;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import com.yxcorp.plugin.search.homepage.homev8.fragment.SearchBaseHomeFragment;

public final class i extends PresenterV2	// class@0003c7
{
    public BaseFragment p;
    public HomeGuideLayout q;
    public t r;
    public List s;
    public int t;
    public final SharedPreferences u;
    public boolean v;
    public final t3 w;
    public final r$a x;
    public final a y;

    public void i(){
       super();
       this.t = 0;
       this.u = c.a(a.a().a(), "search_home_new_user_guide", 0);
       this.v = false;
       this.w = new i$a(this);
       this.x = new i$b(this);
       this.y = new i$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.X7(this.r.map(e.b).filter(h.b).map(f.b).subscribe(new d(this)));
       this.X7(this.p.Vg().i().filter(g.b).subscribe(new c(this)));
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          activity.F2(this.y);
       }
       i tp = this.p;
       if (tp instanceof this) {
          tp.z3(this.w);
       }
       r.c().a(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          activity.l3(this.y);
       }
       i tp = this.p;
       if (tp instanceof this) {
          tp.T7(this.w);
       }
       r.c().g(this.x);
       return;
    }
    public final String P8(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HomeGuideConfig homeGuideCon = (q.f(p0))? null: p0.get(0);
       if (homeGuideCon == null || TextUtils.x(homeGuideCon.mBiz)) {
          return "search_home_new_user_guide";
       }else {
          return homeGuideCon.mBiz;
       }
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.p.Vg().c();
    }
    public void S8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
          return;
       }
       List list = null;
       this.s = list;
       Activity activity = this.getActivity();
       boolean b = false;
       if (activity == null || this.v != null) {
          StringBuilder str = "reallyShowGuide, activity = ";
          if (activity == null) {
             b = true;
          }
          b.c("SearchHomeNewUserGuidePresenter", str+b+" mDisableShowGuide = "+this.v);
          return;
       }else {
          ViewGroup viewGroup = activity.findViewById(0x1020002);
          HomeGuideLayout homeGuideLay = new HomeGuideLayout(activity);
          this.q = homeGuideLay;
          viewGroup.addView(homeGuideLay, new ViewGroup$LayoutParams(-1, -1));
          this.q.setStateChangeListener(new b(this, p0, viewGroup));
          this.q.setGuideInfoProvider(new i$d(this));
          this.q.setOnClickListener(new a(this));
          this.q.setGuideConfigList(p0);
          i tq = this.q;
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoid(list, tq, HomeGuideLayout.class, "7") && tq.getParent() != null) {
             HomeGuideLayout h = tq.h;
             if (h != null) {
                h.cancel();
             }
             Animator uAnimator = tq.d(tq, b, 180);
             tq.h = uAnimator;
             uAnimator.addListener(new b(tq));
             tq.h.start();
          }
          b.c("SearchHomeNewUserGuidePresenter", "reallyShowGuide, success show");
          return;
       }
    }
    public void V8(List p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       View view = this.p.getView();
       if (view == null || this.v != null) {
          StringBuilder str = "tryShowGuideProcessSoftInput, view =";
          b = (view == null)? true: false;
          b.c("SearchHomeNewUserGuidePresenter", str+b+" mDisableShowGuide = "+this.v);
          return;
       }else {
          i tt = this.t;
          if (tt == null) {
             this.s = p0;
          }else if(tt == 2){
             this.S8(p0);
          }else {
             this.s = p0;
             n.D(this.getActivity(), 100);
          }
          b.c("SearchHomeNewUserGuidePresenter", "tryShowGuideProcessSoftInput, mSoftInputShowFlag = "+this.t);
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.q8(SearchBaseHomeFragment.class);
       this.r = this.r8("SEARCH_HOME_RECOMMEND_RESPONSE_OBSERVABLE");
       return;
    }
}
