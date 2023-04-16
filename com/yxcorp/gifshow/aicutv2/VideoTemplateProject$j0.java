package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$j0;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.Object;
import o69.g1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kwai.video.ksmemorykit.EditorSmartClipResult;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import o69.c;
import i69.d;
import j69.a;
import j69.c;
import brd.t;
import com.yxcorp.gifshow.aicutv2.q;

public final class VideoTemplateProject$j0 implements o	// class@00198b
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$j0(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$j0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "task");
          EditorSmartClipResult uEditorSmart = p0.d();
          a.m(uEditorSmart);
          EditorSdk2V2$VideoEditorProject project = uEditorSmart.getProject();
          a.o(project, "task.mSdkResult!!.project");
          this.b.w0(project);
          c uoc = d.d.a().c();
          uEditorSmart = p0.d();
          project = (uEditorSmart != null)? uEditorSmart.getProject(): null;
          ot = uoc.N2(project).map(new q(p0));
       }
       return ot;
    }
}
