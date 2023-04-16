package com.yxcorp.gifshow.v3.editor.cover.k2;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class k2 implements g	// class@000e7a
{
    public static final k2 b;

    static {
       k2.b = new k2();
    }
    public void k2(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("VideoCoverRecommendASP", "mCoverChangePublisher", p0);
    }
}
