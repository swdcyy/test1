package com.yxcorp.gifshow.v3.editor.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.h;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.lang.Object;
import java.util.Set;

public class a extends Accessor	// class@000da3
{
    public final BaseEditorFragment$d c;
    public final h d;

    public void a(h p0,BaseEditorFragment$d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
