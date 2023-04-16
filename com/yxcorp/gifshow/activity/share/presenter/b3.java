package com.yxcorp.gifshow.activity.share.presenter.b3;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class b3 implements g	// class@0013c4
{
    public static final b3 b;

    static {
       b3.b = new b3();
    }
    public void b3(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareVideoQualityObservePresenter", "addListener failed", p0);
    }
}
