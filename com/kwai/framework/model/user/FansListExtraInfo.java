package com.kwai.framework.model.user.FansListExtraInfo;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FansListExtraInfo implements Serializable	// class@0016f5
{
    public final String fansCountText;
    public final String photoPublicCountText;
    public final String userText;

    public void FansListExtraInfo(){
       super(null, null, null, 7, null);
    }
    public void FansListExtraInfo(String p0,String p1,String p2){
       super();
       this.userText = p0;
       this.photoPublicCountText = p1;
       this.fansCountText = p2;
    }
    public void FansListExtraInfo(String p0,String p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static FansListExtraInfo copy$default(FansListExtraInfo p0,String p1,String p2,String p3,int p4,Object p5){
       FansListExtraInfo userText;
       FansListExtraInfo photoPublicC;
       FansListExtraInfo uFansListExt;
       if (p4 & 0x01) {
          userText = p0.userText;
       }
       if (p4 & 0x02) {
          photoPublicC = p0.photoPublicCountText;
       }
       if (p4 & 0x04) {
          uFansListExt = p0.fansCountText;
       }
       return p0.copy(userText, photoPublicC, uFansListExt);
    }
    public final String component1(){
       return this.userText;
    }
    public final String component2(){
       return this.photoPublicCountText;
    }
    public final String component3(){
       return this.fansCountText;
    }
    public final FansListExtraInfo copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, FansListExtraInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FansListExtraInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FansListExtraInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FansListExtraInfo && (a.g(this.userText, p0.userText) && (a.g(this.photoPublicCountText, p0.photoPublicCountText) && a.g(this.fansCountText, p0.fansCountText))))) {
          return true;
       }
       return false;
    }
    public final String getFansCountText(){
       return this.fansCountText;
    }
    public final String getPhotoPublicCountText(){
       return this.photoPublicCountText;
    }
    public final String getUserText(){
       return this.userText;
    }
    public int hashCode(){
       FansListExtraInfo obj = PatchProxy.apply(null, this, FansListExtraInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userText;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FansListExtraInfo tphotoPublic = this.photoPublicCountText;
       int i2 = (tphotoPublic != null)? tphotoPublic.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tphotoPublic = this.fansCountText;
       if (tphotoPublic != null) {
          i = tphotoPublic.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FansListExtraInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FansListExtraInfo\(userText="+this.userText+", photoPublicCountText="+this.photoPublicCountText+", fansCountText="+this.fansCountText+"\)";
    }
}
