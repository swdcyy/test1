package com.kuaishou.post.story.edit.decoration.text.m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class m extends Accessor	// class@000b08
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void m(r p0,StoryEditTextFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.i);
    }
    public void set(Object p0){
       this.c.i = p0.booleanValue();
    }
}
