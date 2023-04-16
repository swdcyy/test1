package com.kuaishou.merchant.home2.magnet.banner.widget.BannerViewPagerContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.view.View$OnTouchListener;
import android.view.ViewGroup;

public final class BannerViewPagerContainer extends FrameLayout	// class@0017f1
{
    public View$OnTouchListener b;
    public HashMap c;

    public void BannerViewPagerContainer(Context p0){
       super(p0);
    }
    public void BannerViewPagerContainer(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       BannerViewPagerContainer obj = PatchProxy.applyOneRefs(p0, this, BannerViewPagerContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null) {
          obj.onTouch(this, p0);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void setOnTouchListener(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BannerViewPagerContainer.class, "1")) {
          return;
       }
       super.setOnTouchListener(p0);
       this.b = p0;
       return;
    }
}
