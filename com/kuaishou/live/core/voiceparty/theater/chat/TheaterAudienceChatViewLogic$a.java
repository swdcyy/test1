package com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import op2.e;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import android.view.ViewGroup;
import android.view.View;
import fw2.d;
import fw2.a;

public final class TheaterAudienceChatViewLogic$a implements g	// class@00195e
{
    public final TheaterAudienceChatViewLogic b;

    public void TheaterAudienceChatViewLogic$a(TheaterAudienceChatViewLogic p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterAudienceChatViewLogic$a.class, "1")) {
       }else {
          TheaterAudienceChatViewLogic$a tb = this.b;
          int i = p0.booleanValue() ^ 0x01;
          Objects.requireNonNull(tb);
          TheaterAudienceChatViewLogic theaterAudie = TheaterAudienceChatViewLogic.class;
          if (!PatchProxy.isSupport(theaterAudie) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), tb, theaterAudie, "4")) {
             TheaterDisplayMode theaterDispl = tb.t.e().b();
             if (i) {
                if (theaterDispl == TheaterDisplayMode.FULL_SCREEN_PORTRAIT) {
                   tb.r.setAlpha(0x3f800000);
                   tb.o.b(tb.r);
                }else if(theaterDispl == TheaterDisplayMode.FULL_SCREEN_LANDSCAPE){
                   tb.n.e(tb.s);
                   tb.o.b(tb.s);
                }
             }else if(theaterDispl == TheaterDisplayMode.FULL_SCREEN_PORTRAIT){
                tb.r.setAlpha(0.20f);
                tb.o.a(tb.r);
             }else if(theaterDispl == TheaterDisplayMode.FULL_SCREEN_LANDSCAPE){
                tb.n.d(tb.s);
                tb.o.a(tb.s);
             }
          }
       }
       return;
    }
}
