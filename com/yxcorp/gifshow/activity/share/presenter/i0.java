package com.yxcorp.gifshow.activity.share.presenter.i0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.activity.share.presenter.j0;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class i0 implements g	// class@0013ed
{
    public static final i0 b;

    static {
       i0.b = new i0();
    }
    public void i0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareEditorInputPresenter", "mKeyBordStatusSubject", p0);
    }
}
