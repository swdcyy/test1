package com.yxcorp.gifshow.aicutv2.b;
import k69.e$a;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$g;
import java.lang.Object;
import i69.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;

public final class b implements e$a	// class@0019a3
{
    public final VideoTemplateProject$g a;

    public void b(VideoTemplateProject$g p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          VideoTemplateProject$g c = this.a.c;
          a.o(c, "styleId");
          p0.e(c, AICutErrorCode.DOWNLOAD_STYLE_FAILED);
       }
       return;
    }
}
