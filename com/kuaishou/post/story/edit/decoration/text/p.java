package com.kuaishou.post.story.edit.decoration.text.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class p extends Accessor	// class@000b0e
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void p(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.p);
    }
    public void set(Object p0){
       this.c.p = p0.booleanValue();
    }
}
