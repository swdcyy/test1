package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$f;
import erd.o;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.enhancefilter.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.lang.System;
import java.lang.Long;
import java.util.Map;
import brd.t;
import com.yxcorp.gifshow.v3.editor.enhancefilter.model.a;
import com.yxcorp.gifshow.v3.editor.enhancefilter.c;
import com.yxcorp.gifshow.v3.editor.enhancefilter.d;
import oa0.a;
import java.util.ArrayList;
import java.util.List;

public final class EnhanceFilterViewModel$f implements o	// class@000f7b
{
    public final EnhanceFilterViewModel b;
    public final boolean c;

    public void EnhanceFilterViewModel$f(EnhanceFilterViewModel p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, EnhanceFilterViewModel$f.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "singleTask");
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("EnhanceFilterViewModel", "startTaskInner start useFace:"+this.c+", singleTaskIndex:"+p0.a(), objArray);
          this.b.d.put(Integer.valueOf(p0.a()), Long.valueOf(System.currentTimeMillis()));
          if (!this.b.q0()) {
             p0 = this.b.l.a(i).onErrorReturn(c.b).flatMap(new d(this, p0));
          }else {
             a.R0(i);
             p0 = p0.b(this.c, new ArrayList(), null);
          }
          ot = p0;
       }
       return ot;
    }
}
