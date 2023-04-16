package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;

public final class ThumbnailView$a implements Runnable	// class@000dc9
{
    public final ThumbnailView b;

    public void ThumbnailView$a(ThumbnailView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ThumbnailView$a.class, "1")) {
          return;
       }
       this.b.invalidate();
       return;
    }
}
