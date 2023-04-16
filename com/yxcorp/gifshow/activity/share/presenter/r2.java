package com.yxcorp.gifshow.activity.share.presenter.r2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class r2 implements g	// class@00142b
{
    public static final r2 b;

    static {
       r2.b = new r2();
    }
    public void r2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareKeyboardStatus", "mKeyBordStatusSubject", p0);
    }
}
