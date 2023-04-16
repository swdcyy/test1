package com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$addConfigItem$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import lp3.h;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lp3.c;

public final class LiveLiteModelConfig$addConfigItem$1 extends Lambda implements l	// class@001e84
{
    public final h $configItem;

    public void LiveLiteModelConfig$addConfigItem$1(h p0){
       this.$configItem = p0;
       super(1);
    }
    public final Object invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelConfig$addConfigItem$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       c uoc = this.$configItem.a();
       a.m(uoc);
       return uoc;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
