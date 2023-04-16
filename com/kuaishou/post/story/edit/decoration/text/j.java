package com.kuaishou.post.story.edit.decoration.text.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;

public class j extends Accessor	// class@000b02
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void j(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
