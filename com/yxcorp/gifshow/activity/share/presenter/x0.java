package com.yxcorp.gifshow.activity.share.presenter.x0;
import erd.o;
import brd.t;
import java.lang.Object;
import com.yxcorp.gifshow.activity.share.model.LocationResponse;
import com.yxcorp.gifshow.activity.share.presenter.y0;
import zw8.g2;

public final class x0 implements o	// class@001454
{
    public final t b;

    public void x0(t p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return this.b.onErrorReturn(y0.b).map(new g2(p0));
    }
}
