package com.kwai.slide.play.detail.information.caption.CaptionTextView;
import com.yxcorp.gifshow.widget.textview.ClickablePressedSpanTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.kwai.slide.play.detail.information.caption.CaptionTextView$a;

public class CaptionTextView extends ClickablePressedSpanTextView	// class@0017c8
{
    public CaptionTextView$a t;

    public void CaptionTextView(Context p0){
       super(p0);
    }
    public void CaptionTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void CaptionTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CaptionTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CaptionTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       CaptionTextView tt = this.t;
       if (tt != null) {
          tt.a(this.getMeasuredWidth(), this.getMeasuredHeight());
          this.t = null;
       }
       return;
    }
    public void setOnMeasureListener(CaptionTextView$a p0){
       this.t = p0;
    }
}
