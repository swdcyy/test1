package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;

public final class ThumbnailViewV2$b implements Runnable	// class@000dce
{
    public final ThumbnailViewV2 b;

    public void ThumbnailViewV2$b(ThumbnailViewV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ThumbnailViewV2$b.class, "1")) {
          return;
       }
       this.b.invalidate();
       return;
    }
}
