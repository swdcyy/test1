package com.kwai.feature.api.feed.growth.model.DeepLinkAdSource;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.growth.model.DeepLinkAdSource$BackDataSource;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;

public class DeepLinkAdSource implements Serializable, Cloneable	// class@000ec0
{
    public DeepLinkAdSource$BackDataSource mBackDataSource;
    public String mBackgroundColor;
    public DeepLinkAdSource$a mContextData;
    public Boolean mEnableClose;
    public boolean mExitKwaiAppDirectly;
    public boolean mHideIfNoBackData;
    public String mIconUrl;
    public float mInitPosition;
    public String mMaxDisplayDuration;
    public String mName;
    public String mOpenFromRegex;
    public String mStyle;
    public String mTextColor;
    public static final long serialVersionUID = 0xd005640496dba13a;

    public void DeepLinkAdSource(){
       super();
       this.mStyle = "NORMAL";
       this.mInitPosition = 0xbf800000;
    }
    public DeepLinkAdSource clone(){
       DeepLinkAdSource obj = PatchProxy.apply(null, this, DeepLinkAdSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          DeepLinkAdSource tmBackDataSo = this.mBackDataSource;
          if (tmBackDataSo != null) {
             obj.mBackDataSource = tmBackDataSo.clone();
          }
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DeepLinkAdSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof DeepLinkAdSource) {
          return false;
       }
       if (this.mExitKwaiAppDirectly != p0.mExitKwaiAppDirectly) {
          return false;
       }
       if (this.mHideIfNoBackData != p0.mHideIfNoBackData) {
          return false;
       }
       DeepLinkAdSource tmName = this.mName;
       if (tmName != null) {
          if (!tmName.equals(p0.mName)) {
          label_003e :
             return false;
          }
       }else if(p0.mName != null){
          goto label_003e ;
       }
       tmName = this.mIconUrl;
       if (tmName != null) {
          if (!tmName.equals(p0.mIconUrl)) {
          label_0050 :
             return false;
          }
       }else if(p0.mIconUrl != null){
          goto label_0050 ;
       }
       tmName = this.mOpenFromRegex;
       if (tmName != null) {
          if (!tmName.equals(p0.mOpenFromRegex)) {
          label_0062 :
             return false;
          }
       }else if(p0.mOpenFromRegex != null){
          goto label_0062 ;
       }
       tmName = this.mEnableClose;
       if (tmName != null) {
          if (!tmName.equals(p0.mEnableClose)) {
          label_0074 :
             return false;
          }
       }else if(p0.mEnableClose != null){
          goto label_0074 ;
       }
       tmName = this.mMaxDisplayDuration;
       if (tmName != null) {
          if (!tmName.equals(p0.mMaxDisplayDuration)) {
          label_0086 :
             return false;
          }
       }else if(p0.mMaxDisplayDuration != null){
          goto label_0086 ;
       }
       tmName = this.mBackDataSource;
       if (tmName != null) {
          if (!tmName.equals(p0.mBackDataSource)) {
          label_0098 :
             return false;
          }
       }else if(p0.mBackDataSource != null){
          goto label_0098 ;
       }
       tmName = this.mBackgroundColor;
       if (tmName != null) {
          if (!tmName.equals(p0.mBackgroundColor)) {
          label_00aa :
             return false;
          }
       }else if(p0.mBackgroundColor != null){
          goto label_00aa ;
       }
       tmName = this.mTextColor;
       if (tmName != null) {
          if (!tmName.equals(p0.mTextColor)) {
          label_00bc :
             return false;
          }
       }else if(p0.mTextColor != null){
          goto label_00bc ;
       }
       tmName = this.mStyle;
       if (tmName != null) {
          if (!tmName.equals(p0.mStyle)) {
          label_00ce :
             return false;
          }
       }else if(p0.mStyle != null){
          goto label_00ce ;
       }
       if (Float.compare(p0.mInitPosition, this.mInitPosition)) {
          return false;
       }else {
          tmName = this.mContextData;
          if (tmName != null) {
             b = tmName.equals(p0.mContextData);
          }else if(p0.mContextData == null){
             b = false;
          }
          return b;
       }
    }
    public int hashCode(){
       DeepLinkAdSource obj = PatchProxy.apply(null, this, DeepLinkAdSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DeepLinkAdSource tmIconUrl = this.mIconUrl;
       int i2 = (tmIconUrl != null)? tmIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmIconUrl = this.mOpenFromRegex;
       i2 = (tmIconUrl != null)? tmIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmIconUrl = this.mEnableClose;
       i2 = (tmIconUrl != null)? tmIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmIconUrl = this.mMaxDisplayDuration;
       i2 = (tmIconUrl != null)? tmIconUrl.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.mExitKwaiAppDirectly) * 31;
       tmIconUrl = this.mTextColor;
       i2 = (tmIconUrl != null)? tmIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmIconUrl = this.mBackgroundColor;
       i2 = (tmIconUrl != null)? tmIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmIconUrl = this.mBackDataSource;
       i2 = (tmIconUrl != null)? tmIconUrl.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.mHideIfNoBackData) * 31;
       tmIconUrl = this.mStyle;
       i2 = (tmIconUrl != null)? tmIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmIconUrl = this.mInitPosition;
       i2 = (tmIconUrl)? Float.floatToIntBits(tmIconUrl): 0;
       i1 = (i1 + i2) * 31;
       tmIconUrl = this.mContextData;
       if (tmIconUrl != null) {
          i = tmIconUrl.hashCode();
       }
       return (i1 + i);
    }
}
