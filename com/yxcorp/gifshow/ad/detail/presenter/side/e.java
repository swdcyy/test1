package com.yxcorp.gifshow.ad.detail.presenter.side.e;
import ok.h;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Void;
import g19.u;
import erd.g;
import crd.b;
import brd.t;

public final class e implements h	// class@0016aa
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void e(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       e tb = this.b;
       return tb.B.subscribe(new u(tb));
    }
}
