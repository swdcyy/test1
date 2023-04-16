package com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import eb5.g;
import fw8.s;
import im8.g;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment$a;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment$b;
import kx8.m;
import q2b.i$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent$Status;
import r97.g0;
import f3b.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent$ShowType;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage$PageType;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.google.common.base.Optional;
import r97.o;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import kx8.n;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import java.lang.Number;
import ekd.i;
import com.yxcorp.utility.n;
import lnc.a1;
import eb5.f;
import kx8.s;
import java.util.Map;
import java.util.HashMap;
import isa.a;
import hsa.a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.homepage.activity.e;
import com.kuaishou.krn.model.LaunchModel;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import uv8.g0;
import wo5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import cta.e;
import cta.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter;
import com.yxcorp.gifshow.webview.yoda.view.c;
import com.yxcorp.gifshow.activity.web.presenter.a;
import im8.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.model.LaunchModel;
import com.yxcorp.gifshow.homepage.log.fps.HomeSceneLifecycleHelper;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import kx8.c;
import com.yxcorp.gifshow.webview.view.c;
import kx8.l;

public class OperateWebViewFragment extends KwaiYodaWebViewFragment implements g, s, g	// class@0014b7
{
    public PublishSubject C;
    public PresenterV2 D;
    public boolean E;
    public ViewParent F;
    public a G;
    public final KwaiYodaWebView$b H;
    public final WebViewFragment$b I;
    public final c J;
    public g0 K;
    public static final int L;

    public void OperateWebViewFragment(){
       super();
       this.C = PublishSubject.g();
       this.E = false;
       this.F = null;
       this.H = new OperateWebViewFragment$a(this);
       this.I = new OperateWebViewFragment$b(this);
       this.J = new m(this);
    }
    public void Bf(i$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateWebViewFragment.class, "16")) {
          return;
       }
       OperateWebViewFragment tK = this.K;
       if (tK == null) {
          return;
       }
       int i = o.h(ClientEvent$UrlPackage$PageType.class, this.K.k());
       p0 = p0.s(TextUtils.I(this.K.j())).e(1).u(TextUtils.k(this.K.l())).k(this.K.g()).x(o.h(ClientEvent$ShowEvent$Status.class, tK.m())).w(o.h(ClientEvent$ShowEvent$ShowType.class, this.K.a())).p(this.K.i()).f(this.K.d()).l(Optional.fromNullable(this.K.f()).or(Long.valueOf(0)).longValue());
       o oo = this.K.e();
       CommonParams uCommonParam = PatchProxy.applyOneRefs(oo, this, OperateWebViewFragment.class, "17");
       if (uCommonParam != PatchProxyResult.class) {
       }else if(oo == null){
          uCommonParam = null;
       }else {
          uCommonParam = new CommonParams();
          uCommonParam.mServiceName = oo.sdkName();
          uCommonParam.mSubBiz = oo.subBiz();
          uCommonParam.mNeedEncrypt = oo.needEncrypt();
          uCommonParam.mH5ExtraAttr = oo.h5ExtraAttr();
          uCommonParam.mContainer = oo.container();
       }
       p0.g(uCommonParam).t(i);
       return;
    }
    public boolean Fh(){
       return false;
    }
    public void Ih(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewFragment.class, "6")) {
          return;
       }
       if (!this.zh().k()) {
          return;
       }
       this.Vg().i().subscribe(new n(this), h.b);
       return;
    }
    public int M(){
       if (this.K != null) {
          return 1;
       }
       return 2;
    }
    public void Nh(boolean p0){
    }
    public ViewParent Oh(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperateWebViewFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       ViewParent parent = p0.getParent();
       while (true) {
          if (parent == null) {
             return null;
          }
          if (parent instanceof ViewPager) {
             break ;
          }else {
             parent = parent.getParent();
          }
       }
       return parent;
    }
    public int Ph(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperateWebViewFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (i.c()) {
          i = i + n.A(p0);
       }
       return (i + a1.d(0x7f070fdf));
    }
    public t Ra(){
       return f.b(this);
    }
    public String X3(){
       return "activity";
    }
    public boolean Xg(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d05e6;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperateWebViewFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, OperateWebViewFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(OperateWebViewFragment.class, new s());
       }else {
          obj.put(OperateWebViewFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0;
    }
    public String getPageParams(){
       OperateWebViewFragment obj = PatchProxy.apply(null, this, OperateWebViewFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       if (obj != null) {
          return TextUtils.k(obj.l());
       }
       return a.c(this.G);
    }
    public boolean kf(){
       return f.a(this);
    }
    public String o(){
       OperateWebViewFragment obj = PatchProxy.apply(null, this, OperateWebViewFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       if (obj != null) {
          return TextUtils.I(obj.j());
       }
       return "OP_ACTIVITY_PAGE";
    }
    public void onCreate(Bundle p0){
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateWebViewFragment.class, str)) {
          return;
       }
       if (this.getArguments() != null) {
          OperateWebViewFragment tG = this.G;
          String str1 = "";
          if (tG != null) {
             if (tG.i() == 2) {
                tG = this.G;
                Object obj = PatchProxy.applyOneRefs(tG, null, e.class, str);
                if (obj != PatchProxyResult.class) {
                   str1 = obj;
                }else {
                   LaunchModel launchModel = e.b(tG);
                   if (launchModel != null) {
                      str1 = launchModel.c();
                   }
                }
             }else {
                str1 = this.G.c();
             }
          }
          this.getArguments().putString("KEY_URL", str1);
          this.getArguments().putBoolean("KEY_IS_SELECTABLE_PAGE", true);
          Object[] objArray = new Object[0];
          b.C().w("OperateWebViewFragment", "url:"+str1, objArray);
       }
       g0.o0(this.getActivity()).p0(this.G.m()).b();
       super.onCreate(p0);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       OperateWebViewFragment tD = this.D;
       if (tD != null) {
          tD.destroy();
       }
       b.a(-920422449).h(this.G.o(), this.J);
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(OperateWebViewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, OperateWebViewFragment.class, "8")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       this.C.onNext(Boolean.valueOf(p0));
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperateWebViewFragment.class, "5")) {
          return;
       }
       this.lh(this.I);
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.D = presenterV2;
       presenterV2.U7(new OperateWebViewPresenter(this.k));
       this.D.U7(new a());
       this.D.f(p0);
       Object[] objArray = new Object[]{this,new c("FRAGMENT", this)};
       this.D.i(objArray);
       if (this.Ch() != null && this.Ch().getLaunchModel() != null) {
          this.nh(8);
          this.Ch().getLaunchModel().setEnableProgress(0);
       }
       if (this.Ch() != null) {
          this.F = this.Oh(this.Ch());
       }
       b.a(-920422449).j(this.G.o(), this.J);
       new HomeSceneLifecycleHelper(this).c();
       PageMonitor.INSTANCE.addCustomParam(this, "activityId", this.G.m(), 0);
       return;
    }
    public c rh(){
       int i;
       Context obj = PatchProxy.apply(null, this, OperateWebViewFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (this.getContext() != null) {
          i = this.Ph(this.getContext());
       }
       return new c(this, i, this.G);
    }
    public c uh(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperateWebViewFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(p0, this.Ah());
    }
}
