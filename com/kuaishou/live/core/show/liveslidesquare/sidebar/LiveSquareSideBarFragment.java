package com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wb2.m;
import wb2.d;
import wb2.h;
import vb2.q;
import vb2.m;
import vb2.k;
import vb2.o;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarTabData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vb2.n;
import x99.o;
import vb2.j;
import y8c.t;
import nb2.f;
import q99.a;
import y99.i;
import pb2.l;
import java.util.Iterator;
import java.util.List;
import gka.o;
import im8.c;
import java.lang.Integer;
import nb2.e;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveSourceType;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import pb2.u;
import f3b.o;
import android.os.Bundle;
import com.yxcorp.gifshow.model.LivePlayConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.QPhoto;
import ub2.d;
import ub2.i;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarTabContainerFragment;
import java.util.Objects;
import pb2.l$b;
import nb2.h;
import qvb.i;
import qvb.q;
import qvb.j;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarFragment$a;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarFragment$b;
import androidx.recyclerview.widget.RecyclerView$n;
import y8c.g;
import pb2.v$a;
import nb2.b;
import pb2.v;
import ob2.a;
import com.kuaishou.live.core.basic.utils.e;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import android.content.Context;

public class LiveSquareSideBarFragment extends RecyclerFragment	// class@000ca0
{
    public a F;
    public d G;
    public LiveSquareSideBarTabData H;
    public String I;
    public QPhoto J;
    public l K;
    public a L;
    public String M;

    public void LiveSquareSideBarFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveSquareSideBarFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new m());
       obj.U7(new d());
       obj.U7(new h());
       obj.U7(new q());
       obj.U7(new m());
       obj.U7(new k());
       obj.U7(new o());
       LiveSquareSideBarFragment tH = this.H;
       if (tH != null && TextUtils.n(tH.mTabId, "19")) {
          obj.U7(new n());
       }
       obj.U7(new o());
       obj.U7(new j());
       PatchProxy.onMethodExit(LiveSquareSideBarFragment.class, "3");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveSquareSideBarFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this, 3);
    }
    public boolean Eh(){
       return true;
    }
    public String Gh(){
       LiveSquareSideBarFragment tH = this.H;
       LiveSquareSideBarTabData mTabId = (tH != null)? tH.mTabId: null;
       return mTabId;
    }
    public int M(){
       return 5;
    }
    public boolean Xg(){
       return false;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, LiveSquareSideBarFragment.class, "13")) {
          return;
       }
       super.c0();
       this.L.d.d(false);
       Iterator iterator = this.K.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().c0();
       }
       return;
    }
    public int f(){
       return 1001;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveSquareSideBarFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.K);
       obj.add(new c("LOAD_MORE_OFFSET", Integer.valueOf(3)));
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d0dd6;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSquareSideBarFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LiveSquareSideBarFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LiveSquareSideBarFragment.class, new e());
       }else {
          obj.put(LiveSquareSideBarFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, LiveSquareSideBarFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       String str = "refer_live_source_type="+o.g(ClientContent$LiveSourceType.class, u.c(this.getActivity()).i())+"&aggregation_session_id="+this.getArguments().getString("aggregation_session_id");
       if (TextUtils.x(obj)) {
          obj = str;
       }else if(!obj.contains("refer_live_source_type") && !obj.contains("aggregation_session_id")){
          obj = obj+"&"+str;
       }
       return obj;
    }
    public String o(){
       return "LIVE_MORE_SQUARE";
    }
    public void onCreate(Bundle p0){
       u ou1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSquareSideBarFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.L = new a(this, FollowConfigUtil.o(), 8);
       this.I = this.getArguments().getString("LIVE_SQUARE_SOURCE_FEED_SERVICE");
       this.J = SerializableHook.getSerializable(this.getArguments(), "notice_feed");
       this.H = SerializableHook.getSerializable(this.getArguments(), "tab_data");
       this.M = this.getArguments().getString("KEY_SELECTED_SUB_TAB_ID");
       Object[] objArray = null;
       if (this.G == null) {
          i oi = PatchProxy.apply(objArray, this, LiveSquareSideBarFragment.class, "15");
          if (oi != PatchProxyResult.class) {
          }else {
             boolean b = TextUtils.n(this.Gh(), u.c(this.getActivity()).n);
             if (TextUtils.n(this.Gh(), "17")) {
                if (b) {
                   oi = new i(this.requireParentFragment().Qh(), this.Gh(), u.c(this.getActivity()).l(), u.c(this.getActivity()).k());
                }else {
                   oi = new i(this.requireParentFragment().Qh(), this.Gh());
                }
             }else if(b){
                String str = this.requireParentFragment().Qh();
                String str1 = this.Gh();
                int i = u.c(this.getActivity()).l();
                String str2 = u.c(this.getActivity()).k();
                u ou = u.c(this.getActivity());
                Objects.requireNonNull(ou);
                Object obj = PatchProxy.apply(objArray, ou, u.class, "11");
                if (obj != PatchProxyResult.class) {
                   ou1 = obj;
                }else if(ou.a()){
                   ou = ou.l;
                }else {
                   Object[] objArray1 = objArray;
                }
                ou1 = ou;
                d uod = new d(str, str1, i, str2, ou1);
             }else {
                oi = new d(this.requireParentFragment().Qh(), this.Gh(), this.M);
             }
          }
          this.G = oi;
       }
       l$b uob = new l$b();
       uob.a = this.requireParentFragment().E;
       uob.c = this.H;
       uob.d = this.M;
       uob.b = new h(this.G);
       l ol = PatchProxy.apply(objArray, uob, l$b.class, "1");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = new l(uob);
       }
       this.K = ol;
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveSquareSideBarFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       LiveSquareSideBarFragment tK = this.K;
       Objects.requireNonNull(tK);
       if (!PatchProxy.applyVoid(null, tK, l.class, "1")) {
          l g = tK.g;
          if (g != null && !PatchProxy.applyVoid(null, g, h.class, "5")) {
             h c = g.c;
             if (c != null) {
                g.a.f(c);
                g.c = null;
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSquareSideBarFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.ia().S0(this.h0(), new LiveSquareSideBarFragment$a(this));
       return;
    }
    public int qh(){
       return 0x7f0a25db;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveSquareSideBarFragment.class, "9")) {
          return;
       }
       super.th();
       this.h0().setNestedScrollingEnabled(false);
       this.h0().addItemDecoration(new LiveSquareSideBarFragment$b(this));
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, LiveSquareSideBarFragment.class, "12")) {
          return;
       }
       super.u();
       this.L.d.d(true);
       Iterator iterator = this.K.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().u();
       }
       return;
    }
    public g vh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       v$a obj = PatchProxy.apply(objArray, this, LiveSquareSideBarFragment.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.F == null) {
          obj = new v$a();
          LiveSquareSideBarFragment tK = this.K;
          obj.a = tK.e;
          obj.d = this.I;
          obj.b = tK.f;
          obj.e = this.L;
          obj.c = new b(this);
          v ov = PatchProxy.apply(objArray, obj, v$a.class, "1");
          if (ov != patchProxyRe) {
          }else {
             ov = new v(obj);
          }
          this.F = new a(e.s(this.getActivity()), ov);
       }
       return this.F;
    }
    public boolean x0(){
       return true;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, LiveSquareSideBarFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NpaGridLayoutManager(this.getContext(), 2);
    }
    public i yh(){
       LiveSquareSideBarFragment obj = PatchProxy.apply(null, this, LiveSquareSideBarFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J;
       if (obj != null) {
          this.G.i2(obj);
       }
       return this.G;
    }
}
