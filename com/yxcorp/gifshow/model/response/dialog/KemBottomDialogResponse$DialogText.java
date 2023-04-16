package com.yxcorp.gifshow.model.response.dialog.KemBottomDialogResponse$DialogText;
import java.io.Serializable;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Color;
import java.lang.Exception;
import android.text.style.ForegroundColorSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import com.kwai.robust.PatchProxyResult;

public class KemBottomDialogResponse$DialogText implements Serializable	// class@001f77
{
    public String color;
    public String content;
    public boolean isBold;
    public int wordSize;
    public static final long serialVersionUID = 0xca82d6ba34e1f769;

    public void KemBottomDialogResponse$DialogText(){
       super();
    }
    public void decorateSpannable(SpannableStringBuilder p0,boolean p1){
       if (PatchProxy.isSupport(KemBottomDialogResponse$DialogText.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KemBottomDialogResponse$DialogText.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(this.content)) {
          return;
       }
       int i = 0xff000000;
       try{
          i = Color.parseColor(this.color);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       KemBottomDialogResponse$DialogText twordSize = this.wordSize;
       if (twordSize == null) {
          twordSize = 12;
       }
       int i1 = p0.length();
       p0.append(this.content);
       int i2 = p0.length();
       p0.setSpan(new ForegroundColorSpan(i), i1, i2, 17);
       p0.setSpan(new AbsoluteSizeSpan(twordSize, true), i1, i2, 17);
       if (this.isBold != null) {
          p0.setSpan(new StyleSpan(true), i1, i2, 17);
       }
       if (p1) {
          p0.append(" ");
       }
       return;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, KemBottomDialogResponse$DialogText.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.content) && (!TextUtils.isEmpty(this.color) && this.wordSize > null))? true: false;
       return b;
    }
}
