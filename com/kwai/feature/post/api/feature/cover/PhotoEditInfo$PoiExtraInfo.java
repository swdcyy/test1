package com.kwai.feature.post.api.feature.cover.PhotoEditInfo$PoiExtraInfo;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PhotoEditInfo$PoiExtraInfo implements Serializable	// class@001393
{
    public int checkType;
    public String extraInfo;

    public void PhotoEditInfo$PoiExtraInfo(){
       super(0, null, 3, null);
    }
    public void PhotoEditInfo$PoiExtraInfo(int p0,String p1){
       a.p(p1, "extraInfo");
       super();
       this.checkType = p0;
       this.extraInfo = p1;
    }
    public void PhotoEditInfo$PoiExtraInfo(int p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = "";
       }
       super(p0, p1);
       return;
    }
    public static PhotoEditInfo$PoiExtraInfo copy$default(PhotoEditInfo$PoiExtraInfo p0,int p1,String p2,int p3,Object p4){
       PhotoEditInfo$PoiExtraInfo checkType;
       PhotoEditInfo$PoiExtraInfo extraInfo;
       if (p3 & 0x01) {
          checkType = p0.checkType;
       }
       if (p3 & 0x02) {
          extraInfo = p0.extraInfo;
       }
       return p0.copy(checkType, extraInfo);
    }
    public final int component1(){
       return this.checkType;
    }
    public final String component2(){
       return this.extraInfo;
    }
    public final PhotoEditInfo$PoiExtraInfo copy(int p0,String p1){
       if (PatchProxy.isSupport(PhotoEditInfo$PoiExtraInfo.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, PhotoEditInfo$PoiExtraInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "extraInfo");
       return new PhotoEditInfo$PoiExtraInfo(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoEditInfo$PoiExtraInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PhotoEditInfo$PoiExtraInfo && (this.checkType == p0.checkType && a.g(this.extraInfo, p0.extraInfo)))) {
          return true;
       }
       return false;
    }
    public final int getCheckType(){
       return this.checkType;
    }
    public final String getExtraInfo(){
       return this.extraInfo;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PhotoEditInfo$PoiExtraInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.checkType * 31;
       PhotoEditInfo$PoiExtraInfo textraInfo = this.extraInfo;
       int i1 = (textraInfo != null)? textraInfo.hashCode(): 0;
       return (i + i1);
    }
    public final void setCheckType(int p0){
       this.checkType = p0;
    }
    public final void setExtraInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$PoiExtraInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.extraInfo = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoEditInfo$PoiExtraInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PoiExtraInfo\(checkType="+this.checkType+", extraInfo="+this.extraInfo+"\)";
    }
}
