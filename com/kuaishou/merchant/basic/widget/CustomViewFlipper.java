package com.kuaishou.merchant.basic.widget.CustomViewFlipper;
import android.widget.ViewFlipper;
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

public class CustomViewFlipper extends ViewFlipper	// class@0015f2
{

    public void CustomViewFlipper(Context p0){
       super(p0);
    }
    public void CustomViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CustomViewFlipper.class, "1")) {
          return;
       }
       try{
          super.onDetachedFromWindow();
       }catch(java.lang.IllegalArgumentException e0){
          this.stopFlipping();
          a.l(MerchantCommonLogBiz.PRELOADER, "CustomViewFlipper", "com.kuaishou.merchant.live.basic.widget", e0);
       }
       return;
    }
}
