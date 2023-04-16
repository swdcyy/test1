package com.kwai.component.photo.detail.slide.widget.SlideAtlasViewPager;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class SlideAtlasViewPager extends PhotosViewPager	// class@000ab7
{
    public boolean H;
    public boolean I;
    public static final boolean J;

    static {
       SlideAtlasViewPager.J = a.t().d("disableSlideAtlasDisallowParentTouchOnOpen", false) ^ 0x01;
    }
    public void SlideAtlasViewPager(Context p0){
       super(p0, null);
    }
    public void SlideAtlasViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setOpened(false);
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(SlideAtlasViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SlideAtlasViewPager.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.I != null) {
          return super.canScrollHorizontally(p0);
       }else {
          return this.H;
       }
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideAtlasViewPager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.o() && (SlideAtlasViewPager.J && !p0.getAction())) {
          this.getParent().requestDisallowInterceptTouchEvent(true);
       }
    label_002b :
       return super.dispatchTouchEvent(p0);
    }
    public boolean o(){
       return this.H;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideAtlasViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.I != null) {
          return super.onInterceptTouchEvent(p0);
       }
       if (!this.o()) {
          return false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideAtlasViewPager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.I != null) {
          return super.onTouchEvent(p0);
       }
       if (!this.o()) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public void setAllowScrollOut(boolean p0){
       if (PatchProxy.isSupport(SlideAtlasViewPager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlideAtlasViewPager.class, "2")) {
          return;
       }
       this.setEnabled(p0);
       this.I = p0;
       return;
    }
    public void setOpened(boolean p0){
       if (PatchProxy.isSupport(SlideAtlasViewPager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlideAtlasViewPager.class, "1")) {
          return;
       }
       this.H = p0;
       this.setEnabled(p0);
       this.I = false;
       Log.g("SlideAtlasViewPager", "change open:"+p0+", enableDisallowParentTouchOnOpen:"+SlideAtlasViewPager.J);
       return;
    }
}
