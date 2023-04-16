package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$f;
import erd.g;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.String;
import java.lang.Object;
import o69.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import h69.g;
import q87.c;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import o69.c;
import o69.o2;
import kotlin.jvm.internal.a;
import i69.a;
import o69.u0;
import com.yxcorp.gifshow.aicutv2.a;
import k69.e$a;
import k69.e;
import com.yxcorp.gifshow.aicut.logic.AICutGeneratorException;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;

public final class VideoTemplateProject$f implements g	// class@001984
{
    public final VideoTemplateProject b;
    public final Ref$ObjectRef c;
    public final String d;

    public void VideoTemplateProject$f(VideoTemplateProject p0,Ref$ObjectRef p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateProject$f.class, "1")) {
       }else if(!p0.c()){
          Object[] objArray = new Object[0];
          g.D().w("VideoTemplateProject", "changeStyle doOnNext taskFinish", objArray);
          this.b.o0(p0.a());
          this.c.element.e(this.b.K());
          if (!p0.o()) {
             if (p0.k()) {
                a.o(p0, "task");
                this.b.G(p0);
                this.b.o0(p0.a());
                this.c.element.e(this.b.K());
                if (this.b.K() == null && (a.g(p0.d().a(), u0.a()) ^ 0x01)) {
                   this.b.z(new a(this));
                }
             }
          }else {
             throw new AICutGeneratorException(AICutErrorCode.DOWNLOAD_STYLE_FAILED);
          }
       }
       return;
    }
}
