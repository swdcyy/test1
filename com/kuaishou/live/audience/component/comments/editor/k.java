package com.kuaishou.live.audience.component.comments.editor.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.comments.editor.LiveUniversalCommentFloatEditorFragment$b;
import y31.e;
import com.kuaishou.live.audience.component.comments.editor.i;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.audience.component.comments.editor.j;
import mm8.a;

public final class k implements b	// class@000ab3
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       e uoe = e.class;
       i oi = new i(this, p1);
       try{
          p0.h(uoe, oi);
          p0.h(LiveUniversalCommentFloatEditorFragment$b.class, new j(this, p1));
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
