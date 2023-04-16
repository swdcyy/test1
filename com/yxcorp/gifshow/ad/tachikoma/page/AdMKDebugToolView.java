package com.yxcorp.gifshow.ad.tachikoma.page.AdMKDebugToolView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKDebugToolView$a;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.customview.widget.ViewDragHelper;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import a2.q;

public class AdMKDebugToolView extends FrameLayout	// class@00182f
{
    public ViewDragHelper b;
    public View c;

    public void AdMKDebugToolView(Context p0){
       super(p0);
    }
    public void AdMKDebugToolView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void AdMKDebugToolView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, AdMKDebugToolView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.b = ViewDragHelper.create(this, 0x3f800000, new AdMKDebugToolView$a(this));
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdMKDebugToolView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = q.c(p0);
       if (i != 3 && i != 1) {
          return this.b.shouldInterceptTouchEvent(p0);
       }
       this.b.cancel();
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdMKDebugToolView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.processTouchEvent(p0);
       return false;
    }
}
