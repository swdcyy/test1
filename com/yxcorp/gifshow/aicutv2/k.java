package com.yxcorp.gifshow.aicutv2.k;
import k69.e$a;
import java.lang.Throwable;
import java.lang.Object;
import i69.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.aicut.logic.AICutGeneratorException;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;

public final class k implements e$a	// class@0019ac
{
    public final Throwable a;

    public void k(Throwable p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          p0.f(this.a.getMErrorCode());
       }
       return;
    }
}
