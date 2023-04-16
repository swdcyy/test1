package com.yxcorp.gifshow.activity.share.presenter.z1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class z1 implements g	// class@001460
{
    public static final z1 b;

    static {
       z1.b = new z1();
    }
    public void z1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareTopicGuidePresenter", "mEditStatus", p0);
    }
}
