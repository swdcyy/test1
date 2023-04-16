package com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$RecyclerImpl;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import lp3.c;
import kotlin.jvm.internal.a;
import msd.l;

public final class LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$2 extends Lambda implements a	// class@001e88
{
    public final LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1 this$0;

    public void LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$2(LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$2.class, "1")) {
          return;
       }
       LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1 e = this.this$0.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(objArray, e, LiveLiteModelConfig$RecyclerImpl.class, "2")) {
          LiveLiteModelConfig$RecyclerImpl c = e.c;
          LiveLiteModelConfig$RecyclerImpl b = e.b;
          LiveLiteModelConfig$RecyclerImpl a = e.a;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidTwoRefs(b, a, c, LiveLiteModelConfig.class, "6")) {
             Iterator iterator = b.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Object obj = iterator.next();
                   if (c.a.containsKey(obj)) {
                      objArray = obj;
                   }
                }
                if (objArray != null) {
                   Object obj1 = c.a.get(objArray);
                   if (obj1 instanceof c && a.g(a, LiveLiteModelConfig.e)) {
                      obj1.destroy();
                   }else {
                      a.invoke(obj1);
                   }
                   Iterator iterator1 = b.iterator();
                   while (iterator1.hasNext()) {
                      c.a.remove(iterator1.next());
                   }
                }
             }
          }
       }
       PatchProxy.onMethodExit(LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1$2.class, "1");
       return;
    }
}
