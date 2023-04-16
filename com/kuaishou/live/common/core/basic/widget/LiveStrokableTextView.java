package com.kuaishou.live.common.core.basic.widget.LiveStrokableTextView;
import com.lsjwzh.widget.text.FastTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.CharSequence;
import android.text.Spanned;
import q38.a;
import q38.b;
import y51.d;

public class LiveStrokableTextView extends FastTextView	// class@000f27
{
    public boolean o;
    public boolean p;

    public void LiveStrokableTextView(Context p0){
       super(p0, null);
    }
    public void LiveStrokableTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveStrokableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       int len;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStrokableTextView.class, "1")) {
          return;
       }
       System.currentTimeMillis();
       CharSequence text = this.getText();
       if (text instanceof Spanned) {
          a[] uoaArray = b.b(text);
          d[] spans = text.getSpans(0, text.length(), d.class);
          if (this.o == null) {
             b.c(uoaArray);
          }
          if (this.p == null && (spans != null && spans.length > 0)) {
             len = spans.length;
             for (int i = 0; i < len; i = i + 1) {
                spans[i].a(true);
             }
          }
          super.onDraw(p0);
          b.a(uoaArray);
          int len1 = spans.length;
          for (len = 0; len < len1; len = len + 1) {
             spans[len].a(0);
          }
       }
       super.onDraw(p0);
       System.currentTimeMillis();
       return;
    }
    public void setIsDisableShadow(boolean p0){
       this.p = p0;
    }
    public void setIsDisableStrokableText(boolean p0){
       this.o = p0;
    }
}
