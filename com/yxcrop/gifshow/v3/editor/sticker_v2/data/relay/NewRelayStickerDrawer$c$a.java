package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$c$a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;

public final class NewRelayStickerDrawer$c$a implements Runnable	// class@000a77
{
    public final NewRelayStickerDrawer$c b;

    public void NewRelayStickerDrawer$c$a(NewRelayStickerDrawer$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer$c$a.class, "1")) {
          return;
       }
       this.b.a.tryLogStickerInfoUpdate();
       return;
    }
}
