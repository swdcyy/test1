package com.yxcorp.gifshow.activity.share.presenter.d1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class d1 implements g	// class@0013d7
{
    public static final d1 b;

    static {
       d1.b = new d1();
    }
    public void d1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareNetworkPromptPresenter", "onBind: try to show no network dialog", p0);
    }
}
