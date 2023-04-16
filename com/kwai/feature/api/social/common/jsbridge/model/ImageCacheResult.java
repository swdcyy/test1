package com.kwai.feature.api.social.common.jsbridge.model.ImageCacheResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ImageCacheResult implements Serializable	// class@0010c3
{
    public final boolean exist;
    public final String result;

    public void ImageCacheResult(boolean p0,String p1){
       super();
       this.exist = p0;
       this.result = p1;
    }
    public void ImageCacheResult(boolean p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       super(p0, p1);
       return;
    }
    public static ImageCacheResult copy$default(ImageCacheResult p0,boolean p1,String p2,int p3,Object p4){
       ImageCacheResult exist;
       ImageCacheResult result;
       if (p3 & 0x01) {
          exist = p0.exist;
       }
       if (p3 & 0x02) {
          result = p0.result;
       }
       return p0.copy(exist, result);
    }
    public final boolean component1(){
       return this.exist;
    }
    public final String component2(){
       return this.result;
    }
    public final ImageCacheResult copy(boolean p0,String p1){
       if (PatchProxy.isSupport(ImageCacheResult.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ImageCacheResult.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ImageCacheResult(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImageCacheResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ImageCacheResult && (this.exist == p0.exist && a.g(this.result, p0.result)))) {
          return true;
       }
       return false;
    }
    public final boolean getExist(){
       return this.exist;
    }
    public final String getResult(){
       return this.result;
    }
    public int hashCode(){
       int i;
       ImageCacheResult obj = PatchProxy.apply(null, this, ImageCacheResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.exist;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       ImageCacheResult tresult = this.result;
       int i1 = (tresult != null)? tresult.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ImageCacheResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ImageCacheResult\(exist="+this.exist+", result="+this.result+"\)";
    }
}
