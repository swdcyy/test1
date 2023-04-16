package com.yxcorp.gifshow.v3.editor.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.h;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.lang.Object;
import java.lang.Long;

public class c extends Accessor	// class@000da8
{
    public final BaseEditorFragment$d c;
    public final h d;

    public void c(h p0,BaseEditorFragment$d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Long.valueOf(this.c.e);
    }
    public void set(Object p0){
       this.c.e = p0.longValue();
    }
}
