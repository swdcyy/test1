package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.o;
import ry1.b;
import hf3.a;
import mk1.a0;
import java.lang.Object;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.l;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Boolean;

public class o	// class@000b15
{
    public final a a;
    public final b b;
    public b c;
    public ImageView d;
    public k e;
    public LiveData f;
    public final Observer g;
    public a0 h;
    public final g i;

    public void o(b p0,a p1,a0 p2){
       super();
       this.g = new l(this);
       this.i = new m(this);
       this.b = p0;
       this.a = p1;
       this.h = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       View[] viewArray = new View[]{this.d};
       n.Z(8, viewArray);
       return;
    }
    public final void b(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "6")) {
          return;
       }
       oo = this.h;
       if (oo == null) {
          return;
       }
       oo.a = p0;
       oo.b = p0;
       return;
    }
}
