package com.kuaishou.live.bridge.commands.LiveJsCmdGetInteractMagicFaceInfo;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetInteractMagicFaceInfo$onExecute$1;
import csd.b;
import qz2.a;
import qrd.j0;
import java.lang.IllegalStateException;
import lp3.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o63.m;
import o63.m$a;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetInteractMagicFaceInfo$a;

public final class LiveJsCmdGetInteractMagicFaceInfo extends AbstractLiveJsCommand	// class@000df3
{

    public void LiveJsCmdGetInteractMagicFaceInfo(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       LiveJsCmdGetInteractMagicFaceInfo$onExecute$1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdGetInteractMagicFaceInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 instanceof LiveJsCmdGetInteractMagicFaceInfo$onExecute$1) {
          obj = p2;
          LiveJsCmdGetInteractMagicFaceInfo$onExecute$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0029 :
             LiveJsCmdGetInteractMagicFaceInfo$onExecute$1 result = obj.result;
             Object obj1 = b.h();
             LiveJsCmdGetInteractMagicFaceInfo$onExecute$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                a uoa1 = this.i(a.class);
                if (uoa1 == null) {
                   b.Z(LiveLogTag.MAGIC_FACE, "[LiveJsCmdGetInteractMagicFaceInfo]LiveInteractMagicFaceService is null");
                   return m.g.c("[LiveJsCmdGetInteractMagicFaceInfo]LiveInteractMagicFaceService is null");
                }else {
                   obj.L$0 = this;
                   obj.L$1 = p0;
                   obj.L$2 = p1;
                   obj.L$3 = uoa1;
                   obj.label = 1;
                   result = uoa1.hn(obj);
                   if (result == obj1) {
                      return obj1;
                   }
                }
             }
             int i1 = result.intValue();
             b.Z(LiveLogTag.MAGIC_FACE, "[LiveJsCmdGetInteractMagicFaceInfo]mainEffectVersion:"+i1);
             LiveJsCmdGetInteractMagicFaceInfo$a uoa = new LiveJsCmdGetInteractMagicFaceInfo$a(i1);
             return m$a.g(m.g, uoa, false, 2, null);
          }
       }
       obj = new LiveJsCmdGetInteractMagicFaceInfo$onExecute$1(this, p2);
       goto label_0029 ;
    }
}
