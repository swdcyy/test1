package com.yxcorp.gifshow.detail.slidev2.widget.NasaRecoReasonTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.text.TextUtils$TruncateAt;
import android.widget.TextView;
import android.text.Layout;

public class NasaRecoReasonTextView extends AppCompatTextView	// class@001a05
{

    public void NasaRecoReasonTextView(Context p0){
       super(p0);
    }
    public void NasaRecoReasonTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void NasaRecoReasonTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(NasaRecoReasonTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NasaRecoReasonTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.getEllipsize() == TextUtils$TruncateAt.END) {
          p1 = 1;
          if (this.getLineCount() == p1 && (this.getMaxLines() == p1 && this.getLayout().getLineCount() == p1)) {
             p0 = (int)this.getLayout().getLineWidth(0);
             if (p0 != this.getMeasuredWidth()) {
                this.setMeasuredDimension(p0, this.getMeasuredHeight());
             }
          }
       }
       return;
    }
}
