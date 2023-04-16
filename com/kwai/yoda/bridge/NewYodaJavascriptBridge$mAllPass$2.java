package com.kwai.yoda.bridge.NewYodaJavascriptBridge$mAllPass$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ny7.d;
import zsd.u;

public final class NewYodaJavascriptBridge$mAllPass$2 extends Lambda implements a	// class@00117a
{
    public final NewYodaJavascriptBridge this$0;

    public void NewYodaJavascriptBridge$mAllPass$2(NewYodaJavascriptBridge p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, NewYodaJavascriptBridge$mAllPass$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.u().iterator();
       boolean b = false;
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          Object obj2 = obj1;
          obj2 = (u.I1(obj2.namespace, "*", true) && u.I1(obj2.command, "*", true))? 1: null;
          if (obj2) {
             objArray = obj1;
             break ;
          }
       }
       if (objArray != null) {
          b = true;
       }
       return b;
    }
}
