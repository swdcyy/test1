package com.yxcorp.gifshow.page.cost.list.a;
import ok.h;
import com.yxcorp.gifshow.page.cost.list.g;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.page.cost.list.b;
import brd.x;
import tvb.c;
import erd.r;
import com.yxcorp.gifshow.page.cost.list.c;
import com.yxcorp.gifshow.page.cost.list.e;
import erd.g;
import crd.b;

public final class a implements h	// class@000e27
{
    public final g b;
    public final ListReqLifecycle c;

    public void a(g p0,ListReqLifecycle p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = new c(tb);
       return this.c.m().compose(b.b).filter(new c(tb)).subscribe(uoc, e.b);
    }
}
