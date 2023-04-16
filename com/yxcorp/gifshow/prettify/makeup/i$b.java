package com.yxcorp.gifshow.prettify.makeup.i$b;
import l16.b;
import java.lang.String;
import t16.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.makeup.i;
import java.lang.Float;
import java.util.Map;

public class i$b implements b	// class@001182
{
    public final int a;
    public final int b;
    public final String c;
    public final b d;
    public final a e;
    public final List f;
    public final boolean g;

    public void i$b(int p0,int p1,String p2,b p3,a p4,List p5,boolean p6){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "2")) {
          return;
       }
       i$b ta = this.a;
       if (ta < (this.b - 1)) {
          i.e(this.e, this.c, this.f, (ta + 1), this.d, this.g);
       }else {
          i.b.put(this.c, Float.valueOf(0x3f800000));
          i.q(this.c, this.d);
          if (i.d() && this.g != null) {
             i.c(this.e);
          }
       }
       return;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "3")) {
          return;
       }
       i$b td = this.d;
       if (td != null) {
          td.onError();
       }
       if (i.d()) {
          i.c(this.e);
       }
       return;
    }
    public void onProgress(float p0){
       i$b uob = i$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       i.b.put(this.c, Float.valueOf((((float)this.a + p0) / (float)this.b)));
       i.r(this.c, this.d);
       return;
    }
}
