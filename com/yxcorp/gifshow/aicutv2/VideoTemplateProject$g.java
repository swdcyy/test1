package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$g;
import erd.g;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import h69.g;
import java.lang.StringBuilder;
import w46.b;
import com.yxcorp.gifshow.aicutv2.b;
import k69.e$a;
import k69.e;

public final class VideoTemplateProject$g implements g	// class@001986
{
    public final VideoTemplateProject b;
    public final String c;

    public void VideoTemplateProject$g(VideoTemplateProject p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateProject$g.class, "1")) {
       }else {
          g.D().e("VideoTemplateProject", "changeStyle: failed styleId="+this.c, p0);
          this.b.z(new b(this));
       }
       return;
    }
}
