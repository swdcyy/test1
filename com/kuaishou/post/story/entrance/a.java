package com.kuaishou.post.story.entrance.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import lnc.i1;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class a implements g	// class@000b2e
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       i1.c(p0);
       PostUtils.D("NextStepPresenter", "onBind mNextStepPublisher: ", p0);
    }
}
