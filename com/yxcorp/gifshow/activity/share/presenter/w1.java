package com.yxcorp.gifshow.activity.share.presenter.w1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class w1 implements g	// class@001441
{
    public static final w1 b;

    static {
       w1.b = new w1();
    }
    public void w1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareToolbarPresenter", "mEditStatus", p0);
    }
}
