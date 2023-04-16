package com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment;
import lyb.s;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$a;
import nsd.u;
import java.util.HashSet;
import k90.a;
import java.util.ArrayList;
import mh9.a;
import lnc.a1;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$g;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$b;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSStaggeredGridLayoutManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import g9c.d;
import android.view.View;
import java.lang.Boolean;
import qvb.i;
import java.util.Map;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import androidx.recyclerview.widget.RecyclerView;
import qvb.f;
import qvb.n0;
import kh9.a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$b;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.KSSource;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import lq.i;
import android.app.Activity;
import java.util.Iterator;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import k2b.e0;
import t90.j;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$e;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$f;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.g;
import q90.n;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$d;
import a9c.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$c;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public final class TemplateSearchFeedListFragment extends RecyclerFragment implements s	// class@000f6c
{
    public KSLaunchParams F;
    public View G;
    public KSStaggeredGridLayoutManager H;
    public final HashSet I;
    public String J;
    public a K;
    public View L;
    public a M;
    public final Runnable N;
    public TemplateSearchFeedListFragment$b O;
    public static final TemplateSearchFeedListFragment$a P;

    static {
       TemplateSearchFeedListFragment.P = new TemplateSearchFeedListFragment$a(null);
    }
    public void TemplateSearchFeedListFragment(){
       super();
       this.I = new HashSet();
       this.K = new a(false, new ArrayList());
       this.M = new a(a1.d(0x7f07031b), 2);
       this.N = new TemplateSearchFeedListFragment$g(this);
       this.O = new TemplateSearchFeedListFragment$b(this);
    }
    public static final KSStaggeredGridLayoutManager Gh(TemplateSearchFeedListFragment p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("layoutManager");
       }
       return p0;
    }
    public final int Hh(){
       Object obj = PatchProxy.apply(null, this, TemplateSearchFeedListFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = KSDataManager.q.a().A0("2");
       if (i < 0) {
          i = -1;
       }
       return i;
    }
    public final void Ih(){
       if (PatchProxy.applyVoid(null, this, TemplateSearchFeedListFragment.class, "12")) {
          return;
       }
       d uod = this.ia();
       if (uod != null) {
          uod.m1(this.L);
       }
       this.M.f(false);
       return;
    }
    public boolean S0(){
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, TemplateSearchFeedListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q();
       if (obj != null) {
          objArray = Boolean.valueOf(obj.isEmpty());
       }
       return (objArray.booleanValue() ^ 0x01);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TemplateSearchFeedListFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(TemplateSearchFeedListFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, TemplateSearchFeedListFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "task_id=";
       TemplateSearchFeedListFragment tF = this.F;
       if (tF == null) {
          a.S("ksLaunchParam");
       }
       return obj+tF.getTaskId();
    }
    public void if(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TemplateSearchFeedListFragment.class, "6")) {
          return;
       }
       this.J = p0;
       i oi = this.q();
       if (oi != null) {
          RecyclerView recyclerView = this.h0();
          int i = 0;
          if (recyclerView != null) {
             recyclerView.stopScroll();
             recyclerView.scrollToPosition(i);
          }
          oi.release();
          oi.clear();
          oi.T1(i);
          if (oi instanceof a) {
             TemplateSearchFeedListFragment tJ = this.J;
             if (tJ != null) {
                oi.h2(tJ);
             }
          }
          oi.a();
       }
       this.Ih();
       return;
    }
    public String o(){
       return "PRODUCE_PLAY_LIBRARY";
    }
    public void onCreate(Bundle p0){
       KSLaunchParams kSLaunchPara;
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateSearchFeedListFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() == null) {
          kSLaunchPara = new KSLaunchParams$b().a();
          a.o(kSLaunchPara, "KSLaunchParams.Builder\(\).build\(\)");
       }else {
          p0 = this.getArguments();
          a.m(p0);
          kSLaunchPara = SerializableHook.getSerializable(p0, "intent_ks_launch_param");
          Objects.requireNonNull(kSLaunchPara, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.model.KSLaunchParams");
       }
       this.F = kSLaunchPara;
       String str = "ksLaunchParam";
       if (kSLaunchPara == null) {
          a.S(str);
       }
       kSLaunchPara.setKSSource(KSSource.SEARCH);
       TemplateSearchFeedListFragment tF = this.F;
       if (tF == null) {
          a.S(str);
       }
       tF.setGroupId("2");
       if (!this.getActivity() instanceof BasePostActivity && i.h()) {
          i.m().e(this.getActivity());
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, TemplateSearchFeedListFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       if (!this.getActivity() instanceof BasePostActivity && i.h()) {
          i.m().S(this.getActivity());
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TemplateSearchFeedListFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       KSDataManager.q.a().u0();
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          KSTemplateDetailInfo kSTemplateDe = iterator.next();
          TemplateSearchFeedListFragment tF = this.F;
          if (tF == null) {
             a.S("ksLaunchParam");
          }
          String groupName = tF.getGroupName();
          KSTemplateDetailInfo mTemplateId = kSTemplateDe.mTemplateId;
          KSTemplateDetailInfo mName = kSTemplateDe.mName;
          KSTemplateDetailInfo mIndexInGrou = kSTemplateDe.mIndexInGroup;
          boolean b = false;
          tF = (kSTemplateDe.mFriendUseCount > 0)? 1: null;
          if (kSTemplateDe.mTemplateType == 12) {
             b = true;
          }
          j.c(this, "2", groupName, mTemplateId, mName, mIndexInGrou, tF, b);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, TemplateSearchFeedListFragment.class, "3")) {
          return;
       }
       super.onResume();
       k1.r(new TemplateSearchFeedListFragment$e(this), 1);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TemplateSearchFeedListFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.G = p0;
       super.onViewCreated(p0, p1);
       this.h0().setPadding(0, a1.d(R.dimen.arg_RES_7f070334), 0, 0);
       this.h0().addItemDecoration(this.M);
       this.h0().addOnScrollListener(new TemplateSearchFeedListFragment$f(this));
       RefreshLayout refreshLayou = this.Ac();
       if (refreshLayou != null) {
          refreshLayou.setEnabled(0);
       }
       return;
    }
    public g vh(){
       n obj = PatchProxy.apply(null, this, TemplateSearchFeedListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TemplateSearchFeedListFragment tF = this.F;
       if (tF == null) {
          a.S("ksLaunchParam");
       }
       obj = new n(tF, new TemplateSearchFeedListFragment$d(), this);
       obj.F0(new TemplateSearchFeedListFragment$c(this));
       return obj;
    }
    public RecyclerView$LayoutManager xh(){
       KSStaggeredGridLayoutManager obj = PatchProxy.apply(null, this, TemplateSearchFeedListFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KSStaggeredGridLayoutManager(2, 1);
       this.H = obj;
       obj.setGapStrategy(0);
       TemplateSearchFeedListFragment tH = this.H;
       if (tH == null) {
          a.S("layoutManager");
       }
       return tH;
    }
    public i yh(){
       a obj = PatchProxy.apply(null, this, TemplateSearchFeedListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.K);
       TemplateSearchFeedListFragment tO = this.O;
       if (!PatchProxy.applyVoidOneRefs(tO, obj, a.class, "2")) {
          a.p(tO, "listener");
          obj.q = tO;
       }
       tO = this.J;
       if (tO != null) {
          obj.h2(tO);
       }
       return obj;
    }
}
