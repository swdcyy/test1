package com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveUserRightsInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveUserRightsInfo	// class@001159
{
    public boolean enableJudgeRedDot;
    public String userRightsId;
    public String userRightsText;

    public void LiveUserRightsInfo(){
       super();
       this.userRightsId = null;
       this.userRightsText = null;
       this.enableJudgeRedDot = false;
    }
    public final String a(){
       return this.userRightsId;
    }
    public final String b(){
       return this.userRightsText;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveUserRightsInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveUserRightsInfo && (a.g(this.userRightsId, p0.userRightsId) && (a.g(this.userRightsText, p0.userRightsText) && this.enableJudgeRedDot == p0.enableJudgeRedDot)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveUserRightsInfo obj = PatchProxy.apply(null, this, LiveUserRightsInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userRightsId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveUserRightsInfo tuserRightsT = this.userRightsText;
       if (tuserRightsT != null) {
          i = tuserRightsT.hashCode();
       }
       i1 = (i1 + i) * 31;
       LiveUserRightsInfo tenableJudge = this.enableJudgeRedDot;
       if (tenableJudge != null) {
          tenableJudge = 1;
       }
       return (i1 + tenableJudge);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveUserRightsInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveUserRightsInfo\(userRightsId="+this.userRightsId+", userRightsText="+this.userRightsText+", enableJudgeRedDot="+this.enableJudgeRedDot+"\)";
    }
}
