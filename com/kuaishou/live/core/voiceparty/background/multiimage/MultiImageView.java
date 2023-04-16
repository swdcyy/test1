package com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageView;
import android.view.ViewGroup;
import android.content.Context;
import com.kuaishou.live.core.voiceparty.background.multiimage.Config;
import com.kuaishou.live.core.voiceparty.background.multiimage.Coordinate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View$MeasureSpec;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageView$a;
import com.kuaishou.live.core.voiceparty.background.multiimage.ScaleType;

public final class MultiImageView extends ViewGroup	// class@001363
{
    public final Rect b;
    public final Config c;
    public final Coordinate d;
    public HashMap e;

    public void MultiImageView(Context p0,Config p1,Coordinate p2){
       a.p(p0, "context");
       a.p(p1, "config");
       a.p(p2, "coordinate");
       super(p0);
       this.c = p1;
       this.d = p2;
       this.b = new Rect();
    }
    public final int a(int p0,int p1){
       if (PatchProxy.isSupport(MultiImageView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MultiImageView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (mode == Integer.MIN_VALUE || mode == 0x40000000) {
          p0 = p1;
       }
       return p0;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, MultiImageView.class, "4")) {
          return;
       }
       int i = (this.getMeasuredHeight() * this.d.b()) / this.d.a();
       int i1 = (this.getMeasuredWidth() - i) / 2;
       this.b.set(i1, 0, (i + i1), this.getMeasuredHeight());
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, MultiImageView.class, "5")) {
          return;
       }
       int i = (this.getMeasuredWidth() * this.d.a()) / this.d.b();
       int i1 = (this.getMeasuredHeight() - i) / 2;
       this.b.set(0, i1, this.getMeasuredWidth(), (i + i1));
       return;
    }
    public final Rect getViewport(){
       return this.b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(MultiImageView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MultiImageView.class, "2")) {
             return;
          }
       }
       int childCount = this.getChildCount();
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          a.o(childAt, "child");
          if (childAt.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageView.LayoutParams");
             p3 = layoutParams.a * this.b.width();
             p3 = p3 / this.d.b();
             p4 = this.getMeasuredWidth() / 2;
             p3 = p3 + p4;
             p4 = this.b.width() / 2;
             p3 = p3 - p4;
             layoutParams = layoutParams.b * this.b.height();
             layoutParams = layoutParams / this.d.a();
             p4 = this.getMeasuredHeight() / 2;
             layoutParams = layoutParams + p4;
             p4 = this.b.height() / 2;
             layoutParams = layoutParams - p4;
             p4 = childAt.getMeasuredWidth() + p3;
             int i1 = childAt.getMeasuredHeight() + layoutParams;
             childAt.layout(p3, layoutParams, p4, i1);
          }
          i = i + 1;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int i2;
       String str = "1";
       if (PatchProxy.isSupport(MultiImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MultiImageView.class, str)) {
          return;
       }
       this.setMeasuredDimension(this.a(this.getSuggestedMinimumWidth(), p0), this.a(this.getSuggestedMinimumHeight(), p1));
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, MultiImageView.class, "3")) {
          p0 = ((this.d.a() * this.getMeasuredWidth()) > (this.d.b() * this.getMeasuredHeight()))? 1: 0;
          MultiImageView tc = this.c;
          Objects.requireNonNull(tc);
          ScaleType scaleType = PatchProxy.apply(objArray, tc, Config.class, str);
          if (scaleType != PatchProxyResult.class) {
          }else {
             Config _scaleType = tc._scaleType;
             i2 = _scaleType.hashCode();
             if (i2 != -1183789060) {
                if (i2 == 0x2eba90 && _scaleType.equals("crop")) {
                   scaleType = ScaleType.CROP;
                }
             }else if(_scaleType.equals("inside")){
                scaleType = ScaleType.INSIDE;
             }
             scaleType = ScaleType.CROP;
          }
          if (scaleType == ScaleType.CROP) {
             if (p0) {
                this.c();
             }else {
                this.b();
             }
          }else if(p0){
             this.b();
          }else {
             this.c();
          }
       }
       p0 = this.getChildCount();
       while (i < p0) {
          View childAt = this.getChildAt(i);
          a.o(childAt, "child");
          if (childAt.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageView.LayoutParams");
             int i1 = layoutParams.width * this.b.width();
             i1 = i1 / this.d.b();
             i2 = layoutParams.height * this.b.height();
             i2 = i2 / this.d.a();
             childAt.measure(View$MeasureSpec.makeMeasureSpec(i1, 0x40000000), View$MeasureSpec.makeMeasureSpec(i2, 0x40000000));
          }
          i = i + 1;
       }
       return;
    }
}
