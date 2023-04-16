package com.kwai.framework.imagebase.d;
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

public final class d implements Runnable	// class@001562
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, h.class, "1")) {
       }else if(PatchProxy.applyVoid(objArray, objArray, a.class, "2")){
          a.b.getAndSet(true);
          Iterator iterator = a.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().onBackground();
          }
       }
       return;
    }
}
