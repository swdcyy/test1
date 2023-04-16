package com.yxcorp.gifshow.activity.share.presenter.v;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class v implements g	// class@00143f
{
    public static final v b;

    static {
       v.b = new v();
    }
    public void v(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareBasePreviewPresenter", "startPreview, onError", p0);
    }
}
