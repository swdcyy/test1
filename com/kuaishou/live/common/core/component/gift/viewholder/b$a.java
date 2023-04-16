package com.kuaishou.live.common.core.component.gift.viewholder.b$a;
import ug1.c0;
import com.kuaishou.live.common.core.component.gift.viewholder.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ug1.b0;
import xz6.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class b$a implements c0	// class@001334
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(GiftPanelItem p0,int p1){
       b0.b(this, p0, p1);
    }
    public void b(GiftPanelItem p0,e p1,int p2){
       b0.a(this, p0, p1, p2);
    }
    public void c(GiftPanelItem p0,e p1,int p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       if (ta.a != null) {
          ta.b();
       }
       return;
    }
}
