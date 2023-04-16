package com.yxcorp.gifshow.growth.ai.KgiRedPacketTkModel;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketTkModel$a;
import nsd.u;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion$KgiRedPacketResponse;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KgiRedPacketTkModel implements Serializable	// class@0012f0
{
    public final Long kgiLaunchTime;
    public final KgiRedPacketServerResponse$Companion$KgiRedPacketResponse kgiResponse;
    public static final KgiRedPacketTkModel$a Companion;
    public static final long serialVersionUID;

    static {
       KgiRedPacketTkModel.Companion = new KgiRedPacketTkModel$a(null);
    }
    public void KgiRedPacketTkModel(KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p0,Long p1){
       super();
       this.kgiResponse = p0;
       this.kgiLaunchTime = p1;
    }
    public static KgiRedPacketTkModel copy$default(KgiRedPacketTkModel p0,KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p1,Long p2,int p3,Object p4){
       KgiRedPacketTkModel kgiResponse;
       KgiRedPacketTkModel kgiLaunchTim;
       if (p3 & 0x01) {
          kgiResponse = p0.kgiResponse;
       }
       if (p3 & 0x02) {
          kgiLaunchTim = p0.kgiLaunchTime;
       }
       return p0.copy(kgiResponse, kgiLaunchTim);
    }
    public final KgiRedPacketServerResponse$Companion$KgiRedPacketResponse component1(){
       return this.kgiResponse;
    }
    public final Long component2(){
       return this.kgiLaunchTime;
    }
    public final KgiRedPacketTkModel copy(KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p0,Long p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KgiRedPacketTkModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KgiRedPacketTkModel(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KgiRedPacketTkModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KgiRedPacketTkModel && (a.g(this.kgiResponse, p0.kgiResponse) && a.g(this.kgiLaunchTime, p0.kgiLaunchTime)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       KgiRedPacketTkModel obj = PatchProxy.apply(null, this, KgiRedPacketTkModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.kgiResponse;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KgiRedPacketTkModel tkgiLaunchTi = this.kgiLaunchTime;
       if (tkgiLaunchTi != null) {
          i = tkgiLaunchTi.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KgiRedPacketTkModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KgiRedPacketTkModel\(kgiResponse="+this.kgiResponse+", kgiLaunchTime="+this.kgiLaunchTime+"\)";
    }
}
