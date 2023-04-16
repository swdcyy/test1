package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$a;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import u80.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import o69.c;
import h69.g;
import q87.c;

public final class VideoTemplateProject$a implements o	// class@00197a
{
    public final VideoTemplateProject b;
    public final KSTemplateDetailInfo c;

    public void VideoTemplateProject$a(VideoTemplateProject p0,KSTemplateDetailInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$a.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "ksProject");
          if (a.g(this.b.L(), this.c.getId())) {
             Object[] objArray = new Object[0];
             g.D().w("VideoTemplateProject", "applyKSTemplate: setKuaiShanProject", objArray);
             this.b.Q0(p0);
          }
       }
       return p0;
    }
}
