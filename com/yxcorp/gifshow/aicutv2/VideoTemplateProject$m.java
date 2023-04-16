package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$m;
import erd.g;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.n2;
import java.lang.Object;
import o69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import s69.i;
import com.yxcorp.gifshow.aicutv2.h;
import k69.e$a;
import k69.e;

public final class VideoTemplateProject$m implements g	// class@001992
{
    public final VideoTemplateProject b;
    public final n2 c;

    public void VideoTemplateProject$m(VideoTemplateProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateProject$m.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          g.D().y("VideoTemplateProject", "start\(\) rxStartDownload percent = ["+p0.p()+']', objArray);
          this.b.z(new h(i.a.d(p0.p(), this.c.e(), 10)));
       }
       return;
    }
}
