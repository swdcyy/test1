package com.yxcorp.gifshow.widget.p;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.widget.FakePieLoadingView;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class p implements g	// class@00199d
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("FakePieLoadingView", "startFakeLoading: ", p0);
    }
}
