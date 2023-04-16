package com.yxcorp.gifshow.v3.mixed.timeline.MixContentView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import com.yxcorp.gifshow.v3.mixed.timeline.MixDragHandle;
import java.lang.Boolean;
import java.lang.Integer;
import hwc.a;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;

public class MixContentView extends RelativeLayout implements d	// class@00155a
{
    public MixTimeline b;
    public MixDragHandle c;

    public void MixContentView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixContentView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a3ef5);
       this.c = m1.f(p0, 0x7f0a0c3c);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, MixContentView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(MixContentView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MixContentView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       MixTimeline e = this.b.e;
       if (e != null) {
          p3 = a.i;
          p4 = a.j;
          int h = a.h;
          int k = a.k;
          this.c.layout((((e.getLeft() - p3) - p4) + h), (this.b.getTop() - k), (((e.getRight() + p3) + p4) - h), (this.b.getBottom() + k));
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MixContentView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MixContentView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       MixTimeline e = this.b.e;
       if (e != null) {
          this.c.measure(View$MeasureSpec.makeMeasureSpec((((e.getMeasuredWidth() + (a.i * 2)) + (a.j * 2)) - (a.h * 2)), 0x40000000), View$MeasureSpec.makeMeasureSpec(((a.k * 2) + e.getMeasuredHeight()), 0x40000000));
       }
       return;
    }
}
