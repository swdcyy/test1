package com.kuaishou.post.story.edit.decoration.text.o0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.q0;
import com.kuaishou.post.story.edit.decoration.text.c0$a;
import java.lang.Object;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;

public class o0 extends Accessor	// class@000b0b
{
    public final c0$a c;
    public final q0 d;

    public void o0(q0 p0,c0$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
