package com.yxcorp.gifshow.activity.share.presenter.t1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class t1 implements g	// class@001432
{
    public static final t1 b;

    static {
       t1.b = new t1();
    }
    public void t1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SharePublishPresenter", "finishMe", p0);
    }
}
