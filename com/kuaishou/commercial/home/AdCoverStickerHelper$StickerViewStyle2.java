package com.kuaishou.commercial.home.AdCoverStickerHelper$StickerViewStyle2;
import com.kuaishou.commercial.home.AdCoverStickerHelper$StickerViewStyleFixedWidth;
import com.kuaishou.commercial.home.AdCoverStickerHelper;
import android.content.Context;
import android.view.View;
import com.kuaishou.commercial.home.StickerView;
import android.widget.FrameLayout;

public class AdCoverStickerHelper$StickerViewStyle2 extends AdCoverStickerHelper$StickerViewStyleFixedWidth	// class@0014c1
{
    public final AdCoverStickerHelper A;

    public void AdCoverStickerHelper$StickerViewStyle2(AdCoverStickerHelper p0,Context p1,View p2){
       this.A = p0;
       super(p0, p1, p2);
       this.i = 0.08f;
       int i = (int)((float)p2.getWidth() * this.i);
       this.e = i;
       this.setPadding(i, 0, 0, 0);
       this.setMarginsPct(new float[4]{0,0x3d75c28f,0,0x3d75c28f});
       this.setTextSize(18);
       this.setTextMaxEms(7);
    }
    public int getLayoutId(){
       return 0x7f0d0047;
    }
}
