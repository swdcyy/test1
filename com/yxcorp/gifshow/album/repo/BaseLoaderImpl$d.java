package com.yxcorp.gifshow.album.repo.BaseLoaderImpl$d;
import erd.a;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import java.util.List;
import android.database.Cursor;
import k79.j;
import java.util.concurrent.atomic.AtomicReference;
import crd.b;

public final class BaseLoaderImpl$d implements a	// class@001a6b
{
    public final BaseLoaderImpl b;

    public void BaseLoaderImpl$d(BaseLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BaseLoaderImpl$d.class, "1")) {
          return;
       }
       Iterator iterator = this.b.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.b.o());
       }
       j.a(this.b.k);
       BaseLoaderImpl$d tb = this.b;
       tb.k = tb.q(tb.r());
       this.b.n();
       b uob = this.b.g.get();
       if (uob != null) {
          uob.dispose();
       }
       this.b.g.set(null);
       return;
    }
}
