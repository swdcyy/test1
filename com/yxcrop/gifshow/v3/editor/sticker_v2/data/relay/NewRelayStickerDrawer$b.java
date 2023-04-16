package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$b;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import qmd.i;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;

public final class NewRelayStickerDrawer$b implements Runnable	// class@000a76
{
    public final NewRelayStickerDrawer b;

    public void NewRelayStickerDrawer$b(NewRelayStickerDrawer p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer$b.class, "1")) {
          return;
       }
       NewRelayStickerDrawer$b tb = this.b;
       NewRelayStickerDrawer mRelaySticke = tb.mRelayStickerViewHelper;
       tb.mBaseDrawerData.M((float)mRelaySticke.g(mRelaySticke.d(), false));
       this.b.update();
       this.b.getContainerView().U(this.b);
       return;
    }
}
