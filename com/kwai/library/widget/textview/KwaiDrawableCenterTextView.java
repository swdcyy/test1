package com.kwai.library.widget.textview.KwaiDrawableCenterTextView;
import com.kwai.library.widget.textview.KwaiBaseTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.widget.TextView;
import java.lang.String;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.Object;
import android.text.TextPaint;
import android.graphics.drawable.Drawable;

public class KwaiDrawableCenterTextView extends KwaiBaseTextView	// class@000a46
{
    public Drawable[] n;
    public float o;
    public float p;
    public int q;

    public void KwaiDrawableCenterTextView(Context p0){
       super(p0, null);
    }
    public void KwaiDrawableCenterTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiDrawableCenterTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = null;
       this.q = 2;
       this.u();
    }
    public void onDraw(Canvas p0){
       if (this.q == 2) {
          p0.translate((((float)this.getWidth() - this.o) / 2.00f), 0);
       }else {
          p0.translate(0, (((float)this.getHeight() - this.p) / 2.00f));
       }
       super.onDraw(p0);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.t();
    }
    public void setText(String p0){
       if (p0.equals(this.getText().toString())) {
          return;
       }
       super.setText(p0);
       this.u();
       this.t();
       this.postInvalidate();
       return;
    }
    public final void t(){
       KwaiDrawableCenterTextView tn = this.n;
       int i = 0;
       object oobject = tn[i];
       int i1 = 1;
       object oobject1 = tn[i1];
       object oobject2 = tn[2];
       if (oobject2 != null && this.getText() != null) {
          this.o = (this.getPaint().measureText(this.getText().toString()) + (float)oobject2.getIntrinsicWidth()) + (float)this.getCompoundDrawablePadding();
          this.setPadding(i, i, (int)((float)this.getWidth() - this.o), i);
          this.q = 2;
       }else if(oobject != null && this.getText() != null){
          this.o = (this.getPaint().measureText(this.getText().toString()) + (float)oobject.getIntrinsicWidth()) + (float)this.getCompoundDrawablePadding();
          this.q = 2;
       }else if(oobject1 != null && this.getText() != null){
          this.p = ((this.getTextSize() + 20.00f) + (float)oobject1.getIntrinsicHeight()) + (float)this.getCompoundDrawablePadding();
          this.setPadding(i, i, i, (int)((float)this.getHeight() - this.p));
          this.q = i1;
       }
       return;
    }
    public final void u(){
       this.n = this.getCompoundDrawables();
    }
}
