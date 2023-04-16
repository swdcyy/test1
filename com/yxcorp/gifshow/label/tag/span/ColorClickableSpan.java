package com.yxcorp.gifshow.label.tag.span.ColorClickableSpan;
import lnc.o7;
import hya.d;
import android.text.style.URLSpan;
import android.app.Application;
import o56.a;
import android.content.Context;
import ync.a;
import java.lang.String;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import com.kwai.robust.PatchProxyResult;
import android.text.TextPaint;
import android.text.style.ClickableSpan;

public class ColorClickableSpan extends URLSpan implements o7, d	// class@001a12
{
    public final String b;
    public int c;
    public int d;
    public int e;
    public View$OnClickListener f;
    public View$OnLongClickListener g;
    public boolean h;
    public static int i;

    static {
       ColorClickableSpan.i = a.d(a.b());
    }
    public void ColorClickableSpan(String p0,String p1){
       super(p0);
       this.b = p1;
    }
    public void a(View p0,boolean p1){
       if (PatchProxy.isSupport(ColorClickableSpan.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ColorClickableSpan.class, "3")) {
          return;
       }
       this.h = p1;
       p0.invalidate();
       return;
    }
    public String b(){
       return this.b;
    }
    public ColorClickableSpan c(int p0){
       this.c = p0;
       return this;
    }
    public ColorClickableSpan d(int p0){
       this.d = p0;
       return this;
    }
    public ColorClickableSpan e(View$OnClickListener p0){
       this.f = p0;
       return this;
    }
    public ColorClickableSpan f(View$OnLongClickListener p0){
       this.g = p0;
       return this;
    }
    public ColorClickableSpan g(int p0){
       this.e = p0;
       return this;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ColorClickableSpan.class, "2")) {
          return;
       }
       ColorClickableSpan tf = this.f;
       if (tf != null) {
          tf.onClick(p0);
       }
       return;
    }
    public boolean onLongClick(View p0){
       ColorClickableSpan obj = PatchProxy.applyOneRefs(p0, this, ColorClickableSpan.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (obj != null) {
          return obj.onLongClick(p0);
       }
       return false;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ColorClickableSpan.class, "1")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       ColorClickableSpan td = this.d;
       if (td == null) {
          p0.setColor(ColorClickableSpan.i);
       }else if(this.h != null){
          ColorClickableSpan te = this.e;
          if (te != null) {
             td = te;
          }
       }
       p0.setColor(td);
       return;
    }
}
