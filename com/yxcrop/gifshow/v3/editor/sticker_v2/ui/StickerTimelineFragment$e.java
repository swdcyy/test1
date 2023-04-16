package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$e;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.e;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;

public final class StickerTimelineFragment$e implements o	// class@000a9e
{
    public static final StickerTimelineFragment$e b;

    static {
       StickerTimelineFragment$e.b = new StickerTimelineFragment$e();
    }
    public void StickerTimelineFragment$e(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, StickerTimelineFragment$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "stickerDetailInfo");
          p0 = (p0.isStickerNeedDecodeDimension() || p0.isStickerNeedLoadInfoJson())? t.fromCallable(new e(p0)).subscribeOn(d.c): t.just(p0);
          ot = p0;
       }
       return ot;
    }
}
