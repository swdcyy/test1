package com.yxcorp.gifshow.util.rx.b;
import io.reactivex.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import java.lang.Class;
import com.kwai.platform.keventbus.KEventBus$ThreadMode;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import eoc.b;
import ph7.a;
import ph7.f;
import eoc.d;
import erd.f;

public final class b implements g	// class@000d02
{
    public final RxBus b;
    public final Class c;
    public final KEventBus$ThreadMode d;
    public final boolean e;
    public final int f;

    public void b(RxBus p0,Class p1,KEventBus$ThreadMode p2,boolean p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       Objects.requireNonNull(p0);
       b uob = new b(p0);
       tb.a.R1(tc, this.d, this.e, this.f, uob);
       p0.setCancellable(new d(tb, tc, uob));
    }
}
