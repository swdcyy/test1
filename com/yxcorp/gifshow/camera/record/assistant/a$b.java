package com.yxcorp.gifshow.camera.record.assistant.a$b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sa6.b;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import cc9.i;

public final class a$b	// class@001cf5
{
    public final ArrayList a;

    public void a$b(){
       super();
       this.a = new ArrayList();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "4")) {
          return;
       }
       this.a.clear();
       return;
    }
    public final void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "newState");
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public final void c(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       if (this.a.contains(p0)) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public final void d(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.a.remove(p0);
       return;
    }
}
