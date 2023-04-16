package com.yxcorp.utility.TextUtils$URLSpanNoUnderline;
import android.text.style.URLSpan;
import java.lang.String;
import android.text.TextPaint;
import android.text.style.ClickableSpan;

public class TextUtils$URLSpanNoUnderline extends URLSpan	// class@0009ae
{

    public void TextUtils$URLSpanNoUnderline(String p0){
       super(p0);
    }
    public void updateDrawState(TextPaint p0){
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
    }
}
