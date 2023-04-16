package com.kwai.framework.debuglog.realtime.a;
import java.lang.Object;
import q87.d;
import r87.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import q87.f;
import java.util.Collection;
import java.util.Iterator;
import q87.e;
import r87.j;
import com.kwai.framework.debuglog.realtime.a$a;
import android.content.Intent;
import android.app.Application;
import o56.a;

public class a	// class@00151a
{
    public static RealTimeLogConfig a;

    public void a(){
       super();
    }
    public static void a(d p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "8")) {
          return;
       }
       Iterator iterator = f.a().values().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       return;
    }
    public static void b(String p0){
       a uoa = a.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoa, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       d uod = j.c("KwaiRealTimeLogger", 4, "KwaiRealTimeLogger", p0, objArray);
       a.a(uod, new a$a(p0, uod));
       if (!PatchProxy.applyVoidOneRefs(p0, obj, uoa, "3")) {
          Intent intent = new Intent();
          intent.setAction("com.kwai.framework.debuglog.realtime.FLUSH_LOG");
          intent.putExtra("TRIGGER_TYPE", p0);
          a.b().sendBroadcast(intent);
       }
       return;
    }
}
