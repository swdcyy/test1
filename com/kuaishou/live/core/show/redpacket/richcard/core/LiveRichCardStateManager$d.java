package com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$d;
import erd.g;
import msd.a;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.richcard.http.ExitRichCardResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.richcard.http.ExitRichCardResponseData;
import bi2.e;
import java.lang.CharSequence;
import e17.i;

public final class LiveRichCardStateManager$d implements g	// class@000f6c
{
    public final a b;

    public void LiveRichCardStateManager$d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardStateManager$d.class, "1")) {
       }else {
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          b.c0(h.f(), "exitRichCardMode， 退出暴富卡模式", "response", p0);
          ExitRichCardResponseData data = p0.getData();
          if (data == null || data.getCode() != 1) {
             p0 = p0.getData();
             if (p0 != null) {
                p0 = p0.getMsg();
                if (p0 != null) {
                   i.d(R.style.arg_RES_7f110668, p0);
                }
             }
          }else {
             this.b.invoke();
             h.e().e("exitRichCardMode");
          }
       }
       return;
    }
}
