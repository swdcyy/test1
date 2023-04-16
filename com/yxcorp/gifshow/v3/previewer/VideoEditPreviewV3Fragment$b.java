package com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$b;
import lq.l;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import lq.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq.i;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.v3.EditorActivity;
import lq.j;
import java.util.Collection;

public class VideoEditPreviewV3Fragment$b implements l	// class@001582
{
    public final VideoEditPreviewV3Fragment a;

    public void VideoEditPreviewV3Fragment$b(VideoEditPreviewV3Fragment p0){
       this.a = p0;
       super();
    }
    public void a(l$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoEditPreviewV3Fragment$b.class, "1")) {
          return;
       }
       if (i.m().G() instanceof EditorActivity) {
          this.a.Mh(1, p0);
       }
       return;
    }
    public void b(i p0,boolean p1){
       j.c(this, p0, p1);
    }
    public void c(){
       j.b(this);
    }
    public void d(i p0){
       j.d(this, p0);
    }
    public void e(i p0,Collection p1){
       j.e(this, p0, p1);
    }
}
