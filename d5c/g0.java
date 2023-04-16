package d5c.g0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d5c.c0;
import ok.x;
import com.google.common.base.Suppliers;
import android.util.SparseArray;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.util.SparseIntArray;
import java.util.HashSet;
import com.google.common.collect.o;
import z5c.y2;
import d5c.g0$a;
import d5c.g0$b;
import d5c.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import z2c.d;
import java.lang.Boolean;
import z2c.b;
import z2c.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import a3c.e;
import lnc.a1;
import android.view.View;
import z5c.k1;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import com.kwai.framework.model.user.User;
import z5c.e3;
import z5c.d3;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import x5c.b;
import androidx.viewpager.widget.ViewPager$i;
import brd.t;
import j5c.c;
import d5c.k;
import d5c.f0;
import erd.g;
import crd.b;
import d5c.m;
import d5c.e;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import t45.d;
import brd.z;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import d5c.g;
import z5c.l0;
import s1c.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import d5c.r;
import erd.o;
import d5c.l;
import d5c.q;
import d5c.s;
import d5c.j;
import d5c.t;
import erd.r;
import d5c.n;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import d5c.p;
import j5c.a;
import d5c.i;
import bp6.a;
import d5c.f;
import d5c.h;
import d5c.g0$c;
import java.util.Set;
import android.widget.HorizontalScrollView;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Runnable;
import ekd.k1;
import android.widget.ImageView;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import android.animation.Animator;
import android.animation.ValueAnimator;
import d5c.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import d5c.g0$d;
import android.animation.Animator$AnimatorListener;
import d5c.b0;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.kwai.framework.model.user.ProfileTabModel;
import ra6.a;
import z5c.g3;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableString;
import java.util.Locale;
import android.text.style.AbsoluteSizeSpan;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.framework.model.user.UserProfile;
import ekd.m1;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.ProfileReboundBehavior;
import z5c.h3;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import d5c.w;
import oe6.e;
import s1c.v;
import xl8.b;
import com.yxcorp.gifshow.profile.util.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import z5c.y1;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import lnc.o5;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import k2b.f3;
import k2b.e0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;
import java.util.HashMap;
import java.util.Map;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.text.TextPaint;
import zf6.j;
import d5c.z;
import android.view.View$OnClickListener;
import d5c.o;
import wh5.c;
import com.kwai.framework.model.user.QCurrentUser;
import android.text.SpannableStringBuilder;
import android.graphics.drawable.Drawable;
import lnc.b3;
import b6c.h;
import d5c.v;
import com.kwai.framework.model.user.UserOwnerCount;
import com.yxcorp.gifshow.profile.common.model.UserCollectCount;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import v2c.g;
import com.yxcorp.utility.n;
import x2c.a;
import u3c.h;
import k2b.u1;
import android.app.Activity;
import p3c.l;
import java.util.Objects;
import p3c.l$a;
import kotlin.jvm.internal.a;
import p3c.a;
import java.lang.ref.WeakReference;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import e17.i;
import com.yxcorp.gifshow.profile.widget.RadioDotButton;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import s1c.o;

public class g0 extends PresenterV2	// class@0020f5
{
    public Fragment A;
    public NestedScrollViewPager B;
    public PagerSlidingTabStrip C;
    public View D;
    public AppBarLayout E;
    public View F;
    public View G;
    public View H;
    public ProfileReboundBehavior I;
    public SparseArray J;
    public SparseArray K;
    public List L;
    public b M;
    public final List N;
    public SparseIntArray O;
    public Set P;
    public y2 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public RadioDotButton U0;
    public UserCollectCount V;
    public int V0;
    public int W;
    public int W0;
    public boolean X;
    public View X0;
    public boolean Y;
    public ImageView Y0;
    public Runnable Z;
    public a Z0;
    public a a1;
    public int b1;
    public a c1;
    public boolean d1;
    public boolean e1;
    public int f1;
    public final ViewPager$i g1;
    public RecyclerView$r h1;
    public User p;
    public ProfileParam q;
    public v r;
    public BaseFragment s;
    public Typeface t;
    public c u;
    public int v;
    public b w;
    public a x;
    public RecyclerView y;
    public Set z;
    public static final x i1;

