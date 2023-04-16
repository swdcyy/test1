package com.yxcorp.gifshow.featured.detail.featured.presenter.g;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import fda.a;
import com.yxcorp.gifshow.util.rx.RxBus;

public final class g implements g	// class@000f75
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       p0 = new a();
       p0.a = 1;
       RxBus.f.b(p0);
    }
}
