package com.kuaishou.live.core.basic.dynamicdeploy.LiveDynamicDeployPluginLoader;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import d93.b;
import c93.b;
import d93.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import java.util.ArrayList;
import com.kuaishou.live.core.basic.dynamicdeploy.LiveDynamicDeployPluginLoader$1;
import msd.a;
import u63.a;

public final class LiveDynamicDeployPluginLoader	// class@000833
{
    public final a a;
    public final List b;
    public final Activity c;
    public final LifecycleOwner d;
    public final b e;
    public final b f;
    public final a g;

    public void LiveDynamicDeployPluginLoader(Activity p0,LifecycleOwner p1,b p2,b p3,a p4){
       a.p(p0, "activity");
       a.p(p1, "parentLifecycleOwner");
       a.p(p2, "serviceRegister");
       a.p(p3, "modelProvider");
       a.p(p4, "serviceProvider");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.a = new a();
       this.b = new ArrayList();
       a.a(p1, new LiveDynamicDeployPluginLoader$1(this));
    }
}
