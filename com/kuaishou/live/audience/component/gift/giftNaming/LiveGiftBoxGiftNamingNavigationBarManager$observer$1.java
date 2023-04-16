package com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager$observer$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager;
import java.lang.Object;
import java.lang.String;
import sl1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import v01.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftBoxGiftNamingNavigationBarManager$observer$1 implements Model$a	// class@000b73
{
    public final LiveGiftBoxGiftNamingNavigationBarManager b;

    public void LiveGiftBoxGiftNamingNavigationBarManager$observer$1(LiveGiftBoxGiftNamingNavigationBarManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxGiftNamingNavigationBarManager$observer$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p1 == null && p2 != null) {
             this.b.b().a();
          }else if(p1 != null && p2 == null){
             this.b.b().a();
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxGiftNamingNavigationBarManager$observer$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
