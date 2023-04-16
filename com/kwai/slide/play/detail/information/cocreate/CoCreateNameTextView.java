package com.kwai.slide.play.detail.information.cocreate.CoCreateNameTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.widget.TextView;
import android.text.Layout;
import lnc.a1;
import android.text.TextPaint;
import java.lang.CharSequence;
import usd.q;
import java.lang.StringBuilder;

public final class CoCreateNameTextView extends AppCompatTextView	// class@0017e4
{
    public HashMap f;

    public void CoCreateNameTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void CoCreateNameTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void CoCreateNameTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void CoCreateNameTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
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
       if (PatchProxy.isSupport(CoCreateNameTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CoCreateNameTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (!this.getLineCount()) {
          return;
       }
       if (this.getLayout() == null) {
          return;
       }
       String str = this.getText().toString();
       float f = (float)q.B((int)this.getPaint().measureText(this.getText().toString()), a1.d(0x7f0702cc), a1.d(0x7f07031d));
       if (this.getPaint().measureText(str) - f <= 0) {
          return;
       }
       while (this.getPaint().measureText(str+8230) - f > 0) {
          int i = str.length() - 1;
          str = str.substring(0, i);
          a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       this.setText(str+8230);
       return;
    }
}
