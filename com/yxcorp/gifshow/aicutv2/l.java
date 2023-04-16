package com.yxcorp.gifshow.aicutv2.l;
import k69.e$a;
import java.lang.Object;
import i69.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;

public final class l implements e$a	// class@0019ad
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          p0.f(AICutErrorCode.NO_META_DATA);
       }
       return;
    }
}
