package com.yxcorp.gifshow.v3.editor.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.h;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public class f extends Accessor	// class@000f91
{
    public final BaseEditorFragment$d c;
    public final h d;

    public void f(h p0,BaseEditorFragment$d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
