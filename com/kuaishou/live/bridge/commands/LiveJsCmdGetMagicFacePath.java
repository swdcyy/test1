package com.kuaishou.live.bridge.commands.LiveJsCmdGetMagicFacePath;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetMagicFacePath$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetMagicFacePath$onExecute$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import o63.m;
import o63.m$a;
import com.kuaishou.live.basic.ability.LiveModuleAbility;
import lp3.c;
import com.kuaishou.live.basic.ability.LiveResourceAbility;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import com.kuaishou.live.basic.ability.LiveResourceAbility$GetMagicFacePathParams;
import com.kuaishou.live.basic.ability.LiveResourceAbility$GetMagicFacePathResult;
import com.kuaishou.live.bridge.commands.LiveJsCmdGetMagicFacePath$b;

public final class LiveJsCmdGetMagicFacePath extends AbstractLiveJsCommand	// class@000df7
{

    public void LiveJsCmdGetMagicFacePath(){
       super();
    }
    public Class a(){
       return LiveJsCmdGetMagicFacePath$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       boolean b;
       LiveJsCmdGetMagicFacePath$onExecute$1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdGetMagicFacePath.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 instanceof LiveJsCmdGetMagicFacePath$onExecute$1) {
          obj = p2;
          LiveJsCmdGetMagicFacePath$onExecute$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0029 :
             LiveJsCmdGetMagicFacePath$onExecute$1 result = obj.result;
             Object obj1 = b.h();
             LiveJsCmdGetMagicFacePath$onExecute$1 label1 = obj.label;
             b = true;
             if (label1 != null) {
                if (label1 == b) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                if (!p0 instanceof LiveJsCmdGetMagicFacePath$a) {
                   return m.g.c("invalid request params");
                }else {
                   LiveJsCmdGetMagicFacePath$a uoa = p0;
                   obj.L$0 = this;
                   obj.L$1 = p0;
                   obj.L$2 = p1;
                   obj.label = b;
                   result = this.g(LiveModuleAbility.class).getAbility(LiveResourceAbility.class).getMagicFacePath(new LiveResourceAbility$GetMagicFacePathParams(uoa.effectKey, uoa.magicFaceId), obj);
                   if (result == obj1) {
                      return obj1;
                   }
                }
             }
             p0 = m.g;
             if (result.getCode() != b) {
                b = false;
             }
             return m$a.g(p0, new LiveJsCmdGetMagicFacePath$b(b, result.getPath()), false, 2, null);
          }
       }
       obj = new LiveJsCmdGetMagicFacePath$onExecute$1(this, p2);
       goto label_0029 ;
    }
}
