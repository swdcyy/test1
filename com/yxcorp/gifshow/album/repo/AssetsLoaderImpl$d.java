package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$d;
import erd.a;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import java.util.List;
import android.database.Cursor;
import k79.j;
import k79.i;
import k79.i$a;
import java.util.concurrent.atomic.AtomicReference;
import crd.b;

public final class AssetsLoaderImpl$d implements a	// class@001a5d
{
    public final AssetsLoaderImpl b;

    public void AssetsLoaderImpl$d(AssetsLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AssetsLoaderImpl$d.class, "1")) {
          return;
       }
       Iterator iterator = this.b.n().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.b.o());
       }
       j.a(this.b.i);
       this.b.i = i.e.a();
       this.b.m();
       b uob = this.b.p().get();
       if (uob != null) {
          uob.dispose();
       }
       this.b.p().set(null);
       return;
    }
}
