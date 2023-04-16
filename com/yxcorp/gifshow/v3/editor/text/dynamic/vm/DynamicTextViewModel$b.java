package com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$b;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import huc.u;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.a;

public final class DynamicTextViewModel$b implements o	// class@0013e7
{
    public final DynamicTextViewModel b;

    public void DynamicTextViewModel$b(DynamicTextViewModel p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, DynamicTextViewModel$b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "result");
          if (this.b.u0() != null) {
             u ou = this.b.u0();
             a.m(ou);
             p0 = ou.P(CachePolicy.CACHE_ELSE_NETWORK).map(new a(p0));
          }else {
             p0 = t.just(p0);
          }
          ot = p0;
       }
       return ot;
    }
}
