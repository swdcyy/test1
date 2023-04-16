package com.kuaishou.recruit.doubleList.RecruitDoubleListFragment;
import eb5.d;
import on5.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import js4.e;
import q99.a;
import com.yxcorp.gifshow.model.LivePlayConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.recruit.doubleList.RecruitDoubleListFragment$RecruitDoubleListParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import us4.a;
import ws4.a;
import x99.o;
import vs4.e;
import xa5.a;
import cb5.g;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.i;
import zs4.k;
import com.kwai.framework.abtest.f;
import ms4.b;
import java.lang.Boolean;
import wa5.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import rz6.a;
import rz6.a$a;
import cb5.b0;
import on5.e;
import com.yxcorp.gifshow.refresh.RefreshType;
import eb5.c;
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
import js4.d;
import java.util.Map;
import java.lang.StringBuilder;
import ro5.e0;
import wkd.b;
import lg2.m;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import tyc.q4;
import y99.i;
import com.kuaishou.recruit.doubleList.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Number;
import db5.c;
import wq6.d;
import y8c.g;
import ks4.b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import qvb.i;
import ys4.b;

public class RecruitDoubleListFragment extends RecyclerFragment implements d, f	// class@000e9e
{
    public final a F;
    public final e G;
    public RecruitDoubleListFragment$RecruitDoubleListParams H;
    public static final int I;

