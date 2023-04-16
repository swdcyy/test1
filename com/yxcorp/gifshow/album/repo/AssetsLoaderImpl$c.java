package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$c;
import erd.g;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.yxcorp.utility.Log;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import kotlin.jvm.internal.a;

public final class AssetsLoaderImpl$c implements g	// class@001a5c
{
    public final AssetsLoaderImpl b;
    public final Ref$BooleanRef c;

    public void AssetsLoaderImpl$c(AssetsLoaderImpl p0,Ref$BooleanRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssetsLoaderImpl$c.class, "1")) {
       }else {
          Log.g("AssetsLoaderImpl", "refresh doOnNext£¬size="+p0.size()+", currentThread="+Thread.currentThread());
          Iterator iterator = this.b.n().iterator();
          while (iterator.hasNext()) {
             a.h(p0, "list");
             iterator.next().a(this.c.element, p0);
          }
          p0.element = false;
       }
       return;
    }
}
