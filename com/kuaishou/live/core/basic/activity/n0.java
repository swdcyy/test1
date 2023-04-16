package com.kuaishou.live.core.basic.activity.n0;
import erd.c;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Object;
import android.app.Activity;
import erd.g;
import com.kuaishou.live.core.basic.activity.LiveShellActivity;
import os5.l;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import java.lang.Class;
import brd.a0;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import m02.t1;
import m02.u1;
import crd.b;
import java.lang.Boolean;

public final class n0 implements c	// class@001847
{
    public final String a;
    public final Runnable b;

    public void n0(String p0,Runnable p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(Object p0,Object p1){
       n0 ta = this.a;
       LivePluginManager.e(l.class, LoadPolicy.DIALOG, p0, ta).R(new t1(this.b, p1), new u1(ta, p1));
       return Boolean.TRUE;
    }
}
