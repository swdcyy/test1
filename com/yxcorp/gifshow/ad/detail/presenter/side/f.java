package com.yxcorp.gifshow.ad.detail.presenter.side.f;
import ok.h;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Void;
import g19.v;
import erd.g;
import crd.b;
import brd.t;

public final class f implements h	// class@0016ab
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void f(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       return tb.A.subscribe(new v(tb));
    }
}
