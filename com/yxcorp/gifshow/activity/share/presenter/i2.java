package com.yxcorp.gifshow.activity.share.presenter.i2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class i2 implements g	// class@0013ef
{
    public static final i2 b;

    static {
       i2.b = new i2();
    }
    public void i2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareUpdatePhotoPresenter", "mCancelPublisher", p0);
    }
}
