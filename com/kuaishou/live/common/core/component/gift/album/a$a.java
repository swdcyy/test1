package com.kuaishou.live.common.core.component.gift.album.a$a;
import com.kuaishou.live.common.core.component.gift.album.c$c;
import com.kuaishou.live.common.core.component.gift.album.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.album.LiveScrollCenterLayoutManager;

public class a$a implements c$c	// class@00113a
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(GiftPanelItem p0,int p1,boolean p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, a$a.class, "1")) {
          return;
       }
       this.a.f.scrollToPosition(p1);
       a e = this.a.e;
       if (e != null) {
          e.a(p0, p1, p2);
       }
       return;
    }
    public void b(GiftPanelItem p0,int p1,boolean p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, a$a.class, "2")) {
          return;
       }
       a e = this.a.e;
       if (e != null) {
          e.b(p0, p1, p2);
       }
       return;
    }
}
