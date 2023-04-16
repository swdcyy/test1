package com.kuaishou.post.story.edit.decoration.text.r;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import com.kuaishou.post.story.edit.decoration.text.i;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.post.story.edit.decoration.text.j;
import com.kuaishou.post.story.edit.decoration.text.k;
import com.kuaishou.post.story.edit.decoration.text.l;
import com.kuaishou.post.story.edit.decoration.text.m;
import com.kuaishou.post.story.edit.decoration.text.n;
import com.kuaishou.post.story.edit.decoration.text.o;
import com.kuaishou.post.story.edit.decoration.text.p;
import com.kuaishou.post.story.edit.decoration.text.q;
import com.kuaishou.post.story.edit.decoration.text.a;
import com.kuaishou.post.story.edit.decoration.text.b;
import com.kuaishou.post.story.edit.decoration.text.c;
import com.kuaishou.post.story.edit.decoration.text.d;
import com.kuaishou.post.story.edit.decoration.text.e;
import com.kuaishou.post.story.edit.decoration.text.f;
import com.kuaishou.post.story.edit.decoration.text.g;
import com.kuaishou.post.story.edit.decoration.text.h;
import java.lang.Class;
import mm8.a;

public final class r implements b	// class@000b12
{

    public void r(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AI_VIDEO_PAGE_PRESENTER_MODEL", new i(this, p1));
       p0.i("BACKUP_STORY_TEXT_DRAWER", new j(this, p1));
       p0.i("STORY_ENABLE_BAR_SHADOW", new k(this, p1));
       p0.i("ENABLE_COMPLETE_BUTTON_IF_EMPTY_TEXT", new l(this, p1));
       p0.i("STORY_ENABLE_TEXT_SHADOW", new m(this, p1));
       p0.i("FRAGMENT", new n(this, p1));
       p0.i("IS_ENABLE_SAVE_TEXT_BACKGROUND_STYLE", new o(this, p1));
       p0.i("MOOD_IS_IN_CAMERA_MOOD_TAB", new p(this, p1));
       p0.i("LOGGER_ACTION", new q(this, p1));
       p0.i("MOOD_CURRENT_PAGE", new a(this, p1));
       p0.i("STORY_SOURCE", new b(this, p1));
       p0.i("STORY_TEXT_DATA_MANAGER", new c(this, p1));
       p0.i("STORY_TEXT_DEFAULT_COLOR_INDEX", new d(this, p1));
       p0.i("STORY_TEXT_DRAWER", new e(this, p1));
       p0.i("TEXT_EDIT_COMPLETE_PUBLISHER", new f(this, p1));
       g og = new g(this, p1);
       String str = "STORY_TEXT_INPUT_DONE_PARAM";
       try{
          p0.i(str, og);
          p0.h(StoryEditTextFragment$a.class, new h(this, p1));
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
