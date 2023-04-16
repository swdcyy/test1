package com.yxcorp.gifshow.activity.share.presenter.q2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class q2 implements g	// class@001426
{
    public static final q2 b;

    static {
       q2.b = new q2();
    }
    public void q2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareKeyboardStatus", "mEditStatus", p0);
    }
}
