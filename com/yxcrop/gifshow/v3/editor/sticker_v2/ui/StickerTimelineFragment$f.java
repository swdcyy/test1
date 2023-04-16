package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$f;
import erd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import itc.x2;

public final class StickerTimelineFragment$f implements g	// class@000a9f
{
    public final StickerTimelineFragment b;

    public void StickerTimelineFragment$f(StickerTimelineFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerTimelineFragment$f.class, "1")) {
       }else {
          a.p(p0, "stickerDetailInfo");
          StickerTimelineFragment g = this.b.G;
          if (g != null) {
             g.onNext(p0);
          }
          h1.l(p0);
          StickerDetailInfo mStickerId = p0.mStickerId;
          a.o(mStickerId, "stickerDetailInfo.mStickerId");
          StickerRanker.i.i(mStickerId);
          x2.g(p0.mStickerId, p0.mGroupId);
       }
       return;
    }
}
