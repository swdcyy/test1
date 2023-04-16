package com.kwai.feature.api.feed.growth.model.DeepLinkAdSource$BackDataSource;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class DeepLinkAdSource$BackDataSource implements Serializable, Cloneable	// class@000ebe
{
    public String mBackDataKey;
    public String mBackDataPattern;
    public String mBtnNameKey;
    public boolean mHideIfNoBtnName;
    public int mType;
    public static final long serialVersionUID = 0x2291b4e61442d7b2;

    public void DeepLinkAdSource$BackDataSource(){
       super();
    }
    public DeepLinkAdSource$BackDataSource clone(){
       Object obj = PatchProxy.apply(null, this, DeepLinkAdSource$BackDataSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DeepLinkAdSource$BackDataSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mType != p0.mType) {
          return false;
       }
       if (this.mHideIfNoBtnName != p0.mHideIfNoBtnName) {
          return false;
       }
       DeepLinkAdSource$BackDataSource tmBackDataKe = this.mBackDataKey;
       if (tmBackDataKe != null) {
          if (!tmBackDataKe.equals(p0.mBackDataKey)) {
          label_0046 :
             return false;
          }
       }else if(p0.mBackDataKey != null){
          goto label_0046 ;
       }
       tmBackDataKe = this.mBackDataPattern;
       if (tmBackDataKe != null) {
          if (!tmBackDataKe.equals(p0.mBackDataPattern)) {
          label_0058 :
             return false;
          }
       }else if(p0.mBackDataPattern != null){
          goto label_0058 ;
       }
       tmBackDataKe = this.mBtnNameKey;
       p0 = p0.mBtnNameKey;
       if (tmBackDataKe != null) {
          b = tmBackDataKe.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DeepLinkAdSource$BackDataSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.mType * 31;
       DeepLinkAdSource$BackDataSource tmBackDataKe = this.mBackDataKey;
       int i1 = 0;
       int i2 = (tmBackDataKe != null)? tmBackDataKe.hashCode(): 0;
       i = (i + i2) * 31;
       tmBackDataKe = this.mBackDataPattern;
       i2 = (tmBackDataKe != null)? tmBackDataKe.hashCode(): 0;
       i = (i + i2) * 31;
       tmBackDataKe = this.mBtnNameKey;
       if (tmBackDataKe != null) {
          i1 = tmBackDataKe.hashCode();
       }
       return (((i + i1) * 31) + this.mHideIfNoBtnName);
    }
}
