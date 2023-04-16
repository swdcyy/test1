package com.kuaishou.tachikoma.api.a;
import android.os.Handler$Callback;
import java.lang.Object;
import android.os.Message;
import com.kuaishou.tachikoma.api.d;
import java.util.Iterator;
import java.util.LinkedList;
import com.kuaishou.tachikoma.api.d$a;
import com.tachikoma.core.bridge.a$b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tachikoma.api.c;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public final class a implements Handler$Callback	// class@000f60
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean handleMessage(Message p0){
       Message what = p0.what;
       if (what != 1001) {
          if (what == 1002) {
             Iterator iterator = d.a.iterator();
             while (iterator.hasNext()) {
                d$a uoa = iterator.next();
                if (!uoa.a.g.get()) {
                   if (!PatchProxy.applyVoid(null, uoa, d$a.class, "1")) {
                      uoa.a.g.set(true);
                      uoa.f.execute(new c(uoa));
                   }
                   iterator.remove();
                }
             }
          }
       }else {
          d.a.offer(p0.obj);
       }
       return false;
    }
}
