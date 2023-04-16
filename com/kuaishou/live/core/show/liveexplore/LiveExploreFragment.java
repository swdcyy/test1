package com.kuaishou.live.core.show.liveexplore.LiveExploreFragment;
import eb5.d;
import on5.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import w51.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import ua2.f;
import q99.a;
import com.yxcorp.gifshow.model.LivePlayConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import va2.j;
import f72.d0;
import va2.h;
import f72.f;
import x99.o;
import androidx.fragment.app.Fragment;
import xa5.a;
import cb5.g;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.abtest.f;
import va2.o;
import va2.q;
import va2.k;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.i;
import wa5.e;
import rz6.a;
import rz6.a$a;
import cb5.b0;
import on5.e;
import java.lang.Number;
import rkd.b;
import com.yxcorp.gifshow.refresh.RefreshType;
import eb5.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import va5.d;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import hka.k;
import fr6.a;
import wq6.k;
import wq6.j;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import o56.f;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import android.view.View;
import android.os.Bundle;
import com.kuaishou.live.core.show.liveexplore.LiveExploreFragment$a;
import g9c.d;
import androidx.recyclerview.widget.GridLayoutManager$b;
import ua2.e;
import java.util.Map;
import java.lang.StringBuilder;
import lnc.g0;
import ro5.e0;
import tyc.q4;
import y99.i;
import android.content.res.Configuration;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import kp.x1;
import java.util.HashMap;
import db5.c;
import wq6.d;
import y8c.g;
import e72.n;
import com.kwai.component.photo.reduce.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import qvb.i;
import e72.o;

public class LiveExploreFragment extends RecyclerFragment implements d, f	// class@000c73
{
    public n F;
    public o G;
    public DecoSafeStaggeredLayoutManager H;
    public HotChannel I;
    public LiveDoubleListParam J;
    public final a K;
    public final f L;
    public static final boolean M;

