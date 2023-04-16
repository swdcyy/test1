package com.kuaishou.live.audience.component.comments.editor.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$f;
import com.kuaishou.live.audience.component.comments.editor.g;
import com.kuaishou.live.audience.component.comments.editor.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.audience.component.comments.editor.c;
import mm8.a;

public final class d implements b	// class@000aaa
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       g og = g.class;
       b uob = new b(this, p1);
       try{
          p0.h(og, uob);
          p0.h(LiveAsrFloatEditorFragment$f.class, new c(this, p1));
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
