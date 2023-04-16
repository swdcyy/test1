package com.kuaishou.merchant.bowl.krn.MerchantKrnWidgetContainerView;
import com.kuaishou.merchant.bowl.krn.MerchantSpbKrnContainerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.FrameLayout;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.graphics.Color;

public class MerchantKrnWidgetContainerView extends MerchantSpbKrnContainerView	// class@00160b
{

    public void MerchantKrnWidgetContainerView(Context p0){
       super(p0);
    }
    public void MerchantKrnWidgetContainerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MerchantKrnWidgetContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void l(){
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantKrnWidgetContainerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.setDrawingCacheEnabled(true);
       this.buildDrawingCache();
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       Bitmap drawingCache = this.getDrawingCache();
       if (drawingCache == null) {
          return super.onInterceptTouchEvent(p0);
       }
       try{
          this.setDrawingCacheEnabled(false);
          if ((double)Color.alpha(drawingCache.getPixel(i, i1)) / 0x406fe00000000000) {
             return super.onInterceptTouchEvent(p0);
          }
          if (!p0.getAction()) {
             this.l();
          }
          return true;
       }catch(java.lang.Exception e0){
          return super.onInterceptTouchEvent(p0);
       }
    }
}
