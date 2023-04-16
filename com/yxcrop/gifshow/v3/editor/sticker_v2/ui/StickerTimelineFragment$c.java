package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$c;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.d$a;

public final class StickerTimelineFragment$c implements View$OnClickListener	// class@000a9c
{
    public final StickerTimelineFragment b;

    public void StickerTimelineFragment$c(StickerTimelineFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerTimelineFragment$c.class, "1")) {
          return;
       }
       StickerTimelineFragment h = this.b.H;
       if (h != null) {
          h.a();
       }
       return;
    }
}
