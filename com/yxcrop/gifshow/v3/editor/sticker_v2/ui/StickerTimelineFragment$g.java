package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$g;
import erd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;

public final class StickerTimelineFragment$g implements g	// class@000aa0
{
    public final StickerTimelineFragment b;

    public void StickerTimelineFragment$g(StickerTimelineFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerTimelineFragment$g.class, "1")) {
       }else {
          StickerTimelineFragment d = this.b.D;
          if (d != null) {
             d.dispose();
             this.b.D = null;
          }
          this.b.sh();
          a.m(p0);
          PostUtils.D(this.b.w, "registerStickerClickSubject: ", p0);
       }
       return;
    }
}
