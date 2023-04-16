package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$r$a;
import k69.e$a;
import java.lang.Object;
import i69.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;

public final class VideoTemplateProject$r$a implements e$a	// class@001997
{
    public static final VideoTemplateProject$r$a a;

    static {
       VideoTemplateProject$r$a.a = new VideoTemplateProject$r$a();
    }
    public void VideoTemplateProject$r$a(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateProject$r$a.class, "1")) {
       }else {
          p0.f(AICutErrorCode.CANCEL_BY_USER);
       }
       return;
    }
}
