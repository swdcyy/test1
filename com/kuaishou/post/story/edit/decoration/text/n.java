package com.kuaishou.post.story.edit.decoration.text.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;

public class n extends Accessor	// class@000b0a
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void n(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
