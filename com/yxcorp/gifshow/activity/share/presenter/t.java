package com.yxcorp.gifshow.activity.share.presenter.t;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class t implements g	// class@001434
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareBasePreviewPresenter", "uploadEditCover", p0);
    }
}
