package com.yxcorp.gifshow.homepage.tab.DrawableResBackground;
import pua.a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.homepage.tab.DrawableResBackground$drawable$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class DrawableResBackground extends a	// class@001809
{
    public final p e;
    public final int f;
    public final Context g;

    public void DrawableResBackground(int p0,Context p1){
       a.p(p1, "context");
       super();
       this.f = p0;
       this.g = p1;
       this.e = s.c(new DrawableResBackground$drawable$2(this));
    }
    public void c(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawableResBackground.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       Drawable uDrawable = this.j();
       if (uDrawable != null) {
          uDrawable.draw(p0);
       }
       return;
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, DrawableResBackground.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.f);
    }
    public void h(int p0){
       DrawableResBackground uDrawableRes = DrawableResBackground.class;
       if (PatchProxy.isSupport(uDrawableRes) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDrawableRes, "5")) {
          return;
       }
       Drawable uDrawable = this.j();
       if (uDrawable != null) {
          uDrawable.setAlpha(p0);
       }
       return;
    }
    public void i(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DrawableResBackground.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DrawableResBackground.class, "2")) {
          return;
       }
       Drawable uDrawable = this.j();
       if (uDrawable != null) {
          uDrawable.setBounds(p0, p1, p2, p3);
       }
       return;
    }
    public final Drawable j(){
       Object obj = PatchProxy.apply(null, this, DrawableResBackground.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
}
