package com.kuaishou.activity.kwaibubble.startup.BlockRuleBlackConfig;
import java.io.Serializable;
import com.kuaishou.activity.kwaibubble.startup.BlockRuleBlackConfig$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BlockRuleBlackConfig implements Serializable	// class@000787
{
    public final List blackPageIds;
    public final List blackUids;
    public static final BlockRuleBlackConfig$a Companion;
    public static final long serialVersionUID;

    static {
       BlockRuleBlackConfig.Companion = new BlockRuleBlackConfig$a(null);
    }
    public void BlockRuleBlackConfig(List p0,List p1){
       super();
       this.blackUids = p0;
       this.blackPageIds = p1;
    }
    public static BlockRuleBlackConfig copy$default(BlockRuleBlackConfig p0,List p1,List p2,int p3,Object p4){
       BlockRuleBlackConfig blackUids;
       BlockRuleBlackConfig blackPageIds;
       if (p3 & 0x01) {
          blackUids = p0.blackUids;
       }
       if (p3 & 0x02) {
          blackPageIds = p0.blackPageIds;
       }
       return p0.copy(blackUids, blackPageIds);
    }
    public final List component1(){
       return this.blackUids;
    }
    public final List component2(){
       return this.blackPageIds;
    }
    public final BlockRuleBlackConfig copy(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BlockRuleBlackConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BlockRuleBlackConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlockRuleBlackConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BlockRuleBlackConfig && (a.g(this.blackUids, p0.blackUids) && a.g(this.blackPageIds, p0.blackPageIds)))) {
          return true;
       }
       return false;
    }
    public final List getBlackPageIds(){
       return this.blackPageIds;
    }
    public final List getBlackUids(){
       return this.blackUids;
    }
    public int hashCode(){
       BlockRuleBlackConfig obj = PatchProxy.apply(null, this, BlockRuleBlackConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.blackUids;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       BlockRuleBlackConfig tblackPageId = this.blackPageIds;
       if (tblackPageId != null) {
          i = tblackPageId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BlockRuleBlackConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BlockRuleBlackConfig\(blackUids="+this.blackUids+", blackPageIds="+this.blackPageIds+"\)";
    }
}
