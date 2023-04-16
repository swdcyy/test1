package com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.JumpTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Float;
import java.lang.Integer;
import java.util.Locale;
import android.widget.TextView;

public class JumpTextView extends AppCompatTextView	// class@001b63
{
    public ValueAnimator f;

    public void JumpTextView(Context p0){
       super(p0);
    }
    public void JumpTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void JumpTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int getNumber(){
       Object obj = PatchProxy.apply(null, this, JumpTextView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (TextUtils.isEmpty(this.getText())) {
          return i;
       }
       try{
          i = (int)(Float.valueOf(this.getText().toString()).floatValue() * 100.00f);
          return i;
       }catch(java.lang.Exception e0){
       }
    }
    public void setNumber(int p0){
       if (PatchProxy.isSupport(JumpTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, JumpTextView.class, "1")) {
          return;
       }
       Object[] objArray = new Object[]{Float.valueOf(((float)p0 / 100.00f))};
       this.setText(String.format(Locale.getDefault(), "%.2f", objArray));
       return;
    }
}
