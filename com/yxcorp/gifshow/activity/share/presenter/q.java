package com.yxcorp.gifshow.activity.share.presenter.q;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class q implements g	// class@001427
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareBasePreviewPresenter", "lifecycle", p0);
    }
}
