package com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeViewController$levelUpListener$1$onLevelUpNotice$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeViewController$levelUpListener$1;
import xx2.c;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeViewController;
import nw0.a;
import java.util.Objects;
import java.lang.ref.WeakReference;
import wx2.c;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import ox2.d;

public final class LevelUpNoticeViewController$levelUpListener$1$onLevelUpNotice$1 extends Lambda implements l	// class@001ab7
{
    public final c $notice;
    public final LevelUpNoticeViewController$levelUpListener$1 this$0;

    public void LevelUpNoticeViewController$levelUpListener$1$onLevelUpNotice$1(LevelUpNoticeViewController$levelUpListener$1 p0,c p1){
       this.this$0 = p0;
       this.$notice = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       LevelUpNoticeViewController$levelUpListener$1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LevelUpNoticeViewController$levelUpListener$1$onLevelUpNotice$1.class, "1")) {
          return;
       }
       String str = "it";
       a.p(p0, str);
       a = this.this$0.a;
       a.l = null;
       LevelUpNoticeViewController o = a.o;
       if (o != null && o.nm()) {
          return;
       }
       a = this.this$0.a;
       LevelUpNoticeViewController$levelUpListener$1$onLevelUpNotice$1 t$notice = this.$notice;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(t$notice, p0, a, LevelUpNoticeViewController.class, "2")) {
          LevelUpNoticeViewController j = a.j;
          if (j != null) {
             c uoc = j.get();
             if (uoc != null) {
                a.o(uoc, str);
                a.O2(uoc);
             }
          }
          c uoc1 = new c(p0, t$notice, a.p, a.q);
          a.z2(uoc1);
          a.j = new WeakReference(uoc1);
       }
       return;
    }
}
