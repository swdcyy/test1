package com.yxcorp.gifshow.activity.share.topic.ShareTopicSearchV3Fragment;
import com.yxcorp.gifshow.activity.share.topic.BaseShareTopicRecyclerFragment;
import lnc.a4;
import java.util.ArrayList;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicSearchV3Fragment$a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.d;
import qvb.i;
import com.kwai.library.widget.refresh.RefreshLayout;
import lnc.a1;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.activity.share.topic.BaseShareTopicRecyclerFragment$ShareTopicPage;
import android.util.SparseArray;
import java.util.List;
import y8c.g;
import g9c.a;
import com.yxcorp.gifshow.model.topic.HistoryItem;
import com.yxcorp.gifshow.model.topic.TopicSearchResultItem;
import com.kuaishou.android.post.topic.model.TopicItem;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import k2b.e0;
import vw8.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.share.topic.k;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fx8.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import androidx.recyclerview.widget.RecyclerView;
import lnc.a4$a;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.Iterator;
import com.yxcorp.gifshow.activity.share.topic.l;
import fx8.r;
import com.yxcorp.gifshow.activity.share.topic.l$a;
import qvb.n0;

public class ShareTopicSearchV3Fragment extends BaseShareTopicRecyclerFragment	// class@001475
{
    public a4 I;
    public List J;
    public ShareTopicExtra K;
    public static final int L;

    public void ShareTopicSearchV3Fragment(){
       super();
       this.I = new a4();
       this.J = new ArrayList();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ShareTopicSearchV3Fragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ShareTopicSearchV3Fragment$a uoa = new ShareTopicSearchV3Fragment$a(this, this.s, this.ia(), this.q(), this.S1());
       obj.u((float)a1.e(0xc1f00000));
       return obj;
    }
    public BaseShareTopicRecyclerFragment$ShareTopicPage Gh(){
       return BaseShareTopicRecyclerFragment$ShareTopicPage.TOPIC_SEARCH;
    }
    public final void Hh(){
       if (PatchProxy.applyVoid(null, this, ShareTopicSearchV3Fragment.class, "9")) {
          return;
       }
       SparseArray sparseArray = new SparseArray();
       e0 uoe0 = null;
       while (uoe0 < this.I.c().size() && uoe0 < this.g7().getItemCount()) {
          HistoryItem historyItem = this.g7().N0(uoe0);
          if (historyItem instanceof TopicSearchResultItem) {
             TopicItem topicItem = new TopicItem(historyItem.getTag().getName(), historyItem.getTag().getId(), TopicItemType.SEARCH_RESULT, historyItem.getTag().getKsOrderId(), historyItem.getTag().getSpecialId(), historyItem.getTag().getType());
             sparseArray.put(uoe0, v10);
          }
          uoe0 = uoe0 + 1;
       }
       a.x(this.c(), sparseArray, "sug");
       this.I.c().clear();
       return;
    }
    public void Ih(String p0,boolean p1){
       if (PatchProxy.isSupport(ShareTopicSearchV3Fragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ShareTopicSearchV3Fragment.class, "4")) {
          return;
       }
       this.Hh();
       k ok = this.q();
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoidOneRefs(p0, ok, k.class, "1")) {
          ok.p = p0;
          ok.a();
       }
       if (!PatchProxy.isSupport(BaseShareTopicRecyclerFragment.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, BaseShareTopicRecyclerFragment.class, "1")) {
          this.F = p0;
          if (p1) {
             this.a();
          }
       }
       return;
    }
    public boolean S1(){
       return false;
    }
    public final e0 c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ShareTopicSearchV3Fragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() instanceof e0) {
          objArray = this.getActivity();
       }
       return objArray;
    }
    public int getLayoutResId(){
       return 0x7f0d1502;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareTopicSearchV3Fragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ShareTopicSearchV3Fragment.class, null);
       return objectsByTag;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Serializable obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareTopicSearchV3Fragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() != null) {
          obj = SerializableHook.getSerializable(this.getArguments(), "topic_extra");
          if (obj instanceof ShareTopicExtra) {
             this.K = obj;
          }else {
             PostUtils.D("ShareTopicSearchFragment", "topic_extra type un match", new Exception("topic_extra type un match"));
          }
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(ShareTopicSearchV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShareTopicSearchV3Fragment.class, "3")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0) {
          this.Hh();
          BaseShareTopicRecyclerFragment tH = this.H;
          if (tH != null) {
             tH.b();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareTopicSearchV3Fragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          String str = arguments.getString("search_key");
          if (!TextUtils.isEmpty(str)) {
             Object[] objArray = new Object[0];
             a.b().s("ShareTopicSearchFragment", "onViewCreated: searchKey: "+str, objArray);
             this.Ih(str, true);
          }
       }
       this.h0().addOnScrollListener(this.I.b());
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          this.h0().addOnScrollListener(iterator.next());
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ShareTopicSearchV3Fragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ShareTopicSearchV3Fragment.class, "8")) {
          return;
       }
       super.v2(p0, p1);
       if (p0) {
          this.I.a(this.h0());
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ShareTopicSearchV3Fragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(new r(this));
    }
    public i yh(){
       k ok = PatchProxy.apply(null, this, ShareTopicSearchV3Fragment.class, "6");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k(this.K);
       }
       return ok;
    }
}
