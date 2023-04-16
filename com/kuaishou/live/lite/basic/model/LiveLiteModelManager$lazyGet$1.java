package com.kuaishou.live.lite.basic.model.LiveLiteModelManager$lazyGet$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import java.lang.Class;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.c;
import lp3.i;
import kotlin.jvm.internal.a;
import c93.c;
import java.util.Objects;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class LiveLiteModelManager$lazyGet$1 extends Lambda implements a	// class@001e8e
{
    public final Class $clazz;
    public final LiveLiteModelManager this$0;

    public void LiveLiteModelManager$lazyGet$1(LiveLiteModelManager p0,Class p1){
       this.this$0 = p0;
       this.$clazz = p1;
       super(0);
    }
    public final Object invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLiteModelManager obj = PatchProxy.apply(objArray, this, LiveLiteModelManager$lazyGet$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = this.this$0.a;
          LiveLiteModelManager$lazyGet$1 t$clazz = this.$clazz;
          if (t$clazz == null) {
             throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<com.kuaishou.live.sm.ILiveService>");
          }
          c uoc = obj.a(t$clazz);
          a.o(uoc, "serviceManager.getServic¡­z as Class<ILiveService>\)");
          if (uoc instanceof c) {
             Objects.requireNonNull(uoc);
             Object obj1 = PatchProxy.apply(objArray, uoc, c.class, "1");
             uoc = (obj1 != patchProxyRe)? obj1: uoc.b.invoke();
          }else if(uoc != null){
             throw new NullPointerException("null cannot be cast to non-null type T");
          }
          return uoc;
       }catch(com.kuaishou.live.sm.LiveServiceInstantiateException e0){
          throw new IllegalArgumentException("unknown ["+this.$clazz+"], please check model config");
       }
    }
}
