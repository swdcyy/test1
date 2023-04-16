package com.kuaishou.post.story.edit.decoration.text.l0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.q0;
import com.kuaishou.post.story.edit.decoration.text.c0$a;
import java.lang.Object;
import java.lang.Integer;

public class l0 extends Accessor	// class@000b05
{
    public final c0$a c;
    public final q0 d;

    public void l0(q0 p0,c0$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.g);
    }
    public void set(Object p0){
       this.c.g = p0.intValue();
    }
}
