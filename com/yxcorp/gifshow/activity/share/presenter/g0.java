package com.yxcorp.gifshow.activity.share.presenter.g0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class g0 implements g	// class@0013e3
{
    public static final g0 b;

    static {
       g0.b = new g0();
    }
    public void g0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareCancelPresenter", "completeEdit", p0);
    }
}