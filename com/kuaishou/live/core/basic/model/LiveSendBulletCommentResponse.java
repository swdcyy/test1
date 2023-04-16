package com.kuaishou.live.core.basic.model.LiveSendBulletCommentResponse;
import java.io.Serializable;
import com.kuaishou.live.core.basic.model.LiveSendBulletCommentResultResponse;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveSendBulletCommentResponse implements Serializable	// class@000881
{
    public final LivePayBulletResponse bulletInfo;
    public final LiveSendBulletCommentResultResponse liveSendBulletCommentResultResponse;
    public final int result;

    public void LiveSendBulletCommentResponse(int p0,LiveSendBulletCommentResultResponse p1,LivePayBulletResponse p2){
       a.p(p1, "liveSendBulletCommentResultResponse");
       a.p(p2, "bulletInfo");
       super();
       this.result = p0;
       this.liveSendBulletCommentResultResponse = p1;
       this.bulletInfo = p2;
    }
    public static LiveSendBulletCommentResponse copy$default(LiveSendBulletCommentResponse p0,int p1,LiveSendBulletCommentResultResponse p2,LivePayBulletResponse p3,int p4,Object p5){
       LiveSendBulletCommentResponse result;
       LiveSendBulletCommentResponse liveSendBull;
       LiveSendBulletCommentResponse bulletInfo;
       if (p4 & 0x01) {
          result = p0.result;
       }
       if (p4 & 0x02) {
          liveSendBull = p0.liveSendBulletCommentResultResponse;
       }
       if (p4 & 0x04) {
          bulletInfo = p0.bulletInfo;
       }
       return p0.copy(result, liveSendBull, bulletInfo);
    }
    public final int component1(){
       return this.result;
    }
    public final LiveSendBulletCommentResultResponse component2(){
       return this.liveSendBulletCommentResultResponse;
    }
    public final LivePayBulletResponse component3(){
       return this.bulletInfo;
    }
    public final LiveSendBulletCommentResponse copy(int p0,LiveSendBulletCommentResultResponse p1,LivePayBulletResponse p2){
       if (PatchProxy.isSupport(LiveSendBulletCommentResponse.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveSendBulletCommentResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "liveSendBulletCommentResultResponse");
       a.p(p2, "bulletInfo");
       return new LiveSendBulletCommentResponse(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSendBulletCommentResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSendBulletCommentResponse && (this.result == p0.result && (a.g(this.liveSendBulletCommentResultResponse, p0.liveSendBulletCommentResultResponse) && a.g(this.bulletInfo, p0.bulletInfo))))) {
          return true;
       }
       return false;
    }
    public final LivePayBulletResponse getBulletInfo(){
       return this.bulletInfo;
    }
    public final LiveSendBulletCommentResultResponse getLiveSendBulletCommentResultResponse(){
       return this.liveSendBulletCommentResultResponse;
    }
    public final int getResult(){
       return this.result;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveSendBulletCommentResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.result * 31;
       LiveSendBulletCommentResponse tliveSendBul = this.liveSendBulletCommentResultResponse;
       int i1 = 0;
       int i2 = (tliveSendBul != null)? tliveSendBul.hashCode(): 0;
       i = (i + i2) * 31;
       tliveSendBul = this.bulletInfo;
       if (tliveSendBul != null) {
          i1 = tliveSendBul.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSendBulletCommentResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveSendBulletCommentResponse\(result="+this.result+", liveSendBulletCommentResultResponse="+this.liveSendBulletCommentResultResponse+", bulletInfo="+this.bulletInfo+"\)";
    }
}
