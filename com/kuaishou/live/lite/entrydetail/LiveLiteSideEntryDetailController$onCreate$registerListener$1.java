package com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$onCreate$registerListener$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qa3.a;
import qa3.b;
import hf3.a;
import v51.a;
import com.kuaishou.livestream.message.nano.LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice;
import lf3.g;

public final class LiveLiteSideEntryDetailController$onCreate$registerListener$1 extends Lambda implements a	// class@0008eb
{
    public final LiveLiteSideEntryDetailController this$0;

    public void LiveLiteSideEntryDetailController$onCreate$registerListener$1(LiveLiteSideEntryDetailController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteSideEntryDetailController$onCreate$registerListener$1.class, "1")) {
          return;
       }
       LiveLiteSideEntryDetailController$onCreate$registerListener$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, LiveLiteSideEntryDetailController.class, "9")) {
          tthis$0.t.c(tthis$0.W2());
          tthis$0.q.u().u0(1069, LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice.class, tthis$0.Y2());
       }
       return;
    }
}
