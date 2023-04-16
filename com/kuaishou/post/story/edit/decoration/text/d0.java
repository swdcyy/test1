package com.kuaishou.post.story.edit.decoration.text.d0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class d0 implements g	// class@000ae4
{
    public static final d0 b;

    static {
       d0.b = new d0();
    }
    public void d0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("StoryTextEditDonePresenter", "onBind mTextEditCompletePublisher: ", p0);
    }
}