    static {
       Object obj = PatchProxy.apply(null, null, a.class, "120");
       boolean b = false;
       boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): l.c("live_enable_feed_card_v4_style", b);
       if (b1 || a.t().d("enableOpenLiveTabV4style", b)) {
          b = true;
       }
       LiveExploreFragment.M = b;
    }
    public void LiveExploreFragment(){
       super();
       this.L = new f();
       this.K = new a(this, FollowConfigUtil.o(), 8);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveExploreFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new j());
       obj.U7(new d0());
       obj.U7(new h());
       obj.U7(new f());
       obj.U7(new o());
       if (a.a(this)) {
          obj.U7(new g(this));
       }
       if (TextUtils.n(this.I.mId, "29") && f.a("enableHomeLiveChannelTopEntry")) {
          obj.U7(new o());
       }else if(TextUtils.n(this.I.mId, "50")){
          obj.U7(new q());
       }
       obj.U7(new k());
       obj.U7(new i(false, "h"));
       if ((e.a()).contains("LIVE") && !a.e.a().b()) {
          obj.U7(new b0());
       }
       PatchProxy.onMethodExit(LiveExploreFragment.class, "10");
       return obj;
    }
    public boolean B7(){
       return e.f(this);
    }
    public final int Gh(){
       Object obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (b.g() && b.e()) {
          return 4;
       }
       return 2;
    }
    public void J3(RefreshType p0){
       c.b(this, p0);
    }
    public void L8(){
       e.h(this);
    }
    public int M(){
       return 5;
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, LiveExploreFragment.class, "15")) {
          return;
       }
       super.N1();
       RxBus.f.b(new d(1));
       return;
    }
    public String O9(){
       return "HOME_FIND_LIVE";
    }
    public boolean S0(){
       return false;
    }
    public void U0(boolean p0){
       if (PatchProxy.isSupport(LiveExploreFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveExploreFragment.class, "20")) {
          return;
       }
       if (this.h0() instanceof CustomRecyclerView) {
          this.h0().setCanPullToRefresh(p0);
       }
       return;
    }
    public void X(RefreshType p0,boolean p1){
       if (PatchProxy.isSupport(LiveExploreFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveExploreFragment.class, "13")) {
          return;
       }
       this.N1();
       this.rh().v(false);
       return;
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
    public boolean c1(){
       Object obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.b(this.getActivity())) {
          return this.Vg().c();
       }
       return super.c1();
    }
    public int f(){
       return 88;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveExploreFragment.class, "4")) {
          return;
       }
       super.fh(p0, p1);
       this.ia().S0(this.h0(), new LiveExploreFragment$a(this));
       this.a6();
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0af3;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveExploreFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LiveExploreFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LiveExploreFragment.class, new e());
       }else {
          obj.put(LiveExploreFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 3;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       String str = "channel_id="+TextUtils.I(this.I.mId)+"&channel_name="+TextUtils.I(g0.a(this.I))+"&index="+this.I.mIndex;
       if (!TextUtils.x(obj)) {
          str = obj+"&"+str;
       }
       return e0.a(this, str);
    }
    public String getUrl(){
       return "";
    }
    public String h5(){
       return this.I.mId;
    }
    public boolean i8(){
       Object obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       q4.c(this.h0());
       RxBus.f.b(new d(2));
       return false;
    }
    public void jh(){
       if (PatchProxy.applyVoid(null, this, LiveExploreFragment.class, "11")) {
          return;
       }
       k ok = this.rh();
       if (ok != null && (this.Dh() && (this.uh() && this.i0()))) {
          ok.v(false);
          return;
       }else {
          this.K.d.d(true);
          return;
       }
    }
    public void kh(){
       if (PatchProxy.applyVoid(null, this, LiveExploreFragment.class, "12")) {
          return;
       }
       this.K.d.d(false);
       return;
    }
    public String o(){
       return "FIND";
    }
    public boolean o3(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "17");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "14");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          this.X(RefreshType.BOTTOM_TAB_CLICK, false);
          b = true;
       }
       return b;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveExploreFragment.class, "22")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (b.g() && !PatchProxy.applyVoidOneRefs(p0, this, LiveExploreFragment.class, "23")) {
          LiveExploreFragment tH = this.H;
          if (tH != null) {
             tH.setSpanCount(this.Gh());
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveExploreFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, LiveExploreFragment.class, "2")) {
          HotChannel serializable = SerializableHook.getSerializable(this.getArguments(), "key_channel");
          this.I = serializable;
          LiveDoubleListParam liveDoubleLi = PatchProxy.applyOneRefs(serializable, this, LiveExploreFragment.class, "3");
          if (liveDoubleLi != PatchProxyResult.class) {
          }else {
             liveDoubleLi = new LiveDoubleListParam();
             liveDoubleLi.mTitle = serializable.mName;
             int i = 1;
             liveDoubleLi.mType = i;
             liveDoubleLi.mSummaryMode = 2;
             liveDoubleLi.mUseChannelFbReason = x1.a(serializable);
             if (LiveExploreFragment.M && !TextUtils.n(serializable.mId, "50")) {
                liveDoubleLi.mCardStyle = i;
                liveDoubleLi.mCornerRadiusDp = 4;
             }else {
                i = 0;
                liveDoubleLi.mCardStyle = i;
                liveDoubleLi.mCornerRadiusDp = i;
             }
             HashMap hashMap = new HashMap();
             hashMap.put("channel_id", serializable.mId);
             hashMap.put("channel_name", serializable.mName);
             liveDoubleLi.mLogExtraParamMap = hashMap;
          }
          this.J = liveDoubleLi;
       }
       return;
    }
    public void onRefresh(){
       if (PatchProxy.applyVoid(null, this, LiveExploreFragment.class, "16")) {
          return;
       }
       this.a();
       return;
    }
    public String pg(){
       Object obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.I != null) {
          return "_"+this.I.mId;
       }
       return super.pg();
    }
    public int qh(){
       return 0x7f0a1c46;
    }
    public int r(){
       Object obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c.a(this);
    }
    public d s8(){
       return j.b(this);
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F == null) {
          Object[] objArray = new Object[]{this.K,this.L};
          this.F = new n(new f(this), this.J, objArray);
       }
       return this.F;
    }
    public boolean x0(){
       return true;
    }
    public RecyclerView$LayoutManager xh(){
       DecoSafeStaggeredLayoutManager obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DecoSafeStaggeredLayoutManager(this.Gh(), 1);
       obj.setGapStrategy(2);
       obj.N(this.h0());
       this.H = obj;
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveExploreFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.G == null) {
          LiveExploreFragment tJ = this.J;
          this.G = new o(tJ.mType, tJ.mTitle, tJ.mCardStyle);
       }
       return this.G;
    }
    public d z5(){
       return j.c(this);
    }
}
