package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$d;
import x59.e$c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.y;

public final class StickerTimelineFragment$d implements e$c	// class@000a9d
{
    public final StickerTimelineFragment a;

    public void StickerTimelineFragment$d(StickerTimelineFragment p0){
       this.a = p0;
       super();
    }
    public final void b(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerTimelineFragment$d.class, "1")) {
          return;
       }
       a.m(p0);
       this.a.E.onNext(p0);
       return;
    }
}
