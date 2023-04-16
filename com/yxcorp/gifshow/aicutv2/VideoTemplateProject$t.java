package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$t;
import erd.g;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeoutException;
import com.yxcorp.gifshow.aicut.logic.AICutGeneratorException;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import kotlin.jvm.internal.a;
import h69.g;
import w46.b;
import com.yxcorp.gifshow.aicutv2.k;
import k69.e$a;
import k69.e;
import o69.c;
import com.yxcorp.gifshow.aicutv2.l;

public final class VideoTemplateProject$t implements g	// class@00199a
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$t(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateProject$t.class, "1")) {
       }else if(p0 instanceof TimeoutException){
          p0 = new AICutGeneratorException(AICutErrorCode.TIME_OUT);
       }else {
          a.o(p0, "it");
       }
       g.D().e("VideoTemplateProject", "start: failed ", p0);
       if (p0 instanceof AICutGeneratorException) {
          this.b.z(new k(p0));
          this.b.d0(this.c, 8, p0.getMErrorCode());
       }else {
          this.b.z(l.a);
          this.b.d0(this.c, 8, AICutErrorCode.NO_META_DATA);
          throw p0;
       }
       return;
    }
}
