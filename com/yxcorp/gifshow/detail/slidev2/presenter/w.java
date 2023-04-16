package com.yxcorp.gifshow.detail.slidev2.presenter.w;
import ok.h;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Void;
import b8a.q1;
import erd.g;
import crd.b;
import brd.t;

public final class w implements h	// class@0019d7
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void w(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       w tb = this.b;
       return tb.A.subscribe(new q1(tb));
    }
}
