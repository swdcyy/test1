package com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment$a;
import nsd.u;
import java.util.HashSet;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment$b;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSStaggeredGridLayoutManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import q90.p;
import java.lang.Boolean;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t90.c;
import androidx.recyclerview.widget.RecyclerView;
import qvb.i;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.Objects;
import java.util.List;
import java.util.HashMap;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import java.util.ArrayList;
import trd.u;
import java.util.Collection;
import java.util.Map;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$b;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.Context;
import k2b.e0;
import t90.j;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import u80.e;
import q87.c;
import j90.a;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import q90.m;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment$e;
import androidx.recyclerview.widget.RecyclerView$r;
import g9c.d;
import q90.o;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y8c.g;
import q90.n;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment$d;
import a9c.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment$c;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import y80.c;

public final class KSFeedListFragment extends RecyclerFragment	// class@001ad2
{
    public String F;
    public KSLaunchParams G;
    public p H;
    public KSStaggeredGridLayoutManager I;
    public boolean J;
    public final HashSet K;
    public boolean L;
    public final Runnable M;
    public static final KSFeedListFragment$a N;

    static {
       KSFeedListFragment.N = new KSFeedListFragment$a(null);
    }
    public void KSFeedListFragment(){
       super();
       this.F = "";
       this.K = new HashSet();
       this.M = new KSFeedListFragment$b(this);
    }
    public static final KSStaggeredGridLayoutManager Gh(KSFeedListFragment p0){
       p0 = p0.I;
       if (p0 == null) {
          a.S("mLayoutManager");
       }
       return p0;
    }
    public t Bh(){
       p obj = PatchProxy.apply(null, this, KSFeedListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new p(this, this.F);
       this.H = obj;
       a.m(obj);
       return obj;
    }
    public final String Hh(){
       return this.F;
    }
    public final boolean Ih(){
       KSDataManager$a obj = PatchProxy.apply(null, this, KSFeedListFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KSDataManager.q;
       int i = obj.a().O();
       if (TextUtils.x(this.F) || (!TextUtils.n(this.F, obj.a().p()) || i < 0)) {
          return false;
       }
       RecyclerView recyclerView = this.h0();
       a.o(recyclerView, "recyclerView");
       i oi = this.q();
       a.o(oi, "pageList");
       return c.a.a(i, true, recyclerView, oi);
    }
    public final void Jh(){
       KSDataManager$d a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSFeedListFragment.class, "8")) {
          return;
       }
       i oi = this.q();
       String str = "pageList";
       a.o(oi, str);
       if (oi.isEmpty()) {
          return;
       }
       i oi1 = this.q();
       a.o(oi1, str);
       KSDataManager kSDataManage = KSDataManager.q.a();
       KSFeedListFragment tF = this.F;
       KSTemplateDetailInfo mCursor = this.q().getItem((oi1.getCount() - 1)).mCursor;
       a.o(mCursor, "lastItem.mCursor");
       Objects.requireNonNull(kSDataManage);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray1 = PatchProxy.applyTwoRefs(tF, mCursor, kSDataManage, KSDataManager.class, "16");
       if (objArray1 != patchProxyRe) {
       }else {
          a.p(tF, "groupId");
          String str1 = "cursor";
          a.p(mCursor, str1);
          KSDataManager$d uod = kSDataManage.h.get(tF);
          if (uod != null) {
             Object obj = PatchProxy.applyOneRefs(mCursor, uod, KSDataManager$d.class, "5");
             if (obj != patchProxyRe) {
                objArray = obj;
             }else {
                a.p(mCursor, str1);
                int i = -1;
                int i1 = 0;
                Iterator iterator1 = uod.a.iterator();
                while (iterator1.hasNext()) {
                   if (TextUtils.n(iterator1.next().mCursor, mCursor)) {
                      i = i1;
                      break ;
                   }
                   i1 = i1 + 1;
                }
                if (i >= 0) {
                   a = uod.a;
                   objArray = a.subList((i + 1), a.size());
                }
             }
          }
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          oi = this.q();
          ArrayList uArrayList = new ArrayList(u.Y(objArray1, 10));
          Iterator iterator = objArray1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().toKSTemplateDetailInfo());
          }
          oi.b(uArrayList);
       }
       return;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSFeedListFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KSFeedListFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, KSFeedListFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "task_id=";
       KSFeedListFragment tG = this.G;
       if (tG == null) {
          a.S("mKSLaunchParam");
       }
       return obj+tG.getTaskId();
    }
    public String o(){
       return "PRODUCE_PLAY_LIBRARY";
    }
    public void onCreate(Bundle p0){
       KSLaunchParams kSLaunchPara;
       if (PatchProxy.applyVoidOneRefs(p0, this, KSFeedListFragment.class, "1")) {
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
       this.G = kSLaunchPara;
       String str = "mKSLaunchParam";
       if (kSLaunchPara == null) {
          a.S(str);
       }
       kSLaunchPara.mNeedOpenExitAnimation = true;
       KSFeedListFragment tG = this.G;
       if (tG == null) {
          a.S(str);
       }
       String groupId = tG.getGroupId();
       a.o(groupId, "mKSLaunchParam.groupId");
       this.F = groupId;
       return;
    }
    public void onDestroyView(){
       int firstChildPo;
       if (PatchProxy.applyVoid(null, this, KSFeedListFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       int i = 0;
       if (this.J != null) {
          Iterator iterator = this.K.iterator();
          while (iterator.hasNext()) {
             KSTemplateDetailInfo kSTemplateDe = iterator.next();
             Context context = this.getContext();
             Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             Context uContext = context;
             KSFeedListFragment tF = this.F;
             KSFeedListFragment tG = this.G;
             if (tG == null) {
                a.S("mKSLaunchParam");
             }
             String groupName = tG.getGroupName();
             KSTemplateDetailInfo mTemplateId = kSTemplateDe.mTemplateId;
             KSTemplateDetailInfo mName = kSTemplateDe.mName;
             KSTemplateDetailInfo mIndexInGrou = kSTemplateDe.mIndexInGroup;
             boolean b = (kSTemplateDe.mFriendUseCount > 0)? true: false;
             boolean b1 = (kSTemplateDe.mTemplateType == 12)? true: false;
             j.c(uContext, tF, groupName, mTemplateId, mName, mIndexInGrou, b, b1);
          }
       }
       RecyclerView recyclerView = this.h0();
       String str = "recyclerView";
       a.o(recyclerView, str);
       if (recyclerView.getLayoutManager() instanceof KSStaggeredGridLayoutManager) {
          recyclerView = this.h0();
          a.o(recyclerView, str);
          RecyclerView$LayoutManager layoutManage = recyclerView.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.feed.KSStaggeredGridLayoutManager");
          firstChildPo = layoutManage.getFirstChildPosition();
       }else {
          firstChildPo = -1;
       }
       KSDataManager$a q = KSDataManager.q;
       q.a().G0(this.F, firstChildPo);
       KSDataManager kSDataManage = q.a();
       KSFeedListFragment tF1 = this.F;
       Objects.requireNonNull(kSDataManage);
       if (!PatchProxy.applyVoidOneRefs(tF1, kSDataManage, KSDataManager.class, "33")) {
          a.p(tF1, "groupId");
          Object[] objArray = new Object[i];
          e.D().w("KSDataManager", "detachPageList\(\) groupId: "+tF1, objArray);
          a uoa = kSDataManage.j.remove(tF1);
          if (uoa != null) {
             a.o(uoa, "it");
             kSDataManage.D0(uoa);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSFeedListFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.h0().addItemDecoration(new m(a1.d(R.dimen.arg_RES_7f07031b), 2));
       this.h0().addOnScrollListener(new KSFeedListFragment$e(this));
       this.ia().J0(new o(this, this.F));
       return;
    }
    public g vh(){
       n obj = PatchProxy.apply(null, this, KSFeedListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSFeedListFragment tG = this.G;
       if (tG == null) {
          a.S("mKSLaunchParam");
       }
       obj = new n(tG, new KSFeedListFragment$d(), this);
       obj.F0(new KSFeedListFragment$c(this));
       return obj;
    }
    public boolean x0(){
       return true;
    }
    public RecyclerView$LayoutManager xh(){
       KSStaggeredGridLayoutManager obj = PatchProxy.apply(null, this, KSFeedListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KSStaggeredGridLayoutManager(2, 1);
       this.I = obj;
       obj.setGapStrategy(0);
       KSFeedListFragment tI = this.I;
       if (tI == null) {
          a.S("mLayoutManager");
       }
       return tI;
    }
    public i yh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSDataManager obj = PatchProxy.apply(null, this, KSFeedListFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = KSDataManager.q.a();
       KSFeedListFragment tF = this.F;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.applyOneRefs(tF, obj, KSDataManager.class, "32");
       if (uoa != patchProxyRe) {
       }else {
          a.p(tF, "groupId");
          Object[] objArray = new Object[0];
          e.D().w("KSDataManager", "attachPageList\(\) groupId: "+tF, objArray);
          uoa = new a(tF, obj);
          obj.j.put(tF, uoa);
       }
       return uoa;
    }
}
