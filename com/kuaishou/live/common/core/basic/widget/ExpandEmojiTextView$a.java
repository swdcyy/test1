package com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import java.lang.StringBuilder;
import android.text.SpannableString;
import com.kuaishou.live.common.core.basic.widget.a;
import com.kuaishou.live.common.core.basic.widget.b;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;

public class ExpandEmojiTextView$a implements Runnable	// class@000f06
{
    public final String b;
    public final int c;
    public final ExpandEmojiTextView d;

    public void ExpandEmojiTextView$a(ExpandEmojiTextView p0,String p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, ExpandEmojiTextView$a.class, "1")) {
          return;
       }
       ExpandEmojiTextView$a d = obj.d;
       ExpandEmojiTextView$a b = obj.b;
       ExpandEmojiTextView$a c = obj.c;
       Objects.requireNonNull(d);
       if (!PatchProxy.isSupport(ExpandEmojiTextView.class) || (PatchProxy.applyVoidTwoRefs(b, Integer.valueOf(c), d, ExpandEmojiTextView.class, "2") || (c <= null || (!TextUtils.x(b) && d.getWidth() > 0)))) {
          StaticLayout staticLayout = new StaticLayout(b, d.getPaint(), d.getWidth(), Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
          int lineCount = v12.getLineCount();
          if (lineCount <= c) {
             d.setText(b);
          }else {
             ExpandEmojiTextView z = d.z;
             ExpandEmojiTextView a = d.A;
             String str = "...";
             float f = d.getPaint().measureText(str+d.w+z);
             int i = (d.getWidth() - d.getPaddingLeft()) - d.getPaddingRight();
             int i1 = c - 1;
             int lineStart = v12.getLineStart(i1);
             String str1 = b.substring(lineStart, v12.getLineEnd(i1));
             String str2 = "\n";
             int i2 = 0;
             if (str1.endsWith(str2)) {
                str1 = str1.substring(i2, (str1.length() - 1));
             }
             float f1 = d.getPaint().measureText(str1);
             f1 = f1 + f;
             float f2 = (float)i;
             while (f1 - f2 > 0 && (i > 0 && str1.length() > 0)) {
                int i3 = str1.length() - 1;
                str1 = str1.substring(0, i3);
                f1 = d.getPaint().measureText(str1);
                f2 = 0;
             }
             String str3 = str1+str+d.w+z;
             if (c > 1) {
                str3 = b.substring(0, v12.getLineEnd((c - 2)))+str3;
             }
             if ((v12.getLineWidth((lineCount - 1)) + d.getPaint().measureText(d.w+a)) - f2 > 0) {
                b = b+str2;
             }
             String str4 = b+d.w+a;
             SpannableString spannableStr = new SpannableString(str3);
             SpannableString spannableStr1 = new SpannableString(str4);
             spannableStr.setSpan(new a(d, spannableStr1), (str3.length() - z.length()), str3.length(), 33);
             spannableStr1.setSpan(new b(d, spannableStr), (str4.length() - a.length()), str4.length(), 33);
             d.setMovementMethod(LinkMovementMethod.getInstance());
             d.setText(spannableStr);
          }
       }
       return;
    }
}
