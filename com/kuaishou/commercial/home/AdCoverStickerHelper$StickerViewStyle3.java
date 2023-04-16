package com.kuaishou.commercial.home.AdCoverStickerHelper$StickerViewStyle3;
import com.kuaishou.commercial.home.AdCoverStickerHelper$StickerViewStyleFixedWidth;
import com.kuaishou.commercial.home.AdCoverStickerHelper;
import android.content.Context;
import android.view.View;
import com.kuaishou.commercial.home.StickerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.home.DrawTextSelfStickerView;

public class AdCoverStickerHelper$StickerViewStyle3 extends AdCoverStickerHelper$StickerViewStyleFixedWidth	// class@0014c2
{
    public final AdCoverStickerHelper A;

    public void AdCoverStickerHelper$StickerViewStyle3(AdCoverStickerHelper p0,Context p1,View p2){
       this.A = p0;
       super(p0, p1, p2);
       this.setBackgroundDrawableRes(R.drawable.ad_cover_sticker_style3_background);
       this.setPaddings(new int[4]{15,23,13,9});
       this.setMarginsPct(new float[4]{0x3dcccccd,0x3da3d70a,0x3dcccccd,0x3da3d70a});
       this.setTextSize(16);
       this.setTextMaxEms(7);
       this.setMaxLines(2);
       this.setFixedWidth(true);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdCoverStickerHelper$StickerViewStyle3.class, "1")) {
          return;
       }
       this.setStickerTextViewGravity(1);
       return;
    }
    public void setMarginsPct(float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdCoverStickerHelper$StickerViewStyle3.class, "2")) {
          return;
       }
       super.setMarginsPct(p0);
       this.b();
       return;
    }
}
