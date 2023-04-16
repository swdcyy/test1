package com.kuaishou.post.story.edit.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import rp4.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.util.PostUtils;

public final class b implements g	// class@000ac6
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       a.D().z("Story", "error", p0);
       PostUtils.D("StoryEditTransitionPresenter", "onBind mBarAnimPublisher: ", p0);
    }
}
