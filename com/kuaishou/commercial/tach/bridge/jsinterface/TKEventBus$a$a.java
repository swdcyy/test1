package com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$a$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$a;
import com.kwai.platform.keventbus.KEventBus$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$c;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import tx4.y;
import org.json.JSONObject;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class TKEventBus$a$a implements Runnable	// class@00163c
{
    public final KEventBus$a b;
    public final TKEventBus$a c;

    public void TKEventBus$a$a(TKEventBus$a p0,KEventBus$a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       V8Function v8Function;
       String str;
       if (PatchProxy.applyVoid(null, this, TKEventBus$a$a.class, "1")) {
          return;
       }
       List list = this.c.a.mSubscribeMap.get(this.b.a());
       if (list != null && !list.isEmpty()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             TKEventBus$c uoc = iterator.next();
             if (uoc == null) {
                continue ;
             }else {
                v8Function = uoc.b.get();
                if (y.a(v8Function)) {
                   str = (this.b.b() != null)? this.b.b().toString(): null;
                   if (!this.c.a.isEventValueValid(str, false)) {
                      return;
                   }
                }
             }
             Object[] objArray = new Object[]{str};
             v8Function.call(null, objArray);
          }
       }
       return;
    }
}
