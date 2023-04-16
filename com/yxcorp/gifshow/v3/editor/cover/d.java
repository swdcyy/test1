package com.yxcorp.gifshow.v3.editor.cover.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.g;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class d extends Accessor	// class@000e5a
{
    public final CoverEditorFragment$a c;
    public final g d;

    public void d(g p0,CoverEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.b);
    }
    public void set(Object p0){
       this.c.b = p0.intValue();
    }
}
