package com.yxcorp.gifshow.model.response.dialog.KemBottomDialogResponse$DialogButton;
import java.io.Serializable;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Color;
import java.lang.Exception;
import android.text.style.ForegroundColorSpan;
import android.text.style.AbsoluteSizeSpan;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class KemBottomDialogResponse$DialogButton implements Serializable	// class@001f76
{
    public String content;
    public String contentColor;
    public int contentWordSize;
    public String iconUrl;
    public String linkUrl;
    public static final long serialVersionUID = 0xe9703ab0bf5959b;

    public void KemBottomDialogResponse$DialogButton(){
       super();
    }
    public void decorateSpannable(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemBottomDialogResponse$DialogButton.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(this.content)) {
          return;
       }
       int i = 0xff000000;
       try{
          i = Color.parseColor(this.contentColor);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       KemBottomDialogResponse$DialogButton tcontentWord = this.contentWordSize;
       if (tcontentWord == null) {
          tcontentWord = 12;
       }
       int i1 = p0.length();
       p0.append(this.content);
       int i2 = p0.length();
       p0.setSpan(new ForegroundColorSpan(i), i1, i2, 17);
       p0.setSpan(new AbsoluteSizeSpan(tcontentWord, true), i1, i2, 17);
       return;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, KemBottomDialogResponse$DialogButton.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.iconUrl) && (!TextUtils.isEmpty(this.content) && (!TextUtils.isEmpty(this.contentColor) && (this.contentWordSize > null && !TextUtils.isEmpty(this.linkUrl)))))? true: false;
       return b;
    }
}
