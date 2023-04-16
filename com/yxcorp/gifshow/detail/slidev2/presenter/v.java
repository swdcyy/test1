package com.yxcorp.gifshow.detail.slidev2.presenter.v;
import ok.h;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Void;
import b8a.p1;
import erd.g;
import crd.b;
import brd.t;

public final class v implements h	// class@0019d6
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void v(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       v tb = this.b;
       return tb.B.subscribe(new p1(tb));
    }
}
