package com.yxcorp.gifshow.detail.fragments.NormalDetailContainerFragment;
import im8.g;
import com.kwai.component.photo.detail.core.container.DetailBaseContainerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import j2a.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import uw9.g;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.nonslide.PhotoDetailBaseFragment;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import h0a.s;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a5a.a;
import android.content.Intent;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import ekd.j0;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.x0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.android.model.mix.PhotoMeta;
import ekd.w0;
import tkd.b;
import tkd.d;
import vo5.a;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.StringBuilder;
import hn5.i0;
import java.lang.IllegalArgumentException;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import com.yxcorp.utility.Log;
import a5a.c;
import b5a.b;
import b5a.c;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import ayb.c;
import ayb.i;
import ayb.l;
import android.content.res.Configuration;
import lnc.b5;
import android.content.Context;
import uw9.m3;
import ekd.i;
import android.os.Build$VERSION;
import com.kwai.feature.api.feed.detail.router.biz.normal.ToProfilePlan;
import e0a.j;
import ok.x;
import com.kwai.feature.api.feed.detail.router.biz.normal.NonslideLandscapeParam;
import az6.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.framework.model.channel.HotChannel;

public class NormalDetailContainerFragment extends DetailBaseContainerFragment implements g	// class@00150b
{
    public NormalDetailBizParam p;
    public BaseFragment q;

