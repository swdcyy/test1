package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.e;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.sticker.f0;

public final class e implements Callable	// class@000aa8
{
    public final StickerDetailInfo b;

    public void e(StickerDetailInfo p0){
       this.b = p0;
       super();
    }
    public Object call(){
       e uoe = PatchProxy.apply(null, this, e.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          f0.h(this.b);
          uoe = this.b;
       }
       return uoe;
    }
}
