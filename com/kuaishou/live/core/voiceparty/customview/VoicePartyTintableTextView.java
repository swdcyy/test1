package com.kuaishou.live.core.voiceparty.customview.VoicePartyTintableTextView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Rect;
import java.lang.Integer;
import androidx.core.graphics.drawable.a;

public class VoicePartyTintableTextView extends SizeAdjustableTextView	// class@0014c2
{

    public void VoicePartyTintableTextView(Context p0){
       super(p0, null);
    }
    public void VoicePartyTintableTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTintableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public static boolean u(int p0,int p1){
       boolean b = ((p0 & p1) == p1)? true: false;
       return b;
    }
    public void onDraw(Canvas p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTintableTextView.class, "1")) {
          return;
       }
       Drawable[] compoundDraw = this.getCompoundDrawables();
       if (compoundDraw != null) {
          object oobject = compoundDraw[0];
          if (oobject != null) {
             float f = this.getPaint().measureText(this.getText().toString());
             int compoundDraw1 = this.getCompoundDrawablePadding();
             Object obj = PatchProxy.applyOneRefs(oobject, this, VoicePartyTintableTextView.class, "2");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                int i1 = oobject.getBounds().width();
                i = (i1 <= 0)? oobject.getIntrinsicWidth(): i1;
             }
             p0.translate((((float)this.getWidth() - ((f + (float)i) + (float)compoundDraw1)) / 2.00f), 0);
          }else if(this.getGravity() != 17){
             this.setGravity(17);
          }
       }
       super.onDraw(p0);
       return;
    }
    public void setTintColor(int p0){
       if (PatchProxy.isSupport(VoicePartyTintableTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTintableTextView.class, "3")) {
          return;
       }
       int i = 9;
       if (!PatchProxy.isSupport(VoicePartyTintableTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(i), this, VoicePartyTintableTextView.class, "4")) {
          if (VoicePartyTintableTextView.u(i, 1)) {
             this.setTextColor(p0);
          }
          if (VoicePartyTintableTextView.u(i, 8)) {
             Drawable background = this.getBackground();
             if (background != null) {
                background = a.r(background);
                a.n(background, p0);
                this.setBackground(background);
             }
          }
       }
    label_0056 :
       return;
    }
}
