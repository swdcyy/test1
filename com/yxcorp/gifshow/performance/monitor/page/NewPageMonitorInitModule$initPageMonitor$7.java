package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$7;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import mwb.b;
import android.content.SharedPreferences;
import fg6.a;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import gf7.c;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class NewPageMonitorInitModule$initPageMonitor$7 extends Lambda implements a	// class@000eae
{
    public final NewPageMonitorInitModule this$0;

    public void NewPageMonitorInitModule$initPageMonitor$7(NewPageMonitorInitModule p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, NewPageMonitorInitModule$initPageMonitor$7.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       boolean b = false;
       if (!b.i() || (this.this$0.s == null && !b.a.getBoolean("EnableFluencyPageMonitor", b))) {
          return obj;
       }
       Object obj1 = a.a.i(b.a.getString("PageMonitorConfig", ""), this.this$0.q);
       a.o(obj1, "Gsons.KWAI_GSON.fromJson¡­nitorConfigType\n        \)");
       Iterator iterator = obj1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Object obj2 = iterator.next();
             if (obj2.deserializeOnLaunch != null) {
                objArray = obj2;
             }
          }
          if (objArray != null) {
             b = true;
          }
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putBoolean("PageMonitorInitOnExecute", b);
          g.a(uEditor);
          break ;
       }
       return obj1;
    }
}
