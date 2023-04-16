package com.yxcorp.gifshow.activity.share.presenter.b2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class b2 implements g	// class@0013c3
{
    public static final b2 b;

    static {
       b2.b = new b2();
    }
    public void b2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareTopicV3Presenter", "mEditStatus", p0);
    }
}
