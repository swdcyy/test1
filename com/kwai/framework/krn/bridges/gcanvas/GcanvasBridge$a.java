package com.kwai.framework.krn.bridges.gcanvas.GcanvasBridge$a;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.framework.krn.bridges.gcanvas.GcanvasBridge;
import com.kwai.plugin.dva.work.c;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import js6.b;
import java.lang.StackTraceElement;
import q87.c;
import sj7.d;
import ekd.v0;
import java.lang.StringBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class GcanvasBridge$a implements c$c	// class@0015b0
{
    public final c a;
    public final Promise b;
    public final GcanvasBridge c;

    public void GcanvasBridge$a(GcanvasBridge p0,c p1,Promise p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcanvasBridge$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.c.t("GCanvasBridge", p0.getStackTrace().toString(), objArray);
       this.a.n(this);
       this.b.reject("1", p0.getLocalizedMessage());
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcanvasBridge$a.class, "1")) {
          return;
       }
       "freetype".b("freetype");
       "gcanvas".b("gcanvas");
       Object[] objArray = new Object[0];
       b.c.w("GCanvasBridge", "installPlugin: onSucceed "+p0, objArray);
       p0 = Arguments.createMap();
       p0.putBoolean("loadResult", true);
       this.a.n(this);
       this.b.resolve(p0);
       return;
    }
}
