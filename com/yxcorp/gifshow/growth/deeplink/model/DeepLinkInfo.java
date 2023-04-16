package com.yxcorp.gifshow.growth.deeplink.model.DeepLinkInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.deeplink.model.DeepLinkInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DeepLinkInfo implements Serializable	// class@00135e
{
    public final String crowdid;
    public final String feedInject;
    public final String keyword;
    public final String photoId;
    public final int type;
    public final String userId;
    public static final DeepLinkInfo$a Companion;
    public static final long serialVersionUID;

    static {
       DeepLinkInfo.Companion = new DeepLinkInfo$a(null);
    }
    public void DeepLinkInfo(int p0,String p1,String p2,String p3,String p4,String p5){
       super();
       this.type = p0;
       this.photoId = p1;
       this.userId = p2;
       this.keyword = p3;
       this.crowdid = p4;
       this.feedInject = p5;
    }
    public void DeepLinkInfo(int p0,String p1,String p2,String p3,String p4,String p5,int p6,u p7){
       if (p6 & 0x20) {
          p5 = "";
       }
       super(p0, p1, p2, p3, p4, p5);
       return;
    }
    public static DeepLinkInfo copy$default(DeepLinkInfo p0,int p1,String p2,String p3,String p4,String p5,String p6,int p7,Object p8){
       DeepLinkInfo type;
       DeepLinkInfo photoId;
       DeepLinkInfo userId;
       DeepLinkInfo keyword;
       DeepLinkInfo crowdid;
       DeepLinkInfo uDeepLinkInf3;
       if (p7 & 0x01) {
          type = p0.type;
       }
       if (p7 & 0x02) {
          photoId = p0.photoId;
       }
       p8 = photoId;
       if (p7 & 0x04) {
          userId = p0.userId;
       }
       DeepLinkInfo uDeepLinkInf = userId;
       if (p7 & 0x08) {
          keyword = p0.keyword;
       }
       DeepLinkInfo uDeepLinkInf1 = keyword;
       if (p7 & 0x10) {
          crowdid = p0.crowdid;
       }
       DeepLinkInfo uDeepLinkInf2 = crowdid;
       if (p7 & 0x20) {
          uDeepLinkInf3 = p0.feedInject;
       }
       return p0.copy(type, p8, uDeepLinkInf, uDeepLinkInf1, uDeepLinkInf2, uDeepLinkInf3);
    }
    public final int component1(){
       return this.type;
    }
    public final String component2(){
       return this.photoId;
    }
    public final String component3(){
       return this.userId;
    }
    public final String component4(){
       return this.keyword;
    }
    public final String component5(){
       return this.crowdid;
    }
    public final String component6(){
       return this.feedInject;
    }
    public final DeepLinkInfo copy(int p0,String p1,String p2,String p3,String p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(DeepLinkInfo.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, DeepLinkInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DeepLinkInfo uDeepLinkInf = new DeepLinkInfo(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DeepLinkInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DeepLinkInfo && (this.type == p0.type && (a.g(this.photoId, p0.photoId) && (a.g(this.userId, p0.userId) && (a.g(this.keyword, p0.keyword) && (a.g(this.crowdid, p0.crowdid) && a.g(this.feedInject, p0.feedInject)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DeepLinkInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.type * 31;
       DeepLinkInfo tphotoId = this.photoId;
       int i1 = 0;
       int i2 = (tphotoId != null)? tphotoId.hashCode(): 0;
       i = (i + i2) * 31;
       tphotoId = this.userId;
       i2 = (tphotoId != null)? tphotoId.hashCode(): 0;
       i = (i + i2) * 31;
       tphotoId = this.keyword;
       i2 = (tphotoId != null)? tphotoId.hashCode(): 0;
       i = (i + i2) * 31;
       tphotoId = this.crowdid;
       i2 = (tphotoId != null)? tphotoId.hashCode(): 0;
       i = (i + i2) * 31;
       tphotoId = this.feedInject;
       if (tphotoId != null) {
          i1 = tphotoId.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DeepLinkInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DeepLinkInfo\(type="+this.type+", photoId="+this.photoId+", userId="+this.userId+", keyword="+this.keyword+", crowdid="+this.crowdid+", feedInject="+this.feedInject+"\)";
    }
}
