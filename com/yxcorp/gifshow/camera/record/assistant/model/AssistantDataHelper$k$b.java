package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$k$b;
import erd.g;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$k;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import zr4.b;
import brd.g;

public final class AssistantDataHelper$k$b implements g	// class@001d03
{
    public final AssistantDataHelper$k b;
    public final v c;

    public void AssistantDataHelper$k$b(AssistantDataHelper$k p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantDataHelper$k$b.class, "1")) {
       }else {
          p0 = this.c;
          a.o(p0, "emitter");
          if (!p0.isDisposed()) {
             this.b.b.H();
          }
          b[] uobArray = new b[0];
          this.c.onNext(uobArray);
       }
       return;
    }
}
