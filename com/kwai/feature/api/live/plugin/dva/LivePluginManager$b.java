package com.kwai.feature.api.live.plugin.dva.LivePluginManager$b;
import erd.o;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import java.lang.System;
import java.lang.RuntimeException;

public final class LivePluginManager$b implements o	// class@000ff0
{
    public final String b;
    public final long c;
    public final boolean d;
    public final Class e;

    public void LivePluginManager$b(String p0,long p1,boolean p2,Class p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       b uob = PatchProxy.applyOneRefs(p0, this, LivePluginManager$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          if (p0.booleanValue()) {
             LivePluginManager.d.i(this.b, (System.currentTimeMillis() - this.c), this.d, true);
             uob = LivePluginManager.b(this.e);
          }else {
             LivePluginManager.d.i(this.b, (System.currentTimeMillis() - this.c), this.d, false);
             throw new RuntimeException("plugin load error");
          }
       }
       return uob;
    }
}
