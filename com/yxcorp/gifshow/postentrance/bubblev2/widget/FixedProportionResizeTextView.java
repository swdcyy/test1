package com.yxcorp.gifshow.postentrance.bubblev2.widget.FixedProportionResizeTextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;

public final class FixedProportionResizeTextView extends KwaiSizeAdjustableTextView	// class@001041
{
    public final float q;
    public HashMap r;

    public void FixedProportionResizeTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void FixedProportionResizeTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void FixedProportionResizeTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.q = 0x3faaaaab;
    }
    public void FixedProportionResizeTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FixedProportionResizeTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedProportionResizeTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = (int)(this.getTextSize() * this.q);
       if (this.getMaxLines() == 1 && this.getMeasuredHeight() != p0) {
          this.setMeasuredDimension(this.getMeasuredWidth(), p0);
       }
       return;
    }
}
