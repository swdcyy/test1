package com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.io.Serializable;
import java.lang.Cloneable;
import az6.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.SearchParams;
import java.lang.String;
import com.yxcorp.gifshow.detail.DetailCoverInfo$b;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.app.Activity;
import java.lang.IllegalArgumentException;
import ekd.j0;
import android.app.Application;
import com.yxcorp.utility.repo.a;
import android.os.Parcelable;
import org.parceler.b;
import java.lang.Boolean;
import android.net.Uri;
import kp.r1;
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Float;
import java.lang.Integer;
import ekd.x0;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Number;
import uh5.e;
import vm5.n;
import java.util.Map;
import vm5.f;
import vca.i;
import tkd.b;
import tkd.d;
import wm5.a;
import android.text.TextUtils;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import wh5.c;
import wkd.b;
import ip.b;
import com.kwai.sdk.switchconfig.a;
import o56.a;
import android.content.res.Resources;

public final class PhotoDetailParam extends a implements Serializable, Cloneable	// class@000ea3
{
    public boolean isForceNormalDetail;
    public boolean isOverAllUseNasa;
    public boolean isShowDanmakuView;
    public int mBizType;
    public String mClickViewId;
    public DetailCommonParam mDetailCommonParam;
    public DetailDanmakuParam mDetailDanmakuParam;
    public DetailLogParam mDetailLogParam;
    public DetailPlayConfig mDetailPlayConfig;
    public int mDialogType;
    public boolean mEnableInsertPhotoToFetchList;
    public BaseFeed mEntranceFeed;
    public boolean mIsEpisodeSerial;
    public boolean mIsForceShowLeftSlideGuide;
    public boolean mIsFromDomino;
    public boolean mIsSearchEpisodeSerial;
    public QPhoto mPhoto;
    public String mPhotoId;
    public SlidePlayConfig mSlidePlayConfig;
    public String mStartEncodedUri;
    public boolean showDanmkuSwitch;
    public static final long serialVersionUID = 0x9b07373daaf7691b;

