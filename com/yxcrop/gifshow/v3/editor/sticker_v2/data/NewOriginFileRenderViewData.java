package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileRenderViewData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import java.lang.Long;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class NewOriginFileRenderViewData extends NewStickerElementData	// class@000a6a
{
    public Long Q;

    public void NewOriginFileRenderViewData(){
       super(null, 1, null);
    }
    public void NewOriginFileRenderViewData(Long p0){
       super(0, 0, 0, 0, 0, 0, 63, null);
       this.Q = p0;
    }
    public void NewOriginFileRenderViewData(Long p0,int p1,u p2){
       super(null);
    }
    public void R0(NewDecorationElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewOriginFileRenderViewData.class, "1")) {
          return;
       }
       a.p(p0, "elementData");
       super.R0(p0);
       if (p0 instanceof NewOriginFileRenderViewData) {
          this.Q = p0.Q;
       }
       return;
    }
    public final Long S0(){
       return this.Q;
    }
    public final void T0(Long p0){
       this.Q = p0;
    }
}
