package com.kwai.live.gzone.widget.WidthAdjustableTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Math;

public class WidthAdjustableTextView extends AppCompatTextView	// class@000e89
{

    public void WidthAdjustableTextView(Context p0){
       super(p0, null);
    }
    public void WidthAdjustableTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void WidthAdjustableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(WidthAdjustableTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, WidthAdjustableTextView.class, "1")) {
          return;
       }
       super.onMeasure(View$MeasureSpec.makeMeasureSpec(0, 0), p1);
       int measuredWidt = this.getMeasuredWidth();
       super.onMeasure(p0, p1);
       float f = this.getPaint().measureText(TextUtils.H(this).toString());
       if (f > 0) {
          measuredWidt = (int)Math.min(f, (float)measuredWidt);
       }
       this.setMeasuredDimension(Math.min(measuredWidt, this.getMeasuredWidth()), this.getMeasuredHeight());
       this.forceLayout();
       return;
    }
}
