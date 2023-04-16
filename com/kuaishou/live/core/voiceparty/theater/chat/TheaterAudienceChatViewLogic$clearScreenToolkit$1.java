package com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$clearScreenToolkit$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic;
import android.app.Activity;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d61.y;
import j47.a;
import gq5.f;

public final class TheaterAudienceChatViewLogic$clearScreenToolkit$1 extends Lambda implements a	// class@00195f
{
    public final Activity $activity;
    public final TheaterAudienceChatViewLogic this$0;

    public void TheaterAudienceChatViewLogic$clearScreenToolkit$1(TheaterAudienceChatViewLogic p0,Activity p1){
       this.this$0 = p0;
       this.$activity = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TheaterAudienceChatViewLogic$clearScreenToolkit$1.class, "1")) {
          return;
       }
       if (y.d(this.$activity)) {
          TheaterAudienceChatViewLogic w = this.this$0.w;
          if (w == null || w.uk() != true) {
             w = this.this$0.v;
             if (w != null) {
                w.q(false);
             }
          }
       }
       return;
    }
}
