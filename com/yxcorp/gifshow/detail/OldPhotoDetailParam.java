package com.yxcorp.gifshow.detail.OldPhotoDetailParam;
import java.io.Serializable;
import java.lang.Cloneable;
import im8.g;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vm5.e;
import android.content.Context;
import ekd.n0;
import android.net.Uri;
import ekd.w0;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.entity.QPreInfo;
import android.view.View;
import android.os.SystemClock;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.CloneNotSupportedException;
import com.kwai.framework.model.feed.BaseFeed;
import uw9.w;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.android.model.mix.QComment;

public class OldPhotoDetailParam implements Serializable, Cloneable, g	// class@00133e
{
    public GifshowActivity mActivity;
    public QComment mComment;
    public DetailPlayConfig mDetailPlayConfig;
    public String mFromH5Page;
    public String mFromUtmSource;
    public String mGzoneSourceUrl;
    public boolean mIsFromFollowTopLive;
    public boolean mIsFromUserProfile;
    public long mOpendTimeStamp;
    public QPhoto mPhoto;
    public float mPhotoCoorX;
    public float mPhotoCoorY;
    public String mPhotoId;
    public int mPhotoIndex;
    public int mPhotoIndexByLog;
    public QPreInfo mPreInfo;
    public String mSlidePlayId;
    public int mSource;
    public View mSourceView;
    public int mThumbHeight;
    public int mThumbWidth;
    public static final long serialVersionUID = 0x9b07373daaf7691b;

