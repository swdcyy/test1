package com.kuaishou.live.bridge.rn.LiveRnBridge$a;
import qs5.e;
import com.kuaishou.live.bridge.rn.LiveRnBridge;
import java.lang.String;
import com.kuaishou.live.external.invoke.krn.LiveRnCommandParams;
import o63.a;
import o63.j;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q33.a;
import tkd.b;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.kuaishou.live.external.invoke.krn.LiveJsContainerParams;
import o63.j$a;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.bridge.rn.LiveRnBridge$a$a;
import o63.p;
import o63.l;

public class LiveRnBridge$a extends e	// class@000e2c
{
    public final LiveRnCommandParams d;
    public final a e;
    public final j f;
    public final boolean g;
    public final Promise h;
    public final LiveRnBridge i;

    public void LiveRnBridge$a(LiveRnBridge p0,String p1,LiveRnCommandParams p2,a p3,j p4,boolean p5,Promise p6){
       this.i = p0;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRnBridge$a.class, "1")) {
          return;
       }
       b.Z(LiveJsBridgeLogTag.RN, "do execute command: "+this.d.getCommand()+", for: "+this.i);
       this.f.c(this.d, new LiveRnBridge$a$a(this, this.g, false), LivePluginManager.b(a.class).fT(this.i.getCurrentActivity(), this.d.getContainerParams(), this.e));
       return;
    }
}
