package com.kuaishou.merchant.marketing.shop.auction.widget.RedRectSweepingButtonView;
import com.kuaishou.merchant.basic.widget.sweeping.RectSweepingButtonView;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RedRectSweepingButtonView extends RectSweepingButtonView	// class@001bd6
{
    public final Bitmap I;
    public HashMap J;

    public void RedRectSweepingButtonView(Context p0){
       super(p0, null);
    }
    public void RedRectSweepingButtonView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RedRectSweepingButtonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setMBandRatio(0.40f);
       this.setMHaloDrawableId(R.drawable.arg_RES_7f081e22);
       this.I = BitmapFactory.decodeResource(this.getResources(), 0x7f08011f);
    }
    public Bitmap c(){
       Bitmap obj = PatchProxy.apply(null, this, RedRectSweepingButtonView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getMMaskBitmap();
       if (obj != null) {
          return obj;
       }
       return this.I;
    }
}
