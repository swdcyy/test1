package com.yxcorp.gifshow.homepage.tab.ColorBackground;
import pua.a;
import com.yxcorp.gifshow.homepage.tab.ColorBackground$drawable$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.drawable.ColorDrawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class ColorBackground extends a	// class@001807
{
    public final p e;
    public final int f;

    public void ColorBackground(int p0){
       super();
       this.f = p0;
       this.e = s.c(new ColorBackground$drawable$2(this));
    }
    public void c(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ColorBackground.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       this.j().draw(p0);
       return;
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, ColorBackground.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.f);
    }
    public void h(int p0){
       ColorBackground uColorBackgr = ColorBackground.class;
       if (PatchProxy.isSupport(uColorBackgr) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uColorBackgr, "5")) {
          return;
       }
       this.j().setAlpha(p0);
       return;
    }
    public void i(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ColorBackground.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ColorBackground.class, "2")) {
          return;
       }
       this.j().setBounds(p0, p1, p2, p3);
       return;
    }
    public final ColorDrawable j(){
       Object obj = PatchProxy.apply(null, this, ColorBackground.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
}
