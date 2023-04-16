package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2$a$a;
import p16.c;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$b;
import java.lang.Runnable;

public final class ThumbnailViewV2$a$a implements c	// class@000dcc
{
    public final ThumbnailViewV2$a b;
    public final int c;

    public void ThumbnailViewV2$a$a(ThumbnailViewV2$a p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, ThumbnailViewV2$a$a.class, "1")) {
          return;
       }
       this.b.d.w.c(this.c);
       this.b.d.v.run();
       return;
    }
}
