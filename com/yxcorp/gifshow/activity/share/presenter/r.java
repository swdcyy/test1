package com.yxcorp.gifshow.activity.share.presenter.r;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class r implements g	// class@00142c
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareBasePreviewPresenter", "mActivityFinishPublisher", p0);
    }
}
