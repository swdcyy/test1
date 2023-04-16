package com.yxcorp.gifshow.activity.share.presenter.h1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class h1 implements g	// class@0013ea
{
    public static final h1 b;

    static {
       h1.b = new h1();
    }
    public void h1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SharePhotosPreviewPresenter", "mBackEventPublisher", p0);
    }
}
