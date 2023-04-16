package com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$d;
import t36.f$a;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import ooc.r0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class VideoEditPreviewV3Fragment$d implements f$a	// class@001584
{
    public final boolean a;
    public final VideoEditPreviewV3Fragment b;

    public void VideoEditPreviewV3Fragment$d(VideoEditPreviewV3Fragment p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoEditPreviewV3Fragment$d.class, "1")) {
       }else {
          p0.e(this.a);
       }
       return;
    }
}
