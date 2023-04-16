package com.kwai.feature.api.social.common.jsbridge.model.FaceDetectParams;
import java.io.Serializable;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FaceDetectParams implements Serializable	// class@0010c0
{
    public final String imagePath;
    public final Map serverParams;

    public void FaceDetectParams(String p0,Map p1){
       super();
       this.imagePath = p0;
       this.serverParams = p1;
    }
    public static FaceDetectParams copy$default(FaceDetectParams p0,String p1,Map p2,int p3,Object p4){
       FaceDetectParams imagePath;
       FaceDetectParams serverParams;
       if (p3 & 0x01) {
          imagePath = p0.imagePath;
       }
       if (p3 & 0x02) {
          serverParams = p0.serverParams;
       }
       return p0.copy(imagePath, serverParams);
    }
    public final String component1(){
       return this.imagePath;
    }
    public final Map component2(){
       return this.serverParams;
    }
    public final FaceDetectParams copy(String p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FaceDetectParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FaceDetectParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FaceDetectParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FaceDetectParams && (a.g(this.imagePath, p0.imagePath) && a.g(this.serverParams, p0.serverParams)))) {
          return true;
       }
       return false;
    }
    public final String getImagePath(){
       return this.imagePath;
    }
    public final Map getServerParams(){
       return this.serverParams;
    }
    public int hashCode(){
       FaceDetectParams obj = PatchProxy.apply(null, this, FaceDetectParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.imagePath;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FaceDetectParams tserverParam = this.serverParams;
       if (tserverParam != null) {
          i = tserverParam.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FaceDetectParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FaceDetectParams\(imagePath="+this.imagePath+", serverParams="+this.serverParams+"\)";
    }
}
