package com.kuaishou.live.audience.component.comments.editor.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.audience.component.comments.editor.k;
import com.kuaishou.live.audience.component.comments.editor.LiveUniversalCommentFloatEditorFragment$b;
import java.lang.Object;
import y31.e;

public class i extends Accessor	// class@000ab1
{
    public final LiveUniversalCommentFloatEditorFragment$b c;
    public final k d;

    public void i(k p0,LiveUniversalCommentFloatEditorFragment$b p1){
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
