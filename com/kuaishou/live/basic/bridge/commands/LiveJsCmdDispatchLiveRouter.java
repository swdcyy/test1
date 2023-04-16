package com.kuaishou.live.basic.bridge.commands.LiveJsCmdDispatchLiveRouter;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.basic.bridge.commands.LiveJsCmdDispatchLiveRouter$Request;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.kuaishou.live.basic.bridge.commands.LiveJsCmdDispatchLiveRouter$Request$Param;
import java.lang.CharSequence;
import lp3.e;
import s51.c;
import lp3.c;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.app.Activity;
import o63.b;
import android.content.Context;
import java.lang.Boolean;
import dsd.a;

public final class LiveJsCmdDispatchLiveRouter extends AbstractLiveJsCommand	// class@000cb2
{

    public void LiveJsCmdDispatchLiveRouter(){
       super();
    }
    public Class a(){
       return LiveJsCmdDispatchLiveRouter$Request.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdDispatchLiveRouter.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (!p0 instanceof LiveJsCmdDispatchLiveRouter$Request) {
          return m.g.c("invalid params");
       }
       if (p0.a() != null) {
          String str = p0.a().a();
          String str1 = null;
          e uoe = (str == null || !str.length())? 1: null;
          if (!uoe) {
             uoe = this.h().a(c.class);
             a.o(uoe, "serviceManager.getServic¡­ManagerProxy::class.java\)");
             if (!uoe.P0(p0.a().a())) {
                return m.g.c("url is not supported: "+p0.a().a());
             }else if(uoe.r4(p0.a().a(), b.a(this.h())) && (a.g(p0.a().keepDisplayWebView, a.a(true)) ^ true)){
                p1.L();
             }
             return m$a.g(m.g, null, str1, 3, null);
          }
       }
       return m.g.c("param is required");
    }
}
