package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdProvideTreasureBoxParams;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdProvideTreasureBoxParams$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdProvideTreasureBoxParams$Param;
import msd.l;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.core.show.webview.jsresult.LiveJsProvideLocalCacheResult;

public final class LiveJsCmdProvideTreasureBoxParams extends AbstractLiveJsCommand	// class@000e21
{
    public l e;

    public void LiveJsCmdProvideTreasureBoxParams(){
       super();
    }
    public Class a(){
       return LiveJsCmdProvideTreasureBoxParams$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdProvideTreasureBoxParams.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof LiveJsCmdProvideTreasureBoxParams$a) {
          return m.g.c("invalid params");
       }
       LiveJsCmdProvideTreasureBoxParams te = this.e;
       if (te != null) {
          p0 = p0.param;
          p0 = (p0 != null)? p0.treasureBoxId: null;
          p0 = te.invoke(p0);
          if (p0 != null) {
          label_003a :
             return m.g.f(new LiveJsProvideLocalCacheResult(p0), true);
          }
       }
       p0 = new HashMap();
       goto label_003a ;
    }
}
