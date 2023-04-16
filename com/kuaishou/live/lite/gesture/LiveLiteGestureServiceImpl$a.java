package com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$a$a;
import nsd.u;
import java.lang.Object;
import wa1.i;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$b;

public final class LiveLiteGestureServiceImpl$a	// class@00098a
{
    public final i a;
    public boolean b;
    public static final LiveLiteGestureServiceImpl$a$a c;

    static {
       LiveLiteGestureServiceImpl$a.c = new LiveLiteGestureServiceImpl$a$a(null);
    }
    public void LiveLiteGestureServiceImpl$a(){
       super();
       this.a = new i();
    }
    public final void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGestureServiceImpl$a.class, "8")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          p0.invoke(iterator.next());
       }
       return;
    }
}
