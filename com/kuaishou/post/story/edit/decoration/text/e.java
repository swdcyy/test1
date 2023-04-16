package com.kuaishou.post.story.edit.decoration.text.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;

public class e extends Accessor	// class@000ae7
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void e(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
