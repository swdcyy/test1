package com.kwai.library.widget.textview.DrawableCenterTextView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.String;

public class DrawableCenterTextView extends SizeAdjustableTextView	// class@000a33
{

    public void DrawableCenterTextView(Context p0){
       super(p0);
    }
    public void DrawableCenterTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DrawableCenterTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       Drawable[] compoundDraw = this.getCompoundDrawables();
       if (compoundDraw != null) {
          object oobject = compoundDraw[0];
          if (oobject != null) {
             p0.translate((((float)this.getWidth() - ((this.getPaint().measureText(this.getText().toString()) + (float)oobject.getIntrinsicWidth()) + (float)this.getCompoundDrawablePadding())) / 2.00f), 0);
          }else if(this.getGravity() != 17){
             this.setGravity(17);
          }
       }
       super.onDraw(p0);
       return;
    }
}
