package com.yxcorp.gifshow.activity.share.presenter.e2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class e2 implements g	// class@0013dc
{
    public static final e2 b;

    static {
       e2.b = new e2();
    }
    public void e2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareUnmatchTopicTipsPresenter", "mFragmentHidePublisher", p0);
    }
}
