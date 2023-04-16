package com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.text.style.ClickableSpan;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class LiveSpannable$a	// class@000d05
{
    public Drawable a;
    public int b;
    public int c;
    public ClickableSpan d;
    public int e;
    public int f;

    public void LiveSpannable$a(int p0){
       super();
       this.a = a1.f(p0);
    }
    public void LiveSpannable$a(Bitmap p0){
       super();
       this.a = new BitmapDrawable(a1.m(), p0);
    }
    public void LiveSpannable$a(Drawable p0){
       super();
       this.a = p0;
    }
    public LiveSpannable$a a(ClickableSpan p0){
       this.d = p0;
       return this;
    }
    public LiveSpannable$a b(int p0){
       this.e = p0;
       return this;
    }
    public LiveSpannable$a c(int p0){
       LiveSpannable$a uoa = LiveSpannable$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.d(p0, p0);
       return this;
    }
    public LiveSpannable$a d(int p0,int p1){
       this.b = p0;
       this.c = p1;
       return this;
    }
}
