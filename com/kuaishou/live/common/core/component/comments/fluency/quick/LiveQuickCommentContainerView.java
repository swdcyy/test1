package com.kuaishou.live.common.core.component.comments.fluency.quick.LiveQuickCommentContainerView;
import android.widget.LinearLayout;
import jl5.c;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.comments.fluency.quick.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;
import android.view.View$MeasureSpec;

public class LiveQuickCommentContainerView extends LinearLayout	// class@001086
{
    public long b;
    public int c;
    public a d;
    public a e;
    public final List f;
    public final Runnable g;
    public static final int h;
    public static final int i;

    static {
       LiveQuickCommentContainerView.h = c.c(0x7f070927);
       LiveQuickCommentContainerView.i = c.c(0x7f07034b);
    }
    public void LiveQuickCommentContainerView(Context p0){
       super(p0, null);
    }
    public void LiveQuickCommentContainerView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveQuickCommentContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new ArrayList();
       this.g = new d(this);
       if (PatchProxy.applyVoid(null, this, LiveQuickCommentContainerView.class, "1")) {
       }else {
          this.setOrientation(0);
          p2 = LiveQuickCommentContainerView.h;
          this.setLayoutParams(new LinearLayout$LayoutParams(-1, p2));
          this.setMinimumHeight(p2);
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveQuickCommentContainerView.class, "5")) {
          return;
       }
       this.removeCallbacks(this.g);
       k1.n(this);
       this.removeAllViews();
       this.f.clear();
       this.c = 0;
       this.b = 0;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveQuickCommentContainerView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveQuickCommentContainerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveQuickCommentContainerView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (!PatchProxy.applyVoid(null, this, LiveQuickCommentContainerView.class, "7")) {
          p0 = this.getChildCount();
          if (p0 > 0) {
             p1 = this.getWidth();
             p2 = 0;
             p3 = 0;
             while (p3 < p0) {
                View childAt = this.getChildAt(p3);
                if (!p3) {
                   childAt.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), Integer.MIN_VALUE), p2);
                }else {
                   childAt.measure(p2, p2);
                }
                p1 = p1 - childAt.getMeasuredWidth();
                if (p3 > 0) {
                   p1 = p1 - LiveQuickCommentContainerView.i;
                }
                if (p3) {
                   if (p1 < 0) {
                      for (; p3 < p0; p3++) {
                         this.getChildAt(p3).setVisibility(8);
                      }
                   }else {
                      childAt.setVisibility(p2);
                   }
                }
                p3++;
             }
          }
       }
       return;
    }
}
