package com.kuaishou.live.LiveLiteContainerFragment;
import com.kuaishou.live.lite.slide.LiveLiteGrootAdapterFragment;
import gq3.a;
import java.lang.Boolean;
import java.lang.Object;
import mrd.a;
import com.kuaishou.live.lite.slide.LiveLiteSlideStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import pg1.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.LiveLiteContainerFragment$a;
import com.kuaishou.live.lite.LiveLiteParam;
import ll0.a;
import ok.n;
import k2b.e0;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.lang.StringBuilder;
import tkd.b;
import tkd.d;
import vo5.q;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import iz1.a;
import dz1.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.a;

public class LiveLiteContainerFragment extends LiveLiteGrootAdapterFragment	// class@00094e
{
    public final a O;
    public final a P;
    public final a Q;
    public final a R;

    public void LiveLiteContainerFragment(){
       super();
       this.O = new a();
       this.P = new a();
       this.Q = a.h(Boolean.TRUE);
       this.R = a.h(LiveLiteSlideStatus.NONE);
    }
    public int Ab(){
       Object obj = PatchProxy.apply(null, this, LiveLiteContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d.c.b()) {
          return d.b;
       }
       return super.Ab();
    }
    public final void Ah(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "12")) {
          return;
       }
       this.R.onNext(LiveLiteSlideStatus.DID_DISAPPEAR);
       this.O.getLifecycle().setCurrentState(Lifecycle$State.CREATED);
       return;
    }
    public void Bh(LiveLiteContainerFragment$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteContainerFragment.class, "5")) {
          return;
       }
       BaseFragment uBaseFragmen = p0.a(this.G, this.O, this.P, this.Q, this.R);
       n.b(uBaseFragmen instanceof a);
       uBaseFragmen.e8(this);
       b.f0(LiveLiteLogTag.LIFECYCLE, "replaceFragment", "replacedFragment", uBaseFragmen, "Fragment", this, "tabSelectLifecycle", this.P.getLifecycle().getCurrentState(), "slideLifecycle", this.O.getLifecycle().getCurrentState());
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.w(R.id.live_lite_container_fragment_placeholder, uBaseFragmen, uBaseFragmen.getClass().getSimpleName());
       uoe.o();
       return;
    }
    public void L9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "10")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIFECYCLE, "slide", "viewUnselected", "liveStreamId: "+this.zh(), "Fragment", this);
       return;
    }
    public int M(){
       return 5;
    }
    public void eb(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "9")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIFECYCLE, "slide", "viewWillDisappear", "liveStreamId: "+this.zh(), "Fragment", this);
       this.R.onNext(LiveLiteSlideStatus.WILL_DISAPPEAR);
       this.O.getLifecycle().setCurrentState(Lifecycle$State.STARTED);
       return;
    }
    public int f(){
       return 90;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, LiveLiteContainerFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x6cf1532f).I6(this.x, this.ih());
       LiveLiteGrootAdapterFragment tG = this.G;
       if (tG == null) {
          return obj;
       }
       LiveStreamFeed liveStreamFe = tG.getLiveStreamFeed();
       if (liveStreamFe == null) {
          return obj;
       }
       QPhoto qPhoto = new QPhoto(liveStreamFe);
       String str = x.g(liveStreamFe);
       liveStreamFe = liveStreamFe.mConfig;
       int i = (liveStreamFe != null && liveStreamFe.isGamePatternType())? 1: 0;
       if (TextUtils.x(str)) {
          return obj+"&is_game_live="+i;
       }else if(TextUtils.x(obj)){
          obj = "lv_params="+str+"&is_game_live="+i;
          if (a.d(qPhoto)) {
             obj = obj+"&ks_order_id="+qPhoto.getKsOrderId();
          }
          return obj;
       }else {
          StringBuilder str1 = obj+"&lv_params="+str+"&is_game_live="+i;
          obj = a.f(qPhoto);
          if (!TextUtils.x(obj)) {
             str1 = str1+"&gzone_live_type="+obj;
          }
          if (a.d(qPhoto)) {
             str1 = str1+"&ks_order_id="+qPhoto.getKsOrderId();
          }
          return str1;
       }
    }
    public String getUrl(){
       return "ks://photo";
    }
    public void ig(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "8")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIFECYCLE, "slide", "viewDidAppear", "liveStreamId: "+this.zh(), "Fragment", this);
       this.R.onNext(LiveLiteSlideStatus.DID_APPEAR);
       this.O.getLifecycle().setCurrentState(Lifecycle$State.RESUMED);
       return;
    }
    public void n6(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "13")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIFECYCLE, "tab change", "viewTabSelect", "liveStreamId: "+this.zh(), "Fragment", this);
       this.Q.onNext(Boolean.TRUE);
       this.P.getLifecycle().setCurrentState(Lifecycle$State.RESUMED);
       return;
    }
    public String o(){
       LiveLiteGrootAdapterFragment obj = PatchProxy.apply(null, this, LiveLiteContainerFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj == null) {
          return "live_lite_not_init_yet";
       }
       return obj.getPage();
    }
    public void oa(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "14")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIFECYCLE, "tab change", "viewTabUnSelected", "liveStreamId: "+this.zh(), "Fragment", this);
       this.Q.onNext(Boolean.FALSE);
       this.P.getLifecycle().setCurrentState(Lifecycle$State.CREATED);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteContainerFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.P.getLifecycle().setCurrentState(Lifecycle$State.RESUMED);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteContainerFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       return a.g(p0, 0x7f0d0c55, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       b.c0(LiveLiteLogTag.LIFECYCLE, "onDestroyView liveStreamId: "+this.zh(), "Fragment", this);
       this.Ah();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteContainerFragment.class, "16")) {
          return;
       }
       p0.clear();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteContainerFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       b.c0(LiveLiteLogTag.LIFECYCLE, "onViewCreated liveStreamId: "+this.zh(), "Fragment", this);
       this.Bh(a.a);
       return;
    }
    public void q5(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "6")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIFECYCLE, "slide", "viewWillAppear", "liveStreamId: "+this.zh(), "Fragment", this);
       this.R.onNext(LiveLiteSlideStatus.WILL_APPEAR);
       this.O.getLifecycle().setCurrentState(Lifecycle$State.STARTED);
       return;
    }
    public void q8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "7")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIFECYCLE, "slide", "viewSelected", "liveStreamId: "+this.zh(), "Fragment", this);
       return;
    }
    public void y6(){
       if (PatchProxy.applyVoid(null, this, LiveLiteContainerFragment.class, "11")) {
          return;
       }
       b.d0(LiveLiteLogTag.LIFECYCLE, "slide", "viewDidDisappear", "liveStreamId: "+this.zh(), "Fragment", this);
       this.Ah();
       return;
    }
    public final String zh(){
       LiveLiteGrootAdapterFragment obj = PatchProxy.apply(null, this, LiveLiteContainerFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj == null) {
          return "empty-live-stream-id";
       }
       return obj.getLiveStreamFeed().getId();
    }
}
