package com.yxcorp.gifshow.activity.share.presenter.b1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class b1 implements g	// class@0013c2
{
    public static final b1 b;

    static {
       b1.b = new b1();
    }
    public void b1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareLocationPresenter", "getPublishPoiList", p0);
    }
}
