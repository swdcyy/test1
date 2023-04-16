package com.yxcorp.gifshow.activity.share.presenter.j1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class j1 implements g	// class@0013f3
{
    public static final j1 b;

    static {
       j1.b = new j1();
    }
    public void j1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SharePhotosPreviewPresenter", "mKeyBordStatusSubject", p0);
    }
}
