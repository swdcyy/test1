package com.yxcorp.gifshow.v3.editor.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.h;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public class b extends Accessor	// class@000da7
{
    public final BaseEditorFragment$d c;
    public final h d;

    public void b(h p0,BaseEditorFragment$d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.g;
    }
    public void set(Object p0){
       this.c.g = p0;
    }
}
