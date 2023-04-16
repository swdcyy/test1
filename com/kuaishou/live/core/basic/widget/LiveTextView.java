package com.kuaishou.live.core.basic.widget.LiveTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.TextView;
import java.lang.String;
import d61.f0;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import java.lang.CharSequence;
import java.lang.Boolean;

public class LiveTextView extends EmojiTextView	// class@000914
{
    public boolean v;
    public boolean w;

    public void LiveTextView(Context p0){
       super(p0, null);
    }
    public void LiveTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.X2);
          int i = 0;
          this.w = typedArray.getBoolean(i, true);
          this.v = typedArray.getBoolean(3, true);
          if (typedArray.getBoolean(true, i)) {
             f0.f(this, "sans-serif-medium");
          }
          if (typedArray.getBoolean(2, i)) {
             f0.i(this, this.getContext());
          }
          typedArray.recycle();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTextView.class, "4")) {
          return;
       }
       if (this.w != null) {
          Drawable[] compoundDraw = this.getCompoundDrawables();
          if (compoundDraw != null) {
             object oobject = compoundDraw[0];
             if (oobject != null) {
                p0.translate((((float)this.getWidth() - ((this.getPaint().measureText(this.getText().toString()) + (float)oobject.getIntrinsicWidth()) + (float)this.getCompoundDrawablePadding())) / 2.00f), 0);
             }else if(this.getGravity() != 17){
                this.setGravity(17);
             }
          }
       }
       super.onDraw(p0);
       return;
    }
    public void setEnableLeftDrawableCenter(boolean p0){
       this.w = p0;
    }
    public void setEnableMediumFontFamily(boolean p0){
       if (PatchProxy.isSupport(LiveTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveTextView.class, "2")) {
          return;
       }
       f0.f(this, "sans-serif-medium");
       return;
    }
    public void setEnableNumberTypeface(boolean p0){
       if (PatchProxy.isSupport(LiveTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveTextView.class, "3")) {
          return;
       }
       f0.i(this, this.getContext());
       return;
    }
    public void setEnablePressedAlphaEffect(boolean p0){
       this.v = p0;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(LiveTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveTextView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (this.v != null) {
          float f = (p0)? 0x3f000000: 0x3f800000;
          this.setAlpha(f);
       }
       return;
    }
}
