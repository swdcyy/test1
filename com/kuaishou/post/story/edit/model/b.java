package com.kuaishou.post.story.edit.model.b;
import java.lang.Runnable;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer$b;
import fq4.c0;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;

public final class b implements Runnable	// class@000b2c
{
    public final StoryTextDrawer b;
    public final DecorationContainerView c;

    public void b(StoryTextDrawer p0,DecorationContainerView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       tb.startElementAnimation(new DecorationDrawer$b(), new c0(tb, this.c));
    }
}
