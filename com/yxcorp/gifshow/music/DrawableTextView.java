package com.yxcorp.gifshow.music.DrawableTextView;
import android.widget.TextView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import java.lang.CharSequence;
import java.util.Objects;
import kotlin.text.StringsKt__StringsKt;

public final class DrawableTextView extends TextView	// class@001fcc
{

    public void DrawableTextView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void DrawableTextView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void DrawableTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawableTextView.class, "1")) {
          return;
       }
       Drawable[] compoundDraw = this.getCompoundDrawables();
       a.o(compoundDraw, "compoundDrawables");
       int i = 0;
       object oobject = compoundDraw[i];
       object oobject1 = compoundDraw[2];
       int intrinsicWid = (oobject != null)? oobject.getIntrinsicWidth(): 0;
       int intrinsicWid1 = (oobject1 != null)? oobject1.getIntrinsicWidth(): 0;
       if (oobject != null && oobject1 != null) {
          i = this.getCompoundDrawablePadding() * 2;
       }else if(oobject != null || oobject1 != null){
          i = this.getCompoundDrawablePadding();
       }
       String str = this.getText().toString();
       Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
       float f = ((((float)(intrinsicWid + i) + this.getPaint().measureText(StringsKt__StringsKt.o5(str).toString())) + (float)intrinsicWid1) + (float)this.getPaddingStart()) + (float)this.getPaddingEnd();
       if (p0 != null) {
          p0.save();
       }
       if (p0 != null) {
          p0.translate((((float)this.getWidth() - f) / (float)2), 0);
       }
       super.onDraw(p0);
       return;
    }
}
