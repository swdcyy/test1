package com.yxcorp.gifshow.aicutv2.a;
import k69.e$a;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$f;
import java.lang.Object;
import i69.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;

public final class a implements e$a	// class@0019a2
{
    public final VideoTemplateProject$f a;

    public void a(VideoTemplateProject$f p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          VideoTemplateProject$f d = this.a.d;
          a.o(d, "styleId");
          p0.e(d, AICutErrorCode.DOWNLOAD_MUSIC_FAILED);
       }
       return;
    }
}
