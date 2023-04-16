package com.kuaishou.post.story.edit.decoration.text.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.r;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class f extends Accessor	// class@000aec
{
    public final StoryEditTextFragment$a c;
    public final r d;

    public void f(r p0,StoryEditTextFragment$a p1){
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
