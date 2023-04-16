package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$exitAndShowDialog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import uw1.f;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler;
import e17.i;

public final class LiveRichCardCoreManager$exitAndShowDialog$1 extends Lambda implements a	// class@000f45
{
    public final LiveRichCardCoreManager this$0;

    public void LiveRichCardCoreManager$exitAndShowDialog$1(LiveRichCardCoreManager p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRichCardCoreManager$exitAndShowDialog$1.class, "1")) {
          return;
       }
       b.P(LiveRichCardStateManager.h.f().appendTag(this.this$0.m()), "[exitAndShowDialog]退出暴富模式");
       LiveRichCardCoreManager$exitAndShowDialog$1 tthis$0 = this.this$0;
       LiveRichCardCoreManager q = tthis$0.q;
       String str = LiveRichCardCoreManager.g(tthis$0, objArray, 1, objArray);
       f uof = this.this$0.h();
       Integer integer = (uof != null)? Integer.valueOf(uof.g()): objArray;
       f uof1 = this.this$0.h();
       if (uof1 != null) {
          objArray = uof1.a();
       }
       q.a(str, integer, objArray, 1);
       i.a(R.style.arg_RES_7f11066a, 0x7f101032);
       return;
    }
}
