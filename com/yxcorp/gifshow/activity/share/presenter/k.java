package com.yxcorp.gifshow.activity.share.presenter.k;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class k implements g	// class@0013fa
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareAdjustPresenter", "mFragmentHidePublisher error", p0);
    }
}
