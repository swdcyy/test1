package com.kuaishou.live.lite.slide.LiveLiteGrootAdapterFragment;
import id3.d;
import id3.j;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kuaishou.live.lite.slide.LiveLiteSlidePlayLogger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vy6.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.lite.LiveLiteParam;
import id3.c;
import pw6.d;
import pw6.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import je5.d;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import android.os.Bundle;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import d61.a0;
import yp.x;
import zv6.t;
import crd.b;
import java.util.Objects;
import id3.f;
import androidx.viewpager.widget.ViewPager$i;
import id3.e;
import com.kuaishou.live.lite.slide.LiveLiteGrootAdapterFragment$a;
import com.kuaishou.live.lite.slide.LiveLiteGrootAdapterFragment$b;
import id3.b;
import erd.g;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import k2b.e0;

public abstract class LiveLiteGrootAdapterFragment extends DetailSlidePlayFragment implements d, j	// class@000b51
{
    public QPhoto F;
    public LiveLiteParam G;
    public boolean H;
    public boolean I;
    public b J;
    public f K;
    public a L;
    public final LiveLiteSlidePlayLogger M;
    public static final int N;

    public void LiveLiteGrootAdapterFragment(){
       super();
       this.M = new LiveLiteSlidePlayLogger();
    }
    public final void H2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrootAdapterFragment.class, "10")) {
          return;
       }
       LiveLiteGrootAdapterFragment tL = this.L;
       if (tL != null && this.H != null) {
          tL.k1();
       }
       return;
    }
    public final ClientEvent$ExpTagTrans I1(){
       LiveLiteGrootAdapterFragment obj = PatchProxy.apply(null, this, LiveLiteGrootAdapterFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj == null) {
          return new ClientEvent$ExpTagTrans();
       }
       return this.M.buildExpTagTrans(obj.getQLivePlayConfig());
    }
    public void L9(){
       c.d(this);
    }
    public final void Mg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGrootAdapterFragment.class, "12")) {
          return;
       }
       c.a(this, p0);
       return;
    }
    public final void N2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrootAdapterFragment.class, "11")) {
          return;
       }
       if (this.L != null && this.getParentFragment().Vg().c()) {
          this.L.B0();
       }
       return;
    }
    public final ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGrootAdapterFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.onExitLivePage(this.F);
    }
    public final void Q0(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrootAdapterFragment.class, "9")) {
          return;
       }
       LiveLiteGrootAdapterFragment tF = this.F;
       tF.setExpTag(d.a(tF.getExpTag()));
       if (this.L != null && this.getParentFragment().Vg().c()) {
          this.L.F1();
       }
       return;
    }
    public final void Q1(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrootAdapterFragment.class, "7")) {
          return;
       }
       LiveLiteGrootAdapterFragment tL = this.L;
       if (tL != null && this.H != null) {
          tL.i2();
       }
       this.xh();
       this.yh();
       return;
    }
    public final ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGrootAdapterFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.onEnterLivePage(this.F);
    }
    public final SlidePlayLogger d1(){
       return this.M;
    }
    public void eb(){
       c.f(this);
    }
    public void ig(){
       c.a(this);
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGrootAdapterFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       DetailSlidePlayFragment tx = this.x;
       if (tx != null && tx.mPhoto != null) {
          tx = this.y;
          if (tx != null && (!tx.s1() && this.y.t() == this)) {
             this.qh();
          }
       }
    label_002c :
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       LiveLiteParam obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteGrootAdapterFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.ch().d("LIVE_LITE_PARAM");
       this.G = obj;
       if (obj.getLiveStreamFeed() != null) {
          if (!PatchProxy.applyVoid(null, this, LiveLiteGrootAdapterFragment.class, "2")) {
             QPhoto qPhoto = new QPhoto(this.G.getLiveStreamFeed());
             this.F = qPhoto;
             qPhoto.startSyncWithFragment(this.m());
             if (this.x == null) {
                this.x = PhotoDetailParam.createByPhotoDetailActivity(this.getActivity());
             }
             this.x.mPhoto = new QPhoto(this.F.mEntity);
             int i = 0;
             if (this.ch() != null) {
                i = this.ch().c("KEY_PAGE_INTERFACE", i);
             }
             this.x.setSource(i);
             x.y(a0.c(this.G.getSourceType()), this.F.mEntity);
             this.F.setPosition(this.ch().d);
          }
          this.M.setBaseFeed(this.F.getEntity());
          this.M.setIndexInAdapter(this.F.getPosition());
          this.xh();
          this.F.startSyncWithFragment(this.m());
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGrootAdapterFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.I = false;
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          ty.t1().d(this);
       }
       LiveLiteGrootAdapterFragment tJ = this.J;
       if (tJ != null) {
          tJ.dispose();
       }
       tJ = this.K;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(objArray, tJ, f.class, "8")) {
          tJ.a.b(tJ.l);
          tJ.a.d(tJ.k);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGrootAdapterFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.K = new f(new LiveLiteGrootAdapterFragment$a(this), new LiveLiteGrootAdapterFragment$b(this));
       FragmentCompositeLifecycleState uFragmentCom = this.getParentFragment().Vg();
       this.J = uFragmentCom.j().subscribe(new b(this));
       this.H = uFragmentCom.c();
       return;
    }
    public void q5(){
       c.e(this);
    }
    public void q8(){
       c.c(this);
    }
    public final void xh(){
       LiveLiteGrootAdapterFragment tF;
       if (PatchProxy.applyVoid(null, this, LiveLiteGrootAdapterFragment.class, "6")) {
          return;
       }
       if (this.hh()) {
          tF = this.F;
          tF.setExpTag(d.a(tF.getExpTag()));
       }else {
          tF = this.F;
          tF.setExpTag(d.c(tF.getExpTag()));
       }
       return;
    }
    public void y6(){
       c.b(this);
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrootAdapterFragment.class, "8")) {
          return;
       }
       this.M.logShowEvent(this, this.F, this.y.c(), this.o(), this.G.getPageType(), b.a(0xe0ff4fb).c(this), this.G.getLivePlayPageSessionId());
       return;
    }
}
