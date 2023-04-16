package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdProvideTreasureBoxParams$Param;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdProvideTreasureBoxParams$Param	// class@000e1f
{
    public final String treasureBoxId;

    public void LiveJsCmdProvideTreasureBoxParams$Param(){
       super(null);
    }
    public void LiveJsCmdProvideTreasureBoxParams$Param(String p0){
       super();
       this.treasureBoxId = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdProvideTreasureBoxParams$Param.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdProvideTreasureBoxParams$Param && a.g(this.treasureBoxId, p0.treasureBoxId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdProvideTreasureBoxParams$Param obj = PatchProxy.apply(null, this, LiveJsCmdProvideTreasureBoxParams$Param.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.treasureBoxId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdProvideTreasureBoxParams$Param.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Param\(treasureBoxId="+this.treasureBoxId+"\)";
    }
}
