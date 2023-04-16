package com.kuaishou.commercial.home.AdCoverStickerHelper$StickerViewStyle1;
import com.kuaishou.commercial.home.AdCoverStickerHelper$StickerViewStyleFixedWidth;
import com.kuaishou.commercial.home.AdCoverStickerHelper;
import android.content.Context;
import android.view.View;
import com.kuaishou.commercial.home.StickerView;
import android.widget.FrameLayout;

public class AdCoverStickerHelper$StickerViewStyle1 extends AdCoverStickerHelper$StickerViewStyleFixedWidth	// class@0014c0
{
    public final AdCoverStickerHelper A;

    public void AdCoverStickerHelper$StickerViewStyle1(AdCoverStickerHelper p0,Context p1,View p2){
       this.A = p0;
       super(p0, p1, p2);
       this.j = 0.13f;
       int i = (int)((float)p2.getWidth() * this.j);
       this.f = i;
       this.setPadding(0, 0, i, 0);
       this.setTextMaxEms(7);
       this.setTextSize(16);
       this.setMarginsPct(new float[4]{0,0x3da3d70a,0,0x3da3d70a});
    }
    public int getLayoutId(){
       return 0x7f0d0046;
    }
}
