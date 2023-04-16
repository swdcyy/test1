package com.kwai.component.taskdispatcher.logger.SlideVsyncScatterTracker$rationRandom$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Random;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlideVsyncScatterTracker$rationRandom$2 extends Lambda implements a	// class@000b8e
{
    public static final SlideVsyncScatterTracker$rationRandom$2 INSTANCE;

    static {
       SlideVsyncScatterTracker$rationRandom$2.INSTANCE = new SlideVsyncScatterTracker$rationRandom$2();
    }
    public void SlideVsyncScatterTracker$rationRandom$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Random invoke(){
       Object obj = PatchProxy.apply(null, this, SlideVsyncScatterTracker$rationRandom$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Random();
    }
}
