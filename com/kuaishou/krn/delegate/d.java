package com.kuaishou.krn.delegate.d;
import brd.f0;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import brd.a0;
import brd.e0;
import java.util.Objects;
import brd.z;
import io.reactivex.android.schedulers.a;
import nj0.g;
import erd.g;

public final class d implements f0	// class@00085e
{
    public final k b;

    public void d(k p0){
       this.b = p0;
    }
    public final e0 b(a0 p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       return p0.G(a.c()).r(new g(tb));
    }
}
