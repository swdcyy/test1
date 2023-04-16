package com.kuaishou.live.basic.tk.LiveTkBridge$subscriberIdsDelegate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveTkBridge$subscriberIdsDelegate$1 extends Lambda implements a	// class@000d1b
{
    public static final LiveTkBridge$subscriberIdsDelegate$1 INSTANCE;

    static {
       LiveTkBridge$subscriberIdsDelegate$1.INSTANCE = new LiveTkBridge$subscriberIdsDelegate$1();
    }
    public void LiveTkBridge$subscriberIdsDelegate$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashSet invoke(){
       Object obj = PatchProxy.apply(null, this, LiveTkBridge$subscriberIdsDelegate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HashSet();
    }
}
