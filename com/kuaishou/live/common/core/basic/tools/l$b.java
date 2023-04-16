package com.kuaishou.live.common.core.basic.tools.l$b;
import ub.a;
import hc.b;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hc.a;
import dc.a;
import com.kuaishou.live.common.core.basic.tools.l;

public class l$b extends a	// class@000efa
{
    public final int b;
    public final b c;

    public void l$b(int p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l$b.class, "1")) {
       }else if(p2 instanceof a){
          l$b tb = this.b;
          if (tb > null) {
             p2.k(l.g(p2, tb));
          }
          tb = this.c;
          if (tb != null) {
             p2.l(tb);
          }
       }
       return;
    }
}
