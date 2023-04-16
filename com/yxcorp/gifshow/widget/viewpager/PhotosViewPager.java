package com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import ekd.p1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.viewpager.widget.CorrectOffsetViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager$a;
import androidx.viewpager.widget.KwaiViewPager;

public class PhotosViewPager extends CustomViewPager	// class@0019f5
{
    public boolean A;
    public View$OnTouchListener B;
    public boolean C;
    public boolean D;
    public float E;
    public boolean F;
    public boolean G;
    public float w;
    public float x;
    public float y;
    public PhotosViewPager$a z;

    public void PhotosViewPager(Context p0){
       super(p0, null);
    }
    public void PhotosViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.A = true;
       this.D = true;
       this.F = true;
       this.G = false;
       this.y = (float)ViewConfiguration.get(p0).getScaledTouchSlop();
       this.E = p1.d(this.getContext());
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(PhotosViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotosViewPager.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.D != null && (super.canScrollHorizontally(p0) && (this.F != null || this.w - this.E > 0)))? true: false;
       return b;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       PhotosViewPager obj = PatchProxy.applyOneRefs(p0, this, PhotosViewPager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       if (obj != null) {
          obj.onTouch(this, p0);
       }
       obj = this.z;
       if (obj != null && obj.a(p0)) {
          return false;
       }else if(this.G != null){
          return false;
       }else {
          int i = p0.getAction() & 0x00ff;
          if (i) {
             if (i == 2) {
                p0.getX();
                p0.getY();
                if (this.A == null) {
                   obj = this.w;
                   if (obj - this.y <= 0 || obj - ((float)this.getWidth() - this.y) >= 0) {
                      return false;
                   }
                }
             }
          }else {
             this.u = p0.getX();
             this.w = p0.getX();
             this.x = p0.getY();
          }
          return super.onInterceptTouchEvent(p0);
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       PhotosViewPager obj = PatchProxy.applyOneRefs(p0, this, PhotosViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       if (obj != null) {
          obj.onTouch(this, p0);
       }
       obj = this.z;
       if (obj != null && obj.onTouchEvent(p0)) {
          return false;
       }else if(this.G != null){
          return false;
       }else if(this.A == null){
          obj = this.w;
          if (obj - this.y <= 0 || obj - ((float)this.getWidth() - this.y) >= 0) {
             return false;
          }
       }
       return super.onTouchEvent(p0);
    }
    public void setBehaviorTouchListener(PhotosViewPager$a p0){
       this.z = p0;
    }
    public void setCurrentItemInternal(int p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(PhotosViewPager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, PhotosViewPager.class, "2")) {
          return;
       }
       if (this.C != null) {
          this.C = false;
          super.setCurrentItemInternal(p0, p1, p2, 200);
       }else {
          super.setCurrentItemInternal(p0, p1, p2, false);
       }
       return;
    }
    public void setCustomTouchListener(View$OnTouchListener p0){
       this.B = p0;
    }
    public void setDisableScroll(boolean p0){
       this.G = p0;
    }
    public void setEdgeScrollable(boolean p0){
       this.F = p0;
    }
    public void setIgnoreEdge(boolean p0){
       this.A = p0;
    }
    public void setIsShown(boolean p0){
       this.D = p0;
    }
}
