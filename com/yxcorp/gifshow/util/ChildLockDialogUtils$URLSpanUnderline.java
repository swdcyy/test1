package com.yxcorp.gifshow.util.ChildLockDialogUtils$URLSpanUnderline;
import android.text.style.URLSpan;
import java.lang.String;
import android.text.TextPaint;
import android.text.style.ClickableSpan;

public class ChildLockDialogUtils$URLSpanUnderline extends URLSpan	// class@001ed4
{

    public void ChildLockDialogUtils$URLSpanUnderline(String p0){
       super(p0);
    }
    public void updateDrawState(TextPaint p0){
       super.updateDrawState(p0);
       p0.setUnderlineText(true);
    }
}
