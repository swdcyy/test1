package com.kuaishou.post.story.edit.decoration.text.q;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class q extends Accessor	// class@000b10
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void q(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.l);
    }
    public void set(Object p0){
       this.c.l = p0.intValue();
    }
}