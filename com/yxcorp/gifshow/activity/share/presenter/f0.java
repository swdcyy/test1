package com.yxcorp.gifshow.activity.share.presenter.f0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class f0 implements g	// class@0013de
{
    public static final f0 b;

    static {
       f0.b = new f0();
    }
    public void f0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareCancelPresenter", "mPageConfigurationStatus", p0);
    }
}
