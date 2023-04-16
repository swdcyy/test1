package com.kuaishou.krn.delegate.e;
import brd.f0;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import brd.a0;
import brd.e0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nj0.j;
import erd.g;
import nj0.u;

public final class e implements f0	// class@00085f
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final e0 b(a0 p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       a0 uoa0 = PatchProxy.applyOneRefs(p0, tb, k.class, "5");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          uoa0 = p0.r(new j(tb)).p(new u(tb));
       }
       return uoa0;
    }
}
