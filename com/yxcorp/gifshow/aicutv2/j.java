package com.yxcorp.gifshow.aicutv2.j;
import k69.e$a;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import i69.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import kotlin.jvm.internal.a;

public final class j implements e$a	// class@0019ab
{
    public final Ref$ObjectRef a;

    public void j(Ref$ObjectRef p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          Ref$ObjectRef element = this.a.element;
          a.o(element, "uiErrorCode");
          p0.f(element);
       }
       return;
    }
}
