package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$g;
import erd.g;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.enhancefilter.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.Integer;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Long;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import sqc.c;

public final class EnhanceFilterViewModel$g implements g	// class@000f7c
{
    public final EnhanceFilterViewModel b;
    public final boolean c;

    public void EnhanceFilterViewModel$g(EnhanceFilterViewModel p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EnhanceFilterViewModel$g.class, "1")) {
       }else {
          long l = System.currentTimeMillis();
          Long longx = this.b.d.get(Integer.valueOf(p0.a()));
          if (longx == null) {
             longx = Long.valueOf(System.currentTimeMillis());
          }
          a.o(longx, "mDebugProcessingTaskIdTi¡­ystem.currentTimeMillis\(\)");
          Object[] objArray = new Object[0];
          a.D().w("EnhanceFilterViewModel", "startTaskInner end useFace:"+this.c+", singleTaskIndex:"+p0.a()+", "+"costTime:"+(l - longx.longValue()), objArray);
          a.o(p0, "singleTask");
          this.b.l.n(p0);
       }
       return;
    }
}
