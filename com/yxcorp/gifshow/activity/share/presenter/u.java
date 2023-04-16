package com.yxcorp.gifshow.activity.share.presenter.u;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class u implements g	// class@001438
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareBasePreviewPresenter", "decode cover file fail", p0);
    }
}
