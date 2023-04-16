package com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$b;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import ph7.a;
import ph7.f;

public class TKEventBus$b implements Runnable	// class@00163e
{
    public final TKEventBus b;

    public void TKEventBus$b(TKEventBus p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKEventBus$b.class, "1")) {
          return;
       }
       Iterator iterator = this.b.mSubscribeMap.keySet().iterator();
       while (iterator.hasNext()) {
          TKEventBus$b tb = this.b;
          tb.mKEventClient.Y1(iterator.next(), tb.mEventCallback);
       }
       this.b.mSubscribeMap.clear();
       this.b.mEventCallback = null;
       return;
    }
}
