package com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper$b;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.content.Context;
import com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import android.widget.ViewFlipper;

public class MerchantViewFlipper$b extends GestureDetector$SimpleOnGestureListener	// class@0018af
{
    public MerchantViewFlipper b;

    public void MerchantViewFlipper$b(Context p0,MerchantViewFlipper p1){
       super();
       this.b = p1;
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       MerchantViewFlipper$b tb;
       if (PatchProxy.isSupport(MerchantViewFlipper$b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, MerchantViewFlipper$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if ((p0.getX() - p1.getX()) - 0x42480000 > 0) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, MerchantViewFlipper.class, "11") && tb.getChildCount() > 1) {
             tb.f();
             tb.showNext();
          }
       }else if((p1.getX() - p0.getX()) - 0x42480000 > 0){
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, MerchantViewFlipper.class, "12") && tb.getChildCount() > 1) {
             tb.g();
             tb.showPrevious();
          }
       }
       return true;
    }
}
