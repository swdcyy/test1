package com.yxcorp.gifshow.activity.share.presenter.w;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class w implements g	// class@001453
{
    public static final w b;

    static {
       w.b = new w();
    }
    public void w(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareBasePreviewPresenter", "startEdit download resource fail", p0);
    }
}
