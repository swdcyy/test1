package com.yxcorp.gifshow.activity.share.presenter.p;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class p implements g	// class@001423
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareBasePreviewPresenter", "mBackEventPublisher", p0);
    }
}
