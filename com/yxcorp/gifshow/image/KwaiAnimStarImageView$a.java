package com.yxcorp.gifshow.image.KwaiAnimStarImageView$a;
import com.yxcorp.gifshow.image.KwaiAnimStarImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Random;
import java.lang.Math;

public class KwaiAnimStarImageView$a	// class@001942
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public double m;
    public float n;
    public boolean o;
    public int p;
    public float q;
    public float r;
    public final float s;
    public final float t;
    public final float u;
    public final KwaiAnimStarImageView v;

    public void KwaiAnimStarImageView$a(KwaiAnimStarImageView p0){
       this.v = p0;
       super();
       this.q = 0.05f;
       this.r = 0.00f;
       this.s = 0x3fa66666;
       this.t = 0.09f;
       this.u = 0.05f;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, KwaiAnimStarImageView$a.class, "2")) {
          return;
       }
       double d = (double)(this.v.E.nextFloat() * 2.00f) * 0x400921fb54442d18;
       float f = (float)Math.cos(d);
       KwaiAnimStarImageView$a tq = this.q;
       this.k = this.i + (f * tq);
       float f1 = (float)Math.sin(d);
       this.l = this.j + (f1 * tq);
       this.m = d;
       KwaiAnimStarImageView$a tr = this.r;
       this.g = f * tr;
       this.h = f1 * tr;
       this.f = (- tq) * (float)this.p;
       return;
    }
}
