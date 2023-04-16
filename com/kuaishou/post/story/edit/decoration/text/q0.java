package com.kuaishou.post.story.edit.decoration.text.q0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.post.story.edit.decoration.text.c0$a;
import com.kuaishou.post.story.edit.decoration.text.k0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.l0;
import com.kuaishou.post.story.edit.decoration.text.m0;
import com.kuaishou.post.story.edit.decoration.text.n0;
import com.kuaishou.post.story.edit.decoration.text.o0;
import com.kuaishou.post.story.edit.decoration.text.p0;
import java.lang.Class;
import mm8.a;

public final class q0 implements b	// class@000b0f
{

    public void q0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("STORY_TEXT_COLOR_ITEM_MARGIN", new k0(this, p1));
       p0.i("LOGGER_ACTION", new l0(this, p1));
       p0.i("MOOD_CURRENT_PAGE", new m0(this, p1));
       p0.i("STORY_SOURCE", new n0(this, p1));
       o0 oo0 = new o0(this, p1);
       String str = "STORY_TEXT_DRAWER";
       try{
          p0.i(str, oo0);
          p0.h(c0$a.class, new p0(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
