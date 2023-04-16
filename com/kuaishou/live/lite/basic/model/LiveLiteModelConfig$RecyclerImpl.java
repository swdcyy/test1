package com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$RecyclerImpl;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$b;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$RecyclerImpl$releaseAction$1;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveLiteModelConfig$RecyclerImpl implements LiveLiteModelConfig$b	// class@001e82
{
    public l a;
    public final Set b;
    public final LiveLiteModelConfig c;

    public void LiveLiteModelConfig$RecyclerImpl(LiveLiteModelConfig p0,Set p1){
       a.p(p1, "interfaceSet");
       this.c = p0;
       super();
       this.b = p1;
       this.a = LiveLiteModelConfig$RecyclerImpl$releaseAction$1.INSTANCE;
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelConfig$RecyclerImpl.class, "1")) {
          return;
       }
       a.p(p0, "releaseAction");
       this.a = p0;
       return;
    }
}
