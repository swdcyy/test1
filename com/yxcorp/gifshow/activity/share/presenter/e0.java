package com.yxcorp.gifshow.activity.share.presenter.e0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class e0 implements g	// class@0013da
{
    public static final e0 b;

    static {
       e0.b = new e0();
    }
    public void e0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareCancelPresenter", "mCancelPublisher", p0);
    }
}
