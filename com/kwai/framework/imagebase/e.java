package com.kwai.framework.imagebase.e;
import java.lang.Runnable;
import java.lang.Object;
import e0d.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i0d.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import java.util.List;
import i0d.a$a;

public final class e implements Runnable	// class@001563
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, h.class, "2")) {
       }else if(PatchProxy.applyVoid(objArray, objArray, a.class, "3")){
          a.b.getAndSet(false);
          Iterator iterator = a.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().onForeground();
          }
       }
       return;
    }
}
