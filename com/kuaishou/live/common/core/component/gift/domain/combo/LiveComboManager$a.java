package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$a;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class LiveComboManager$a implements k	// class@00116c
{
    public final LiveComboManager b;

    public void LiveComboManager$a(LiveComboManager p0){
       this.b = p0;
       super();
    }
    public Object get(){
       String str = PatchProxy.apply(null, this, LiveComboManager$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          Integer integer = this.b.l.get();
          str = (integer != null && integer.intValue() == 2)? "LIVE_LITE_ROOM_EXPAND_GIFT_DIALOG_SEND_GIFT": "LIVE_ROOM_EXPAND_GIFT_DIALOG_SEND_GIFT";
       }
       return str;
    }
}
