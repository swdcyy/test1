package com.kwai.sdk.rerank.model.SodlerConfig;
import java.io.Serializable;
import com.kwai.sdk.rerank.model.SodlerConfig$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SodlerConfig implements Serializable	// class@001632
{
    public String mArm64Md5;
    public String mArm64Url;
    public String mMd5;
    public String mName;
    public String mUrl;
    public static final SodlerConfig$a Companion;
    public static final long serialVersionUID;

    static {
       SodlerConfig.Companion = new SodlerConfig$a(null);
    }
    public void SodlerConfig(){
       super(null, null, null, null, null, 31, null);
    }
    public void SodlerConfig(String p0,String p1,String p2,String p3,String p4){
       super();
       this.mName = p0;
       this.mUrl = p1;
       this.mMd5 = p2;
       this.mArm64Url = p3;
       this.mArm64Md5 = p4;
    }
    public void SodlerConfig(String p0,String p1,String p2,String p3,String p4,int p5,u p6){
       int i = (p5 & 0x01)? 0: p0;
       int i1 = (p5 & 0x02)? 0: p1;
       int i2 = (p5 & 0x04)? 0: p2;
       int i3 = (p5 & 0x08)? 0: p3;
       String str = (p5 & 0x10)? null: p4;
       super(i, i1, i2, i3, str);
       return;
    }
    public static SodlerConfig copy$default(SodlerConfig p0,String p1,String p2,String p3,String p4,String p5,int p6,Object p7){
       SodlerConfig mName;
       SodlerConfig mUrl;
       SodlerConfig mMd5;
       SodlerConfig mArm64Url;
       SodlerConfig mArm64Md5;
       if (p6 & 0x01) {
          mName = p0.mName;
       }
       if (p6 & 0x02) {
          mUrl = p0.mUrl;
       }
       p7 = mUrl;
       if (p6 & 0x04) {
          mMd5 = p0.mMd5;
       }
       SodlerConfig sodlerConfig = mMd5;
       if (p6 & 0x08) {
          mArm64Url = p0.mArm64Url;
       }
       SodlerConfig sodlerConfig1 = mArm64Url;
       if (p6 & 0x10) {
          mArm64Md5 = p0.mArm64Md5;
       }
       return p0.copy(mName, p7, sodlerConfig, sodlerConfig1, mArm64Md5);
    }
    public final String component1(){
       return this.mName;
    }
    public final String component2(){
       return this.mUrl;
    }
    public final String component3(){
       return this.mMd5;
    }
    public final String component4(){
       return this.mArm64Url;
    }
    public final String component5(){
       return this.mArm64Md5;
    }
    public final SodlerConfig copy(String p0,String p1,String p2,String p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(SodlerConfig.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, SodlerConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       SodlerConfig sodlerConfig = new SodlerConfig(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SodlerConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SodlerConfig && (a.g(this.mName, p0.mName) && (a.g(this.mUrl, p0.mUrl) && (a.g(this.mMd5, p0.mMd5) && (a.g(this.mArm64Url, p0.mArm64Url) && a.g(this.mArm64Md5, p0.mArm64Md5))))))) {
          return true;
       }
       return false;
    }
    public final String getMArm64Md5(){
       return this.mArm64Md5;
    }
    public final String getMArm64Url(){
       return this.mArm64Url;
    }
    public final String getMMd5(){
       return this.mMd5;
    }
    public final String getMName(){
       return this.mName;
    }
    public final String getMUrl(){
       return this.mUrl;
    }
    public int hashCode(){
       SodlerConfig obj = PatchProxy.apply(null, this, SodlerConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SodlerConfig tmUrl = this.mUrl;
       int i2 = (tmUrl != null)? tmUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmUrl = this.mMd5;
       i2 = (tmUrl != null)? tmUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmUrl = this.mArm64Url;
       i2 = (tmUrl != null)? tmUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmUrl = this.mArm64Md5;
       if (tmUrl != null) {
          i = tmUrl.hashCode();
       }
       return (i1 + i);
    }
    public final void setMArm64Md5(String p0){
       this.mArm64Md5 = p0;
    }
    public final void setMArm64Url(String p0){
       this.mArm64Url = p0;
    }
    public final void setMMd5(String p0){
       this.mMd5 = p0;
    }
    public final void setMName(String p0){
       this.mName = p0;
    }
    public final void setMUrl(String p0){
       this.mUrl = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SodlerConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SodlerConfig\(mName="+this.mName+", mUrl="+this.mUrl+", mMd5="+this.mMd5+", mArm64Url="+this.mArm64Url+", mArm64Md5="+this.mArm64Md5+"\)";
    }
}
