package com.yxcorp.gifshow.detail.slidev2.widget.NasaRecoReasonTextLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.CharSequence;
import android.text.TextPaint;

public class NasaRecoReasonTextLayout extends ViewGroup	// class@001a04
{
    public TextView b;
    public TextView c;

    public void NasaRecoReasonTextLayout(Context p0){
       super(p0);
    }
    public void NasaRecoReasonTextLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void NasaRecoReasonTextLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, NasaRecoReasonTextLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a2d58);
       this.c = this.findViewById(0x7f0a2d59);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NasaRecoReasonTextLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NasaRecoReasonTextLayout.class, "3")) {
             return;
          }
       }
       NasaRecoReasonTextLayout tb = this.b;
       tb.layout(0, 0, (tb.getMeasuredWidth() + 0), this.b.getMeasuredHeight());
       int i = this.b.getMeasuredWidth() + 0;
       NasaRecoReasonTextLayout tc = this.c;
       tc.layout(i, 0, (tc.getMeasuredWidth() + i), this.c.getMeasuredHeight());
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(NasaRecoReasonTextLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NasaRecoReasonTextLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = View$MeasureSpec.getSize(p0);
       float f = 0;
       float f1 = (this.b.getText() == null)? 0: this.b.getPaint().measureText(this.b.getText().toString());
       if (this.c.getText() != null) {
          f = this.c.getPaint().measureText(this.c.getText().toString());
       }
       float f2 = (float)p0;
       if ((f1 + f) - f2 > 0) {
          float f3 = (float)(p0 >> 1);
          if (f1 - f3 > 0 && f - f3 > 0) {
             f1 = f3;
             f = f1;
          }else if(f1 - f3 < 0){
             f = f2 - f1;
          }else {
             f1 = f2 - f;
          }
       }
       this.b.measure(View$MeasureSpec.makeMeasureSpec((int)f1, 0x40000000), p1);
       this.c.measure(View$MeasureSpec.makeMeasureSpec((int)f, 0x40000000), p1);
       this.setMeasuredDimension((this.b.getMeasuredWidth() + this.c.getMeasuredWidth()), ViewGroup.getDefaultSize(0, p1));
       return;
    }
}
