package com.kuaishou.merchant.basic.widget.AdapterViewFlipper;
import android.widget.AdapterViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import com.kuaishou.merchant.basic.widget.AdapterViewFlipper$a;

public class AdapterViewFlipper extends AdapterViewFlipper	// class@0015e9
{
    public AdapterViewFlipper$a b;
    public boolean c;

    public void AdapterViewFlipper(Context p0){
       super(p0, null);
    }
    public void AdapterViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = false;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, AdapterViewFlipper.class, "2")) {
          return;
       }
       try{
          super.onDetachedFromWindow();
       }catch(java.lang.IllegalArgumentException e0){
          this.stopFlipping();
          a.l(MerchantCommonLogBiz.PRELOADER, "AdapterViewFlipper", "com.kuaishou.merchant.live.basic.widget", e0);
       }
       return;
    }
    public void setAutoStop(boolean p0){
       this.c = p0;
    }
    public void setOnViewFlipperListener(AdapterViewFlipper$a p0){
       this.b = p0;
    }
    public void showNext(){
       AdapterViewFlipper tb;
       if (PatchProxy.applyVoid(null, this, AdapterViewFlipper.class, "1")) {
          return;
       }
       if (this.c != null && (this.getCount() > 0 && this.getDisplayedChild() == (this.getCount() - 1))) {
          this.stopFlipping();
          tb = this.b;
          if (tb != null) {
             tb.b();
          }
       }
       super.showNext();
       tb = this.b;
       if (tb != null) {
          tb.a();
       }
       return;
    }
}
