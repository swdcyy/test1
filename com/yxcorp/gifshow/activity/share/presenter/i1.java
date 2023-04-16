package com.yxcorp.gifshow.activity.share.presenter.i1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class i1 implements g	// class@0013ee
{
    public static final i1 b;

    static {
       i1.b = new i1();
    }
    public void i1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SharePhotosPreviewPresenter", "onBind", p0);
    }
}
