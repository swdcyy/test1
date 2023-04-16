package com.kuaishou.live.lite.player.basic.lifecycle.LiveLitePlayerLifecycleOwner;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleRegistry;
import com.kuaishou.live.lite.player.basic.lifecycle.LiveLitePlayerLifecycleOwner$lifecycleEventObserver$1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class LiveLitePlayerLifecycleOwner implements LifecycleOwner	// class@000a69
{
    public final String b;
    public final LifecycleRegistry c;
    public final LifecycleEventObserver d;
    public final LifecycleOwner e;
    public final LifecycleOwner f;

    public void LiveLitePlayerLifecycleOwner(LifecycleOwner p0,LifecycleOwner p1){
       a.p(p0, "liveLiteFragmentLifecycleOwner");
       a.p(p1, "rootVCLifecycleOwner");
       super();
       this.e = p0;
       this.f = p1;
       this.b = "LiveLitePlayerLifeCycleOwner";
       this.c = new LifecycleRegistry(this);
       LiveLitePlayerLifecycleOwner$lifecycleEventObserver$1 olifecycleEv = new LiveLitePlayerLifecycleOwner$lifecycleEventObserver$1(this);
       this.d = olifecycleEv;
       p0.getLifecycle().addObserver(olifecycleEv);
       p1.getLifecycle().addObserver(olifecycleEv);
    }
    public Lifecycle getLifecycle(){
       return this.c;
    }
}
