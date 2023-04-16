package com.kuaishou.post.story.edit.decoration.text.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import vp4.b;

public class i extends Accessor	// class@000b00
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void i(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.q;
    }
    public void set(Object p0){
       this.c.q = p0;
    }
}
