package com.kuaishou.live.lite.performance.ResourceWarmup$warmup$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec3.w;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.view.animation.Interpolator;
import android.view.animation.AnimationUtils;

public final class ResourceWarmup$warmup$2 extends Lambda implements a	// class@000a41
{
    public static final ResourceWarmup$warmup$2 INSTANCE;

    static {
       ResourceWarmup$warmup$2.INSTANCE = new ResourceWarmup$warmup$2();
    }
    public void ResourceWarmup$warmup$2(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ResourceWarmup$warmup$2.class, "1")) {
          return;
       }
       w a = w.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, w.class, "3")) {
          AnimationUtils.loadInterpolator(a.b(), 0x10c000d);
       }
       return;
    }
}
