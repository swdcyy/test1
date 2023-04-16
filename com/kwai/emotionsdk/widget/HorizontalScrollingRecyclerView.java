package com.kwai.emotionsdk.widget.HorizontalScrollingRecyclerView;
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
import java.lang.Integer;
import android.view.View$MeasureSpec;

public class HorizontalScrollingRecyclerView extends RecyclerView implements a	// class@000dc2
{
    public float b;
    public float c;
    public int d;
    public boolean e;
    public int f;

    public void HorizontalScrollingRecyclerView(Context p0){
       super(p0, null);
    }
    public void HorizontalScrollingRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HorizontalScrollingRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = p0.obtainStyledAttributes(p1, c$b.h1).getDimensionPixelOffset(0, 0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HorizontalScrollingRecyclerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoid(null, this, HorizontalScrollingRecyclerView.class, "2") && this.d <= null) {
          this.d = ViewConfiguration.get(this.getContext()).getScaledTouchSlop() / 2;
       }
       int i = p0.getAction() & 0x00ff;
       boolean b = true;
       if (i) {
          if (i == b || i == 3) {
             this.x();
          }
       }else {
          this.b = p0.getRawX();
          this.c = p0.getRawY();
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
       HorizontalScrollingRecyclerView tf = this.f;
       if (tf > null && tf < size) {
          p0 = View$MeasureSpec.makeMeasureSpec(this.f, View$MeasureSpec.getMode(p0));
       }
       super.onMeasure(p0, p1);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HorizontalScrollingRecyclerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p0.getAction() & 0x00ff;
       if (i == 1 || i == 3) {
          this.x();
       }
       return super.onTouchEvent(p0);
    }
    public final void x(){
       this.e = false;
    }
}
