package com.yxcorp.gifshow.widget.EllipsisEndEmojiTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import android.text.TextUtils$TruncateAt;
import android.widget.TextView;
import android.text.Layout;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;

public class EllipsisEndEmojiTextView extends EmojiTextView	// class@00182c
{

    public void EllipsisEndEmojiTextView(Context p0){
       super(p0);
    }
    public void EllipsisEndEmojiTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void EllipsisEndEmojiTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public static boolean v(char p0){
       boolean b = (p0 && (p0 != 9 && (p0 != 10 && (p0 != 13 && (p0 < ' ' || (p0 > 0xd7ff && (p0 < 0xe000 || p0 > 0xfffd)))))))? true: false;
       return b;
    }
    public static boolean w(char p0,char p1){
       if (PatchProxy.isSupport(EllipsisEndEmojiTextView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Character.valueOf(p0), Character.valueOf(p1), null, EllipsisEndEmojiTextView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = ((Integer.toHexString(p0)).compareTo("dc00") >= 0 && ((Integer.toHexString(p0)).compareTo("dfff") <= 0 && !(Integer.toHexString(p1)).equals("200D")))? true: false;
       return b;
    }
    public boolean onPreDraw(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SpannableStringBuilder obj = PatchProxy.apply(objArray, this, EllipsisEndEmojiTextView.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = super.onPreDraw();
       if (this.getEllipsize() != TextUtils$TruncateAt.END) {
          return b;
       }
       Layout layout = this.getLayout();
       if (layout == null) {
          return b;
       }
       CharSequence text = layout.getText();
       CharSequence text1 = this.getText();
       if (!TextUtils.n(text, text1) && (TextUtils.x(text) || TextUtils.x(text1))) {
          return b;
       }
       Object obj1 = PatchProxy.applyOneRefs(text, objArray, EllipsisEndEmojiTextView.class, "2");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          int i1 = text.length();
          while (i1 > 0) {
             int i2 = i1 - 1;
             if (TextUtils.n(text.subSequence(i2, i1), "бн")) {
                objArray = text.subSequence(0, i2);
                break ;
             }
             i1 = i2;
          }
       }
       if (TextUtils.x(objArray)) {
          return b;
       }else if(EllipsisEndEmojiTextView.v(objArray.charAt((objArray.length() - 1))) && (text1.length() > (objArray.length() + 1) && (!EllipsisEndEmojiTextView.w(objArray.charAt((objArray.length() - 1)), text1.charAt(objArray.length())) && EllipsisEndEmojiTextView.w(text1.charAt(objArray.length()), text1.charAt((objArray.length() + 1)))))){
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(text1.subSequence(0, (objArray.length() + 1)));
          spannableStr.append("бн");
          SpannableStringBuilder spannableStr1 = spannableStr;
          if (this.getPaint().measureText(spannableStr1, 0, spannableStr1.length()) - (float)this.getMeasuredWidth() <= 0) {
             this.setText(spannableStr1);
             return 0;
          }
       }
    label_00ed :
       Object[] objArray1 = objArray;
       while (objArray1.length() > 0) {
          int i = objArray1.length() - 1;
          if (EllipsisEndEmojiTextView.v(objArray1.charAt(i)) && text1.length() > objArray1.length()) {
             i = objArray1.length() - 1;
             if (!EllipsisEndEmojiTextView.w(objArray1.charAt(i), text1.charAt(objArray1.length()))) {
                i = objArray1.length() - 1;
                objArray1 = objArray1.subSequence(0, i);
             }else if(TextUtils.n(objArray, objArray1)){
                return b;
             }else {
                obj = new SpannableStringBuilder(objArray1);
                obj.append("бн");
                this.setText(obj);
                return 0;
             }
          }else {
             goto label_0131 ;
          }
       }
    }
}
