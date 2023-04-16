package com.kuaishou.merchant.marketing.base.widget.RedRectSweepingButtonViewEx;
import com.kuaishou.merchant.marketing.base.widget.RectSweepingButtonViewEx;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.merchant.basic.widget.sweeping.RectSweepingButtonView;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.content.res.Resources;
import android.widget.ImageView;
import android.graphics.BitmapFactory;

public final class RedRectSweepingButtonViewEx extends RectSweepingButtonViewEx	// class@001afe
{
    public Bitmap K;
    public HashMap L;

    public void RedRectSweepingButtonViewEx(Context p0){
       super(p0, null);
    }
    public void RedRectSweepingButtonViewEx(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RedRectSweepingButtonViewEx(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setMBandRatio(0.40f);
       this.setMHaloDrawableId(R.drawable.arg_RES_7f081e22);
    }
    public Bitmap c(){
       Bitmap obj = PatchProxy.apply(null, this, RedRectSweepingButtonViewEx.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getMMaskBitmap();
       if (obj != null) {
          return obj;
       }
       return this.K;
    }
    public final void setRedMaskBitmap(int p0){
       if (PatchProxy.isSupport(RedRectSweepingButtonViewEx.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RedRectSweepingButtonViewEx.class, "1")) {
          return;
       }
       this.K = BitmapFactory.decodeResource(this.getResources(), p0);
       return;
    }
}