    public void PhotoDetailParam(){
       super();
       this.isOverAllUseNasa = false;
       this.isForceNormalDetail = false;
       this.showDanmkuSwitch = true;
       this.isShowDanmakuView = false;
       this.mDetailCommonParam = new DetailCommonParam();
       this.mDetailDanmakuParam = new DetailDanmakuParam();
       this.mDetailLogParam = new DetailLogParam();
       this.mDetailPlayConfig = new DetailPlayConfig();
       this.mSlidePlayConfig = new SlidePlayConfig();
       this.mIsEpisodeSerial = false;
       this.mIsFromDomino = false;
       this.mIsSearchEpisodeSerial = false;
    }
    public void PhotoDetailParam(QPhoto p0){
       super();
       boolean b = false;
       this.isOverAllUseNasa = b;
       this.isForceNormalDetail = b;
       this.showDanmkuSwitch = true;
       this.isShowDanmakuView = b;
       this.mDetailCommonParam = new DetailCommonParam();
       this.mDetailDanmakuParam = new DetailDanmakuParam();
       this.mDetailLogParam = new DetailLogParam();
       this.mDetailPlayConfig = new DetailPlayConfig();
       this.mSlidePlayConfig = new SlidePlayConfig();
       this.mIsEpisodeSerial = b;
       this.mIsFromDomino = b;
       this.mIsSearchEpisodeSerial = b;
       this.mPhoto = p0;
       if (p0 != null) {
          this.mEntranceFeed = p0.mEntity;
          this.getDetailLogParam().setSearchParams(SearchParams.getSearchParams(this.mPhoto.mEntity));
       }
       return;
    }
    public void PhotoDetailParam(String p0){
       super();
       this.isOverAllUseNasa = false;
       this.isForceNormalDetail = false;
       this.showDanmkuSwitch = true;
       this.isShowDanmakuView = false;
       this.mDetailCommonParam = new DetailCommonParam();
       this.mDetailDanmakuParam = new DetailDanmakuParam();
       this.mDetailLogParam = new DetailLogParam();
       this.mDetailPlayConfig = new DetailPlayConfig();
       this.mSlidePlayConfig = new SlidePlayConfig();
       this.mIsEpisodeSerial = false;
       this.mIsFromDomino = false;
       this.mIsSearchEpisodeSerial = false;
       this.mPhotoId = p0;
    }
    public void PhotoDetailParam(String p0,float p1,String p2,String p3,String p4,int p5){
       super();
       this.isOverAllUseNasa = false;
       this.isForceNormalDetail = false;
       this.showDanmkuSwitch = true;
       this.isShowDanmakuView = false;
       this.mDetailCommonParam = new DetailCommonParam();
       this.mDetailDanmakuParam = new DetailDanmakuParam();
       this.mDetailLogParam = new DetailLogParam();
       this.mDetailPlayConfig = new DetailPlayConfig();
       this.mSlidePlayConfig = new SlidePlayConfig();
       this.mIsEpisodeSerial = false;
       this.mIsFromDomino = false;
       this.mIsSearchEpisodeSerial = false;
       this.mPhotoId = p0;
       DetailCoverInfo$b uob = new DetailCoverInfo$b();
       uob.e(p1);
       uob.c = p2;
       uob.d(p3);
       uob.c(p4);
       uob.b(p5);
       this.mDetailCommonParam.setDetailCoverInfo(uob.a());
    }
    public static PhotoDetailParam createByPhotoDetailActivity(GifshowActivity p0){
       Object obj = null;
       PhotoDetailParam obj1 = PatchProxy.applyOneRefs(p0, obj, PhotoDetailParam.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("must not null");
       }
       obj1 = new PhotoDetailParam();
       obj1.mPhoto = obj;
       Intent intent = p0.getIntent();
       obj1.getDetailCommonParam().setDisallowScreenShot(PhotoDetailParam.isDisallowScreenShot(intent));
       PhotoDetailParam.setCoverInfo(obj1, intent);
       PhotoDetailParam.setFansGroupInfo(obj1, intent);
       return obj1;
    }
    public static PhotoDetailParam getPhotoDetailParamFromIntent(Intent p0,GifshowActivity p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, PhotoDetailParam.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "photoDetailRepoId";
       if (j0.g(p0, obj)) {
          return a.b(p1.getApplication()).a(p0.getIntExtra(obj, 0), p1);
       }
       if (j0.g(p0, "PHOTO")) {
          return b.a(p0.getParcelableExtra("PHOTO"));
       }
       return PhotoDetailParam.createByPhotoDetailActivity(p1);
    }
    public static boolean isDisallowScreenShot(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoDetailParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && (p0.getData() != null && p0.getData().isHierarchical())) {
          return p0.getData().getBooleanQueryParameter("with_secure_flag", false);
       }
       return false;
    }
    public static boolean isLiveStream(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoDetailParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && r1.S2(p0.mEntity))? true: false;
       return b;
    }
    public static void setCoverInfo(PhotoDetailParam p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PhotoDetailParam.class, "19")) {
          return;
       }
       if (p1 != null && p1.getData() != null) {
          try{
             Uri data = p1.getData();
             if (!data.isHierarchical()) {
                return;
             }else {
                String str = w0.a(data, "coverAspectRatio");
                String str1 = w0.a(data, "coverUrl");
                String str2 = w0.a(data, "coverPlaceholdColor");
                String str3 = w0.a(data, "coverPhotoType");
                int i = 0;
                if (!TextUtils.x(str)) {
                   float f = Float.valueOf(str).floatValue();
                }
                int i1 = 0;
                try{
                   i1 = Integer.valueOf(str3).intValue();
                }catch(java.lang.NumberFormatException e0){
                }
                DetailCoverInfo$b uob = new DetailCoverInfo$b();
                uob.e(i);
                uob.d(str1);
                uob.c(str2);
                uob.b(e0);
                if (p0.getDetailCommonParam().getDetailCoverInfo() != null) {
                   p0.getDetailCommonParam().getDetailCoverInfo().setBuilder(uob);
                }else {
                   p0.getDetailCommonParam().setDetailCoverInfo(uob.a());
                }
             }
          }catch(java.lang.NumberFormatException e0){
          }
       }
    }
    public static void setFansGroupInfo(PhotoDetailParam p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PhotoDetailParam.class, "2")) {
          return;
       }
       if (p1 != null && p1.getData() != null) {
          Uri data = p1.getData();
          if (!data.isHierarchical()) {
             return;
          }else {
             String str = x0.b(data, "dialog_type", "");
             if (TextUtils.n(str, "1")) {
                p0.mDialogType = 1;
             }else if(TextUtils.n(str, "2")){
                p0.mDialogType = 2;
             }else if(TextUtils.n("1", x0.a(data, "openComment"))){
                p0.mDialogType = 3;
             }
          }
       }
       return;
    }
    public a clone(){
       return this.clone();
    }
    public PhotoDetailParam clone(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, PhotoDetailParam.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.clone();
       if (obj != null) {
          obj.setDetailCommonParam(this.mDetailCommonParam.clone());
          obj.setDetailDanmakuParam(this.mDetailDanmakuParam.clone());
          obj.mDetailPlayConfig = this.mDetailPlayConfig.clone();
          obj.mDetailLogParam = this.mDetailLogParam.clone();
       }
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public a cloneWithoutUnnecessaryFields(){
       return this.cloneWithoutUnnecessaryFields();
    }
    public PhotoDetailParam cloneWithoutUnnecessaryFields(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, PhotoDetailParam.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.clone();
       if (obj != null) {
          obj.getDetailCommonParam().setComment(null);
          obj.getDetailCommonParam().setOpendTimeStamp(-1);
          obj.getDetailPlayConfig().setPlayerSessionUuid(null);
       }
       return obj;
    }
    public boolean enablePullToRefresh(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailParam.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mSlidePlayConfig.enablePullRefresh() && !TextUtils.x(this.mSlidePlayId))? true: false;
       return b;
    }
    public boolean enableSlidePlay(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, PhotoDetailParam.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mBizType;
       boolean b = true;
       if (obj == b || obj == 2) {
          return false;
       }
       if (obj != 4 && (obj != 5 && obj != 21)) {
          switch (obj){
              case 9:
              case 11:
              case 10:
              default:
                switch (obj){
                    case 16:
                    case 18:
                    case 19:
                    case 17:
                    default:
                      throw new IllegalArgumentException("不应该出现这种情况");
                }
          }
       }
       return b;
    }
    public BaseFeed getBaseFeed(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, PhotoDetailParam.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPhoto;
       BaseFeed entity = (obj != null)? obj.getEntity(): super.getBaseFeed();
       return entity;
    }
    public int getBizType(){
       return this.mBizType;
    }
    public final String getBrowseTypeFromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailParam.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          Uri data = p0.getData();
          if (data != null && data.isHierarchical()) {
             return w0.a(data, "detail_browse_type");
          }
       }
       return null;
    }
    public String getClickViewId(){
       return this.mClickViewId;
    }
    public int getDetailBrowseType(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.isThanos()) {
          return 3;
       }
       if (e.e()) {
          return 4;
       }
       return 1;
    }
    public String getDetailBrowseTypeStr(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailParam.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isThanos()) {
          return "thanos";
       }
       if (e.e()) {
          return "nasa";
       }
       return "default";
    }
    public DetailCommonParam getDetailCommonParam(){
       return this.mDetailCommonParam;
    }
    public DetailDanmakuParam getDetailDanmakuParam(){
       return this.mDetailDanmakuParam;
    }
    public DetailLogParam getDetailLogParam(){
       return this.mDetailLogParam;
    }
    public DetailPlayConfig getDetailPlayConfig(){
       return this.mDetailPlayConfig;
    }
    public String getEncodedStartUri(){
       return this.mStartEncodedUri;
    }
    public BaseFeed getEntranceFeed(){
       return this.mEntranceFeed;
    }
    public boolean getForceShowLeftSlideGuide(){
       return this.mIsForceShowLeftSlideGuide;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailParam.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailParam.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PhotoDetailParam.class, new n());
       }else {
          obj.put(PhotoDetailParam.class, null);
       }
       return obj;
    }
    public QPhoto getPhoto(){
       return this.mPhoto;
    }
    public int getPhotoIndex(){
       return this.mPhotoIndex;
    }
    public SlidePlayConfig getSlidePlayConfig(){
       return this.mSlidePlayConfig;
    }
    public int getSource(){
       return this.mSource;
    }
    public int getSourceOfContainer(){
       return this.mSourceOfContainer;
    }
    public boolean isEpisodeSerial(){
       return this.mIsEpisodeSerial;
    }
    public boolean isFromDomino(){
       return this.mIsFromDomino;
    }
    public boolean isSearchEpisodeSerial(){
       return this.mIsSearchEpisodeSerial;
    }
    public boolean isThanos(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, PhotoDetailParam.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mBizType;
       boolean b = true;
       if (obj != b && (obj != 2 && obj != 4)) {
          if (obj != 5 && obj != 21) {
             switch (obj){
                 case 9:
                 case 10:
                 case 11:
                   return b;
                 default:
                   switch (obj){
                       case 16:
                       case 19:
                       case 17:
                       case 18:
                         goto label_0034 ;
                       default:
                         throw new IllegalArgumentException("不应该出现这种情况");
                   }
             }
          }
          return e.f();
       }
       return false;
    }
    public final void overrideBizTypeForNormalDetail(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailParam.class, "7")) {
          return;
       }
       if (this.mBizType != 1) {
          return;
       }
       PhotoDetailParam tmPhoto = this.mPhoto;
       if (tmPhoto != null && (!tmPhoto.isAtlasPhotos() && (this.mPhoto.isLongPhotos() || r1.v3(this.mPhoto.mEntity)))) {
          return;
       }
       this.setBizType(4);
       return;
    }
    public void parseBizType(Intent p0,QPhoto p1){
       int i;
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoDetailParam.class, "6")) {
          return;
       }
       if (p1 != null && (p1.getEntity() != null && i.d(p1))) {
          this.setBizType(4);
          return;
       }else {
          i = 9;
          if (p1 != null && (p1.getEntity() != null && r1.f3(p1.mEntity))) {
             this.setBizType(i);
             return;
          }else if(this.mBizType != null){
             return;
          }else if(p0 != null){
             if (d.a(0x66aa3a58).FT(p0)) {
                this.setBizType(4);
             }else if(d.a(0x66aa3a58).Uc(p0)){
                this.setBizType(4);
             }else if(("non_slide").equals(this.getBrowseTypeFromIntent(p0))){
                this.setBizType(true);
             }else if(f.h(p0)){
                this.setBizType(4);
             }else {
                String obj = PatchProxy.applyOneRefs(p0, null, uof, "9");
                int i1 = 0;
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   obj = f.b(p0);
                   b = (TextUtils.isEmpty(obj))? false: ("musicstation").equals(obj);
                }
                if (b) {
                   this.setBizType(i);
                }else if(f.g(p0)){
                   this.setBizType(10);
                }else if(f.l(p0)){
                   this.setBizType(5);
                }else if(f.k(p0)){
                   this.setBizType(4);
                }else if(d.a(0x66aa3a58).Kx(p0)){
                   this.setBizType(4);
                }else {
                   String obj1 = PatchProxy.applyOneRefs(p0, null, uof, "12");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      obj1 = f.c(p0, "magicFaceId");
                      if (("work").equals(f.b(p0)) && !TextUtils.isEmpty(obj1)) {
                         i1 = 1;
                      }
                      b1 = i1;
                   }
                   if (b1) {
                      this.setBizType(4);
                   }else if(f.i(p0)){
                      this.setBizType(4);
                   }else if(f.j(p0)){
                      this.setBizType(4);
                   }else if(f.e(p0)){
                      this.setBizType(4);
                   }else if(f.f(p0)){
                      this.setBizType(4);
                   }else if(d.a(0x66aa3a58).B50(p0)){
                      this.setBizType(4);
                   }else if(f.m(p0)){
                      this.setBizType(4);
                   }else if(f.o(p0)){
                      this.setBizType(4);
                   }else if(f.n(p0)){
                      this.setBizType(4);
                   }
                }
             }
          }
          if (this.mBizType == null) {
             if (e.f()) {
                this.setBizType(4);
             }else if(NasaSlidePlayExperimentUtil.g() && (this.isForceNormalDetail == null && !PhotoDetailParam.isLiveStream(this.mPhoto))){
                this.setBizType(4);
                this.isOverAllUseNasa = true;
             }else {
                this.setBizType(true);
             }
          }
          this.overrideBizTypeForNormalDetail();
          return;
       }
    }
    public void parseBizTypeFromPhoto(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailParam.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!this.enableSlidePlay()) {
          if (!c.b() && b.a(-570058679).c(p0)) {
             p0.setIsNonSlideAd(true);
             this.setBizType(4);
          }else if(NasaSlidePlayExperimentUtil.g() && (this.isForceNormalDetail == null && (this.mBizType == null && !PhotoDetailParam.isLiveStream(this.mPhoto)))){
             this.setBizType(4);
             this.isOverAllUseNasa = true;
          }else {
             this.setBizType(true);
             this.overrideBizTypeForNormalDetail();
          }
       }
       return;
    }
    public void parseParamFromPhoto(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailParam.class, "3")) {
          return;
       }
       if (p0.isDisallowShot()) {
          this.getDetailCommonParam().setDisallowScreenShot(true);
       }
       return;
    }
    public void putParamIntoIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailParam.class, "20")) {
          return;
       }
       if (a.t().d("enableNasaBizParamUnSerialize", false)) {
          p0.putExtra("photoDetailRepoId", a.b(a.b()).c(this));
       }else {
          p0.putExtra("PHOTO", b.c(this));
       }
       return;
    }
    public void setBaseFeed(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailParam.class, "18")) {
          return;
       }
       super.setBaseFeed(p0);
       this.mPhoto = new QPhoto(p0);
       return;
    }
    public PhotoDetailParam setBizType(int p0){
       this.mBizType = p0;
       return this;
    }
    public void setClickViewId(int p0){
       if (PatchProxy.isSupport(PhotoDetailParam.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PhotoDetailParam.class, "22")) {
          return;
       }
       try{
          if (p0 != -1) {
             this.mClickViewId = a.b().getResources().getResourceEntryName(p0);
          }
          return;
       }catch(android.content.res.Resources$NotFoundException e0){
       }
    }
    public final void setDetailCommonParam(DetailCommonParam p0){
       this.mDetailCommonParam = p0;
    }
    public final void setDetailDanmakuParam(DetailDanmakuParam p0){
       this.mDetailDanmakuParam = p0;
    }
    public void setEnableForceNormalDetail(boolean p0){
       this.isForceNormalDetail = p0;
    }
    public PhotoDetailParam setEpisodeSerial(boolean p0){
       this.mIsEpisodeSerial = p0;
       return this;
    }
    public PhotoDetailParam setFeedPosition(int p0){
       this.mFeedPosition = p0;
       return this;
    }
    public PhotoDetailParam setForceShowLeftSlideGuide(boolean p0){
       this.mIsForceShowLeftSlideGuide = p0;
       return this;
    }
    public PhotoDetailParam setFromDomino(boolean p0){
       this.mIsFromDomino = p0;
       return this;
    }
    public PhotoDetailParam setPhotoIndex(int p0){
       this.mPhotoIndex = p0;
       this.mPhotoIndexByLog = p0;
       return this;
    }
    public PhotoDetailParam setSearchEpisodeSerial(boolean p0){
       this.mIsSearchEpisodeSerial = p0;
       return this;
    }
    public a setSlidePlayId(String p0){
       return this.setSlidePlayId(p0);
    }
    public PhotoDetailParam setSlidePlayId(String p0){
       this.mSlidePlayId = p0;
       return this;
    }
    public PhotoDetailParam setSource(int p0){
       this.mSource = p0;
       return this;
    }
    public PhotoDetailParam setSourceOfContainer(int p0){
       this.mSourceOfContainer = p0;
       return this;
    }
}