    public void NormalDetailContainerFragment(){
       super();
    }
    public void ch(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NormalDetailContainerFragment.class, "2")) {
          return;
       }
       w.G1(b.e(this.k.mPhoto), this.k.mPhoto.getEntity());
       return;
    }
    public void d0(){
       if (PatchProxy.applyVoid(null, this, NormalDetailContainerFragment.class, "12")) {
          return;
       }
       super.d0();
       NormalDetailContainerFragment tq = this.q;
       if (tq instanceof g) {
          tq.d0();
       }
       return;
    }
    public SlidePlayLogger d1(){
       NormalDetailContainerFragment obj = PatchProxy.apply(null, this, NormalDetailContainerFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj instanceof PhotoDetailBaseFragment) {
          return obj.fh();
       }
       return new PhotoDetailLogger();
    }
    public int eh(){
       return 0;
    }
    public QPhoto getCurrentPhoto(){
       return this.k.mPhoto;
    }
    public int getLayoutResId(){
       return 0x7f0d10aa;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NormalDetailContainerFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, NormalDetailContainerFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NormalDetailContainerFragment.class, new s());
       }else {
          obj.put(NormalDetailContainerFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       NormalDetailContainerFragment obj = PatchProxy.apply(null, this, NormalDetailContainerFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.q;
       if (obj != null) {
          return obj.getPage();
       }
       return super.getPage();
    }
    public PresenterV2 gh(){
       Object obj = PatchProxy.applyWithListener(null, this, NormalDetailContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NormalDetailContainerFragment.class, "18");
       return new a(this.l);
    }
    public boolean ih(Intent p0,PhotoDetailParam p1){
       NormalDetailBizParam obj = PatchProxy.applyTwoRefs(p0, p1, this, NormalDetailContainerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = NormalDetailBizParam.getBizParamFromIntent(p0);
       this.p = obj;
       if (obj == null) {
          this.p = new NormalDetailBizParam();
       }
       this.qh(p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, NormalDetailContainerFragment.class, "6")) {
          String str1 = "NOTICE_TYPE";
          if (j0.g(p0, str1) && 2 == j0.b(p0, str1, -1)) {
             this.p.mPopSharePanelStyle = 2;
          }
       }
       Uri data = p0.getData();
       if (PatchProxy.applyVoidOneRefs(data, this, NormalDetailContainerFragment.class, "7") || (data != null && data.isHierarchical())) {
          if (data.getBooleanQueryParameter("authorFansTopMotivate", false)) {
             String lastPathSegm = data.getLastPathSegment();
             if (!TextUtils.x(lastPathSegm)) {
                NormalDetailContainerFragment tp = this.p;
                tp.mPopSharePanelStyle = 3;
                tp.mFansGuidePhotoId = lastPathSegm;
             }
          }
          this.p.mCouponAccountId = data.getQueryParameter("couponAccountId");
       }
    label_0080 :
       data = p0.getData();
       if (!PatchProxy.applyVoidTwoRefs(p1, data, this, NormalDetailContainerFragment.class, "8") && (x0.b(data, "source", "")).equals("nearby")) {
          p1.setSource(9);
       }
       Uri data1 = p0.getData();
       if (!PatchProxy.applyVoidTwoRefs(p1, data1, this, NormalDetailContainerFragment.class, "9")) {
          String str = x0.b(data1, "dialog_type", "");
          if (TextUtils.n(str, "1")) {
             p1.mDialogType = 1;
          }else if(TextUtils.n(str, "2")){
             p1.mDialogType = 2;
          }
       }
       return true;
    }
    public void jh(){
       if (PatchProxy.applyVoid(null, this, NormalDetailContainerFragment.class, "1")) {
          return;
       }
       Uri data = this.getActivity().getIntent().getData();
       if (!PatchProxy.applyVoidOneRefs(data, this, NormalDetailContainerFragment.class, "11") && this.l != null) {
          DetailBaseContainerFragment tk = this.k;
          if (tk != null) {
             PhotoDetailParam mPhoto = tk.mPhoto;
             if (mPhoto == null || (mPhoto.getPhotoMeta() != null && data.isHierarchical())) {
                this.k.mPhoto.getPhotoMeta().mSurveyId = w0.a(data, "surveyId");
                this.k.mPhoto.getPhotoMeta().mSst = w0.a(data, "sst");
             }
          }
       }
       NormalDetailContainerFragment tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, NormalDetailContainerFragment.class, "10")) {
          if (this.k.mPhoto.isImageType()) {
             int i = -392345116;
             if (this.k.mPhoto.isLongPhotos()) {
                this.q = d.a(i).aP();
             }else if(this.k.mPhoto.isAtlasPhotos()){
                this.q = d.a(i).u10();
             }else {
                i0.b("NormalDetailContainerFragment", "incorrect image type, photoId="+this.k.mPhoto.getPhotoId());
                this.getActivity().finish();
             }
             try{
                Bundle uBundle = new Bundle();
                uBundle.putParcelable("PHOTO", b.c(this.k));
                tp.putParamIntoBundle(uBundle);
                this.q.setArguments(uBundle);
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.v(R.id.fragment_container, this.q);
                uoe.m();
                this.getChildFragmentManager().executePendingTransactions();
             }catch(java.lang.Exception e0){
                ExceptionHandler.handleCaughtException(e0);
             }
          }else {
             Log.k(new IllegalArgumentException("NormalDetailContainerFragment incorrect photo type, photoId="+this.k.mPhoto.getPhotoId()+" photoType="+r1.S1(this.k.mPhoto.getEntity()).toInt()));
             this.getActivity().finish();
          }
       }
    }
    public boolean kh(){
       return false;
    }
    public boolean mh(){
       Object obj = PatchProxy.apply(null, this, NormalDetailContainerFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
    public void nh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NormalDetailContainerFragment.class, "17")) {
          return;
       }
       p0.U7(new c());
       p0.U7(new b());
       p0.U7(new c());
       if (!FreeTrafficManager.j().n()) {
          p0.U7(d.a(0x4d672e6e).Pa());
       }
       d.a(0x4f878389).OA(p0);
       d.a(0x38955e85).L40(p0);
       PatchProxy.onMethodExit(NormalDetailContainerFragment.class, "17");
       return;
    }
    public String o(){
       NormalDetailContainerFragment obj = PatchProxy.apply(null, this, NormalDetailContainerFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj != null) {
          return obj.o();
       }
       return super.o();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NormalDetailContainerFragment.class, "19")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.getActivity() != null && !b5.a(this.getActivity())) {
          QPhoto currentPhoto = this.getCurrentPhoto();
          if (currentPhoto != null && (currentPhoto.isVideoAndNotKtv() && (p0.orientation != 2 && m3.d(this.getActivity(), this.getCurrentPhoto())))) {
             i.a(this.getActivity(), 0, 0);
          }
       }
    label_0046 :
       return;
    }
    public boolean ph(){
       return (this.p.mFromSlidePlayPhotoClick ^ 0x01);
    }
    public final void qh(PhotoDetailParam p0){
       DetailBaseContainerFragment tk;
       if (PatchProxy.applyVoidOneRefs(p0, this, NormalDetailContainerFragment.class, "4")) {
          return;
       }
       PhotoDetailParam mPhoto = p0.mPhoto;
       if (mPhoto != null) {
          int i = 0;
          int i1 = (Build$VERSION.SDK_INT > 23)? 1: 0;
          NormalDetailContainerFragment tp = this.p;
          ToProfilePlan sMOOTH = (i1 && !w.k0(mPhoto.getEntity()))? ToProfilePlan.SMOOTH: ToProfilePlan.NON_SMOOTH;
          tp.mToProfilePlan = sMOOTH;
          if (!p0.mPhoto.isPayCourse() || !j.b.get().booleanValue()) {
             i = 1;
          }
          if (i) {
             NormalDetailContainerFragment tp1 = this.p;
             if (tp1.mNonslideLandscapeParam == null) {
                tp1.mNonslideLandscapeParam = new NonslideLandscapeParam();
             }
             if (this.p.mNonslideLandscapeParam.mRecommendSource == null) {
                tk = this.k;
                if (tk.mSource == 8 && tk.getDetailCommonParam().getHotChannel() == null) {
                   tk.mRecommendSource = this.k.mSource;
                }
             }
             tk.mEnableNonSlideLandUnited = true;
          }else {
             p0.mNonslideLandscapeParam = null;
          }
       }
       return;
    }
    public int r(){
       NormalDetailContainerFragment obj = PatchProxy.apply(null, this, NormalDetailContainerFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.q;
       if (obj instanceof g) {
          return obj.r();
       }
       return 0;
    }
}
