package com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig;
import java.util.Map;
import msd.l;
import lp3.c;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import lp3.e;
import java.util.Iterator;
import java.lang.Iterable;

public final class LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$1 extends Lambda implements a	// class@001e87
{
    public final LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1 this$0;

    public void LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$1(LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public final Object invoke(){
       LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$1 obj = PatchProxy.applyWithListener(null, this, LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       Object obj1 = obj.b.a.get(obj.a);
       if (obj1 == null) {
          obj = this.this$0;
          obj1 = obj.c.invoke(obj.b.b().invoke());
          if (obj1 instanceof c) {
             obj1.create(this.this$0.b.b().invoke().b);
          }
          Iterator iterator = this.this$0.d.iterator();
          while (iterator.hasNext()) {
             this.this$0.b.a.put(iterator.next(), obj1);
          }
       }
       PatchProxy.onMethodExit(LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$1.class, "1");
       return obj1;
    }
}
