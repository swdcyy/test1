package com.yxcorp.gifshow.activity.share.topic.ShareTopicHistoryV3Fragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import lnc.a4;
import java.util.ArrayList;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import k2b.e0;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import ekd.m1;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import java.lang.Exception;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.util.SparseArray;
import java.util.List;
import y8c.g;
import g9c.a;
import com.kuaishou.android.post.topic.model.TopicItem;
import vw8.a;
import androidx.recyclerview.widget.RecyclerView;
import lnc.a4$a;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.Iterator;
import qvb.i;
import com.yxcorp.gifshow.activity.share.topic.j;
import fx8.q;
import fx8.m0;
import qvb.n0;
import fx8.a0;
import com.yxcorp.gifshow.model.topic.HotRecommendResponse;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicHistoryV3Fragment$a;
import com.yxcorp.gifshow.activity.share.topic.i;

public class ShareTopicHistoryV3Fragment extends RecyclerFragment implements d	// class@001473
{
    public PublishPageSetting F;
    public View G;
    public View H;
    public String I;
    public String J;
    public String K;
    public m0 L;
    public a4 M;
    public List N;
    public ShareTopicExtra O;
    public ShareTopicHistoryV3Fragment$a P;
    public static final int Q;

    public void ShareTopicHistoryV3Fragment(){
       super();
       this.F = a.t().getValue("publish_page_settings", PublishPageSetting.class, new PublishPageSetting());
       this.I = "";
       this.J = "";
       this.K = "";
       this.M = new a4();
       this.N = new ArrayList();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(ShareTopicHistoryV3Fragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ShareTopicHistoryV3Fragment.class, "10")) {
          return;
       }
       super.M1(p0, p1);
       this.H.setVisibility(8);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ShareTopicHistoryV3Fragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ShareTopicHistoryV3Fragment.class, "8")) {
          return;
       }
       super.Z1(p0, p1);
       this.H.setVisibility(0);
       return;
    }
    public final e0 c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ShareTopicHistoryV3Fragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() instanceof e0) {
          objArray = this.getActivity();
       }
       return objArray;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicHistoryV3Fragment.class, "1")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a129c);
       this.H = m1.f(p0, 0x7f0a129f);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d00f5;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareTopicHistoryV3Fragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ShareTopicHistoryV3Fragment.class, null);
       return objectsByTag;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Serializable obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareTopicHistoryV3Fragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoid(null, this, ShareTopicHistoryV3Fragment.class, "7") && this.getArguments() != null) {
          this.I = this.getArguments().getString("photo_task_id", "");
          this.J = this.getArguments().getString("editSessionId", "");
          this.K = this.getArguments().getString("from_page", "");
          obj = SerializableHook.getSerializable(this.getArguments(), "topic_extra");
          if (obj instanceof ShareTopicExtra) {
             this.O = obj;
          }else {
             PostUtils.D("ShareTopicHistoryV3Fragment", "topic_extra type un match", new Exception("topic_extra type un match"));
          }
       }
       View view = super.onCreateView(p0, p1, p2);
       this.doBindView(view);
       return view;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(ShareTopicHistoryV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShareTopicHistoryV3Fragment.class, "4")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0 && !PatchProxy.applyVoid(null, this, ShareTopicHistoryV3Fragment.class, "12")) {
          SparseArray sparseArray = new SparseArray();
          for (e0 uoe0 = null; uoe0 < this.M.c().size() && uoe0 < this.g7().getItemCount(); uoe0 = uoe0 + 1) {
             sparseArray.put(uoe0, this.g7().N0(uoe0));
          }
          a.x(this.c(), sparseArray, "taglist");
          this.M.c().clear();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareTopicHistoryV3Fragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.h0().addOnScrollListener(this.M.b());
       Iterator iterator = this.N.iterator();
       while (iterator.hasNext()) {
          this.h0().addOnScrollListener(iterator.next());
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ShareTopicHistoryV3Fragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ShareTopicHistoryV3Fragment.class, "9")) {
          return;
       }
       if (!this.q().d1().size()) {
          this.G.setVisibility(0);
       }else {
          this.G.setVisibility(8);
       }
       if (p0) {
          this.M.a(this.h0());
       }
       this.H.setVisibility(8);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ShareTopicHistoryV3Fragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(new q(this));
    }
    public boolean x0(){
       return false;
    }
    public i yh(){
       i oi = PatchProxy.apply(null, this, ShareTopicHistoryV3Fragment.class, "6");
       if (oi != PatchProxyResult.class) {
       }else {
          PublishPageSetting mRecommendTa = this.F.mRecommendTagIndex;
          int i = (mRecommendTa == null)? 11: mRecommendTa;
          a0 uoa0 = new a0(this.I, this.J, this.K, i, 100);
          ShareTopicHistoryV3Fragment tO = this.O;
          if (tO != null) {
             mRecommendTa.e(tO.flatValues());
          }
          mRecommendTa.b = true;
          tO = this.P;
          if (tO != null) {
             mRecommendTa.f(tO.a());
          }
          oi = new i(mRecommendTa);
       }
       return oi;
    }
}
