package com.yxcorp.gifshow.prettify.v4.magic.filter.i;
import ub.a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import o1c.w0;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n1c.d;
import bd.c;

public class i extends a	// class@0011bf
{
    public final w0 b;
    public final j c;

    public void i(j p0,w0 p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "1")) {
          return;
       }
       this.c.q.b();
       if (this.b.h() >= 0 && p1 instanceof c) {
          this.c.q.c(p1);
       }
       return;
    }
}
