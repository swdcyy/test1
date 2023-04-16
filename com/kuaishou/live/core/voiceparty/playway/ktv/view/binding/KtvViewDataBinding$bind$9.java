package com.kuaishou.live.core.voiceparty.playway.ktv.view.binding.KtvViewDataBinding$bind$9;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d61.c0;

public final class KtvViewDataBinding$bind$9 extends Lambda implements l	// class@001863
{
    public static final KtvViewDataBinding$bind$9 INSTANCE;

    static {
       KtvViewDataBinding$bind$9.INSTANCE = new KtvViewDataBinding$bind$9();
    }
    public void KtvViewDataBinding$bind$9(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0.booleanValue());
    }
    public final String invoke(boolean p0){
       if (PatchProxy.isSupport(KtvViewDataBinding$bind$9.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, KtvViewDataBinding$bind$9.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p0)? c0.a.b("udata/pkg/kwai-client-image/live_voice_party_ktv_singer_singing.json"): null;
       return str;
    }
}
