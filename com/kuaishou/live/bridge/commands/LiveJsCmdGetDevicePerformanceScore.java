package com.kuaishou.live.bridge.commands.LiveJsCmdGetDevicePerformanceScore;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetDevicePerformanceScore$onExecute$1;
import csd.b;
import com.kuaishou.live.basic.ability.LiveModuleAbility;
import qrd.j0;
import java.lang.IllegalStateException;
import lp3.c;
import com.kuaishou.live.basic.ability.LiveAppAbility;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import com.kuaishou.live.basic.ability.LiveAppAbility$PerformanceScore;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import o63.m;
import o63.m$a;

public final class LiveJsCmdGetDevicePerformanceScore extends AbstractLiveJsCommand	// class@000df0
{

    public void LiveJsCmdGetDevicePerformanceScore(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       LiveJsCmdGetDevicePerformanceScore$onExecute$1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdGetDevicePerformanceScore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 instanceof LiveJsCmdGetDevicePerformanceScore$onExecute$1) {
          obj = p2;
          LiveJsCmdGetDevicePerformanceScore$onExecute$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0029 :
             LiveJsCmdGetDevicePerformanceScore$onExecute$1 result = obj.result;
             Object obj1 = b.h();
             LiveJsCmdGetDevicePerformanceScore$onExecute$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                LiveModuleAbility liveModuleAb = this.i(LiveModuleAbility.class);
                if (liveModuleAb != null) {
                   obj.L$0 = this;
                   obj.L$1 = p0;
                   obj.L$2 = p1;
                   obj.L$3 = liveModuleAb;
                   obj.label = 1;
                   result = liveModuleAb.getAbility(LiveAppAbility.class).getPerformanceScore(obj);
                   if (result == obj1) {
                      return obj1;
                   }
                }else {
                   return m.g.c("[onExecute]moduleAbility is null");
                }
             }
             b.Z(LiveLogTag.MAGIC_FACE, "[LiveJsCmdGetDevicePerformanceScore]performanceScore:"+result);
             return m$a.g(m.g, result, false, 2, null);
          }
       }
       obj = new LiveJsCmdGetDevicePerformanceScore$onExecute$1(this, p2);
       goto label_0029 ;
    }
}
