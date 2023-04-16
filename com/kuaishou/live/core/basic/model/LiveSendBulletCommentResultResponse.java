package com.kuaishou.live.core.basic.model.LiveSendBulletCommentResultResponse;
import java.io.Serializable;
import com.kuaishou.live.core.basic.model.LiveSendBulletPopUpInfo;
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

public final class LiveSendBulletCommentResultResponse implements Serializable	// class@000882
{
    public final LiveSendBulletPopUpInfo popUp;
    public final int shotCode;

    public void LiveSendBulletCommentResultResponse(int p0,LiveSendBulletPopUpInfo p1){
       a.p(p1, "popUp");
       super();
       this.shotCode = p0;
       this.popUp = p1;
    }
    public static LiveSendBulletCommentResultResponse copy$default(LiveSendBulletCommentResultResponse p0,int p1,LiveSendBulletPopUpInfo p2,int p3,Object p4){
       LiveSendBulletCommentResultResponse shotCode;
       LiveSendBulletCommentResultResponse popUp;
       if (p3 & 0x01) {
          shotCode = p0.shotCode;
       }
       if (p3 & 0x02) {
          popUp = p0.popUp;
       }
       return p0.copy(shotCode, popUp);
    }
    public final int component1(){
       return this.shotCode;
    }
    public final LiveSendBulletPopUpInfo component2(){
       return this.popUp;
    }
    public final LiveSendBulletCommentResultResponse copy(int p0,LiveSendBulletPopUpInfo p1){
       if (PatchProxy.isSupport(LiveSendBulletCommentResultResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, LiveSendBulletCommentResultResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "popUp");
       return new LiveSendBulletCommentResultResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSendBulletCommentResultResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSendBulletCommentResultResponse && (this.shotCode == p0.shotCode && a.g(this.popUp, p0.popUp)))) {
          return true;
       }
       return false;
    }
    public final LiveSendBulletPopUpInfo getPopUp(){
       return this.popUp;
    }
    public final int getShotCode(){
       return this.shotCode;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveSendBulletCommentResultResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.shotCode * 31;
       LiveSendBulletCommentResultResponse tpopUp = this.popUp;
       int i1 = (tpopUp != null)? tpopUp.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSendBulletCommentResultResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveSendBulletCommentResultResponse\(shotCode="+this.shotCode+", popUp="+this.popUp+"\)";
    }
}
