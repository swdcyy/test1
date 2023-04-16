package com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$c;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import jb7.b;
import brd.t;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import puc.b;
import puc.c;
import erd.g;
import crd.b;

public final class DynamicTextRepo$c implements g	// class@0013df
{
    public final DynamicTextRepo b;
    public final CachePolicy c;
    public final boolean d;

    public void DynamicTextRepo$c(DynamicTextRepo p0,CachePolicy p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTextRepo$c.class, str)) {
          return;
       }
       a.p(p0, "emitter");
       DynamicTextRepo$c tb = this.b;
       DynamicTextRepo$c tc = this.c;
       DynamicTextRepo$c td = this.d;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(DynamicTextRepo.class) || !PatchProxy.applyVoidThreeRefs(tc, p0, Boolean.valueOf(td), tb, DynamicTextRepo.class, "3")) {
          b uob = PatchProxy.apply(null, tb, DynamicTextRepo.class, str);
          if (uob == PatchProxyResult.class) {
             uob = tb.a.getValue();
          }
          uob.a(tc).observeOn(d.c).subscribe(new b(tb, td, p0), new c(p0));
       }
       return;
    }
}
