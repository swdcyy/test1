package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$s;
import erd.g;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.a;
import o69.c;
import com.yxcorp.gifshow.aicutv2.i;
import k69.e$a;
import k69.e;
import com.yxcorp.gifshow.aicutv2.j;

public final class VideoTemplateProject$s implements g	// class@001999
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$s(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateProject$s.class, "1")) {
       }else {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = p0;
          a.o(p0, "downloadResultCode");
          if (this.b.l0(p0)) {
             objectRef.element = AICutErrorCode.NOT_USE_PRESELECT;
          }
          this.b.z(i.a);
          this.b.z(new j(objectRef));
          objectRef = objectRef.element;
          a.o(objectRef, "uiErrorCode");
          this.b.d0(this.c, 7, objectRef);
       }
       return;
    }
}
