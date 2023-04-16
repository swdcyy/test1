package com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import android.app.Application;
import o56.a;
import java.lang.Boolean;
import java.util.Collection;
import com.yxcorp.gifshow.model.OperationMaskTag;
import java.lang.StringBuilder;
import java.io.File;
import elb.h0;
import g16.a;
import q87.c;
import java.lang.Integer;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public class FilterConfig implements Serializable, Cloneable	// class@0012eb
{
    public int b;
    public String c;
    public boolean d;
    public int e;
    public String f;
    public boolean g;
    public boolean mAutoDownload;
    public boolean mCanSaveAsLast;
    public boolean mChangeByExternal;
    public boolean mChangeIntensityByMagic;
    public int mColorFilterType;
    public int mDimension;
    public String mDisplayName;
    public String mDisplayType;
    public int mFeatureId;
    public List mFileMd5CheckList;
    public int mFilterId;
    public String mFilterName;
    public List mFilterResources;
    public List mFilterResourcesUrl;
    public int mImageType;
    public float mIntensity;
    public float mIntensityBeforeMagic;
    public float mIntensityFromMagic;
    public boolean mIsFilterResExist;
    public boolean mIsZipResExist;
    public ItemNameStyle mItemNameStyle;
    public int mMinVersion;
    public OperationMaskTag mOperationMaskTag;
    public int mPageType;
    public float mRatioIntensity;
    public int mSourceType;
    public String mThumbImageName;
    public String mThumbImageUrl;
    public CDNUrl[] mZipSourceFile;
    public static final long serialVersionUID = 0x1;

    public void FilterConfig(){
       super();
       this.mRatioIntensity = 0x3f800000;
       this.mPageType = 1;
       this.mChangeIntensityByMagic = false;
       this.mCanSaveAsLast = false;
       this.mChangeByExternal = false;
       this.mFeatureId = 0;
       this.mColorFilterType = -1;
       this.d = false;
       this.e = -1;
       this.f = "";
    }
    public static ArrayList arrayClone(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, FilterConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().clone());
       }
       return obj;
    }
    public static FilterConfig getDivider(){
       FilterConfig obj = PatchProxy.apply(null, null, FilterConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FilterConfig();
       obj.d = true;
       obj.mFilterId = -9;
       return obj;
    }
    public static FilterConfig getEmpty(){
       FilterConfig obj = PatchProxy.apply(null, null, FilterConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FilterConfig();
       obj.mFilterId = -1;
       obj.mDisplayName = FilterConfig.getEmptyDisplayName();
       obj.mDisplayType = FilterConfig.getEmptyDisplayType();
       obj.b = -1;
       obj.e = -1;
       return obj;
    }
    public static String getEmptyDisplayName(){
       Object obj = PatchProxy.apply(null, null, FilterConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b().getString(0x7f100f4d);
    }
    public static String getEmptyDisplayType(){
       return "";
    }
    public static String getFilterDisplayName(FilterConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterConfig.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String emptyDisplay = (p0 == null)? FilterConfig.getEmptyDisplayName(): p0.getDisplayName();
       return emptyDisplay;
    }
    public static String getFilterDisplayType(FilterConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterConfig.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String emptyDisplay = (p0 == null)? FilterConfig.getEmptyDisplayType(): p0.getDisplayType();
       return emptyDisplay;
    }
    public static boolean isEmptyOrNull(FilterConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterConfig.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isEmptyFilter())? true: false;
       return b;
    }
    public boolean canSaveAsLast(){
       boolean b = (this.mChangeByExternal != null || (this.mChangeIntensityByMagic == null || this.mCanSaveAsLast != null))? true: false;
       return b;
    }
    public FilterConfig clone(){
       ArrayList uArrayList;
       FilterConfig obj = PatchProxy.apply(null, this, FilterConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          if (this.mFilterResourcesUrl != null) {
             uArrayList = new ArrayList();
             obj.mFilterResourcesUrl = uArrayList;
             uArrayList.addAll(this.mFilterResourcesUrl);
          }
          if (this.mFilterResources != null) {
             uArrayList = new ArrayList();
             obj.mFilterResources = uArrayList;
             uArrayList.addAll(this.mFilterResources);
          }
          obj.g = this.g;
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof FilterConfig && this.mFilterId == p0.mFilterId)? true: false;
       return b;
    }
    public String getBottomMaskColor(){
       FilterConfig tmOperationM = this.mOperationMaskTag;
       String str = (tmOperationM == null)? "": tmOperationM.color;
       return str;
    }
    public String getBottomMaskSecondColor(){
       FilterConfig tmOperationM = this.mOperationMaskTag;
       String str = (tmOperationM == null)? "": tmOperationM.secondColor;
       return str;
    }
    public String getBottomMaskText(){
       FilterConfig tmOperationM = this.mOperationMaskTag;
       String str = (tmOperationM == null)? "": tmOperationM.text;
       return str;
    }
    public int getColorFilterType(int p0){
       FilterConfig tmColorFilte = this.mColorFilterType;
       if (tmColorFilte == -1) {
          return p0;
       }
       return tmColorFilte;
    }
    public String getDisplayName(){
       return this.mDisplayName;
    }
    public String getDisplayType(){
       return this.mDisplayType;
    }
    public int getGroupId(){
       return this.e;
    }
    public String getGroupName(){
       return this.f;
    }
    public int getPosition(){
       return this.b;
    }
    public String getUnZipDir(){
       Object obj = PatchProxy.apply(null, this, FilterConfig.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.mFilterId);
    }
    public String getZipFileName(){
       Object obj = PatchProxy.apply(null, this, FilterConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mFilterId+".zip";
    }
    public boolean isDivider(){
       return this.d;
    }
    public boolean isEmptyFilter(){
       Object obj = PatchProxy.apply(null, this, FilterConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mFilterId < null && !this.isReco())? true: false;
       return b;
    }
    public boolean isKeepCurrentFilter(){
       boolean b = (this.mFilterId == -2)? true: false;
       return b;
    }
    public boolean isNormal(){
       boolean b = true;
       if (this.mPageType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isPhotoMovie(){
       boolean b = (this.mPageType == 2)? true: false;
       return b;
    }
    public boolean isReco(){
       return this.g;
    }
    public boolean isResourceValid(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, FilterConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(p0, this.getUnZipDir());
       if (obj.exists() && h0.a(obj, this.mFileMd5CheckList)) {
          return true;
       }
       return false;
    }
    public boolean isUnzipDirExist(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, FilterConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(p0, this.getUnZipDir());
       if (obj.exists()) {
          String[] stringArray = obj.list();
          if (stringArray != null && stringArray.length > 0) {
             return true;
          }
       }
       Object[] objArray = new Object[0];
       a.C().w("FilterConfig", "isFilterResExist zip not exist, id:"+this.mFilterId, objArray);
       return 0;
    }
    public void setChangeIntensityByMagic(float p0,float p1){
       this.mIntensityBeforeMagic = p0;
       this.mIntensityFromMagic = p1;
       this.mChangeIntensityByMagic = true;
    }
    public void setColorFilterType(int p0){
       this.mColorFilterType = p0;
    }
    public void setDisplayName(int p0){
       if (PatchProxy.isSupport(FilterConfig.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FilterConfig.class, "1")) {
          return;
       }
       FilterConfig tc = this.c;
       this.c = (tc == null)? this.mDisplayName: tc;
       this.mDisplayName = this.mDisplayName+" "+p0;
       return;
    }
    public void setDisplayName(String p0){
       this.mDisplayName = p0;
    }
    public void setGroupId(int p0){
       this.e = p0;
    }
    public void setGroupName(String p0){
       this.f = p0;
    }
    public void setIsReco(boolean p0){
       this.g = p0;
    }
    public void setPosition(int p0){
       this.b = p0;
    }
    public String toSimpleString(){
       Object obj = PatchProxy.apply(null, this, FilterConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isDivider()) {
          return "FilterConfig{Divider}";
       }
       if (this.isEmptyFilter()) {
          return "FilterConfig{Empty}";
       }
       return "FilterConfig{mFilterId="+this.mFilterId+", mDisplayName="+this.mDisplayName+", mIntensity="+this.mIntensity+'}';
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FilterConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isDivider()) {
          return "FilterConfig{Divider}";
       }
       if (this.isEmptyFilter()) {
          return "FilterConfig{Empty}";
       }
       return "FilterConfig{mFilterId="+this.mFilterId+", mFeatureId="+this.mFilterName+", mMinVersion="+this.mMinVersion+", mSourceType="+this.mSourceType+", mSourceType="+e0.c(this.mZipSourceFile)+", mDisplayName="+this.mDisplayName+", mDisplayType="+this.mDisplayType+", mIntensity="+this.mIntensity+", mRatioIntensity="+this.mRatioIntensity+", mThumbImageName="+this.mThumbImageName+", mFilterResources="+this.mFilterResources+", mThumbImageUrl="+this.mThumbImageUrl+", mFilterResourcesUrl="+this.mFilterResourcesUrl+", mImageType="+this.mImageType+'''+", mDimension=\'"+this.mDimension+'''+", mColorFilterType="+this.mColorFilterType+", mFileMd5CheckList="+this.mFileMd5CheckList+'}';
    }
}
