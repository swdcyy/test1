package com.kuaishou.commercial.splash.presenter.g;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Bitmap;
import java.lang.Object;
import gz.p;
import android.view.animation.Interpolator;
import c2.a;
import android.view.ViewParent;
import android.view.View$OnLayoutChangeListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public abstract class g	// class@0015ec
{
    public View a;
    public ViewGroup b;
    public Bitmap c;
    public View d;
    public ImageView e;
    public Rect f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public TimeInterpolator o;
    public int p;
    public int q;
    public int[] r;
    public final View$OnLayoutChangeListener s;

    public void g(ViewGroup p0,View p1,Bitmap p2){
       super();
       int[] ointArray = new int[2];
       this.r = ointArray;
       p op = new p(this);
       this.s = op;
       this.b = p0;
       this.a = p1;
       this.c = p2;
       this.o = a.b(0.15f, 0x3f0ccccd, 0.27f, 0x3f8ccccd);
       View parent = this.b.getParent();
       this.d = parent;
       this.q = parent.getHeight();
       this.p = this.d.getWidth();
       this.d.addOnLayoutChangeListener(op);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.i = (int)((float)(this.p - this.g) * 0x3f000000);
       this.j = (int)((float)(this.q - this.h) * 0x3f000000);
       this.d.getLocationOnScreen(this.r);
       return;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getHeight();
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getWidth();
    }
    public abstract void d();
    public abstract void e();
}
