package com.kuaishou.post.story.edit.decoration.text.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class l extends Accessor	// class@000b06
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void l(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.j);
    }
    public void set(Object p0){
       this.c.j = p0.booleanValue();
    }
}
