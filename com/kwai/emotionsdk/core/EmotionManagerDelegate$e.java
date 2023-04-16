package com.kwai.emotionsdk.core.EmotionManagerDelegate$e;
import erd.g;
import com.kwai.emotionsdk.core.EmotionManagerDelegate;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import ok5.a;
import kotlin.jvm.internal.a;

public final class EmotionManagerDelegate$e implements g	// class@000d89
{
    public final EmotionManagerDelegate b;

    public void EmotionManagerDelegate$e(EmotionManagerDelegate p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionManagerDelegate$e.class, "1")) {
       }else {
          a.a("EmotionManagerDelegate", "initEmotionDataInternal 9, ≥ı ºªØ ß∞‹ "+p0);
          this.b.b = false;
          this.b.c = false;
          a.o(p0, "it");
          this.b.g(p0);
       }
       return;
    }
}
