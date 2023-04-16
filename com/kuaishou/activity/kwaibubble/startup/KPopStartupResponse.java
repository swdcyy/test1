package com.kuaishou.activity.kwaibubble.startup.KPopStartupResponse;
import java.io.Serializable;
import com.kuaishou.activity.kwaibubble.startup.KPopStartupResponse$a;
import nsd.u;
import com.kuaishou.activity.kwaibubble.startup.UserGrowthDialogBlockRules;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KPopStartupResponse implements Serializable	// class@000789
{
    public UserGrowthDialogBlockRules userGrowthDialogBlockRules;
    public static final KPopStartupResponse$a Companion;
    public static final long serialVersionUID;

    static {
       KPopStartupResponse.Companion = new KPopStartupResponse$a(null);
    }
    public void KPopStartupResponse(UserGrowthDialogBlockRules p0){
       super();
       this.userGrowthDialogBlockRules = p0;
    }
    public static KPopStartupResponse copy$default(KPopStartupResponse p0,UserGrowthDialogBlockRules p1,int p2,Object p3){
       KPopStartupResponse userGrowthDi;
       if (p2 & 0x01) {
          userGrowthDi = p0.userGrowthDialogBlockRules;
       }
       return p0.copy(userGrowthDi);
    }
    public final UserGrowthDialogBlockRules component1(){
       return this.userGrowthDialogBlockRules;
    }
    public final KPopStartupResponse copy(UserGrowthDialogBlockRules p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KPopStartupResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KPopStartupResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KPopStartupResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KPopStartupResponse && a.g(this.userGrowthDialogBlockRules, p0.userGrowthDialogBlockRules))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       KPopStartupResponse obj = PatchProxy.apply(null, this, KPopStartupResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userGrowthDialogBlockRules;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KPopStartupResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KPopStartupResponse\(userGrowthDialogBlockRules="+this.userGrowthDialogBlockRules+"\)";
    }
}
