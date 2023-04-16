package com.kuaishou.live.core.show.wealthgrade.barrage.view.LiveWealthGradeBarrageNewStyleV2View;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import android.widget.LinearLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import android.view.View;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import java.util.Iterator;
import lm2.d;
import yh3.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import va1.n0;
import android.view.View$MeasureSpec;
import java.lang.Math;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import lnc.a1;

public class LiveWealthGradeBarrageNewStyleV2View extends FrameLayout	// class@001259
{
    public KwaiImageView b;
    public KwaiImageView c;
    public LinearLayout d;
    public LinearLayout e;
    public LinearLayout f;
    public static final int g = 2131368567;

    public void LiveWealthGradeBarrageNewStyleV2View(Context p0){
       super(p0);
       this.c();
    }
    public void LiveWealthGradeBarrageNewStyleV2View(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c();
    }
    public void LiveWealthGradeBarrageNewStyleV2View(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c();
    }
    public final void a(LifecycleOwner p0,List p1,LinearLayout p2){
       View tag;
       d this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveWealthGradeBarrageNewStyleV2View.class, "8")) {
          return;
       }
       if (q.f(p1)) {
          return;
       }
       int i = 0;
       while (i < p2.getChildCount()) {
          tag = p2.getChildAt(i).getTag(LiveWealthGradeBarrageNewStyleV2View.g);
          if (tag instanceof SubLifecycleController) {
             tag.a();
          }
          i = i + 1;
       }
       p2.removeAllViews();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          tag = uod.f(this.getContext());
          p2.addView(tag);
          this = uod.a;
          tag.setTag(LiveWealthGradeBarrageNewStyleV2View.g, this);
          uod.c(this, tag, uod.d(p0));
       }
       return;
    }
    public final int b(LinearLayout p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWealthGradeBarrageNewStyleV2View.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int childCount = p0.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(0);
          i1 = i1 + childAt.getMeasuredWidth();
          if (childAt.getLayoutParams() != null) {
             ViewGroup$MarginLayoutParams layoutParams = this.getLayoutParams();
             i1 = i1 + layoutParams.leftMargin;
             i1 = i1 + layoutParams.rightMargin;
          }
          i = i + 1;
       }
       return i1;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveWealthGradeBarrageNewStyleV2View.class, "7")) {
          return;
       }
       this.setVisibility(8);
       a.k(this, R.layout.arg_RES_7f0d0aea, true);
       this.b = this.findViewById(0x7f0a1c15);
       this.c = this.findViewById(0x7f0a1a64);
       this.d = this.findViewById(0x7f0a3ff5);
       this.e = this.findViewById(0x7f0a2b65);
       this.f = this.findViewById(0x7f0a04b0);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveWealthGradeBarrageNewStyleV2View.class, "5")) {
          return;
       }
       super.onAttachedToWindow();
       int i = n0.f();
       this.measure(View$MeasureSpec.makeMeasureSpec((i * 4), 0x40000000), View$MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE));
       i = this.b(this.d);
       int i1 = this.b(this.e);
       int i2 = Math.max(i, i1);
       StringBuilder str = "topLineContainerWidth = "+i;
       b.Z(LiveLogTag.WEALTH_GRADE, str+"  middleLineContainerWidth = "+i1);
       if (this.getLayoutParams() == null) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.getLayoutParams();
       layoutParams.width = i2 + a1.d(0x7f0705db);
       this.setLayoutParams(layoutParams);
       return;
    }
}
