package com.kuaishou.live.external.subscribe.LiveHalfSubscribeUriRouterHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import r33.d;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import brd.a0;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import t45.d;
import brd.z;
import z33.a;
import z33.b;
import erd.g;
import crd.b;

public class LiveHalfSubscribeUriRouterHandler extends AnnotationUriHandler	// class@001bbc
{

    public void LiveHalfSubscribeUriRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHalfSubscribeUriRouterHandler.class, "1")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       LivePluginManager.d(d.class, LoadPolicy.DIALOG, uActivity).G(d.a).R(new a(uActivity, p0, p1), new b(p1));
       return;
    }
}