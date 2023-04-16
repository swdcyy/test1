package com.kuaishou.live.common.core.basic.resource.c$a;
import ub.a;
import hc.b;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hc.a;
import com.kuaishou.live.common.core.basic.resource.b;
import dc.a;

public class c$a extends a	// class@000ebf
{
    public final int b;
    public final b c;

    public void c$a(int p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$a.class, "1")) {
       }else if(p2 instanceof a){
          p2.k(new b(this, p2.f()));
          c$a tc = this.c;
          if (tc != null) {
             p2.l(tc);
          }
       }
       return;
    }
}
