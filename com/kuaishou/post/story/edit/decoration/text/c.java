package com.kuaishou.post.story.edit.decoration.text.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager;

public class c extends Accessor	// class@000ae3
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void c(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
