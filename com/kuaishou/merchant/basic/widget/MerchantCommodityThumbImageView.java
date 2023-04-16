package com.kuaishou.merchant.basic.widget.MerchantCommodityThumbImageView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;

public class MerchantCommodityThumbImageView extends MerchantKwaiImageView	// class@0015f5
{
    public Drawable Q;

    public void MerchantCommodityThumbImageView(Context p0){
       super(p0);
       this.o0(p0, null, 0);
    }
    public void MerchantCommodityThumbImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.o0(p0, p1, 0);
    }
    public void MerchantCommodityThumbImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o0(p0, p1, p2);
    }
    public final void o0(Context p0,AttributeSet p1,int p2){
       if (PatchProxy.isSupport(MerchantCommodityThumbImageView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, MerchantCommodityThumbImageView.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.n3, p2, 0);
          this.Q = typedArray.getDrawable(0);
          typedArray.recycle();
       }
       MerchantCommodityThumbImageView tQ = this.Q;
       if (tQ == null) {
          tQ = new ColorDrawable(a1.a(0x7f061810));
       }
       this.setPlaceHolderImage(tQ);
       return;
    }
}
