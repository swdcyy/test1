package com.yxcorp.gifshow.activity.share.presenter.s2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class s2 implements g	// class@00142f
{
    public static final s2 b;

    static {
       s2.b = new s2();
    }
    public void s2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareKeyboardStatus", "mPageConfigurationStatus", p0);
    }
}