    public void RecruitDoubleListFragment(){
       super();
       this.G = new e();
       this.F = new a(this, FollowConfigUtil.o(), 8);
    }
    public static RecruitDoubleListFragment Gh(RecruitDoubleListFragment$RecruitDoubleListParams p0){
       RecruitDoubleListFragment obj = PatchProxy.applyOneRefs(p0, null, RecruitDoubleListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RecruitDoubleListFragment();
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, "KEY_RECRUIT_DOUBLE_LIST_PARAMS", p0);
       obj.setArguments(uBundle);
       return obj;
    }
    public PresenterV2 B2(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PresenterV2 obj = PatchProxy.applyWithListener(objArray, this, RecruitDoubleListFragment.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = super.B2();
       String str = "8";
       if (!PatchProxy.applyVoidOneRefsWithListener(obj, this, RecruitDoubleListFragment.class, str)) {
          obj.U7(new a());
          obj.U7(new a());
          obj.U7(new o());
          PatchProxy.onMethodExit(RecruitDoubleListFragment.class, str);
       }
       if (this.H.mIsFromTab != null && !PatchProxy.applyVoidOneRefsWithListener(obj, this, RecruitDoubleListFragment.class, "9")) {
          obj.U7(new e());
          if (a.a(this)) {
             obj.U7(new g(this));
          }
          boolean b = false;
          obj.U7(new i(b, "h"));
          obj.U7(new k());
          int i = f.f("recruitTabAutoRefreshIntervalSeconds", b);
          if ((long)i > 0) {
             obj.U7(new b(i));
          }
          Object obj1 = PatchProxy.apply(objArray, this, RecruitDoubleListFragment.class, "10");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             String str1 = e.a();
             if (!TextUtils.isEmpty(str1) && str1.contains("RECRUIT")) {
                b = 1;
             }
             b1 = b;
          }
          if (b1 && !a.e.a().b()) {
             obj.U7(new b0());
          }
          PatchProxy.onMethodExit(RecruitDoubleListFragment.class, "9");
       }
       PatchProxy.onMethodExit(RecruitDoubleListFragment.class, "7");
       return obj;
    }
    public boolean B7(){
       return e.f(this);
    }
    public boolean Eh(){
       return true;
    }
    public void J3(RefreshType p0){
       c.b(this, p0);
    }
    public void L8(){
       e.h(this);
    }
    public int M(){
       return this.H.mLogCategory;
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, RecruitDoubleListFragment.class, "19")) {
          return;
       }
       super.N1();
       return;
    }
    public String O9(){
       return "FIND_JOB";
    }
    public boolean S0(){
       return false;
    }
    public void U0(boolean p0){
       if (PatchProxy.isSupport(RecruitDoubleListFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecruitDoubleListFragment.class, "17")) {
          return;
       }
       if (this.h0() instanceof CustomRecyclerView) {
          this.h0().setCanPullToRefresh(p0);
       }
       return;
    }
    public void X(RefreshType p0,boolean p1){
       if (PatchProxy.isSupport(RecruitDoubleListFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, RecruitDoubleListFragment.class, "13")) {
          return;
       }
       this.N1();
       this.rh().v(false);
       return;
    }
    public boolean Xg(){
       return (this.H.mIsFromTab ^ 0x01);
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public boolean c1(){
       Object obj = PatchProxy.apply(null, this, RecruitDoubleListFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.b(this.getActivity())) {
          return this.Vg().c();
       }
       return super.c1();
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecruitDoubleListFragment.class, "3")) {
          return;
       }
       super.fh(p0, p1);
       this.a6();
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d12e8;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecruitDoubleListFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, RecruitDoubleListFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(RecruitDoubleListFragment.class, new d());
       }else {
          obj.put(RecruitDoubleListFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, RecruitDoubleListFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       String pageParams = super.getPageParams();
       if (!TextUtils.isEmpty(pageParams)) {
          obj = obj+pageParams;
       }
       if (!TextUtils.isEmpty(this.H.mPageSource)) {
          if (obj.length()) {
             obj = obj+"&";
          }
          obj = obj+"page_source="+this.H.mPageSource;
       }
       if (this.H.mIsFromTab != null) {
          e0.b(this, obj);
       }
       Map map = b.a(-1498019239).e();
       if (map != null) {
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             obj = obj+"&"+uEntry.getKey()+"="+uEntry.getValue();
          }
       }
       return obj;
    }
    public boolean i8(){
       Object obj = PatchProxy.apply(null, this, RecruitDoubleListFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       q4.c(this.h0());
       return false;
    }
    public void jh(){
       if (PatchProxy.applyVoid(null, this, RecruitDoubleListFragment.class, "11")) {
          return;
       }
       k ok = this.rh();
       if (ok != null && (this.Dh() && (this.uh() && this.i0()))) {
          ok.v(false);
          return;
       }else {
          this.F.d.d(true);
          return;
       }
    }
    public void kh(){
       if (PatchProxy.applyVoid(null, this, RecruitDoubleListFragment.class, "12")) {
          return;
       }
       this.F.d.d(false);
       return;
    }
    public boolean lh(){
       RecruitDoubleListFragment tH = this.H;
       boolean b = (tH != null && tH.mIsFromTab != null)? true: false;
       return b;
    }
    public String o(){
       return this.H.mLogPage2;
    }
    public boolean o3(){
       Object obj = PatchProxy.apply(null, this, RecruitDoubleListFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.X(RefreshType.BOTTOM_REFRESH, false);
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitDoubleListFragment.class, "2")) {
          return;
       }
       this.H = k0.a(this.getArguments(), d.a).or(new RecruitDoubleListFragment$RecruitDoubleListParams(true));
       super.onCreate(p0);
       return;
    }
    public void onRefresh(){
       if (PatchProxy.applyVoid(null, this, RecruitDoubleListFragment.class, "20")) {
          return;
       }
       this.a();
       return;
    }
    public int qh(){
       return 0x7f0a1c46;
    }
    public int r(){
       Object obj = PatchProxy.apply(null, this, RecruitDoubleListFragment.class, "15");
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
       Object obj = PatchProxy.apply(null, this, RecruitDoubleListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.F,this.G};
       return new b(objArray);
    }
    public boolean x0(){
       return true;
    }
    public RecyclerView$LayoutManager xh(){
       DecoSafeStaggeredLayoutManager obj = PatchProxy.apply(null, this, RecruitDoubleListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DecoSafeStaggeredLayoutManager(2, 1);
       obj.setGapStrategy(2);
       obj.N(this.h0());
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, RecruitDoubleListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.H.mServerExtraInfo, true);
    }
    public d z5(){
       return j.c(this);
    }
}
