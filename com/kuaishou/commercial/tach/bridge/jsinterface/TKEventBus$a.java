package com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$a;
import ph7.a;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus;
import java.lang.Object;
import com.kwai.platform.keventbus.KEventBus$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$a$a;
import java.lang.Runnable;
import iq8.x;

public class TKEventBus$a implements a	// class@00163d
{
    public final TKEventBus a;

    public void TKEventBus$a(TKEventBus p0){
       this.a = p0;
       super();
    }
    public void onEvent(KEventBus$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKEventBus$a.class, "1")) {
          return;
       }
       x.b(new TKEventBus$a$a(this, p0));
       return;
    }
    public void onEvent(Object p0){
       this.onEvent(p0);
    }
}
