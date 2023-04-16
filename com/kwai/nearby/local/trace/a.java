package com.kwai.nearby.local.trace.a;
import ok.h;
import com.kwai.nearby.local.trace.NearbyPageCostHelper;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import brd.t;
import com.kwai.nearby.local.trace.b;
import brd.x;
import kd7.b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class a implements h	// class@001001
{
    public final NearbyPageCostHelper b;
    public final ListReqLifecycle c;

    public void a(NearbyPageCostHelper p0,ListReqLifecycle p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       b uob = new b(tb);
       return this.c.m().compose(b.b).subscribe(uob, Functions.e);
    }
}
