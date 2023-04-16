package com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import jc1.a;
import java.lang.Integer;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView$b;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView$a;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveIncreaseFansNoticeView extends SelectShapeLinearLayout	// class@000fda
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;

    public void LiveIncreaseFansNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveIncreaseFansNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveIncreaseFansNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveIncreaseFansNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.d = this.findViewById(0x7f0a1b4c);
       this.e = this.findViewById(0x7f0a1b5b);
       this.c = this.findViewById(0x7f0a1b4b);
       this.f = this.findViewById(0x7f0a1b59);
       this.g = this.findViewById(0x7f0a1b5c);
       a.b(this.d);
       a.b(this.e);
       return;
    }
    public void onMeasure(int p0,int p1){
       ViewGroup$MarginLayoutParams layoutParams;
       if (PatchProxy.isSupport(LiveIncreaseFansNoticeView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveIncreaseFansNoticeView.class, "10")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.c != null && this.g != null) {
          LiveIncreaseFansNoticeView tf = this.f;
          if (tf != null && !tf.getVisibility()) {
             tf = (this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight();
             int i = 0;
             if (this.c.getVisibility() != 8) {
                i = this.c.getMeasuredWidth();
                layoutParams = this.c.getLayoutParams();
                layoutParams = layoutParams.rightMargin + layoutParams.leftMargin;
             }else {
                p1 = 0;
             }
             int i1 = Integer.MIN_VALUE;
             this.f.measure(View$MeasureSpec.makeMeasureSpec(tf, i1), View$MeasureSpec.makeMeasureSpec(this.f.getMeasuredHeight(), 0x40000000));
             ViewGroup$MarginLayoutParams layoutParams1 = this.f.getLayoutParams();
             ViewGroup$MarginLayoutParams layoutParams2 = this.g.getLayoutParams();
             tf = ((((((tf - i) - layoutParams) - this.f.getMeasuredWidth()) - layoutParams1.leftMargin) - layoutParams1.rightMargin) - layoutParams2.leftMargin) - layoutParams2.rightMargin;
             if (tf != this.g.getMeasuredWidth()) {
                this.g.measure(View$MeasureSpec.makeMeasureSpec(tf, i1), View$MeasureSpec.makeMeasureSpec(this.g.getMeasuredHeight(), i1));
             }
          }
       }
    label_00b7 :
       return;
    }
    public void setButtonClickListener(LiveIncreaseFansNoticeView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveIncreaseFansNoticeView.class, "6")) {
          return;
       }
       this.f.setOnClickListener(new LiveIncreaseFansNoticeView$a(this, p0));
       return;
    }
    public void setButtonText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveIncreaseFansNoticeView.class, "8")) {
          return;
       }
       this.f.setText(p0);
       return;
    }
    public void setButtonVisibility(int p0){
       if (PatchProxy.isSupport(LiveIncreaseFansNoticeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveIncreaseFansNoticeView.class, "7")) {
          return;
       }
       this.f.setVisibility(p0);
       return;
    }
    public void setContentIconVisibility(int p0){
       if (PatchProxy.isSupport(LiveIncreaseFansNoticeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveIncreaseFansNoticeView.class, "5")) {
          return;
       }
       this.c.setVisibility(p0);
       return;
    }
    public void setFirstLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveIncreaseFansNoticeView.class, "2")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.d.setText(p0);
       return;
    }
    public void setSecondLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveIncreaseFansNoticeView.class, "3")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.e.setText(p0);
       this.e.setVisibility(0);
       return;
    }
}
