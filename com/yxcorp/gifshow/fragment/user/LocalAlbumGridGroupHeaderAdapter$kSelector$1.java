package com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$kSelector$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter;
import m8c.e;
import ika.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import ika.a;
import java.util.Iterator;
import java.lang.Iterable;
import usd.n;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class LocalAlbumGridGroupHeaderAdapter$kSelector$1 extends Lambda implements l	// class@00127c
{
    public final LocalAlbumGridGroupHeaderAdapter this$0;

    public void LocalAlbumGridGroupHeaderAdapter$kSelector$1(LocalAlbumGridGroupHeaderAdapter p0){
       this.this$0 = p0;
       super(1);
    }
    public final a$b invoke(e p0){
       Object obj1;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, LocalAlbumGridGroupHeaderAdapter$kSelector$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "project");
       obj = this.this$0.S0().iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!obj1.c().q(p0.i())) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (obj1 == null) {
             obj1 = CollectionsKt___CollectionsKt.Y2(this.this$0.S0());
             break ;
          }
          break ;
       }
       return obj1;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
