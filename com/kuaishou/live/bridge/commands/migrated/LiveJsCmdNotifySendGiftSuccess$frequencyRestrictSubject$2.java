package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2 extends Lambda implements a	// class@000e1a
{
    public static final LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2 INSTANCE;

    static {
       LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2.INSTANCE = new LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2();
    }
    public void LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2(){
       super(0);
    }
    public final PublishSubject invoke(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdNotifySendGiftSuccess$frequencyRestrictSubject$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishSubject.g();
    }
    public Object invoke(){
       return this.invoke();
    }
}