    public void OldPhotoDetailParam(){
       super();
       this.mSource = 0;
       this.mOpendTimeStamp = -1;
       this.mDetailPlayConfig = new DetailPlayConfig();
    }
    public void OldPhotoDetailParam(GifshowActivity p0,QPhoto p1){
       super();
       this.mSource = 0;
       this.mOpendTimeStamp = -1;
       this.mDetailPlayConfig = new DetailPlayConfig();
       this.mActivity = p0;
       this.mPhoto = p1;
    }
    public void OldPhotoDetailParam(String p0,GifshowActivity p1){
       super();
       this.mSource = 0;
       this.mOpendTimeStamp = -1;
       this.mDetailPlayConfig = new DetailPlayConfig();
       this.mPhotoId = p0;
       this.mActivity = p1;
    }
    public Intent build(){
       String photoId;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, this, OldPhotoDetailParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-1818031860).sG(this.mActivity);
       Object[] objArray1 = new Object[1];
       int i = 0;
       OldPhotoDetailParam tmPhoto = this.mPhoto;
       tmPhoto = (tmPhoto == null)? this.mPhotoId: tmPhoto.getPhotoId();
       objArray1[i] = tmPhoto;
       obj.setData(w0.f(n0.a("kwai://work/%s", objArray1)));
       OldPhotoDetailParam tmPhoto1 = this.mPhoto;
       obj.putExtra("PHOTO", b.c(this));
       if (tmPhoto1 != null && tmPhoto1.isLiveStream()) {
          obj.putExtra("source", this.mSource);
          obj.putExtra("indexInAdapter", this.getPhotoIndex());
       }
       tmPhoto1 = this.mPreInfo;
       if (tmPhoto1 != null) {
          QPreInfo mPreExpTag = tmPhoto1.mPreExpTag;
          if (mPreExpTag != null) {
             obj.putExtra("arg_photo_exp_tag", mPreExpTag);
             obj.putExtra("page_path", this.mActivity.R2(objArray));
          }
       }
       obj.putExtra("key_opened_timestamp", SystemClock.elapsedRealtime());
       return obj;
    }
    public Intent build(View p0){
       OldPhotoDetailParam tmPhoto1;
       Intent obj = PatchProxy.applyOneRefs(p0, this, OldPhotoDetailParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-1818031860).sG(this.mActivity);
       String str = null;
       OldPhotoDetailParam tmPhoto = this.mPhoto;
       if (tmPhoto != null) {
          str = tmPhoto.getPhotoId();
       }else if(!TextUtils.x(this.mPhotoId)){
          tmPhoto1 = this.mPhotoId;
       }
       if (!TextUtils.x(str)) {
          Object[] objArray = new Object[]{str};
          obj.setData(w0.f(n0.a("kwai://work/%s", objArray)));
       }
       tmPhoto1 = this.mPhoto;
       obj.putExtra("PHOTO", b.c(this));
       if (tmPhoto1 != null && tmPhoto1.isLiveStream()) {
          obj.putExtra("source", this.mSource);
          obj.putExtra("indexInAdapter", this.getPhotoIndex());
       }
       tmPhoto1 = this.mPreInfo;
       if (tmPhoto1 != null) {
          QPreInfo mPreExpTag = tmPhoto1.mPreExpTag;
          if (mPreExpTag != null) {
             obj.putExtra("arg_photo_exp_tag", mPreExpTag);
             obj.putExtra("page_path", this.mActivity.R2(p0));
          }
       }
       obj.putExtra("key_opened_timestamp", SystemClock.elapsedRealtime());
       return obj;
    }
    public OldPhotoDetailParam clone(){
       Object obj = PatchProxy.apply(null, this, OldPhotoDetailParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public OldPhotoDetailParam cloneWithoutUnnecessaryFields(){
       OldPhotoDetailParam obj = PatchProxy.apply(null, this, OldPhotoDetailParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.clone();
       obj.mComment = null;
       return obj;
    }
    public boolean enableSlidePlay(){
       return true;
    }
    public BaseFeed getBaseFeed(){
       Object[] objArray = null;
       OldPhotoDetailParam obj = PatchProxy.apply(objArray, this, OldPhotoDetailParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPhoto;
       if (obj != null) {
          objArray = obj.getEntity();
       }
       return objArray;
    }
    public int getBrowseType(){
       return 3;
    }
    public DetailPlayConfig getDetailPlayConfig(){
       return this.mDetailPlayConfig;
    }
    public String getH5Page(){
       return this.mFromH5Page;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OldPhotoDetailParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, OldPhotoDetailParam.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(OldPhotoDetailParam.class, new w());
       }else {
          obj.put(OldPhotoDetailParam.class, null);
       }
       return obj;
    }
    public QPhoto getPhoto(){
       return this.mPhoto;
    }
    public int getPhotoIndex(){
       return this.mPhotoIndex;
    }
    public String getPreExpTag(){
       OldPhotoDetailParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPreExpTag;
       return str;
    }
    public QPreInfo getPreInfo(){
       return this.mPreInfo;
    }
    public String getPrePhotoId(){
       OldPhotoDetailParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPrePhotoId;
       return str;
    }
    public String getPreUserId(){
       OldPhotoDetailParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPreUserId;
       return str;
    }
    public int getSource(){
       return this.mSource;
    }
    public String getUtmSource(){
       return this.mFromUtmSource;
    }
    public boolean isThanos(){
       return true;
    }
    public void setBaseFeed(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OldPhotoDetailParam.class, "7")) {
          return;
       }
       this.mPhoto = new QPhoto(p0);
       return;
    }
    public OldPhotoDetailParam setComment(QComment p0){
       this.mComment = p0;
       return this;
    }
    public void setDetailPlayConfig(DetailPlayConfig p0){
       this.mDetailPlayConfig = p0;
    }
    public OldPhotoDetailParam setPhotoCoorX(float p0){
       this.mPhotoCoorX = p0;
       return this;
    }
    public OldPhotoDetailParam setPhotoCoorY(float p0){
       this.mPhotoCoorY = p0;
       return this;
    }
    public OldPhotoDetailParam setPhotoIndex(int p0){
       this.mPhotoIndex = p0;
       this.mPhotoIndexByLog = p0;
       return this;
    }
    public OldPhotoDetailParam setPreExpTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OldPhotoDetailParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreInfo == null) {
          this.mPreInfo = new QPreInfo();
       }
       this.mPreInfo.mPreExpTag = p0;
       return this;
    }
    public OldPhotoDetailParam setSchemaInfo(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, OldPhotoDetailParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mFromH5Page = TextUtils.k(p0);
       this.mFromUtmSource = TextUtils.k(p1);
       return this;
    }
    public OldPhotoDetailParam setSlidePlayId(String p0){
       this.mSlidePlayId = p0;
       return this;
    }
    public OldPhotoDetailParam setSource(int p0){
       this.mSource = p0;
       return this;
    }
    public OldPhotoDetailParam setSourceView(View p0){
       this.mSourceView = p0;
       return this;
    }
    public OldPhotoDetailParam setThumbHeight(int p0){
       this.mThumbHeight = p0;
       return this;
    }
    public OldPhotoDetailParam setThumbWidth(int p0){
       this.mThumbWidth = p0;
       return this;
    }
    public OldPhotoDetailParam setTitle(String p0){
       return this;
    }
}
