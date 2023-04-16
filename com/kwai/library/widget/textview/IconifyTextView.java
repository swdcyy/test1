package com.kwai.library.widget.textview.IconifyTextView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.TextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class IconifyTextView extends SizeAdjustableTextView	// class@000a3e
{
    public int q;

    public void IconifyTextView(Context p0){
       super(p0, null);
    }
    public void IconifyTextView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void IconifyTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.q = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.o1);
       this.q = typedArray.getDimensionPixelSize(0, 0);
       typedArray.recycle();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       IconifyTextView tq = this.q;
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
       if (TextUtils.x(p0)) {
          this.setVisibility(8);
       }else {
          this.setText(p0);
          this.setVisibility(0);
       }
       return;
    }
}
