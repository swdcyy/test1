package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$c;
import z1.k;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.LinkedHashMap;
import ic3.a;
import sz1.e;
import kotlin.jvm.internal.a;

public final class LiveLiteGiftManager$c implements k	// class@001da1
{
    public final LiveLiteGiftManager b;

    public void LiveLiteGiftManager$c(LiveLiteGiftManager p0){
       this.b = p0;
       super();
    }
    public Object get(){
       LinkedHashMap linkedHashMa = PatchProxy.apply(null, this, LiveLiteGiftManager$c.class, "1");
       if (linkedHashMa != PatchProxyResult.class) {
       }else {
          linkedHashMa = new LinkedHashMap();
          LiveLiteGiftManager x0 = this.b.X0;
          if (x0 != null) {
             linkedHashMa.putAll(x0.E8());
          }
          x0 = this.b.Q;
          if (x0 != null) {
             Map map = x0.zg();
             a.o(map, "it.interactLogParams");
             linkedHashMa.putAll(map);
          }
       }
       return linkedHashMa;
    }
}
