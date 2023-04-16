package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$c;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;

public final class LiveJsCmdNotifySendGiftSuccess$c implements a	// class@000e19
{
    public static final LiveJsCmdNotifySendGiftSuccess$c b;

    static {
       LiveJsCmdNotifySendGiftSuccess$c.b = new LiveJsCmdNotifySendGiftSuccess$c();
    }
    public void LiveJsCmdNotifySendGiftSuccess$c(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveJsCmdNotifySendGiftSuccess$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveJsNotifySendGiftSuccessCommand", "notifySendGiftSuccess#subscribe complete", objArray);
       return;
    }
}
