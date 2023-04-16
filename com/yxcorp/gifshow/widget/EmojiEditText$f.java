package com.yxcorp.gifshow.widget.EmojiEditText$f;
import android.text.InputFilter;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.Spanned;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.text.TextUtils;
import android.text.SpannableString;
import android.text.Spannable;

public class EmojiEditText$f implements InputFilter	// class@001834
{

    public void EmojiEditText$f(){
       super();
    }
    public CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       String str1;
       int i = 0;
       if (PatchProxy.isSupport(EmojiEditText$f.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          p3 = PatchProxy.apply(objArray, this, EmojiEditText$f.class, "1");
          if (p3 != PatchProxyResult.class) {
             return p3;
          }
       }
       int i1 = p1;
       while (true) {
          if (i1 >= p2) {
             return null;
          }
          if (0xff03 == p0.charAt(i1)) {
             char[] uocharArray = new char[(p2 - p1)];
             TextUtils.getChars(p0, p1, p2, uocharArray, i);
             String str = new String(uocharArray);
             str1 = str.replace(0xff03, '#');
             if (p0 instanceof Spanned) {
                break ;
             }else {
                return str1;
             }
          }else {
             i1++;
          }
       }
       SpannableString spannableStr = new SpannableString(str1);
       TextUtils.copySpansFrom(p0, p1, p2, null, spannableStr, 0);
       return spannableStr;
    }
}
