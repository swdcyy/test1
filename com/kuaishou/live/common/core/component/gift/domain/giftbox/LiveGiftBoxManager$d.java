package com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$d;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import zg1.j;
import zg1.l;

public final class LiveGiftBoxManager$d implements k	// class@0011c9
{
    public final LiveGiftBoxManager b;

    public void LiveGiftBoxManager$d(LiveGiftBoxManager p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, LiveGiftBoxManager$d.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          j oj = this.b.s.d0();
          if (oj != null) {
             objArray = oj.b();
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
