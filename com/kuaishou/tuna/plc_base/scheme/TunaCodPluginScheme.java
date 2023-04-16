package com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme;
import agc.e;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme$a;
import nsd.u;
import java.lang.Object;
import android.net.Uri;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nmc.b;
import android.app.Activity;
import lnc.a1;
import com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
import java.util.List;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme$onAction$1;
import msd.a;
import c15.b;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme$onAction$2;
import nmc.b$a;

public final class TunaCodPluginScheme implements e	// class@001086
{
    public Uri a;
    public static final TunaCodPluginScheme$a b;

    static {
       TunaCodPluginScheme.b = new TunaCodPluginScheme$a(null);
    }
    public void TunaCodPluginScheme(){
       super();
    }
    public static final Uri e(TunaCodPluginScheme p0){
       p0 = p0.a;
       if (p0 == null) {
          a.S("mSourceUri");
       }
       return p0;
    }
    public String a(){
       return "codcontainer";
    }
    public boolean b(Uri p0,Map p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, TunaCodPluginScheme.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       a.p(p0, "sourceUri");
       this.a = p0;
       b uob = d.a(0x11c60373);
       boolean b = true;
       if (uob == null || uob.Ji() != b) {
          b = false;
       }
       return b;
    }
    public String c(){
       return "kwai";
    }
    public void d(Activity p0,Map p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TunaCodPluginScheme.class, "2")) {
          return;
       }
       if (!a1.i(p0)) {
          return;
       }
       b uob = d.a(0x11c60373);
       if (uob != null) {
          b.f(KsLogTunaCodDynamicLogTag.PLUGIN.appendTag("TunaCodPluginScheme"), new TunaCodPluginScheme$onAction$1(this));
          a.m(p0);
          uob.HX(p0, new TunaCodPluginScheme$onAction$2(this, p0, p2, uob));
       }
       return;
    }
    public String getPath(){
       return null;
    }
}
