package com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager$handlerMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.HashMap;
import java.lang.Integer;
import ka3.e;
import xp5.g;
import brd.t;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ja3.b;
import pg1.e;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import ka3.b;
import ka3.d;
import ka3.c;

public final class LiveLiteFollowGuideManager$handlerMap$2 extends Lambda implements a	// class@000866
{
    public final LiveLiteFollowGuideManager this$0;

    public void LiveLiteFollowGuideManager$handlerMap$2(LiveLiteFollowGuideManager p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLiteFollowGuideManager$handlerMap$2 obj = PatchProxy.apply(objArray, this, LiveLiteFollowGuideManager$handlerMap$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       HashMap hashMap = PatchProxy.apply(objArray, obj, LiveLiteFollowGuideManager.class, "3");
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          Integer integer = Integer.valueOf(14);
          String str = obj.g.d();
          String str1 = (str != null)? str: "";
          e uoe = new e(str1, obj.g.getLiveStreamId(), obj.f, obj.a, obj.h, obj.k, obj.b());
          hashMap.put(integer, v11);
          integer = Integer.valueOf(16);
          str = obj.g.d();
          str1 = (str != null)? str: "";
          b uob = new b(str1, obj.g.getLiveStreamId(), obj.f, obj.a, obj.h, obj.k, obj.b());
          hashMap.put(integer, v11);
          integer = Integer.valueOf(15);
          str = obj.g.d();
          str1 = (str != null)? str: "";
          d uod = new d(str1, obj.g.getLiveStreamId(), obj.f, obj.a, obj.h, obj.k, obj.b());
          hashMap.put(integer, v11);
          integer = Integer.valueOf(17);
          str = obj.g.d();
          str1 = (str != null)? str: "";
          c uoc = new c(str1, obj.g.getLiveStreamId(), obj.f, obj.a, obj.h, obj.k, obj.b());
          hashMap.put(integer, v11);
       }
       return hashMap;
    }
}
