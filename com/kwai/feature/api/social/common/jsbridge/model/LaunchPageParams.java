package com.kwai.feature.api.social.common.jsbridge.model.LaunchPageParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LaunchPageParams implements Serializable	// class@0010c4
{
    public final String imgPath;
    public final String moodId;
    public final String serverParams;

    public void LaunchPageParams(String p0,String p1,String p2){
       super();
       this.serverParams = p0;
       this.imgPath = p1;
       this.moodId = p2;
    }
    public static LaunchPageParams copy$default(LaunchPageParams p0,String p1,String p2,String p3,int p4,Object p5){
       LaunchPageParams serverParams;
       LaunchPageParams imgPath;
       LaunchPageParams moodId;
       if (p4 & 0x01) {
          serverParams = p0.serverParams;
       }
       if (p4 & 0x02) {
          imgPath = p0.imgPath;
       }
       if (p4 & 0x04) {
          moodId = p0.moodId;
       }
       return p0.copy(serverParams, imgPath, moodId);
    }
    public final String component1(){
       return this.serverParams;
    }
    public final String component2(){
       return this.imgPath;
    }
    public final String component3(){
       return this.moodId;
    }
    public final LaunchPageParams copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LaunchPageParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LaunchPageParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LaunchPageParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LaunchPageParams && (a.g(this.serverParams, p0.serverParams) && (a.g(this.imgPath, p0.imgPath) && a.g(this.moodId, p0.moodId))))) {
          return true;
       }
       return false;
    }
    public final String getImgPath(){
       return this.imgPath;
    }
    public final String getMoodId(){
       return this.moodId;
    }
    public final String getServerParams(){
       return this.serverParams;
    }
    public int hashCode(){
       LaunchPageParams obj = PatchProxy.apply(null, this, LaunchPageParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.serverParams;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LaunchPageParams timgPath = this.imgPath;
       int i2 = (timgPath != null)? timgPath.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       timgPath = this.moodId;
       if (timgPath != null) {
          i = timgPath.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LaunchPageParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LaunchPageParams\(serverParams="+this.serverParams+", imgPath="+this.imgPath+", moodId="+this.moodId+"\)";
    }
}
