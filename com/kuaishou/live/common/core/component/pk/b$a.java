package com.kuaishou.live.common.core.component.pk.b$a;
import ub.a;
import hc.b;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hc.a;
import com.kuaishou.live.common.core.component.pk.b;
import com.kwai.robust.PatchProxyResult;
import dc.a;
import hw1.f;

public class b$a extends a	// class@001733
{
    public final boolean b;
    public final b c;

    public void b$a(boolean p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$a.class, "1")) {
       }else if(p2 instanceof a){
          if (this.b != null) {
             f uof = PatchProxy.applyOneRefs(p2, null, b.class, "5");
             if (uof != PatchProxyResult.class) {
             }else {
                uof = new f(p2.f());
             }
             p2.k(uof);
          }
          b$a tc = this.c;
          if (tc != null) {
             p2.l(tc);
          }
       }
       return;
    }
}
