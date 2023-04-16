package com.kuaishou.post.story.edit.decoration.text.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class b extends Accessor	// class@000ae0
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void b(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.n);
    }
    public void set(Object p0){
       this.c.n = p0.intValue();
    }
}
