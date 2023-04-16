package com.yxcorp.gifshow.v3.editor.PostTaskManager$f;
import erd.g;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import gq.a;
import java.lang.StringBuilder;
import java.util.HashMap;
import q87.c;

public final class PostTaskManager$f implements g	// class@000d9e
{
    public final PostTaskManager b;
    public final PostTaskManager$a c;
    public final String d;

    public void PostTaskManager$f(PostTaskManager p0,PostTaskManager$a p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostTaskManager$f.class, "1")) {
       }else {
          PostTaskManager$f td = this.d;
          a.o(td, "keyNow");
          this.b.b.put(td, this.c);
          p0 = this.b.c.iterator();
          while (p0.hasNext()) {
             p0.next().a(this.c);
          }
          this.b.a.remove(this.d);
          p0 = this.b.c.iterator();
          while (p0.hasNext()) {
             p0.next().c(this.c);
          }
          this.b.g();
          Object[] objArray = new Object[0];
          a.D().w("PostTaskManager", "task end "+this.b.a.size()+" tasks. "+this.b.b.size()+" results", objArray);
       }
       return;
    }
}
