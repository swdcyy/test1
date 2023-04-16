package com.yxcorp.gifshow.recycler.widget.HorizontalScrollingRecyclerView;
import t17.a;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.ViewConfiguration;
import android.view.View;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9c.b;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView$a;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.view.ViewParent;

public class HorizontalScrollingRecyclerView extends RecyclerView implements a	// class@0017b4
{
    public float b;
    public float c;
    public int d;
    public boolean e;
    public CustomRecyclerView f;
    public RefreshLayout g;
    public int h;
    public static final int i;

    public void HorizontalScrollingRecyclerView(Context p0){
       super(p0, null);
    }
    public void HorizontalScrollingRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HorizontalScrollingRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = p0.obtainStyledAttributes(p1, c$b.h1).getDimensionPixelOffset(0, 0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       HorizontalScrollingRecyclerView obj = PatchProxy.applyOneRefs(p0, this, HorizontalScrollingRecyclerView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoid(null, this, HorizontalScrollingRecyclerView.class, "2") && this.d <= null) {
          this.d = ViewConfiguration.get(this.getContext()).getScaledTouchSlop() / 2;
          this.f = this.x(this);
          this.g = this.y(this);
       }
       int i = p0.getAction() & 0x00ff;
       boolean b = true;
       if (i) {
          if (i == b || i == 3) {
             this.z();
          }
       }else {
          this.b = p0.getRawX();
          this.c = p0.getRawY();
          obj = this.f;
          if (obj != null) {
             obj.setIgnoreTouchSwipeHandler(new b(this));
          }
       }
       if (!super.onInterceptTouchEvent(p0) && this.e == null) {
          b = false;
       }
       return b;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(HorizontalScrollingRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HorizontalScrollingRecyclerView.class, "1")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p0);
       HorizontalScrollingRecyclerView th = this.h;
       if (th > null && th < size) {
          p0 = View$MeasureSpec.makeMeasureSpec(this.h, View$MeasureSpec.getMode(p0));
       }
       super.onMeasure(p0, p1);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HorizontalScrollingRecyclerView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p0.getAction() & 0x00ff;
       if (i == 1 || i == 3) {
          this.z();
       }
       return super.onTouchEvent(p0);
    }
    public final CustomRecyclerView x(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HorizontalScrollingRecyclerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.getParent() instanceof View) {
          return null;
       }
       p0 = p0.getParent();
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof CustomRecyclerView) {
          return p0;
       }
       return this.x(p0);
    }
    public final RefreshLayout y(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HorizontalScrollingRecyclerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.getParent() instanceof View) {
          return null;
       }
       p0 = p0.getParent();
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof RefreshLayout) {
          return p0;
       }
       return this.y(p0);
    }
    public final void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HorizontalScrollingRecyclerView.class, "8")) {
          return;
       }
       this.e = false;
       HorizontalScrollingRecyclerView tf = this.f;
       if (tf != null) {
          tf.setIgnoreTouchSwipeHandler(objArray);
       }
       tf = this.g;
       if (tf != null) {
          tf.setEnabled(true);
       }
       return;
    }
}
