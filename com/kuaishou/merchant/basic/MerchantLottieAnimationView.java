package com.kuaishou.merchant.basic.MerchantLottieAnimationView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import com.airbnb.lottie.RenderMode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.reflect.Method;
import java.lang.Exception;

public class MerchantLottieAnimationView extends KwaiLottieAnimationView	// class@00159a
{

    public void MerchantLottieAnimationView(Context p0){
       super(p0, null);
    }
    public void MerchantLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MerchantLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (Build$VERSION.SDK_INT <= 22) {
          this.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantLottieAnimationView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       if (!PatchProxy.applyVoid(objArray, this, MerchantLottieAnimationView.class, "3")) {
          try{
             Class[] uClassArray = new Class[0];
             Method declaredMeth = LottieAnimationView.class.getDeclaredMethod("i", uClassArray);
             declaredMeth.setAccessible(true);
             objArray = new Object[0];
             declaredMeth.invoke(this, objArray);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public void setRenderMode(RenderMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLottieAnimationView.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT <= 22) {
          super.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
}
