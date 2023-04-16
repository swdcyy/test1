package com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import ml8.d;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import crd.a;
import java.util.ArrayList;
import java.util.HashSet;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment$a;
import k2b.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.Float;
import android.animation.ValueAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import fx8.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment$b;
import android.animation.Animator$AnimatorListener;
import th0.d;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import fx8.p;
import java.util.Map;
import java.util.HashMap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import f66.i;
import jq.a;
import q87.c;
import i2b.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.StringBuilder;
import fx8.t;
import fx8.k;
import com.yxcorp.gifshow.activity.share.topic.e;
import erd.g;
import crd.b;
import brd.t;
import lnc.a1;
import fx8.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import fx8.l0;
import androidx.recyclerview.widget.RecyclerView$l;
import fx8.a0;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment$c;
import com.yxcorp.gifshow.activity.share.topic.i;
import t45.d;
import brd.z;
import fx8.l;
import fx8.j;
import androidx.recyclerview.widget.RecyclerView$r;
import com.trello.rxlifecycle3.components.support.RxFragment;
import lnc.b9;
import y8c.g;
import java.util.Set;
import com.kuaishou.android.post.topic.model.TopicItem;
import vw8.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public class ShareTopicGuideFragment extends BaseFragment implements d, g	// class@001471
{
    public PublishPageSetting j;
    public String k;
    public String l;
    public String m;
    public ShareTopicExtra n;
    public m0 o;
    public t p;
    public a q;
    public z r;
    public RecyclerView s;
    public View t;
    public View u;
    public int v;
    public ArrayList w;
    public Set x;
    public ShareTopicGuideFragment$c y;
    public RecyclerView$r z;
    public static final int A;

    public void ShareTopicGuideFragment(){
       super();
       this.j = a.t().getValue("publish_page_settings", PublishPageSetting.class, new PublishPageSetting());
       this.k = "";
       this.l = "";
       this.m = "";
       this.q = new a();
       this.w = new ArrayList();
       this.x = new HashSet();
       this.z = new ShareTopicGuideFragment$a(this);
    }
    public final e0 c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ShareTopicGuideFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() instanceof e0) {
          objArray = this.getActivity();
       }
       return objArray;
    }
    public final void ch(float p0,float p1){
       if (PatchProxy.isSupport(ShareTopicGuideFragment.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ShareTopicGuideFragment.class, "12")) {
          return;
       }
       float[] uofloatArray = new float[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setInterpolator(new e());
       valueAnimato.addUpdateListener(new i(this));
       float[] uofloatArray1 = new float[]{p0,p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.u, "alpha", uofloatArray1);
       objectAnimat.addListener(new ShareTopicGuideFragment$b(this, p1));
       objectAnimat.setInterpolator(new d());
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(300);
       Animator[] uAnimatorArr = new Animator[]{valueAnimato,objectAnimat};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicGuideFragment.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a34da);
       this.t = m1.f(p0, 0x7f0a2958);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareTopicGuideFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ShareTopicGuideFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ShareTopicGuideFragment.class, new p());
       }else {
          obj.put(ShareTopicGuideFragment.class, null);
       }
       return obj;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareTopicGuideFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "ShareTopicGuideFragment";
       a.b().w(str, "onCreateView", objArray);
       objArray = null;
       if (this.u == null) {
          Object[] objArray1 = new Object[i];
          a.b().w(str, "onCreateView: inflate", objArray1);
          View view = a.g(p0, R.layout.arg_RES_7f0d14fe, p1, i);
          this.u = view;
          this.doBindView(view);
          if (!PatchProxy.applyVoid(objArray, this, ShareTopicGuideFragment.class, "11")) {
             Bundle arguments = this.getArguments();
             if (arguments != null) {
                this.k = arguments.getString("photo_task_id", "");
                this.l = arguments.getString("editSessionId", "");
                this.m = arguments.getString("from_page", "");
                Serializable serializable = SerializableHook.getSerializable(arguments, "topic_extra");
                if (serializable instanceof ShareTopicExtra) {
                   this.n = serializable;
                }else {
                   String str1 = "topic_extra type un match";
                   PostUtils.D(str, str1, new Exception(str1));
                }
                Object[] objArray2 = new Object[i];
                a.b().w(str, "initArguments mTaskId:"+this.k+",  mEditSessionId:"+this.l, objArray2);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, ShareTopicGuideFragment.class, "10")) {
             t ot = new t();
             this.p = ot;
             this.q.c(ot.b.subscribe(new k(this), e.b));
             this.v = a1.d(0x7f07031f);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ShareTopicGuideFragment.class, "6")) {
          this.r = new z(this.p);
          LinearLayoutManager linearLayout = new LinearLayoutManager(this.getActivity());
          linearLayout.setOrientation(i);
          this.s.setLayoutManager(linearLayout);
          this.s.setAdapter(this.r);
          this.s.setItemAnimator(new l0());
          PublishPageSetting mRecommendTa = this.j.mRecommendTagIndex;
          int i1 = (mRecommendTa <= null)? 11: mRecommendTa;
          a0 uoa0 = new a0(this.k, this.l, this.m, i1, 20);
          ShareTopicGuideFragment tn = this.n;
          if (tn != null) {
             11.e(tn.flatValues());
          }
          tn = this.y;
          if (tn != null) {
             tn.b();
          }
          this.q.c(new i(11).I1().subscribeOn(d.c).observeOn(d.a).subscribe(new l(this, 11), new j(this)));
          this.s.addOnScrollListener(this.z);
       }
       return this.u;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ShareTopicGuideFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       b9.a(this.q);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ShareTopicGuideFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       int i = 0;
       Object[] objArray = new Object[i];
       a.b().w("ShareTopicGuideFragment", "onDestroyView", objArray);
       ShareTopicGuideFragment ts = this.s;
       if (ts != null && ts.getAdapter() instanceof g) {
          Object[] objArray1 = new Object[i];
          a.b().w("ShareTopicGuideFragment", "destroyDetachedPresenter", objArray1);
          this.s.getAdapter().Z0();
          this.s.removeOnScrollListener(this.z);
          this.s.setAdapter(null);
       }
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareTopicGuideFragment.class, "5")) {
          return;
       }
       super.onPause();
       if (!PatchProxy.applyVoid(objArray, this, ShareTopicGuideFragment.class, "17")) {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          int i1 = 0;
          while (i1 < this.w.size()) {
             if (!this.x.contains(this.w.get(i1))) {
                uArrayList.add(this.w.get(i1));
                this.x.add(this.w.get(i1));
             }
             i1 = i1 + 1;
          }
          e0 uoe0 = this.c();
          if (!PatchProxy.applyVoidTwoRefs(uoe0, uArrayList, objArray, a.class, "79") && uArrayList.size()) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
             ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[uArrayList.size()];
             tagShowPacka.tagPackage = tagPackageAr;
             ArrayList uArrayList1 = new ArrayList();
             while (i < uArrayList.size()) {
                TopicItem topicItem = uArrayList.get(i);
                tagShowPacka.tagPackage[i] = a.e(-1, topicItem);
                if (!TextUtils.x(topicItem.getMKsOrderId())) {
                   uArrayList1.add(topicItem.getMKsOrderId());
                }
                i = i + 1;
             }
             if (!q.f(uArrayList1)) {
                uContentPack.ksOrderInfoPackage = a.c(uArrayList1);
             }
             uContentPack.tagShowPackage = tagShowPacka;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RECO_HISTORY_TOPIC";
             u1.C0("", uoe0, 6, uElementPack, uContentPack);
          }
          this.w.clear();
       }
       return;
    }
}
