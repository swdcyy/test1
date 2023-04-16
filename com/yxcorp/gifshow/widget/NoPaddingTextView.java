package com.yxcorp.gifshow.widget.NoPaddingTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.widget.TextView;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;

public class NoPaddingTextView extends AppCompatTextView	// class@001890
{
    public final Paint f;
    public final Rect g;

    public void NoPaddingTextView(Context p0){
       super(p0);
       this.g = new Rect();
       this.f = this.getPaint();
    }
    public void NoPaddingTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = new Rect();
       this.f = this.getPaint();
    }
    public void NoPaddingTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = new Rect();
       this.f = this.getPaint();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NoPaddingTextView.class, "1")) {
          return;
       }
       NoPaddingTextView tg = this.g;
       Rect left = tg.left;
       tg.offset((- left), (- tg.top));
       this.f.setAntiAlias(true);
       this.f.setColor(this.getCurrentTextColor());
       p0.drawText(this.p(), (float)(- left), (float)(this.g.bottom - tg.bottom), this.f);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(NoPaddingTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NoPaddingTextView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.p();
       this.setMeasuredDimension((this.g.width() + 1), ((- this.g.top) + 2));
       return;
    }
    public final String p(){
       String obj = PatchProxy.apply(null, this, NoPaddingTextView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getText().toString();
       int i = obj.length();
       this.f.setTextSize(this.getTextSize());
       this.f.getTextBounds(obj, 0, i, this.g);
       if (!i) {
          NoPaddingTextView tg = this.g;
          tg.right = tg.left;
       }
       return obj;
    }
}
