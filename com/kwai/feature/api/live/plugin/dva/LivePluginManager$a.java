package com.kwai.feature.api.live.plugin.dva.LivePluginManager$a;
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
import e17.i;
import java.lang.RuntimeException;

public final class LivePluginManager$a implements o	// class@000fef
{
    public final String b;
    public final long c;
    public final boolean d;
    public final Class e;

    public void LivePluginManager$a(String p0,long p1,boolean p2,Class p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       b uob = PatchProxy.applyOneRefs(p0, this, LivePluginManager$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          if (p0.booleanValue()) {
             LivePluginManager.d.i(this.b, (System.currentTimeMillis() - this.c), this.d, true);
             uob = LivePluginManager.b(this.e);
          }else {
             i.a(R.style.arg_RES_7f11066a, 0x7f101e5e);
             LivePluginManager.d.i(this.b, (System.currentTimeMillis() - this.c), this.d, false);
             throw new RuntimeException("plugin load error");
          }
       }
       return uob;
    }
}
