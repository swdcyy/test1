package com.yxcorp.gifshow.camerasdk.j$a;
import com.kwai.camerasdk.preprocess.DataExtractProcessor;
import com.yxcorp.gifshow.camerasdk.j;
import com.kwai.camerasdk.models.DataExtractType;
import com.kwai.camerasdk.video.VideoFrame;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qi9.o1;

public class j$a extends DataExtractProcessor	// class@00101a
{
    public final j a;

    public void j$a(j p0,DataExtractType p1){
       this.a = p0;
       super(p1);
    }
    public void onReceiveRawData(VideoFrame p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          j v = this.a.V;
          if (v != null) {
             v.a(p0);
          }
       }
       return;
    }
}
