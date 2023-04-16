package com.yxcorp.gifshow.commercial.api.DetailAd;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.api.DetailAd$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DetailAd implements Serializable	// class@00111e
{
    public final String mCaption;
    public final String mCoverUrl;
    public long mCreativeId;
    public final String mH5Data;
    public static final DetailAd$a Companion;
    public static final long serialVersionUID;

    static {
       DetailAd.Companion = new DetailAd$a(null);
    }
    public void DetailAd(long p0,String p1,String p2,String p3){
       a.p(p1, "mCaption");
       a.p(p2, "mCoverUrl");
       a.p(p3, "mH5Data");
       super();
       this.mCreativeId = p0;
       this.mCaption = p1;
       this.mCoverUrl = p2;
       this.mH5Data = p3;
    }
    public static DetailAd copy$default(DetailAd p0,long p1,String p2,String p3,String p4,int p5,Object p6){
       DetailAd mCreativeId;
       DetailAd mCaption;
       DetailAd mCoverUrl;
       DetailAd mH5Data;
       if (p5 & 0x01) {
          mCreativeId = p0.mCreativeId;
       }
       DetailAd uDetailAd = mCreativeId;
       if (p5 & 0x02) {
          mCaption = p0.mCaption;
       }
       DetailAd uDetailAd1 = mCaption;
       if (p5 & 0x04) {
          mCoverUrl = p0.mCoverUrl;
       }
       DetailAd uDetailAd2 = mCoverUrl;
       if (p5 & 0x08) {
          mH5Data = p0.mH5Data;
       }
       return p0.copy(uDetailAd, uDetailAd1, uDetailAd2, mH5Data);
    }
    public final long component1(){
       return this.mCreativeId;
    }
    public final String component2(){
       return this.mCaption;
    }
    public final String component3(){
       return this.mCoverUrl;
    }
    public final String component4(){
       return this.mH5Data;
    }
    public final DetailAd copy(long p0,String p1,String p2,String p3){
       Object obj;
       if (PatchProxy.isSupport(DetailAd.class)) {
          obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, p2, p3, this, DetailAd.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "mCaption");
       a.p(p2, "mCoverUrl");
       a.p(p3, "mH5Data");
       DetailAd uDetailAd = new DetailAd(p0, p1, p2, p3);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailAd.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DetailAd && (!this.mCreativeId - p0.mCreativeId && (a.g(this.mCaption, p0.mCaption) && (a.g(this.mCoverUrl, p0.mCoverUrl) && a.g(this.mH5Data, p0.mH5Data)))))) {
          return true;
       }
       return false;
    }
    public final String getMCaption(){
       return this.mCaption;
    }
    public final String getMCoverUrl(){
       return this.mCoverUrl;
    }
    public final long getMCreativeId(){
       return this.mCreativeId;
    }
    public final String getMH5Data(){
       return this.mH5Data;
    }
    public int hashCode(){
       DetailAd obj = PatchProxy.apply(null, this, DetailAd.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCreativeId;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.mCaption;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.mCoverUrl;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.mH5Data;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public final void setMCreativeId(long p0){
       this.mCreativeId = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DetailAd.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DetailAd\(mCreativeId="+this.mCreativeId+", mCaption="+this.mCaption+", mCoverUrl="+this.mCoverUrl+", mH5Data="+this.mH5Data+"\)";
    }
}
