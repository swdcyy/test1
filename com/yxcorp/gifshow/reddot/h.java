package com.yxcorp.gifshow.reddot.h;
import erd.g;
import com.yxcorp.gifshow.reddot.i;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cub.a;
import java.lang.reflect.Type;
import java.util.Map;
import aub.a;
import j9c.h;
import java.util.Comparator;
import java.util.Collections;

public final class h implements g	// class@0017c8
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "16")) {
       }else {
          Collections.sort(p0, new h(a.b(a.d)));
       }
       return;
    }
}
