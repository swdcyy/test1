package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.a$b;
import xk1.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import pz0.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.LiveAudienceDrawingGiftBoxFragment$a;

public class a$b implements b	// class@000b37
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
    public boolean b(){
       a obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.u;
       boolean b = (obj != null && obj.isShown())? true: false;
       return b;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       this.a.R8(new c(this));
       return;
    }
}
