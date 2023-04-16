package com.kwai.library.widget.textview.KwaiIconifyTextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.TextView;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KwaiIconifyTextView extends KwaiSizeAdjustableTextView	// class@000a4f
{
    public int q;

    public void KwaiIconifyTextView(Context p0){
       super(p0, null);
    }
    public void KwaiIconifyTextView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void KwaiIconifyTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.q = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.U1);
       this.q = typedArray.getDimensionPixelSize(0, 0);
       typedArray.recycle();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       KwaiIconifyTextView tq = this.q;
       if (tq > null) {
          this.setTranslationX((float)(tq - (this.getWidth() / 2)));
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void setNumber(int p0){
       this.setText(String.valueOf(p0));
       if (p0 <= 0) {
          this.setVisibility(8);
       }else {
          this.setVisibility(0);
       }
       return;
    }
    public void setNumber(String p0){
       if (TextUtils.isEmpty(p0)) {
          this.setVisibility(8);
       }else {
          this.setText(p0);
          this.setVisibility(0);
       }
       return;
    }
}
