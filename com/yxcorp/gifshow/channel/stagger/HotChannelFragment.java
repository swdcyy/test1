package com.yxcorp.gifshow.channel.stagger.HotChannelFragment;
import eb5.b;
import ab5.v;
import eb5.d;
import eb5.g;
import on5.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import xl8.b;
import java.lang.Object;
import elb.g0;
import com.yxcorp.gifshow.channel.stagger.HotChannelFragment$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.Integer;
import hka.k;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import jb5.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e9c.k;
import e9c.h;
import gj9.c;
import e9c.h$d;
import e9c.a;
import rj9.e;
import y8c.q;
import e9c.f;
import on5.e;
import y8c.t;
import db5.g;
import lnc.a1;
import com.yxcorp.gifshow.fragment.f;
import ab5.a;
import qvb.i;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import eb5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import va5.d;
import brd.t;
import eb5.f;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import on5.a;
import lnc.u3;
import ab5.u;
import fr6.a;
import wq6.k;
import wq6.j;
import androidx.collection.ArraySet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import gka.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import wkd.b;
import sa5.b;
import java.util.List;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.f;
import cb5.w;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import tkd.b;
import tkd.d;
import hn5.n;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.g;
import cb5.u;
import rj9.f;
import rj9.c;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeItemRecoRealShowPresenter;
import androidx.fragment.app.Fragment;
import xa5.a;
import rj9.g;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import o56.f;
import za5.a;
import wq6.f;
import as6.a;
import wq6.h;
import cb5.c0;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.i;
import wh5.c;
import im8.c;
import com.kwai.component.feedstaggercard.model.CardStyle;
import db5.d;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import gj9.d;
import erd.g;
import crd.b;
import gj9.j;
import java.util.Map;
import java.lang.StringBuilder;
import lnc.g0;
import hlb.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ga5.e;
import ok.x;
import com.kwai.component.feedstaggercard.model.FeedCoverStyle;
import com.kwai.component.feedstaggercard.model.FeedCoverStyle$ChannelCoverStyle;
import oj9.e;
import qvb.a;
import lnc.u1;
import lnc.b;
import db5.c;
import wq6.d;
import y8c.g;
import com.kwai.component.feedstaggercard.PhotoItemViewParam$a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import com.facebook.drawee.generic.RoundingParams;
import com.kwai.component.feedstaggercard.experiment.HomeCardExperimentUtil;
import ga5.j;
import com.yxcorp.gifshow.channel.stagger.c;
import a9c.e;
import pa5.n;
import com.kwai.component.photo.reduce.f;
import com.yxcorp.gifshow.channel.stagger.HotChannelFragment$b;
import ha5.e;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class HotChannelFragment extends RecyclerFragment implements b, v, d, g, f	// class@00105a
{
    public final b F;
    public d G;
    public final e H;
    public a I;
    public a J;
    public PresenterV2 K;
    public int L;
    public boolean M;
    public HotChannel N;
    public int O;
    public CardStyle P;
    public boolean Q;
    public c R;
    public String S;
    public static final int T;

    public void HotChannelFragment(){
       super();
       this.F = new b(null);
       this.G = null;
       this.H = new g0();
       this.L = 2;
       this.M = false;
       this.O = 1;
       this.Q = false;
       this.R = new HotChannelFragment$a(this);
       this.S = null;
    }
    public int Ab(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (Integer.parseInt(this.N.mId) + 300);
    }
    public k Ah(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(super.Ah(), this, this.Ih());
       this.J = uoa;
       return uoa;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, HotChannelFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new k());
       h oh = new h(this.rh(), true, false);
       oh.R8(new c(this));
       obj.U7(oh);
       obj.U7(new a());
       HotChannelFragment tN = this.N;
       if (tN != null && tN.mIsLive == null) {
          obj.U7(new e(this));
       }else {
          obj.U7(new f(this));
       }
       PatchProxy.onMethodExit(HotChannelFragment.class, "16");
       return obj;
    }
    public boolean B7(){
       return e.f(this);
    }
    public t Bh(){
       g obj = PatchProxy.apply(null, this, HotChannelFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new g(this);
       obj.u((float)a1.e(-25.00f));
       return obj;
    }
    public boolean Eh(){
       return true;
    }
    public final void Gh(){
       if (PatchProxy.applyVoid(null, this, HotChannelFragment.class, "11")) {
          return;
       }
       if (this.M == null) {
          this.M = true;
          this.Hh().a(this);
          this.Hh().h = this.J;
       }
       return;
    }
    public a Hh(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.I == null) {
          this.I = new a();
       }
       return this.I;
    }
    public d Ih(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.q();
    }
    public void J3(RefreshType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotChannelFragment.class, "32")) {
          return;
       }
       if (this.J != null) {
          if (p0 == RefreshType.FOREGROUND2) {
             this.Hh().m.onNext(Boolean.TRUE);
          }
          this.J.f(p0);
       }
       return;
    }
    public String Jh(){
       HotChannelFragment obj = PatchProxy.apply(null, this, HotChannelFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj != null && !TextUtils.x(obj.mSubChannelId)) {
          return "hsc";
       }
       obj = this.S;
       if (obj == null) {
          return "hc3";
       }
       Objects.requireNonNull(obj);
       if (obj.equals("1")) {
          return "hc1";
       }
       if (!obj.equals("2")) {
          return "hc3";
       }
       return "hc2";
    }
    public void L8(){
       if (PatchProxy.applyVoid(null, this, HotChannelFragment.class, "38")) {
          return;
       }
       this.T9();
       return;
    }
    public int M(){
       return 2;
    }
    public boolean Mf(){
       return a.a(this);
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, HotChannelFragment.class, "7")) {
          return;
       }
       super.N1();
       RxBus.f.b(new d(1));
       return;
    }
    public t Ra(){
       return f.b(this);
    }
    public boolean T9(){
       HotChannelFragment obj = PatchProxy.apply(null, this, HotChannelFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.J;
       if (obj != null) {
          obj.f(RefreshType.BACK_CLICK);
       }
       return true;
    }
    public void U0(boolean p0){
       if (PatchProxy.isSupport(HotChannelFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HotChannelFragment.class, "41")) {
          return;
       }
       if (this.h0() instanceof CustomRecyclerView) {
          this.h0().setCanPullToRefresh(p0);
       }
       return;
    }
    public TabIdentifier Ua(){
       return b.b;
    }
    public void X(RefreshType p0,boolean p1){
       if (PatchProxy.isSupport(HotChannelFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, HotChannelFragment.class, "33")) {
          return;
       }
       if (this.J != null) {
          if (p0 == RefreshType.FOREGROUND2) {
             this.Hh().m.onNext(Boolean.TRUE);
          }
          this.J.g(p0, p1);
       }
       return;
    }
    public String X3(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u3.a(this.N.mId, a.d(this.Ua()));
    }
    public boolean Xf(String p0){
       return u.a(this, p0);
    }
    public boolean Xg(){
       return false;
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, HotChannelFragment.class, "21")) {
          return;
       }
       super.c0();
       Iterator iterator = new ArraySet(this.Hh().c).iterator();
       while (iterator.hasNext()) {
          iterator.next().c0();
       }
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HotChannelFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-1519540672).b(R.layout.arg_RES_7f0d05d2);
       if (obj != null) {
          return obj;
       }
       return super.eh(p0, p1, p2);
    }
    public int f(){
       int i = (this.N.mIsLive != null)? 88: 0;
       return i;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, HotChannelFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.Gh();
       obj = super.fg();
       obj.add(this.Hh());
       return obj;
    }
    public void fh(View p0,Bundle p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotChannelFragment.class, "4")) {
          return;
       }
       super.fh(p0, p1);
       this.a6();
       this.Gh();
       if (!PatchProxy.applyVoidOneRefs(p0, this, HotChannelFragment.class, "5")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.K = presenterV2;
          presenterV2.U7(new f(this.Q));
          this.K.U7(new w());
          int i = 0;
          this.K.U7(new e(i));
          d.a(-1883158055).Nq(this.K);
          this.K.U7(new g(this.Q));
          this.K.U7(new u(i));
          this.K.U7(new f());
          this.K.U7(new c());
          this.K.U7(new HomeItemRecoRealShowPresenter());
          if (a.h(this)) {
             this.K.U7(new g());
          }
          Fragment parentFragme = this.getParentFragment();
          Object obj = PatchProxy.applyOneRefs(parentFragme, null, a.class, "9");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(parentFragme == null || (!f.b(parentFragme.getActivity()) || a.o0(parentFragme.requireActivity()).p0() == 2)){
             f uof = a.j(parentFragme);
             if (uof != null && (b.B.equals(uof.M2()) || b.D.equals(uof.M2()))) {
                b = true;
             }
          }
       label_00ee :
          b = false;
          if (b) {
             this.K.U7(new c0(this));
          }
          if (a.c(this, b.C)) {
             this.K.U7(new c0(this, (a1.d(R.dimen.arg_RES_7f070fdf) * 2)));
          }
          this.K.U7(new i(c.b(), "hc"));
          this.K.f(p0);
          Object[] objArray = new Object[]{this.Hh(),this,new c("FRAGMENT", this)};
          this.K.i(objArray);
       }
       if (a.h(this)) {
          d.a(this, this.P.mBottomType, true);
       }
       this.F.b().compose(this.ge()).subscribe(new d(this));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d05d2;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotChannelFragment.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, HotChannelFragment.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(HotChannelFragment.class, new j());
       }else {
          obj.put(HotChannelFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       HotChannelFragment tN = this.N;
       if (tN != null && tN.mTeenageMode != null) {
          return 0;
       }
       return 3;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, HotChannelFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "channel_id="+this.N.mId+"&channel_name="+g0.a(this.N)+"&sub_channel_name="+g0.a(this.N)+"&sub_channel_id="+this.N.mSubChannelId;
       if (this.G != null) {
          obj = obj+"&third_channel_name="+this.G.mTitle+"&third_channel_id="+this.G.mSubChannelId+"&third_channel_index="+this.G.b;
       }
       return obj;
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ks://home/"+a.d(this.Ua());
    }
    public String h5(){
       HotChannelFragment obj = PatchProxy.apply(null, this, HotChannelFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.G != null) {
          return this.G.mSubChannelId+"";
       }
       obj = this.N;
       if (obj != null) {
          return obj.mId;
       }
       return "";
    }
    public boolean i8(){
       return e.e(this);
    }
    public boolean kf(){
       return f.a(this);
    }
    public boolean lh(){
       return true;
    }
    public String o(){
       HotChannelFragment obj = PatchProxy.apply(null, this, HotChannelFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N;
       if (obj != null && obj.mTeenageMode != null) {
          return "RECOMMEND_PAGE";
       }
       return super.o();
    }
    public boolean o3(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.r4();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotChannelFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       HotChannel serializable = SerializableHook.getSerializable(this.getArguments(), "key_channel");
       this.N = serializable;
       if (serializable.isArticle()) {
          int i = 1;
          this.L = i;
          this.Q = i;
       }
       if (a.d(this)) {
          this.S = "1";
       }
       if (this.Q != null) {
          this.P = CardStyle.NORMAL_CARD_NORMAL_BOTTOM;
       }else {
          String str = this.Jh();
          HotChannel mId = this.N.mId;
          CardStyle uCardStyle = PatchProxy.applyTwoRefs(str, mId, this, HotChannelFragment.class, "36");
          if (uCardStyle != PatchProxyResult.class) {
          }else if(TextUtils.n(mId, "33")){
             FeedCoverStyle uFeedCoverSt = e.a.get();
             if (e.g() && !TextUtils.x(uFeedCoverSt.mImageChannelCardStyle.mVersion)) {
                uCardStyle = e.b(str, uFeedCoverSt.mImageChannelCardStyle.mVersion);
             }
          }else if(this.N.mIsLive != null || TextUtils.n(mId, "50")){
             uCardStyle = CardStyle.NORMAL_CARD_NORMAL_BOTTOM;
          }
          uCardStyle = e.a(str);
          this.P = uCardStyle;
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HotChannelFragment.class, "23")) {
          return;
       }
       super.onDestroy();
       if (this.Ih() instanceof e) {
          e uoe = this.Ih();
          Objects.requireNonNull(uoe);
          if (!PatchProxy.applyVoid(null, uoe, e.class, "7")) {
             e d = uoe.D;
             if (d != null) {
                d.clear();
                uoe.D = null;
             }
             d = uoe.E;
             if (d != null) {
                d.clear();
                uoe.E = null;
             }
             d = uoe.F;
             if (d != null) {
                d.clear();
                uoe.F = null;
             }
             d = uoe.G;
             if (d != null) {
                d.clear();
                uoe.G = null;
             }
             uoe.clear();
             u1.b(uoe);
          }
       }
       HotChannelFragment tI = this.I;
       if (tI != null) {
          tI.c.clear();
          this.I.e.clear();
          this.I.g.clear();
          this.I = null;
          this.M = false;
       }
       b.a(this.getActivity());
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HotChannelFragment.class, "6")) {
          return;
       }
       HotChannelFragment tK = this.K;
       if (tK != null) {
          tK.destroy();
          this.K = null;
       }
       super.onDestroyView();
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(HotChannelFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HotChannelFragment.class, "24")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       this.Hh().d.onNext(Boolean.valueOf(p0));
       return;
    }
    public void onRefresh(){
       e.g(this);
    }
    public String pg(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.d(this) && this.N != null) {
          return "_"+this.N.mId;
       }
       return super.pg();
    }
    public i q(){
       return this.Ih();
    }
    public int r(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c.a(this);
    }
    public boolean r4(){
       HotChannelFragment obj = PatchProxy.apply(null, this, HotChannelFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.J;
       if (obj != null) {
          obj.f(RefreshType.BOTTOM_TAB_CLICK);
       }
       return true;
    }
    public d s8(){
       return j.b(this);
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, HotChannelFragment.class, "20")) {
          return;
       }
       super.u();
       Iterator iterator = new ArraySet(this.Hh().c).iterator();
       while (iterator.hasNext()) {
          iterator.next().u();
       }
       return;
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public boolean u2(){
       Object obj = PatchProxy.apply(null, this, HotChannelFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.Ih().F2() ^ 0x01);
    }
    public g vh(){
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PhotoItemViewParam$a obj = PatchProxy.apply(objArray, this, HotChannelFragment.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = this.f();
       int i1 = (this.N.mIsLive != null)? 3: 2;
       obj = PhotoItemViewParam.getBuilder(i, i1);
       obj.w(true);
       obj.y = this.N.mId;
       obj.o(true);
       obj.q(true);
       obj.b(true);
       obj.h(true);
       obj.g(true);
       HotChannel mId = this.N.mId;
       HotChannelFragment obj1 = PatchProxy.applyOneRefs(mId, objArray, HotChannelFragment.class, "37");
       if (obj1 != patchProxyRe) {
          i2 = obj1.intValue();
       }else if(TextUtils.n(mId, "33")){
          FeedCoverStyle uFeedCoverSt = e.a.get();
          if (e.g()) {
             i2 = uFeedCoverSt.mImageChannelCardStyle.mDescLineCount;
             if (i2 <= null) {
             }
          }else {
          }
       }else {
       }
       obj.n(i2);
       obj1 = this.P;
       RoundingParams roundingPara = PatchProxy.applyOneRefs(obj1, this, HotChannelFragment.class, "8");
       if (roundingPara != patchProxyRe) {
       }else if(HomeCardExperimentUtil.b() && obj1.isCornerCard != null){
          roundingPara = new RoundingParams();
          roundingPara.m((float)a1.d(R.dimen.arg_RES_7f070429), (float)a1.d(R.dimen.arg_RES_7f070429), 0, 0);
       }else {
          roundingPara = j.b();
       }
       obj.m(roundingPara);
       c uoc = new c(obj.a(), this.H, this.N);
       uoc.x1(this.P);
       uoc.z1(new f(this));
       uoc.y1(new HotChannelFragment$b(this));
       uoc.n1("HOME_RECYCLE_VIEW_SCROLL_STATE", this.Hh().k);
       Boolean tRUE = Boolean.TRUE;
       uoc.n1("HOT_LIVE_CLICK_TO_SLIDE_PLAY", tRUE);
       uoc.n1("HOT_CLICK_TO_NASA_SLIDE_PLAY", tRUE);
       HotChannelFragment tN = this.N;
       if (!PatchProxy.applyVoidOneRefs(tN, uoc, c.class, "5")) {
          uoc.n1("feed_channel", tN);
       }
       uoc.n1("PAGE_NAME", g0.a(this.N));
       uoc.n1("REDESIGN_PAGE", this.Jh());
       uoc.n1("RECYCLERVIEW_LAYOUT_COMPLETE", Boolean.valueOf(this.I.l));
       return uoc;
    }
    public RecyclerView$LayoutManager xh(){
       DecoSafeStaggeredLayoutManager obj = PatchProxy.apply(null, this, HotChannelFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DecoSafeStaggeredLayoutManager(this.L, 1);
       obj.setGapStrategy(2);
       obj.N(this.h0());
       return obj;
    }
    public boolean yf(){
       return false;
    }
    public i yh(){
       int i;
       String obj = PatchProxy.apply(null, this, HotChannelFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       HotChannelFragment tN = this.N;
       if (tN != null && TextUtils.n(tN.mId, "33")) {
          FeedCoverStyle uFeedCoverSt = e.a.get();
          if (e.g() && !TextUtils.x(uFeedCoverSt.mImageChannelCardStyle.mVersion)) {
             i = e.f(this.Jh(), uFeedCoverSt.mImageChannelCardStyle.mVersion);
          }
       }else {
          i = e.e(this.Jh());
       }
       e uoe = new e(this.N);
       uoe.I = this.S;
       uoe.J = i;
       return uoe;
    }
    public d z5(){
       return j.c(this);
    }
}
