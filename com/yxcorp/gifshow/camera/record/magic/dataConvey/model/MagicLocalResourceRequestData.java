package com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicLocalResourceRequestData;
import java.io.Serializable;
import java.util.List;
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

public final class MagicLocalResourceRequestData implements Serializable	// class@000e2c
{
    public final List cdnUrls;
    public final String fileKey;
    public final int type;

    public void MagicLocalResourceRequestData(int p0,List p1,String p2){
       super();
       this.type = p0;
       this.cdnUrls = p1;
       this.fileKey = p2;
    }
    public static MagicLocalResourceRequestData copy$default(MagicLocalResourceRequestData p0,int p1,List p2,String p3,int p4,Object p5){
       MagicLocalResourceRequestData type;
       MagicLocalResourceRequestData cdnUrls;
       MagicLocalResourceRequestData fileKey;
       if (p4 & 0x01) {
          type = p0.type;
       }
       if (p4 & 0x02) {
          cdnUrls = p0.cdnUrls;
       }
       if (p4 & 0x04) {
          fileKey = p0.fileKey;
       }
       return p0.copy(type, cdnUrls, fileKey);
    }
    public final int component1(){
       return this.type;
    }
    public final List component2(){
       return this.cdnUrls;
    }
    public final String component3(){
       return this.fileKey;
    }
    public final MagicLocalResourceRequestData copy(int p0,List p1,String p2){
       if (PatchProxy.isSupport(MagicLocalResourceRequestData.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, MagicLocalResourceRequestData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new MagicLocalResourceRequestData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicLocalResourceRequestData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MagicLocalResourceRequestData && (this.type == p0.type && (a.g(this.cdnUrls, p0.cdnUrls) && a.g(this.fileKey, p0.fileKey))))) {
          return true;
       }
       return false;
    }
    public final List getCdnUrls(){
       return this.cdnUrls;
    }
    public final String getFileKey(){
       return this.fileKey;
    }
    public final int getType(){
       return this.type;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, MagicLocalResourceRequestData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.type * 31;
       MagicLocalResourceRequestData tcdnUrls = this.cdnUrls;
       int i1 = 0;
       int i2 = (tcdnUrls != null)? tcdnUrls.hashCode(): 0;
       i = (i + i2) * 31;
       tcdnUrls = this.fileKey;
       if (tcdnUrls != null) {
          i1 = tcdnUrls.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicLocalResourceRequestData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicLocalResourceRequestData\(type="+this.type+", cdnUrls="+this.cdnUrls+", fileKey="+this.fileKey+"\)";
    }
}
