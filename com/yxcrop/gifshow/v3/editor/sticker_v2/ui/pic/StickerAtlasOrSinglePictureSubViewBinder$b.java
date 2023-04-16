package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$b;
import qsc.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import smd.d;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class StickerAtlasOrSinglePictureSubViewBinder$b implements g	// class@000ab2
{
    public final StickerAtlasOrSinglePictureSubViewBinder a;

    public void StickerAtlasOrSinglePictureSubViewBinder$b(StickerAtlasOrSinglePictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, StickerAtlasOrSinglePictureSubViewBinder$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.a.I(), "mPictureTemplateActionListener onRelayReset: ", objArray);
       this.a.G().t0(new EditDraftAction(0, 1, null));
       return;
    }
}
