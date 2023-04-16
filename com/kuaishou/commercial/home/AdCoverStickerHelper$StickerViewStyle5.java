package com.kuaishou.commercial.home.AdCoverStickerHelper$StickerViewStyle5;
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

public class AdCoverStickerHelper$StickerViewStyle5 extends AdCoverStickerHelper$StickerViewStyleFixedWidth	// class@0014c4
{
    public final AdCoverStickerHelper A;

    public void AdCoverStickerHelper$StickerViewStyle5(AdCoverStickerHelper p0,Context p1,View p2){
       this.A = p0;
       super(p0, p1, p2);
       this.setBackgroundDrawableRes(R.drawable.ad_cover_sticker_style5_background);
       this.setPaddings(new int[4]{7,21,7,7});
       this.setMarginsPct(new float[4]{0x3dcccccd,0x3df5c28f,0x3dcccccd,0x3dcccccd});
       this.setTextSize(18);
       this.setTextMaxEms(7);
       this.setMaxLines(2);
       this.setFixedWidth(true);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdCoverStickerHelper$StickerViewStyle5.class, "1")) {
          return;
       }
       StickerView tb = this.b;
       if (tb != null && tb.length() <= this.u) {
          this.setStickerTextViewGravity(1);
       }else {
          this.setStickerTextViewGravity(3);
       }
       return;
    }
    public void setMarginsPct(float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdCoverStickerHelper$StickerViewStyle5.class, "2")) {
          return;
       }
       super.setMarginsPct(p0);
       this.b();
       return;
    }
}
