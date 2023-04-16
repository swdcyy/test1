package com.yxcorp.gifshow.aggregate.user.UserAggregateFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e7c.e;
import com.yxcorp.gifshow.aggregate.user.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.soc.arch.rubas.base.Rubas;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.yxcorp.gifshow.pymk.f;
import a7c.h;
import a7c.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.aggregate.user.UserAggregateFragment$a;
import com.kwai.component.fpsrecorder.biz.FpsSocialBizType;
import androidx.recyclerview.widget.RecyclerView;
import na5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.fpsrecorder.ListScrollFpsRecorder;
import com.kwai.component.fpsrecorder.PageFpsRecorder;
import java.util.Map;
import lnc.i3;
import f3b.o;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.RecyclerView$l;
import android.content.Context;
import i2b.a;
import g9c.d;
import g69.d;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$s;
import y8c.g;
import g69.f;
import a7c.h$a;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.Exception;
import g69.c;
import com.yxcorp.gifshow.pymk.b;
import com.kwai.social.startup.relation.model.PymkConfig;
import com.kwai.social.startup.follow.model.SayHiConfigParam;
import x6c.j;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ok.x;
import g7c.a;
import g69.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import f7c.d;
import a7c.b$a;
import com.yxcorp.gifshow.aggregate.user.c;
import com.yxcorp.gifshow.aggregate.user.b;
import e7c.b;
import e7c.c;
import qvb.i;

public class UserAggregateFragment extends RecyclerFragment	// class@001936
{
    public QPhoto F;
    public int G;
    public String H;
    public String I;
    public String J;
    public String K;
    public boolean L;
    public String M;
    public String N;
    public h O;
    public String P;
    public boolean Q;
    public static final int R;

    public void UserAggregateFragment(){
       super();
       this.Q = false;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, UserAggregateFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new e());
       if (this.L != null) {
          obj.U7(new a());
       }
       PatchProxy.onMethodExit(UserAggregateFragment.class, "7");
       return obj;
    }
    public final ClientContent$ContentPackage Gh(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, UserAggregateFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       UserAggregateFragment tF = this.F;
       if (tF != null) {
          obj.photoPackage = w1.g(tF.mEntity, 0);
       }
       return obj;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(UserAggregateFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, UserAggregateFragment.class, "6")) {
          return;
       }
       super.M1(p0, p1);
       if (this.Q == null) {
          this.Q = true;
          Rubas.c("pymk_aggregate_page_error");
       }
       return;
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, UserAggregateFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Gh();
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, UserAggregateFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Gh();
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(UserAggregateFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, UserAggregateFragment.class, "3")) {
          return;
       }
       super.Z1(p0, p1);
       if (this.Q == null) {
          Rubas.c("pymk_aggregate_page_start");
       }
       return;
    }
    public int f(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, UserAggregateFragment.class, "17");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.apply(null, this, UserAggregateFragment.class, "18");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(!TextUtils.isEmpty(this.K)){
          i = Integer.parseInt(this.K);
       }else {
          UserAggregateFragment tO = this.O;
          if (tO != null && tO.s() != null) {
             i = c.a(this.O.s().l2());
             if (i <= 0) {
             }
          }else {
          }
       }
       return i;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserAggregateFragment.class, "8")) {
          return;
       }
       super.fh(p0, p1);
       UserAggregateFragment$a uoa = new UserAggregateFragment$a(this, FpsSocialBizType.RELATION, "PYMK", this, this.h0());
       if (!PatchProxy.applyVoid(null, p0, UserAggregateFragment$a.class, "1")) {
          p0.a.a();
          p0.b.a();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserAggregateFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(UserAggregateFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, UserAggregateFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.P)) {
          obj = i3.f();
          obj.c("contentType", Integer.valueOf(this.G));
          obj.d("pageType", this.H);
          UserAggregateFragment tF = this.F;
          if (tF != null) {
             obj.d("type", tF.getBizId());
          }
          this.P = obj.e();
       }
       return this.P;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, UserAggregateFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.i(237);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserAggregateFragment.class, "1")) {
          return;
       }
       if (this.Q == null) {
          Rubas.c("pymk_aggregate_page_enter");
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.F = SerializableHook.getSerializable(this.getArguments(), "photo");
          this.N = this.getArguments().getString("topUsers");
          this.G = this.getArguments().getInt("contentType");
          this.H = this.getArguments().getString("pageType");
          this.M = this.getArguments().getString("prsid");
          this.I = this.getArguments().getString("extraInfo");
          this.J = this.getArguments().getString("extParams");
          this.K = this.getArguments().getString("followRefer");
          this.L = this.getArguments().getBoolean("useContact");
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserAggregateFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       RecyclerView$l ol = null;
       this.h0().setItemAnimator(ol);
       if (!TextUtils.isEmpty(this.N) && !PatchProxy.applyVoid(ol, this, UserAggregateFragment.class, "11")) {
          this.ia().P0(a.a(this.getContext(), R.layout.arg_RES_7f0d12a5));
          this.h0().setOnScrollListener(new d(this));
       }
       return;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserAggregateFragment.class, "13")) {
          return;
       }
       super.th();
       RecyclerView$s recycledView = this.h0().getRecycledViewPool();
       recycledView.k(14, 15);
       recycledView.k(13, 25);
       this.h0().setItemAnimator(objArray);
       this.h0().setHasFixedSize(true);
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(UserAggregateFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, UserAggregateFragment.class, "4")) {
          return;
       }
       super.v2(p0, p1);
       if (!PatchProxy.applyVoid(null, this, UserAggregateFragment.class, "5") && this.Q == null) {
          this.Q = true;
          Rubas.c("pymk_aggregate_page_end");
       }
       return;
    }
    public g vh(){
       h$a uoa1;
       b$a uoa2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, UserAggregateFragment.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new f();
       h$a uoa = PatchProxy.applyTwoRefs(objArray, obj, this, UserAggregateFragment.class, "14");
       if (uoa != patchProxyRe) {
       }else {
          int i = 1;
          int i1 = TextUtils.isEmpty(this.N) ^ i;
          String str = PatchProxy.apply(objArray, this, UserAggregateFragment.class, "10");
          if (str != patchProxyRe) {
          }else {
             try{
                str = new c().a(this.J).e0("profileUserId").w();
                if (TextUtils.isEmpty(str)) {
                }
             }catch(java.lang.Exception e5){
                e5.printStackTrace();
             }
             str = objArray;
          }
          c uoc = new c(this, str);
          SayHiConfigParam obj1 = PatchProxy.apply(objArray, this, UserAggregateFragment.class, "9");
          int i2 = 0;
          int i3 = (obj1 != patchProxyRe)? obj1.intValue(): c.d(this.J).r().e0("liveSourceType").p();
       }
       this.O = uoa.b();
       return new b(new c(), this.O, this);
    }
    public i yh(){
       f obj = PatchProxy.apply(null, this, UserAggregateFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.O.s();
       obj.E = this.G;
       obj.F = this.H;
       obj.I = this.N;
       obj.G = this.I;
       obj.H = this.J;
       obj.J = this.M;
       return obj;
    }
}
