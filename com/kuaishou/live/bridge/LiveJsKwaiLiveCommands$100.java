package com.kuaishou.live.bridge.LiveJsKwaiLiveCommands$100;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import o63.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import nl9.r;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;

public final class LiveJsKwaiLiveCommands$100 extends Lambda implements a	// class@000d6f
{
    public static final LiveJsKwaiLiveCommands$100 INSTANCE;

    static {
       LiveJsKwaiLiveCommands$100.INSTANCE = new LiveJsKwaiLiveCommands$100();
    }
    public void LiveJsKwaiLiveCommands$100(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final j invoke(){
       b obj = PatchProxy.apply(null, this, LiveJsKwaiLiveCommands$100.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x691527a8);
       a.o(obj, "PluginManager.get\(Commer¡­alLivePlugin::class.java\)");
       AbstractLiveJsCommand uAbstractLiv = obj.SR();
       a.o(uAbstractLiv, "PluginManager.get\(Commer¡­va\).reportAdLogInvitation");
       return uAbstractLiv;
    }
}
