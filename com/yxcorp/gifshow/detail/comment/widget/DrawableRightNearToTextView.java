package com.yxcorp.gifshow.detail.comment.widget.DrawableRightNearToTextView;
import com.yxcorp.gifshow.detail.comment.widget.DrawableRightTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;

public class DrawableRightNearToTextView extends DrawableRightTextView	// class@001394
{

    public void DrawableRightNearToTextView(Context p0){
       super(p0);
    }
    public void DrawableRightNearToTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DrawableRightNearToTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawableRightNearToTextView.class, "1")) {
          return;
       }
       object oobject = this.getCompoundDrawables()[0];
       int i = (oobject != null)? (oobject.getIntrinsicWidth() + 0) + this.getCompoundDrawablePadding(): 0;
       object oobject1 = this.getCompoundDrawables()[2];
       if (oobject1 != null) {
          int intrinsicWid = oobject1.getIntrinsicWidth();
          i = - (int)((float)this.getWidth() - ((((float)i + this.getPaint().measureText(this.getText().toString())) + (float)this.getCompoundDrawablePadding()) + (float)intrinsicWid));
          oobject1.setBounds(i, 0, (intrinsicWid + i), oobject1.getIntrinsicHeight());
       }
       super.onDraw(p0);
       return;
    }
}
