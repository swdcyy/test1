package com.kwai.slide.play.detail.bottom.generalbottomentry.GeneralBottomEntryTextLayout;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;
import android.view.View$MeasureSpec;
import android.widget.LinearLayout$LayoutParams;
import android.text.TextPaint;

public class GeneralBottomEntryTextLayout extends PriorityLinearLayout	// class@0017a2
{
    public TextView g;
    public TextView h;
    public ViewGroup i;
    public View j;

    public void GeneralBottomEntryTextLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GeneralBottomEntryTextLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, GeneralBottomEntryTextLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.g = this.findViewById(0x7f0a107f);
       this.h = this.findViewById(0x7f0a1082);
       this.i = this.findViewById(0x7f0a1085);
       this.j = this.findViewById(0x7f0a1081);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(GeneralBottomEntryTextLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GeneralBottomEntryTextLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.i.getVisibility() == 8 && (this.j.getVisibility() != 8 && (!this.i.getMeasuredWidth() && (!this.j.getMeasuredWidth() || (this.i.getLayoutParams() == null || (this.g.getLayoutParams() == null || (this.j.getLayoutParams() != null && this.h.getText() != null))))))) {
          p0 = View$MeasureSpec.getSize(p0);
          LinearLayout$LayoutParams layoutParams = this.g.getLayoutParams();
          LinearLayout$LayoutParams layoutParams1 = this.i.getLayoutParams();
          LinearLayout$LayoutParams layoutParams2 = this.j.getLayoutParams();
          float f = (float)((this.i.getMeasuredWidth() + layoutParams1.leftMargin) + layoutParams1.rightMargin) + this.h.getPaint().measureText(this.h.getText().toString());
          if (!this.g.getVisibility()) {
             f = f + (float)((this.g.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin);
          }
          if (!this.j.getVisibility()) {
             f = f + (float)((this.j.getMeasuredWidth() + layoutParams2.leftMargin) + layoutParams2.rightMargin);
          }
          if (f - (float)p0 > 0) {
             this.i.setVisibility(8);
             this.j.setVisibility(8);
          }
       }
    label_00da :
       return;
    }
}
