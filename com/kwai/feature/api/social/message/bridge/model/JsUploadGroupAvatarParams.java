package com.kwai.feature.api.social.message.bridge.model.JsUploadGroupAvatarParams;
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

public final class JsUploadGroupAvatarParams implements Serializable	// class@00113b
{
    public final String callback;
    public final String filePath;
    public final String subBiz;
    public final String targetId;

    public void JsUploadGroupAvatarParams(String p0,String p1,String p2,String p3){
       super();
       this.subBiz = p0;
       this.targetId = p1;
       this.filePath = p2;
       this.callback = p3;
    }
    public static JsUploadGroupAvatarParams copy$default(JsUploadGroupAvatarParams p0,String p1,String p2,String p3,String p4,int p5,Object p6){
       JsUploadGroupAvatarParams subBiz;
       JsUploadGroupAvatarParams targetId;
       JsUploadGroupAvatarParams filePath;
       JsUploadGroupAvatarParams callback;
       if (p5 & 0x01) {
          subBiz = p0.subBiz;
       }
       if (p5 & 0x02) {
          targetId = p0.targetId;
       }
       if (p5 & 0x04) {
          filePath = p0.filePath;
       }
       if (p5 & 0x08) {
          callback = p0.callback;
       }
       return p0.copy(subBiz, targetId, filePath, callback);
    }
    public final String component1(){
       return this.subBiz;
    }
    public final String component2(){
       return this.targetId;
    }
    public final String component3(){
       return this.filePath;
    }
    public final String component4(){
       return this.callback;
    }
    public final JsUploadGroupAvatarParams copy(String p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, JsUploadGroupAvatarParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsUploadGroupAvatarParams(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsUploadGroupAvatarParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsUploadGroupAvatarParams && (a.g(this.subBiz, p0.subBiz) && (a.g(this.targetId, p0.targetId) && (a.g(this.filePath, p0.filePath) && a.g(this.callback, p0.callback)))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getFilePath(){
       return this.filePath;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public final String getTargetId(){
       return this.targetId;
    }
    public int hashCode(){
       JsUploadGroupAvatarParams obj = PatchProxy.apply(null, this, JsUploadGroupAvatarParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsUploadGroupAvatarParams ttargetId = this.targetId;
       int i2 = (ttargetId != null)? ttargetId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttargetId = this.filePath;
       i2 = (ttargetId != null)? ttargetId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttargetId = this.callback;
       if (ttargetId != null) {
          i = ttargetId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsUploadGroupAvatarParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsUploadGroupAvatarParams\(subBiz="+this.subBiz+", targetId="+this.targetId+", filePath="+this.filePath+", callback="+this.callback+"\)";
    }
}
