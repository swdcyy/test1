package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$h;
import erd.g;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Objects;
import kotlin.jvm.internal.a;
import k79.m;
import kotlin.TypeCastException;

public final class AssetsLoaderImpl$h implements g	// class@001a61
{
    public final AssetsLoaderImpl b;

    public void AssetsLoaderImpl$h(AssetsLoaderImpl p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssetsLoaderImpl$h.class, "1")) {
       }else {
          Log.g("AssetsLoaderImpl", "loadAllMediaListInterval doOnNext 1, thread="+Thread.currentThread());
          if (p0 != null) {
             p0 = p0.iterator();
             while (p0.hasNext()) {
                QMedia qMedia = p0.next();
                AssetsLoaderImpl$h tb = this.b;
                Objects.requireNonNull(tb);
                if (PatchProxy.applyVoidOneRefs(qMedia, tb, AssetsLoaderImpl.class, "18")) {
                   continue ;
                }
                a.q(qMedia, "qMedia");
                m.i.c(2, qMedia);
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.yxcorp.gifshow.models.QMedia>");
          }
       }
       return;
    }
}
