package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$b;
import x59.e$d;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.a;
import kotlin.jvm.internal.a;

public final class StickerTimelineFragment$b implements e$d	// class@000a9b
{
    public final StickerTimelineFragment a;

    public void StickerTimelineFragment$b(StickerTimelineFragment p0){
       this.a = p0;
       super();
    }
    public StickerDetailInfo a(){
       Object obj = PatchProxy.apply(null, this, StickerTimelineFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.J.i();
    }
    public void b(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerTimelineFragment$b.class, "1")) {
          return;
       }
       a.p(p0, "sticker");
       this.a.J.onNext(p0);
       return;
    }
}
