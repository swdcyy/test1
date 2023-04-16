package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$k;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import s69.i;

public final class VideoTemplateProject$k implements Callable	// class@00198e
{
    public final KwaiAICutStyle b;

    public void VideoTemplateProject$k(KwaiAICutStyle p0){
       this.b = p0;
       super();
    }
    public Object call(){
       VideoTemplateProject$k ok = PatchProxy.apply(null, this, VideoTemplateProject$k.class, "1");
       if (ok != PatchProxyResult.class) {
       }else {
          i.a();
          ok = this.b;
       }
       return ok;
    }
}
