package d5c.t0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.util.SparseArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.ScrollViewPager;
import s1c.a;
import brd.t;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import t45.d;
import brd.z;
import d5c.n0;
import z5c.l0;
import erd.g;
import crd.b;
import d5c.q0;
import erd.o;
import d5c.s0;
import erd.r;
import d5c.l0;
import s1c.j1;
import d5c.k0;
import java.util.Set;
import com.kwai.framework.model.user.User;
import z5c.d3;
import com.kwai.framework.model.user.User$FollowStatus;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import d5c.p0;
import d5c.m0;
import s1c.v;
import d5c.r0;
import brd.w;
import d5c.o0;
import lnc.a1;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import java.lang.Integer;
import com.kwai.framework.model.user.ProfileTabModel;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.UserProfile;
import u3c.h;
import java.util.ArrayList;
import s1c.r0;
import s1c.n;
import android.content.Context;
import z2c.a;
import x5c.c;
import s1c.k0;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.library.widget.viewpager.tabstrip.b;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Number;
import lnc.d2;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.profile.widget.RadioDotButton;
import android.widget.TextView;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import androidx.fragment.app.Fragment;
import hka.l;
import ekd.m1;
import com.yxcorp.gifshow.profile.tab.DynamicScrollViewPager;

public class t0 extends PresenterV2	// class@00210f
{
    public boolean A;
    public boolean B;
    public User$FollowStatus C;
    public int D;
    public v p;
    public ProfileParam q;
    public User r;
    public DynamicTabHostFragment s;
    public j1 t;
    public DynamicScrollViewPager u;
    public PagerSlidingTabStrip v;
    public View w;
    public int x;
    public PagerSlidingTabStrip$e y;
    public final SparseArray z;

    public void t0(){
       super();
       this.z = new SparseArray();
       this.B = true;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "4")) {
          return;
       }
       this.u.setScrollable(true);
       z a = d.a;
       g a1 = l0.a;
       this.X7(this.p.d.f("PROFILE_TAB_DATA").subscribeOn(a).subscribe(new n0(this), a1));
       this.X7(this.p.d.f("PROFILE_REFRESH").map(q0.b).filter(s0.b).subscribe(new l0(this), a1));
       t0 tt = this.t;
       if (tt != null) {
          tt.e.add(new k0(this));
       }
       if (!d3.a(this.r) && this.r.isPrivate()) {
          this.C = this.r.getFollowStatus();
          this.X7(this.r.observable().distinctUntilChanged(p0.b).subscribe(new m0(this)));
       }
       tt = this.p;
       this.X7(t.merge(tt.t, tt.d.f("PROFILE_TAB_REFRESH").map(r0.b)).observeOn(a).subscribe(new o0(this), a1));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "2")) {
          return;
       }
       this.u.setPageMargin(a1.d(R.dimen.arg_RES_7f07044a));
       this.u.setOffscreenPageLimit(1);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "5")) {
          return;
       }
       t0 tv = this.v;
       if (tv != null) {
          t0 ty = this.y;
          if (ty != null) {
             tv.s(ty);
          }
       }
       return;
    }
    public final boolean P8(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, t0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!q.f(p1) && !TextUtils.x(p0)) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             if (TextUtils.n(p0, String.valueOf(iterator.next()))) {
                return true;
             }
          }
       }
       return false;
    }
    public final ProfileTabModel R8(int p0){
       List obj;
       ProfileTabModel profileTabMo;
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ot0, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = h.m(this.q.mUserProfile);
       if (q.f(obj)) {
          return null;
       }else {
          Iterator iterator = obj.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return null;
             }
             profileTabMo = iterator.next();
             if (profileTabMo.getTabId() == p0) {
                break ;
             }
          }
          return profileTabMo;
       }
    }
    public final List S8(List p0){
       int i1;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, t0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          r0 or0 = new r0(this.r, i, this.R8(i), this.q, this.p, this.t);
          Context context = this.getContext();
          Object[] objArray = null;
          Class uClass = (this.z.get(v4.c) == null)? objArray: this.z.get(v4.c).a();
          c uoc = k0.a(context, v4, uClass);
          obj.add(uoc);
          View view = uoc.c().b();
          if (p0.size() >= 4 && (view != null && (view.getLayoutParams() == null || view.getWidth() < 0))) {
             t0 obj1 = PatchProxy.apply(objArray, this, t0.class, "12");
             if (obj1 != PatchProxyResult.class) {
                i1 = obj1.intValue();
             }else {
                obj1 = this.x;
                if (obj1 > null) {
                   i1 = obj1;
                }else if(d2.g()){
                   i = d2.b(this.getActivity());
                }else {
                   i = n.z(this.getContext());
                }
                i1 = i / 4;
                this.x = i1;
             }
             view.setLayoutParams(new LinearLayout$LayoutParams(i1, -1));
          }
       label_00b6 :
          if (view != null) {
             view = view.findViewById(R.id.tab_text);
             if (view instanceof RadioDotButton) {
                view.setSingleLine();
                view.setDotPaddingTop(0);
                view.setDotPaddingLeft(a1.e(5.00f));
             }
          }
       }
       return obj;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "7")) {
          return;
       }
       if (this.A != null) {
          t0 ts = this.s;
          Fragment uFragment = ts.nh(ts.rh(String.valueOf(1)));
          if (uFragment instanceof l) {
             uFragment.a();
          }
          this.A = false;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0.class, "1")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a32d2);
       this.v = m1.f(p0, 0x7f0a3cb6);
       this.w = m1.f(p0, 0x7f0a3ca2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "3")) {
          return;
       }
       this.p = this.q8(v.class);
       this.q = this.q8(ProfileParam.class);
       this.r = this.q8(User.class);
       this.s = this.r8("PROFILE_FRAGMENT");
       this.t = this.s8(j1.class);
       this.D = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
