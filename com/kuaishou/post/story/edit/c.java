package com.kuaishou.post.story.edit.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import rp4.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.util.PostUtils;

public final class c implements g	// class@000ac7
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       a.D().z("Story", "error", p0);
       PostUtils.D("StoryEditTransitionPresenter", "onBind mNavigationBarStatePublisher distinctUntilChanged: ", p0);
    }
}