    static {
       g0.i1 = Suppliers.a(c0.b);
    }
    public void g0(){
       super();
       this.J = new SparseArray();
       this.K = new SparseArray();
       this.L = new ArrayList();
       this.N = Lists.b();
       this.O = new SparseIntArray();
       this.P = o.h();
       this.Q = new y2();
       this.U = true;
       this.V0 = 0;
       this.W0 = 0;
       this.f1 = 0;
       this.g1 = new g0$a(this);
       this.h1 = new g0$b(this);
       this.U7(new c());
    }
    public static int P8(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, og0, "31");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.max(p0, 0);
    }
    public static d Z8(boolean p0,int p1){
       g0 og0 = g0.class;
       a uoa = null;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), uoa, og0, "53");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       SparseArray a = (p0)? b.a: b.b;
       a uoa1 = a.get(p1);
       if (uoa1 != null) {
          uoa = uoa1.c;
       }
       return uoa;
    }
    public void E8(){
       g a1;
       if (PatchProxy.applyVoid(null, this, g0.class, "4")) {
          return;
       }
       this.C.setTextColor(R.color.arg_RES_7f061cc4);
       if (e.a(this.v)) {
          k1.c(this.F, a1.d(R.dimen.arg_RES_7f070313));
       }
       if (this.t == null) {
          this.t = d0.a("alte-din.ttf", this.getContext());
       }
       this.S = e3.a(this.p);
       this.T = d3.a(this.p);
       this.M = this.B.getAdapter();
       this.B.addOnPageChangeListener(this.g1);
       this.X7(this.u.e().subscribe(new k(this), new f0(this)));
       this.X7(this.u.b().subscribe(new m(this), new e(this)));
       z a = d.a;
       FragmentEvent dESTROY = FragmentEvent.DESTROY;
       this.X7(this.p.observable().observeOn(a).compose(c.c(this.s.m(), dESTROY)).subscribe(new g(this), l0.a("ProfileTabPresenter")));
       this.X7(this.r.d.f("PROFILE_TAB_CHANGE").map(r.b).doOnNext(new l(this)).distinctUntilChanged().subscribe(new q(this), l0.a("ProfileTabPresenter")));
       this.X7(this.r.d.f("PROFILE_FEED_LOAD").map(s.b).subscribe(new j(this), l0.a("ProfileTabPresenter")));
       a1 = l0.a;
       this.X7(this.s.m().compose(c.c(this.s.m(), dESTROY)).filter(t.b).subscribe(new n(this), a1));
       this.X7(this.s.Vg().j().subscribe(new p(this), a1));
       this.X7(this.x.b().subscribe(new i(this), new a()));
       this.X7(this.p.observable().subscribe(new f(this), l0.a("ProfileTabPresenter")));
       t ot = this.r.d.f("PROFILE_ACTIONBAR_CLICK").observeOn(a);
       this.X7(ot.subscribe(new h(this)));
       this.z.add(new g0$c(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "2")) {
          return;
       }
       this.C.setVisibility(8);
       this.C.setTabGravity(17);
       this.C.setTabTypefaceStyle(0);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "6")) {
          return;
       }
       this.J.clear();
       this.K.clear();
       this.L.clear();
       this.O.clear();
       this.N.clear();
       this.P.clear();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "5")) {
          return;
       }
       this.B.removeOnPageChangeListener(this.g1);
       g0 ty = this.y;
       if (ty != null) {
          ty.removeOnScrollListener(this.h1);
       }
       ty = this.Z;
       if (ty != null) {
          k1.m(ty);
       }
       ty = this.Y0;
       if (ty != null) {
          ty.clearAnimation();
       }
       u.c(this.Z0);
       u.c(this.a1);
       this.Z0 = null;
       return;
    }
    public final Animator R8(){
       ValueAnimator obj = PatchProxy.apply(null, this, g0.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       obj.setDuration(500);
       obj.addUpdateListener(new d(this));
       obj.addListener(new g0$d(this));
       return obj;
    }
    public final String S8(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ProfileTabModel profileTabMo = y.y(this.L, new b0(p0)).orNull();
       String str = (profileTabMo == null)? String.valueOf(0): profileTabMo.getLogTabId();
       return str;
    }
    public final int V8(){
       Object obj = PatchProxy.apply(null, this, g0.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       float f = (a.e())? 14.00f: 15.00f;
       int i = a1.e(f);
       if (!e.a(this.v)) {
          i = g3.a(i);
       }
       return i;
    }
    public final CharSequence W8(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       return new SpannableString(p0);
    }
    public final CharSequence X8(String p0,CharSequence p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g0.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{p1,p0};
       p0 = String.format(a.c(), "%s %s", objArray);
       float f = (a.e())? 12.00f: 15.00f;
       int i = a1.e(f);
       if (!e.a(this.v)) {
          i = g3.a(i);
       }
       SpannableString spannableStr = new SpannableString(p0);
       spannableStr.setSpan(new AbsoluteSizeSpan(i, 0), 0, p1.length(), 17);
       spannableStr.setSpan(new AbsoluteSizeSpan(this.V8(), 0), p1.length(), p0.length(), 17);
       return spannableStr;
    }
    public final PagerSlidingTabStrip$d Y8(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.M.e(String.valueOf(p0));
    }
    public final int a9(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "46");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.x9(p0)) {
          return p0;
       }else {
          return 0;
       }
    }
    public final int b9(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.O.get(p0, Integer.MIN_VALUE);
    }
    public final int c9(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = this.N.indexOf(Integer.valueOf(p0));
       if (p0 == -1) {
          p0 = 0;
       }
       return p0;
    }
    public final boolean d9(UserProfile p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.T != null || (!d3.d(this.p, p0) && (this.p.isBanned() || p0 == null)))? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a32d2);
       this.H = m1.f(p0, 0x7f0a32b1);
       this.C = m1.f(p0, 0x7f0a3cb6);
       this.D = m1.f(p0, 0x7f0a3cb0);
       this.E = m1.f(p0, 0x7f0a0225);
       this.F = m1.f(p0, 0x7f0a3cb7);
       this.G = m1.f(p0, 0x7f0a3ca3);
       this.I = h3.a(this.E);
       return;
    }
    public final void e9(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og0, "12")) {
          return;
       }
       this.h9(p0, false);
       return;
    }
    public final void h9(int p0,boolean p1){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, og0, "13")) {
          return;
       }
       this.q.mPhotoTabId = p0;
       int i = this.c9(p0);
       if (p1 && i >= 4) {
          k1.r(new w(this, i), 100);
       }
       e.B0(this.q.mPhotoTabId);
       int i1 = this.c9(p0);
       this.B.setCurrentItem(i1);
       PagerSlidingTabStrip$d uod = this.Y8(p0);
       if (uod != null) {
          uod.b().setSelected(true);
       }
       this.n9(i1);
       this.m9(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "3")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.q8(ProfileParam.class);
       this.r = this.q8(v.class);
       this.s = this.r8("PROFILE_FRAGMENT");
       this.t = d0.a("alte-din.ttf", this.getContext());
       this.u = this.r8("PROFILE_LOAD_STATE");
       this.v = this.r8("PROFILE_STYLE").intValue();
       this.w = this.r8("PROFILE_OPERATION_BTN_SCROLL_TO_TOP");
       this.x = this.r8("PROFILE_APP_BAR_SCROLL_STATE");
       this.z = this.r8("PROFILE_BUBBLE_SHOW_TASK_LIST");
       return;
    }
    public final void j9(UserProfile p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "55")) {
          return;
       }
       if (a.b(p0)) {
          return;
       }
       if (!q.f(this.L) && !this.d9(p0)) {
          Iterator iterator = this.L.iterator();
          while (iterator.hasNext()) {
             ProfileTabModel profileTabMo = iterator.next();
             g0 ts = this.s;
             String id = this.p.getId();
             String logTabId = profileTabMo.getLogTabId();
             String str = TextUtils.I(this.K.get(profileTabMo.getTabId()));
             int i = this.b9(profileTabMo.getTabId());
             profileTabMo = profileTabMo.mIndex;
             y1 oy1 = y1.class;
             int i1 = 2;
             if (PatchProxy.isSupport(oy1)) {
                Object[] objArray = new Object[6];
                objArray[0] = ts;
                objArray[1] = id;
                objArray[i1] = logTabId;
                objArray[3] = str;
                objArray[4] = Integer.valueOf(i);
                objArray[5] = Integer.valueOf(profileTabMo);
                if (PatchProxy.applyVoid(objArray, null, oy1, "57")) {
                   continue ;
                }
             }
             i3 oi3 = i3.f();
             oi3.d("tab_id", logTabId);
             oi3.d("tab_name", str);
             oi3.c("tab_num", Integer.valueOf(Math.max(i, 0)));
             oi3.c("tab_index", Integer.valueOf(profileTabMo));
             int i2 = e.N();
             ClientContent$ContentPackage uContentPack = b0.c(id, 0, i2);
             i2 = o5.b(logTabId, i2);
             ClientContent$ContentPackage profilePacka = uContentPack.profilePackage;
             if (i2 == 1 || (i2 == i1 || i2 == 3)) {
                i1 = 1;
             }
             profilePacka.style = i1;
             f3 uof3 = f3.i(803);
             uof3.m(oi3.e());
             uof3.b(uContentPack);
             uof3.h(ts);
          }
       }
       return;
    }
    public boolean k9(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g0 og0 = g0.class;
       Object[] objArray = null;
       g0 obj = PatchProxy.apply(objArray, this, og0, "37");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.W0;
       Object obj1 = PatchProxy.apply(objArray, this, og0, "38");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          g0 ty = this.y;
          i = (ty == null || ty.getAdapter() == null)? 0: this.y.getAdapter().b1();
       }
       if (obj > (i + 27) && this.w.a().booleanValue()) {
          b = true;
       }
       return b;
    }
    public final void l9(List p0,int p1){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og0, "19")) {
          return;
       }
       HashMap hashMap = new HashMap(3);
       hashMap.put("TAB_IDS", p0);
       hashMap.put("LOCATE_TAB_ID", Integer.valueOf(p1));
       this.r.d.c("PROFILE_TAB_DATA", hashMap);
       return;
    }
    public void m9(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og0, "18")) {
          return;
       }
       this.r.d.b("PROFILE_TAB_CHANGE", "MAIN_KEY", Integer.valueOf(p0));
       return;
    }
    public void n9(int p0){
       TextView textView;
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og0, "50")) {
          return;
       }
       View childAt = this.C.getTabsContainer().getChildAt(this.V0);
       int i = 0x7f0a3caa;
       if (childAt != null) {
          textView = childAt.findViewById(i);
          if (textView != null) {
             textView.getPaint().setFakeBoldText(false);
             textView.setTextColor(j.d(textView, R.color.arg_RES_7f061673));
             textView.setSelected(false);
          }
       }
       childAt = this.C.getTabsContainer().getChildAt(p0);
       if (childAt != null) {
          textView = childAt.findViewById(i);
          if (textView != null) {
             textView.getPaint().setFakeBoldText(true);
             textView.setTextColor(j.d(textView, R.color.arg_RES_7f061642));
             textView.setSelected(true);
             this.V0 = p0;
          }
       }
       return;
    }
    public final void o9(int p0,CharSequence p1){
       SpannableStringBuilder spannableStr;
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, og0, "34")) {
          return;
       }
       PagerSlidingTabStrip$d uod = this.Y8(p0);
       if (uod == null) {
          return;
       }
       if (p0 == 1) {
          uod.i(new z(this));
       }else {
          uod.i(new o(this));
       }
       TextView textView = uod.b().findViewById(R.id.tab_text);
       if (PatchProxy.isSupport(og0)) {
          String[] obj = PatchProxy.applyTwoRefs(p1, Integer.valueOf(p0), this, og0, "41");
          if (obj != PatchProxyResult.class) {
             spannableStr = obj;
          }else if(c.j()){
             og0 = this.T;
             int i = 6;
             if (og0 != null || p0 == i) {
                int i1 = 19;
                if (p0 == i || (p0 == i1 || (p0 == 3 || (p0 == 2 || p0 == 15)))) {
                   if (p0 == i) {
                      if (og0 == null || !QCurrentUser.me().isNotPublicProfileCollect()) {
                      label_0148 :
                         textView.setText(spannableStr);
                         return;
                      }
                   }else if(p0 != i1 || (og0 != null && QCurrentUser.me().isMentionedTabPrivate())){
                   }
                   String str = " ";
                   obj = (p1.toString()).split(str);
                   SpannableStringBuilder spannableStr1 = new SpannableStringBuilder();
                   b3 uob3 = new b3(this.getContext(), 0x7f0822e2);
                   uob3.b(a.e());
                   uob3.c(j.n(this.getContext(), R.drawable.arg_RES_7f0822e2, 0x7f061cc4));
                   spannableStr1.append(uob3.a());
                   spannableStr1.append(str);
                   p0 = spannableStr1.length();
                   spannableStr1.append(p1.toString());
                   float f = (a.e())? 12.00f: 15.00f;
                   int i2 = a1.e(f);
                   if (!e.a(this.v)) {
                      i2 = g3.a(i2);
                   }
                   spannableStr1.setSpan(new AbsoluteSizeSpan(i2, false), p0, ((obj[0]).length() + p0), 17);
                   spannableStr1.setSpan(new h((float)i2), p0, ((obj[0]).length() + p0), 17);
                   if (obj.length > 1) {
                      i2 = this.V8();
                      spannableStr1.setSpan(new AbsoluteSizeSpan(i2, false), (((obj[0]).length() + p0) + 1), spannableStr1.length(), 17);
                      spannableStr1.setSpan(new h((float)i2), ((p0 + (obj[0]).length()) + 1), spannableStr1.length(), 17);
                   }
                   spannableStr = spannableStr1;
                   goto label_0148 ;
                }
             }else {
                goto label_0148 ;
             }
          }
       }else {
          goto label_0056 ;
       }
    }
    public final void q9(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og0, "10")) {
          return;
       }
       this.s9(p0, false);
       return;
    }
    public final void s9(int p0,boolean p1){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, og0, "11")) {
          return;
       }
       int i = this.c9(p0);
       if (p1 && i >= 4) {
          k1.r(new v(this, i), 100);
       }
       g0 tq = this.q;
       ProfileParam mPhotoTabId = tq.mPhotoTabId;
       if (p0 == mPhotoTabId) {
          e.B0(this.a9(mPhotoTabId));
          return;
       }else {
          tq.mPhotoTabId = p0;
          e.B0(this.a9(p0));
          int i1 = this.c9(p0);
          this.B.setCurrentItem(i1);
          this.n9(i1);
          this.m9(p0);
          return;
       }
    }
    public final void t9(UserOwnerCount p0,boolean p1){
       Iterator iterator;
       int i2;
       CharSequence uCharSequenc;
       ProfileParam obj2;
       Object obj = this;
       int i = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(i, Boolean.valueOf(p1), obj, og0, "32")) {
          return;
       }
       int b = 14;
       g0 og01 = 19;
       if (p1 || (obj.R != null && !q.f(obj.P))) {
          iterator = obj.P.iterator();
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             int i1 = integer.intValue();
             if (i1 != 1) {
                if (i1 != 2) {
                   if (i1 != 4) {
                      if (i1 != 8) {
                         if (i1 != og01) {
                            if (i1 != 13) {
                               if (i1 != b) {
                                  i2 = integer.intValue();
                                  if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), i, obj, og0, "51")) {
                                     continue ;
                                  }else {
                                     i1 = obj.O.get(i2, Integer.MIN_VALUE);
                                     if (i1 == Integer.MIN_VALUE) {
                                        continue ;
                                     }else {
                                        d uod = g0.Z8(obj.T, i2);
                                        if (uod != null) {
                                           uod.a(i, i1);
                                        }
                                     }
                                  }
                               }else {
                                  i.mAcFun = obj.O.get(integer.intValue());
                               }
                            }else {
                               i.mDesignerMagic = obj.O.get(integer.intValue());
                            }
                         }else {
                            i.mentionedMeWorksCount = obj.O.get(integer.intValue());
                         }
                      }else {
                         i.mArticlePublic = obj.O.get(integer.intValue());
                      }
                   }else {
                      i.mSong = obj.O.get(integer.intValue());
                   }
                }else {
                   i.mPrivatePhoto = obj.O.get(integer.intValue());
                }
             }else {
                i.mPublicPhoto = obj.O.get(integer.intValue());
             }
          }
       }
       iterator = obj.N.iterator();
       String str = "ProfileTabPresenter";
       int i3 = 0;
       Object[] objArray = null;
       while (iterator.hasNext()) {
          i2 = iterator.next().intValue();
          if (obj.x9(i2)) {
             if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), i, obj, og0, "33")) {
                if (i2 != 8) {
                   if (i2 != 12) {
                      if (i2 != b) {
                         if (i2 != 18) {
                            if (i2 != og01) {
                               switch (i2){
                                   case 1:
                                     obj.O.put(i2, g0.P8(i.mPublicPhoto));
                                     break;
                                   case 2:
                                     obj.O.put(i2, g0.P8(i.mPrivatePhoto));
                                     break;
                                   case 3:
                                     obj.O.put(i2, g0.P8(i.mLike));
                                     break;
                                   case 4:
                                     obj.O.put(i2, g0.P8(i.mSong));
                                     break;
                                   case 5:
                                     obj.O.put(i2, g0.P8(i.mMoment));
                                     break;
                                   case 6:
                                     obj.O.put(i2, g0.P8(i.mCollection));
                                     break;
                                   default:
                                     g0 o = obj.O;
                                     if (PatchProxy.isSupport(og0)) {
                                        d obj3 = PatchProxy.applyTwoRefs(Integer.valueOf(i2), i, obj, og0, "52");
                                        if (obj3 != patchProxyRe) {
                                           b = obj3.intValue();
                                        }else {
                                        label_0191 :
                                           obj3 = g0.Z8(obj.T, i2);
                                           if (obj3 != null) {
                                              b = obj3.b(i);
                                              if (b != Integer.MIN_VALUE) {
                                                 b = g0.P8(b);
                                              }
                                           }
                                           b = Integer.MIN_VALUE;
                                        }
                                     }else {
                                        goto label_0191 ;
                                     }
                                     o.put(i2, b);
                               }
                            }else {
                               obj.O.put(i2, g0.P8(i.mentionedMeWorksCount));
                            }
                         }else {
                            obj.O.put(i2, g0.P8(i.mNews));
                         }
                      }else {
                         obj.O.put(i2, g0.P8(i.mAcFun));
                      }
                   }else {
                      obj.O.put(i2, g0.P8(i.mLivePlayBack));
                   }
                }else {
                   obj.O.put(i2, g0.P8(i.mArticlePublic));
                }
             }
             if (c.j()) {
                if (PatchProxy.isSupport(og0)) {
                   uCharSequenc = PatchProxy.applyOneRefs(Integer.valueOf(i2), obj, og0, "27");
                   if (uCharSequenc != patchProxyRe) {
                   }
                }
                uCharSequenc = obj.W8(TextUtils.k(obj.J.get(i2)));
             }else {
                String str1 = "";
                boolean b1 = 6;
                if (i2 == b1 && obj.V != null) {
                   g0 obj1 = PatchProxy.apply(objArray, obj, og0, "28");
                   if (obj1 != patchProxyRe) {
                      uCharSequenc = obj1;
                   }else {
                      obj1 = obj.V;
                      if (obj1 != null) {
                         str1 = obj1.mCollect;
                         if (!PatchProxy.applyVoid(objArray, obj, og0, "49")) {
                            HashMap hashMap = new HashMap(9);
                            hashMap.put("mCollect", obj.V.mCollect);
                            hashMap.put("mMagicFace", obj.V.mMagicFace);
                            hashMap.put("mMusic", obj.V.mMusic);
                            hashMap.put("mPhoto", obj.V.mPhoto);
                            hashMap.put("mPOI", obj.V.mPOI);
                            hashMap.put("mTag", obj.V.mTag);
                            List list = KsLogProfileTag.TAB_COUNT.appendTag(str);
                            str = (obj.T != null)? "myCollectCount": "userCollectCount";
                            g.g(list, str, hashMap);
                         }
                      }
                      ProfileParam mUserProfile = obj.q.mUserProfile;
                      if (mUserProfile != null && mUserProfile.mIsolated != null) {
                         str1 = "0";
                      }
                      obj.O.put(b1, o5.b(str1, i3));
                      if (str1.startsWith("-")) {
                         uCharSequenc = obj.X8("X", TextUtils.k(obj.J.get(b1)));
                      }else {
                         uCharSequenc = obj.X8(str1, TextUtils.k(obj.J.get(b1)));
                      }
                   }
                }else {
                   int i4 = obj.O.get(i2);
                   if (PatchProxy.isSupport(og0)) {
                      obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i4), Integer.valueOf(i2), obj, og0, "26");
                      if (obj2 != patchProxyRe) {
                         uCharSequenc = obj2;
                      }
                   }
                   if (obj.T == null) {
                      obj2 = obj.q.mUserProfile;
                      if (obj2 != null && obj2.mIsolated != null) {
                      label_02fb :
                         if (i2 == 1 && (i3 <= 10 && (i3 && !obj.P.contains(Integer.valueOf(i2))))) {
                            uCharSequenc = obj.X8(str1, TextUtils.k(obj.J.get(i2)));
                         }else {
                            uCharSequenc = obj.X8(TextUtils.N((long)i3), TextUtils.k(obj.J.get(i2)));
                         }
                      }
                   }
                   i3 = i4;
                   goto label_02fb ;
                }
             }
             obj.o9(i2, uCharSequenc);
          }
          b = 14;
          og01 = 19;
       }
       if (obj.S != null && !PatchProxy.applyVoid(objArray, obj, og0, "29")) {
          Iterator iterator1 = obj.L.iterator();
          while (iterator1.hasNext()) {
             ProfileTabModel profileTabMo = iterator1.next();
             if (profileTabMo.isBusinessTab()) {
                obj.o9(profileTabMo.getTabId(), obj.W8(TextUtils.k(obj.J.get(profileTabMo.getTabId()))));
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, obj, og0, "48")) {
          i = obj.J.size();
          HashMap hashMap1 = new HashMap((int)(((float)i / 0x3f400000) + 0x3f800000));
          for (; i3 < i; i3 = i3 + 1) {
             hashMap1.put(obj.J.valueAt(i3), String.valueOf(obj.O.get(obj.J.keyAt(i3))));
          }
          List list1 = KsLogProfileTag.TAB_COUNT.appendTag(str);
          String str2 = (obj.T != null)? "updateMyPhotoNum": "updateUserPhotoNum";
          g.g(list1, str2, hashMap1);
       }
       return;
    }
    public final void u9(UserProfile p0){
       g0 q;
       Iterator obj1;
       int i3;
       String str1;
       l$a b2;
       a uoa;
       int b3;
       boolean b = this;
       View[] obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g0 og0 = g0.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, og0, "17")) {
          return;
       }
       if (b.X == null) {
          return;
       }
       b.S = e3.a(b.p);
       int b1 = this.d9(p0);
       g0 c = b.C;
       int i = 8;
       int i1 = (b1)? 8: 0;
       c.setVisibility(i1);
       int i2 = 2;
       View[] viewArray = new View[i2];
       viewArray[0] = b.H;
       viewArray[1] = b.G;
       n.Z(i, viewArray);
       b.E.removeView(b.F);
       if (!b1) {
          b.C.setVisibility(0);
          b.E.addView(b.F);
       }
       if (b1 || obj == null) {
          if (e.a(b.v)) {
             b.E.addView(b.F);
             b.C.setVisibility(i);
             obj = new View[]{b.G};
             n.Z(0, obj);
          }
          b.N.clear();
          b.N.add(Integer.valueOf(1));
          b.l9(b.N, 1);
          return;
       }else {
          b.V = a.c(p0);
          List list = h.m(p0);
          if (!PatchProxy.applyVoidOneRefs(list, b, og0, "20") && !q.f(list)) {
             b.L.clear();
             b.N.clear();
             obj1 = list.iterator();
             i = 1;
             while (obj1.hasNext()) {
                ProfileTabModel profileTabMo1 = obj1.next();
                Object obj2 = PatchProxy.applyOneRefs(profileTabMo1, b, og0, "21");
                if (obj2 != patchProxyRe) {
                   b3 = obj2.booleanValue();
                }else if(profileTabMo1 != null && b.x9(profileTabMo1.mType)){
                   b3 = true;
                }else {
                   b3 = false;
                }
                if (b3 && (profileTabMo1.mShowStatus == i2 || (b.S == null && profileTabMo1.isBusinessTab()))) {
                   continue ;
                }
                b3 = i + 1;
                profileTabMo1.mIndex = i;
                b.L.add(profileTabMo1);
                i = profileTabMo1.getTabId();
                b.N.add(Integer.valueOf(i));
                b.J.put(i, profileTabMo1.mName);
                b.K.put(i, profileTabMo1.mTabLogName);
                i = b3;
             }
          }
          if (q.f(b.N)) {
             i3 oi3 = i3.f();
             oi3.d("id", b.p.getId());
             b1 = (h.m(p0) == null)? true: false;
             oi3.a("tabList", Boolean.valueOf(b1));
             u1.R("profile_tab", oi3.e(), 13);
             b.N.add(Integer.valueOf(1));
             b.J.put(1, a1.p(R.string.arg_RES_7f103dfd));
             b.K.put(1, "product");
             b.l9(b.N, 1);
          }else if(b.q.mFirstLoadUserProfile != null){
             obj1 = PatchProxy.applyOneRefs(obj, b, og0, "8");
             if (obj1 != patchProxyRe) {
                i3 = obj1.intValue();
             }else if(b.q.mPhotoTabId == 4 && b.N.contains(Integer.valueOf(4))){
                i3 = 4;
             }else if(b.q.mMomentParam != null && b.N.contains(Integer.valueOf(5))){
                if (b.N.contains(Integer.valueOf(5))) {
                   q = b.q;
                   if (q.mPhotoTabId == 5 && q.mMomentParam != null) {
                      i3 = 1;
                   }
                }
                if (b.q.mPhotoTabId != 18 || (b.N.contains(Integer.valueOf(18)) || !b.N.contains(Integer.valueOf(5)))) {
                   if (b.T == null && (b.q.mPhotoTabId == null && b.N.contains(Integer.valueOf(h.a(p0))))) {
                      i3 = h.a(p0);
                   }else if(b.x9(b.q.mPhotoTabId) && b.N.contains(Integer.valueOf(b.q.mPhotoTabId))){
                      i3 = b.q.mPhotoTabId;
                   }else {
                      i3 = b.N.get(0).intValue();
                   }
                }
             }
             i3 = 5;
          }else {
             i3 = 0;
          }
          if (b.q.mFirstLoadUserProfile != null && (!PatchProxy.isSupport(og0) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i3), b, og0, "58") && (!q.f(b.L) && this.getActivity() != null)))) {
             b1 = 0;
             while (b1 < b.L.size()) {
                ProfileTabModel profileTabMo = b.L.get(b1);
                if (profileTabMo != null && profileTabMo.getTabId() == i3) {
                   String str = String.valueOf(this.getActivity().hashCode());
                   if (PatchProxy.isSupport(l.class)) {
                      str1 = str;
                      if (!PatchProxy.applyVoidThreeRefs(profileTabMo, Integer.valueOf(b1), str, null, l.class, "1")) {
                      }
                   }else {
                      str1 = str;
                   }
                }
                b1 = b1 + 1;
             }
          }
       label_02bf :
          b.l9(b.N, b.c9(i3));
          Object[] objArray = null;
          if (b.T != null) {
             if (!PatchProxy.applyVoid(objArray, b, og0, "25")) {
                User mOwnerCount = b.p.mOwnerCount;
                b.t9(mOwnerCount, 0);
                UserOwnerCount mCollection = mOwnerCount.mCollection;
                if (mCollection != b.W) {
                   SharedPreferences$Editor uEditor = a.a.edit();
                   uEditor.putInt("collectPhotoCnt", mCollection);
                   g.a(uEditor);
                   b.W = mOwnerCount.mCollection;
                }
             }
          }else if(PatchProxy.applyVoid(objArray, b, og0, "30")){
             b.t9(b.p.mOwnerCount, 0);
          }
          if (!PatchProxy.applyVoidOneRefs(obj, b, og0, "7")) {
             q = b.q;
             if (q.mFirstLoadUserProfile == null) {
                if (!b.N.contains(Integer.valueOf(q.mPhotoTabId))) {
                   b.e9(b.N.get(0).intValue());
                }else {
                   b.e9(b.q.mPhotoTabId);
                }
             }else {
                q.mFirstLoadUserProfile = false;
                if (q.mPhotoTabId == 4 && b.N.contains(Integer.valueOf(4))) {
                   b.h9(4, 1);
                }else if(b.q.mMomentParam != null && b.N.contains(Integer.valueOf(5))){
                   b.s9(5, 1);
                   b.q.mAutoSelectedMomentBtn = true;
                }else if(b.N.contains(Integer.valueOf(5))){
                   q = b.q;
                   if (q.mPhotoTabId == 5) {
                      ProfileParam mMomentParam = q.mMomentParam;
                      if (mMomentParam != null) {
                         if (mMomentParam.isNotifyIfInvalid()) {
                            i.a(R.style.arg_RES_7f11066a, 0x7f103f47);
                         }
                         b.q.mMomentParam.setLocated(1);
                         b.q9(1);
                      }
                   }
                }
                if (b.q.mPhotoTabId == 18 && (!b.N.contains(Integer.valueOf(18)) && b.N.contains(Integer.valueOf(5)))) {
                   b.s9(5, 1);
                   b.q.mAutoSelectedMomentBtn = true;
                }else if(b.T == null && (b.q.mPhotoTabId == null && b.N.contains(Integer.valueOf(h.a(p0))))){
                   b.s9(h.a(p0), 1);
                   q = b.q;
                   b1 = (h.a(p0) == 5)? true: false;
                   q.mAutoSelectedMomentBtn = b1;
                }else if(b.x9(b.q.mPhotoTabId) && b.N.contains(Integer.valueOf(b.q.mPhotoTabId))){
                   b.h9(b.q.mPhotoTabId, 1);
                }else {
                   b.q9(b.N.get(0).intValue());
                }
             }
          }
          if (PatchProxy.applyVoidOneRefs(obj, b, og0, "23") || (b.T != null && b.N.contains(Integer.valueOf(5)))) {
             PagerSlidingTabStrip$d uod = b.Y8(5);
             if (uod != null) {
                View view = uod.b();
                if (view != null) {
                   RadioDotButton radioDotButt = view.findViewById(R.id.tab_text);
                   b.U0 = radioDotButt;
                   if (obj.mOwnerCount.mMoment == null) {
                      ConstraintLayout$LayoutParams layoutParams = radioDotButt.getLayoutParams();
                      layoutParams.width = -1;
                      b.U0.setLayoutParams(layoutParams);
                      View view1 = view.findViewById(R.id.tab_layout);
                      b.X0 = view1;
                      LinearLayout$LayoutParams layoutParams1 = view1.getLayoutParams();
                      layoutParams1.width = -1;
                      layoutParams1.height = -1;
                      b.X0.setLayoutParams(layoutParams1);
                      b.U0.setShowDot((o.a.getBoolean("profile_moment_tab_dot_shown", 0) ^ 1));
                   }else {
                      o.A(1);
                   }
                }
             }
          }
          return;
       }
    }
    public final boolean x9(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (p0 < i || (p0 > g0.i1.get().intValue() || (p0 == 7 || (p0 == 10 || p0 == 11)))) {
          i = false;
       }
       return i;
    }
}
