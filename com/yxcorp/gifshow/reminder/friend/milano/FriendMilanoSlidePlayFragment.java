package com.yxcorp.gifshow.reminder.friend.milano.FriendMilanoSlidePlayFragment;
import mdc.b;
import qvb.q;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import udc.b;
import sdc.a;
import android.util.Pair;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import lec.r;
import lec.w;
import com.yxcorp.gifshow.reminder.friend.data.a;
import lec.f;
import java.lang.Throwable;
import qvb.p;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import ab5.v;
import ab5.u;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import android.view.View;
import tyc.q4;
import com.yxcorp.gifshow.nasa.NasaRefreshView;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.content.Context;
import lnc.a1;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Number;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zda.w0;
import udc.s;
import z1.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.e;
import zda.s0;
import wdc.c0;
import wdc.i0;
import wdc.a0;
import wdc.n;
import c5a.l;
import wdc.g0;
import wdc.v;
import wdc.i;
import wdc.e;
import wdc.k0;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import dec.a;
import rkd.b;
import wdc.m0;
import udc.v;
import zcc.l;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import tx5.a;
import tda.m0;
import zcc.k;
import ydc.d;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter;
import tda.m;
import udc.a;
import qvb.a;
import lec.y;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import j9c.b;
import eec.a;
import ekd.x0;
import lnc.o5;
import com.yxcorp.gifshow.reminder.friend.milano.a;
import rvb.m;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import zcc.o;
import q87.c;
import com.yxcorp.gifshow.reminder.friend.preload.FriendsSlidePrefetchHelper;
import qvb.n0;
import yw6.g;
import com.yxcorp.utility.SystemUtil;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import yw6.j;
import rda.a;
import qvb.i;
import ok.o;
import bf5.e;
import udc.t;
import udc.o;
import androidx.fragment.app.c;
import k2b.e0;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import ww6.a;
import ww6.a$a;
import lnc.k4;
import ww6.b;
import ww6.d;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class FriendMilanoSlidePlayFragment extends HomeMilanoBaseContainerFragment implements b, q	// class@001ac4
{
    public b W0;

    public void FriendMilanoSlidePlayFragment(){
       super();
    }
    public int Ah(){
       return 0x2710;
    }
    public void E4(boolean p0,int p1){
       if (PatchProxy.isSupport(FriendMilanoSlidePlayFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, FriendMilanoSlidePlayFragment.class, "31")) {
          return;
       }
       if (p0) {
          this.Ih().n.b(p1);
       }
       this.Jh(new Pair(Boolean.valueOf(p0), Integer.valueOf(p1)));
       return;
    }
    public void Eh(boolean p0){
       if (PatchProxy.isSupport(FriendMilanoSlidePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FriendMilanoSlidePlayFragment.class, "22")) {
          return;
       }
       Objects.requireNonNull(this.Ih().i);
       return;
    }
    public boolean Fh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, FriendMilanoSlidePlayFragment.class, "21");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Ih().i;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, r.class, "1");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a.Gh();
       return b;
    }
    public boolean Gh(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Jh(null);
    }
    public final b Ih(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.W0 == null) {
          this.W0 = new b(this);
       }
       return this.W0;
    }
    public boolean Jh(Pair p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendMilanoSlidePlayFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Ih().j.e(p0);
    }
    public void K9(){
    }
    public boolean Kh(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "29");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Ih().j;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, w.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj.a();
          obj.c.p2(null);
          obj.c(7);
          f.e("click_tab");
          b = true;
       }
       return b;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public boolean T9(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "20");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Ih().j;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, w.class, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj.a();
          obj.c.p2(null);
          obj.c(9);
          f.e("unknown");
          b = true;
       }
       return b;
    }
    public TabIdentifier Ua(){
       return b.h;
    }
    public boolean Xf(String p0){
       w ow = w.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, FriendMilanoSlidePlayFragment.class, "19");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       u.a(this, p0);
       obj = "friends";
       if (!TextUtils.equals(p0, obj)) {
          return false;
       }
       if (this.getParentFragment() instanceof TabHostFragment) {
          TabHostFragment parentFragme = this.getParentFragment();
          PagerSlidingTabStrip$d uod = PatchProxy.applyOneRefs(parentFragme, null, ow, "16");
          if (uod != patchProxyRe) {
          }else {
             a adapter = parentFragme.s2().getAdapter();
             uod = (adapter instanceof PagerSlidingTabStrip$d$b)? adapter.e(obj): null;
          }
          if (uod != null && uod.b() != null) {
             View view = uod.b();
             if (!PatchProxy.applyVoidTwoRefs(parentFragme, view, null, ow, "15")) {
                view.setTag(R.string.arg_RES_7f1005cf, Boolean.TRUE);
                Fragment uFragment = parentFragme.t();
                if (uFragment instanceof FriendMilanoSlidePlayFragment && uFragment.getView() != null) {
                   q4.e(uFragment);
                   View view1 = uFragment.getView().findViewById(R.id.milano_container_layout);
                   if (view1 != null) {
                      NasaRefreshView nasaRefreshV = view1.findViewById(R.id.refresh_layout);
                      if (nasaRefreshV != null && !nasaRefreshV.u()) {
                         uFragment.Kh();
                      }
                   }
                }
             }
          }
       }
    label_00a0 :
       return true;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public ViewGroup dh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FriendMilanoSlidePlayFragment.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setBackgroundColor(a1.a(R.color.arg_RES_7f061ec9));
       return uFrameLayout;
    }
    public int f(){
       return 204;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendMilanoSlidePlayFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FriendMilanoSlidePlayFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       BaseFragment obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Bh();
       String pageParams = (obj != null)? obj.getPageParams(): "is_page_loading=TRUE";
       return pageParams;
    }
    public boolean i8(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       w.b(this);
       return false;
    }
    public int identity(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.hashCode();
    }
    public boolean lh(){
       return true;
    }
    public void mc(boolean p0,int p1){
       if (PatchProxy.isSupport(FriendMilanoSlidePlayFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, FriendMilanoSlidePlayFragment.class, "30")) {
          return;
       }
       if (p0) {
          this.Ih().n.b(p1);
       }
       this.Ih().h.p2(new Pair(Boolean.valueOf(p0), Integer.valueOf(p1)));
       return;
    }
    public void mh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FriendMilanoSlidePlayFragment.class, "15")) {
          return;
       }
       p0.U7(new w0(new s(this)));
       p0.U7(new e());
       p0.U7(new s0());
       p0.U7(new c0());
       p0.U7(new i0());
       p0.U7(new a0());
       p0.U7(new n());
       p0.U7(new l());
       p0.U7(new g0());
       p0.U7(new v());
       p0.U7(new i());
       p0.U7(new e());
       p0.U7(new k0());
       if (b.a(-1578665399).F()) {
          p0.U7(new a());
       }
       if (b.d()) {
          p0.U7(new m0());
       }
       p0.U7(this.Ih().f().a());
       if (l.d()) {
          b m = this.Ih().m;
          Uri data = (this.getActivity() != null && this.getActivity().getIntent() != null)? this.getActivity().getIntent().getData(): null;
          m.c(data);
       }
       PatchProxy.onMethodExit(FriendMilanoSlidePlayFragment.class, "15");
       return;
    }
    public void nh(m0 p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendMilanoSlidePlayFragment.class, "16")) {
          return;
       }
       Object obj = PatchProxy.apply(null, null, l.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(b.a(0x78443100).c() == 3){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          p0.a(new d());
       }
       if (PlayerPanelConfigHelper.a().isSmallWindowEnable()) {
          p0.a(new PictureInPicturePresenter());
          p0.a(new PictureInPictureLockScreenPresenter());
       }
       return;
    }
    public String o(){
       return "FRIENDS";
    }
    public boolean o3(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.r4();
    }
    public void o7(){
       if (PatchProxy.applyVoid(null, this, FriendMilanoSlidePlayFragment.class, "33")) {
          return;
       }
       this.Ih().j.e(null);
       return;
    }
    public void oh(m p0,View p1){
       int i;
       Uri data;
       FragmentActivity activity1;
       Intent intent1;
       Uri data1;
       Pair pair1;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendMilanoSlidePlayFragment.class, "4")) {
       }else {
          super.oh(p0, p1);
          b uob1 = this.Ih();
          Objects.requireNonNull(uob1);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, uob1, uob, "3")) {
             uob1.h.h(new a(uob1));
          }
          if (l.a()) {
             this.Ih().h.h(this);
          }
          uob1 = this.Ih();
          Objects.requireNonNull(uob1);
          if (!PatchProxy.applyVoid(objArray, uob1, uob, "2") && l.e()) {
             b h = uob1.h;
             uob1 = uob1.b;
             Pair pair = PatchProxy.applyOneRefs(uob1, objArray, y.class, "1");
             if (pair != PatchProxyResult.class) {
             }else if(uob1 == null){
                pair = new Pair(Boolean.FALSE, Integer.valueOf(0));
             }else if(l.a()){
                i = RedDotRepository.d(1);
             }else {
                i = b.b(-7);
             }
             int i1 = 3;
             if (i > 0) {
                FragmentActivity activity = uob1.getActivity();
                if (activity != null) {
                   Intent intent = activity.getIntent();
                   if (intent != null) {
                      data = intent.getData();
                   label_00a0 :
                      if (a.e(data)) {
                         activity1 = uob1.getActivity();
                         if (activity1 != null) {
                            intent1 = activity1.getIntent();
                            if (intent1 != null) {
                               data1 = intent1.getData();
                            label_00b8 :
                               pair = new Pair(Boolean.TRUE, Integer.valueOf(o5.b(x0.a(data1, "pushType"), i1)));
                            }
                         }
                         data1 = objArray;
                         goto label_00b8 ;
                      }else {
                         pair1 = new Pair(Boolean.FALSE, Integer.valueOf(2));
                      }
                   }
                }
                data = objArray;
                goto label_00a0 ;
             }else {
                activity1 = uob1.getActivity();
                if (activity1 != null) {
                   intent1 = activity1.getIntent();
                   if (intent1 != null) {
                      data1 = intent1.getData();
                   label_00eb :
                      if (a.e(data1)) {
                         pair = new Pair(Boolean.TRUE, Integer.valueOf(o5.b(x0.a(data1, "pushType"), i1)));
                      }else {
                         pair1 = new Pair(Boolean.FALSE, Integer.valueOf(4));
                      }
                   }
                }
                Object[] objArray1 = objArray;
                goto label_00eb ;
             }
             pair = pair1;
             h.p2(pair);
          }
          uob1 = this.Ih();
          Objects.requireNonNull(uob1);
          if (!PatchProxy.applyVoid(objArray, uob1, uob, "1")) {
             uob = uob1.m;
             if (uob1.b.getActivity() != null && uob1.b.getActivity().getIntent() != null) {
                objArray = uob1.b.getActivity().getIntent().getData();
             }
             uob.c(objArray);
             uob1.n.b(uob1.n.a(uob1.m.h));
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendMilanoSlidePlayFragment.class, "2")) {
          return;
       }
       this.F = a.b;
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, FriendMilanoSlidePlayFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.Ih().g().a(this);
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FriendMilanoSlidePlayFragment.class, "7")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       o.C().w("FriendMilanoSlidePlayFragment", "onDestroy", objArray);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FriendMilanoSlidePlayFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       o.C().w("FriendMilanoSlidePlayFragment", "onDestroyView", objArray);
       if (l.a()) {
          this.Ih().h.f(this);
       }
       a uoa = FriendsSlidePrefetchHelper.b.b();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, a.class, "1") && uoa.t != null) {
          uoa.B.b();
          uoa.clear();
          uoa.u1();
          uoa.S1(null);
          uoa.R1(0);
       }
       k ok = b.a(0x78443100);
       ok.a = null;
       ok.b = null;
       return;
    }
    public boolean p3(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       w.b(this);
       return false;
    }
    public boolean r4(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Gh();
    }
    public boolean rg(){
       return p.e(this);
    }
    public m rh(){
       b uob = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "8");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = this.Ih();
       }
       return uob;
    }
    public g sh(){
       SlideMediaType obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (SystemUtil.a(23))? SlideMediaType.ALL: SlideMediaType.PHOTO;
       return new j(this.W0.h, new a(obj, true));
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public e th(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       o oo = new o(new t(false), this.Ih(), this.getSupportFragmentManager(), this.getActivity(), this, this.G, this, this, this, this);
       return obj;
    }
    public a uh(){
       a$a obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.k(a1.p(R.string.arg_RES_7f10108a));
       obj.i(true);
       obj.g(false);
       obj.c(this.o());
       if (k4.b()) {
          int[] ointArray = new int[true];
          ointArray[0] = true;
          obj.f(new b(true, ointArray));
       }
       obj.l(new d(true, false, -1));
       return obj.a();
    }
    public void v2(boolean p0,boolean p1){
       p.b(this, p0, p1);
    }
    public NasaBizParam vh(){
       NasaBizParam obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NasaBizParam();
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("DETAIL");
       uoa.i(true);
       uoa.G(true);
       uoa.r(true);
       obj.setNasaSlideParam(uoa.a());
       return obj;
    }
    public PhotoDetailParam wh(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Ih().e();
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendMilanoSlidePlayFragment.class, "5")) {
          return;
       }
       super.y2(p0);
       b uob = (this.Ih().m.c(p0.getData()) && this.Ih().m.d())? 1: null;
       int i = o5.b(x0.a(p0.getData(), "pushType"), 3);
       if (uob) {
          this.Ih().h.p2(new Pair(Boolean.TRUE, Integer.valueOf(i)));
          this.Ih().j.c(3);
       }else {
          this.Ih().n.b(this.Ih().n.a(i));
       }
       return;
    }
    public boolean yf(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Kh();
    }
    public boolean yh(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.f();
    }
    public boolean zh(){
       Object obj = PatchProxy.apply(null, this, FriendMilanoSlidePlayFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.f();
    }
}
