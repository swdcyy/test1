package com.yxcorp.gifshow.postentrance.bubblev2.widget.FixedProportionMediumStyleTextView;
import com.kwai.library.widget.textview.KwaiSimpleMediumStyleTextView;
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

public final class FixedProportionMediumStyleTextView extends KwaiSimpleMediumStyleTextView	// class@001040
{
    public final float r;
    public HashMap s;

    public void FixedProportionMediumStyleTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void FixedProportionMediumStyleTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void FixedProportionMediumStyleTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.r = 0x3faaaaab;
    }
    public void FixedProportionMediumStyleTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
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
       if (PatchProxy.isSupport(FixedProportionMediumStyleTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedProportionMediumStyleTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = (int)(this.getTextSize() * this.r);
       if (this.getMaxLines() == 1 && this.getMeasuredHeight() != p0) {
          this.setMeasuredDimension(this.getMeasuredWidth(), p0);
       }
       return;
    }
}
