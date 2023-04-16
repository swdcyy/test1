package com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.userlevel.model.a;
import nw0.a;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import ox2.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeViewController$levelUpListener$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import wa1.i;
import com.kuaishou.live.common.core.basic.tools.g$c;

public final class LevelUpNoticeViewController extends ViewController	// class@001ab9
{
    public WeakReference j;
    public long k;
    public g$c l;
    public final LevelUpNoticeViewController$levelUpListener$1 m;
    public final a n;
    public a o;
    public final UserMicSeatLevelLogger p;
    public final d q;

    public void LevelUpNoticeViewController(a p0,a p1,UserMicSeatLevelLogger p2,d p3){
       a.p(p0, "levelUpService");
       a.p(p2, "logger");
       a.p(p3, "launcher");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.m = new LevelUpNoticeViewController$levelUpListener$1(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LevelUpNoticeViewController.class, "4")) {
          return;
       }
       LevelUpNoticeViewController tn = this.n;
       LevelUpNoticeViewController tm = this.m;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoidOneRefs(tm, tn, a.class, "1")) {
          a.p(tm, "listener");
          tn.b.add(tm);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LevelUpNoticeViewController.class, "5")) {
          return;
       }
       LevelUpNoticeViewController tn = this.n;
       LevelUpNoticeViewController tm = this.m;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoidOneRefs(tm, tn, a.class, "2")) {
          a.p(tm, "listener");
          tn.b.remove(tm);
       }
       tn = this.l;
       if (tn != null) {
          tn.a();
       }
       return;
    }
}
