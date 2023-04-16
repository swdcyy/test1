package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData$a;
import java.lang.Object;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.RelayStickerUIData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;

public final class NewRelayStickerDrawerData$a	// class@000a7b
{

    public void NewRelayStickerDrawerData$a(){
       super();
    }
    public void NewRelayStickerDrawerData$a(u p0){
       super();
    }
    public final RelayStickerUIData a(NewRelayStickerDrawerData p0,int p1){
       Object obj;
       NewRelayStickerDrawerData$a uoa = NewRelayStickerDrawerData$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "drawerData");
       RelayStickerUIData relaySticker = new RelayStickerUIData(p0.W0(), p0.U0(), p0.V0(), p1, p0.W, p0.Y0(), Math.min(p0.e(), 0x3f733333), p0.S0(), p0.k0());
       return obj;
    }
}
