package com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import xc3.c;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel;
import xc3.d;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendPanelItemType;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment$a;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment$c;
import q99.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.model.LivePlayConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import yc3.j;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.recommendsidebar.panel.n;
import com.kuaishou.live.lite.recommendsidebar.panel.o;
import com.kuaishou.live.lite.recommendsidebar.panel.i;
import com.kuaishou.live.lite.recommendsidebar.panel.l;
import x99.o;
import yc3.c;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelLiveEndStatusPresenter;
import y8c.t;
import yc3.v;
import java.lang.Number;
import g9c.d;
import com.kuaishou.live.lite.recommendsidebar.panel.k;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import xc3.e;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus;
import com.kuaishou.live.lite.recommendsidebar.panel.m;
import yc3.x;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.Boolean;
import qvb.a;
import com.kuaishou.android.live.log.b;
import qvb.i;
import io.reactivex.subjects.PublishSubject;
import im8.c;
import yc3.m;
import java.util.Map;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import y8c.g;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelAdapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import yc3.i;
import yc3.g;
import yc3.f;
import yc3.h;
import z1.k;
import z1.a;

public class LiveLiteRecommendPanelFragment extends RecyclerFragment	// class@000af2
{
    public LiveLiteRecommendPanelAdapter F;
    public m G;
    public LinearLayoutManager H;
    public final j I;
    public final LiveLiteRecommendSideBarCoreModel J;
    public final d K;
    public final c L;
    public a M;
    public int N;
    public LiveLiteRecommendPanelFragment$c O;
    public static final int P;

    public void LiveLiteRecommendPanelFragment(c p0,LiveLiteRecommendSideBarCoreModel p1,d p2){
       super();
       this.N = LiveLiteRecommendPanelItemType.Recommend.mType;
       LiveLiteRecommendPanelFragment$a uoa = new LiveLiteRecommendPanelFragment$a(this);
       this.O = uoa;
       this.L = p0;
       this.J = p1;
       this.K = p2;
       this.I = new j(p1, p2, uoa);
       this.M = new a(this, null, 16);
       if (PatchProxy.applyVoid(null, this, LiveLiteRecommendPanelFragment.class, "2")) {
       }else {
          p1.c().observe(this, new j(this));
       }
       return;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveLiteRecommendPanelFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new n());
       obj.U7(new o());
       obj.U7(new i());
       obj.U7(new l());
       obj.U7(new o());
       obj.U7(new c());
       obj.U7(new LiveLiteRecommendPanelLiveEndStatusPresenter());
       PatchProxy.onMethodExit(LiveLiteRecommendPanelFragment.class, "3");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new v(this);
    }
    public boolean Eh(){
       return true;
    }
    public int Gh(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return k0.a(this.ia(), k.a).or(Integer.valueOf(0)).intValue();
    }
    public int Hh(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteRecommendPanelFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(p0)) {
          return -1;
       }
       int i = 0;
       while (true) {
          if (i >= p1.size()) {
             return -1;
          }
          QPhoto qPhoto = p1.get(i);
          if (qPhoto != null) {
             qPhoto = qPhoto.mEntity;
             if (qPhoto != null && TextUtils.n(r1.n1(qPhoto), p0)) {
                break ;
             }
          }
          i = i + 1;
       }
       return i;
    }
    public final QPhoto Ih(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveLiteRecommendPanelFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.J.a() != null && this.J.a().a() != null) {
          return new QPhoto(this.J.a().a());
       }
       if (this.J.b() != null && this.J.b().mEntity != null) {
          return this.J.b();
       }
       return objArray;
    }
    public final void Jh(LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus p0,m p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteRecommendPanelFragment.class, "23")) {
          return;
       }
       if (x.d()) {
          return;
       }
       c c = this.L.c;
       LiveLiteLogTag lITE_RECOMME = LiveLiteLogTag.LITE_RECOMMEND_PANEL;
       lITE_RECOMME.appendTag("LiveLiteRecommendPanelFragment");
       b.U(lITE_RECOMME, "replaceSlidePlayDataResource", "hasReplacedDataSource", Boolean.valueOf(c), "panelStatus", p0, "isEmpty", Boolean.valueOf(p1.isEmpty()));
       if (c != null) {
          return;
       }
       if (p0 != LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.FINISH_OPEN && p0 != LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.START_OPEN) {
          return;
       }
       if (p1.isEmpty()) {
          return;
       }
       this.K.d(true, 26);
       String str = x.b(this.J.a());
       int i = this.Hh(str, this.q().getItems());
       if (i >= 0 && i < this.q().getItems().size()) {
          lITE_RECOMME.appendTag("LiveLiteRecommendPanelFragment");
          b.T(lITE_RECOMME, "replaceSlidePlayDataResource relay do!!", "Injected_liveStreamId", str, "targetPosition", Integer.valueOf(i));
          this.K.b(this.q(), this.q().getItems().get(i), false);
       }else {
          lITE_RECOMME.appendTag("LiveLiteRecommendPanelFragment");
          b.T(lITE_RECOMME, "replaceSlidePlayDataResource exception!!", "Injected_liveStreamId", str, "targetPosition", Integer.valueOf(i));
       }
       return;
    }
    public void Kh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteRecommendPanelFragment.class, "17")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_RECOMMEND_PANEL, "LiveLiteRecommendPanelFragment, resetRecommendPanel");
       this.I.a.setValue(objArray);
       LiveLiteRecommendPanelFragment tG = this.G;
       if (tG != null) {
          tG.x = objArray;
          tG.clear();
       }
       this.I.e.onNext(Boolean.TRUE);
       return;
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       super.M();
       return 5;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveLiteRecommendPanelFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveLiteRecommendPanelFragment.class, "11")) {
          return;
       }
       super.Z1(p0, p1);
       if (p0) {
          this.K.d(false, 26);
       }
       return;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.I);
       obj.add(new c("LOAD_MORE_OFFSET", Integer.valueOf(3)));
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d098f;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteRecommendPanelFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LiveLiteRecommendPanelFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LiveLiteRecommendPanelFragment.class, new m());
       }else {
          obj.put(LiveLiteRecommendPanelFragment.class, null);
       }
       return obj;
    }
    public int qh(){
       return 0x7f0a1808;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecommendPanelFragment.class, "6")) {
          return;
       }
       super.th();
       this.h0().setNestedScrollingEnabled(false);
       this.h0().addItemDecoration(new e(1, a1.d(R.dimen.arg_RES_7f07058e), false));
       this.h0().addOnScrollListener(new LiveLiteRecommendPanelFragment$b(this));
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveLiteRecommendPanelFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveLiteRecommendPanelFragment.class, "12")) {
          return;
       }
       super.v2(p0, p1);
       this.Jh(this.J.c().getValue(), this.G);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F == null) {
          this.F = new LiveLiteRecommendPanelAdapter(this.I, this.M);
       }
       return this.F;
    }
    public boolean x0(){
       return true;
    }
    public RecyclerView$LayoutManager xh(){
       LinearLayoutManager obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayoutManager(this.getActivity());
       this.H = obj;
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.N = this.J.d();
       m om = new m(new i(this), this.N, new g(this), new f(this), new h(this));
       this.G = obj;
       return obj;
    }
}
