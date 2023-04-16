package com.kuaishou.live.audience.component.comments.editor.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.audience.component.comments.editor.d;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$f;
import java.lang.Object;
import com.kuaishou.live.audience.component.comments.editor.g;

public class b extends Accessor	// class@000aa8
{
    public final LiveAsrFloatEditorFragment$f c;
    public final d d;

    public void b(d p0,LiveAsrFloatEditorFragment$f p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.p;
    }
    public void set(Object p0){
       this.c.p = p0;
    }
}
