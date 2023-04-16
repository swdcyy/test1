package com.kuaishou.live.core.show.hotspot.LiveHotSpotRouterHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import xh7.a;
import java.lang.Integer;
import android.content.Context;
import android.app.Activity;
import com.kwai.framework.activitycontext.ActivityContext;
import tkd.b;
import tkd.d;
import os5.l;

public class LiveHotSpotRouterHandler extends AnnotationUriHandler	// class@000beb
{

    public void LiveHotSpotRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHotSpotRouterHandler.class, "1")) {
          return;
       }
       String queryParamet = p0.g().getQueryParameter("hotspotId");
       int i = Integer.parseInt(p0.g().getQueryParameter("entrySrc"));
       Activity uActivity = (p0.b() instanceof Activity)? p0.b(): ActivityContext.g().e();
       if (queryParamet != null) {
          d.a(-1492894991).qP(uActivity, queryParamet, i);
       }
       return;
    }
}
