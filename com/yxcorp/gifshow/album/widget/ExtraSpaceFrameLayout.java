package com.yxcorp.gifshow.album.widget.ExtraSpaceFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.Layout;
import android.graphics.Rect;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import com.yxcorp.utility.RomUtils;
import com.yxcorp.gifshow.album.widget.ExtraSpaceFrameLayout$a;

public class ExtraSpaceFrameLayout extends FrameLayout	// class@001b05
{

    public void ExtraSpaceFrameLayout(Context p0){
       super(p0);
    }
    public void ExtraSpaceFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ExtraSpaceFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int a(TextView p0){
       int i1;
       Layout obj = PatchProxy.applyOneRefs(p0, this, ExtraSpaceFrameLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       int i = p0.getLineCount() - 1;
       if (i >= 0) {
          Rect rect = new Rect();
          i1 = rect.bottom - (p0.getLineBounds(i, rect) + p0.getLayout().getPaint().getFontMetricsInt().descent);
       }
       return i1;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ExtraSpaceFrameLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ExtraSpaceFrameLayout.class, "2")) {
             return;
          }
       }
       if (this.getChildCount() != 1 || !this.getChildAt(0) instanceof SizeAdjustableTextView) {
          super.onLayout(p0, p1, p2, p3, p4);
          return;
       }else {
          this.getChildAt(0).layout(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ExtraSpaceFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ExtraSpaceFrameLayout.class, "1")) {
          return;
       }
       int i = 1;
       if (this.getChildCount() < i) {
          super.onMeasure(p0, p1);
          return;
       }else {
          View childAt = this.getChildAt(0);
          v3 = childAt instanceof TextView;
          if (!RomUtils.s() && !RomUtils.o()) {
             i = 0;
          }
          if (v3 && (i && childAt instanceof ExtraSpaceFrameLayout$a)) {
             childAt.measure(p0, p1);
             this.setMeasuredDimension(childAt.getMeasuredWidth(), (childAt.getMeasuredHeight() - this.a(childAt)));
             return;
          }else {
             super.onMeasure(p0, p1);
             return;
          }
       }
    }
}
