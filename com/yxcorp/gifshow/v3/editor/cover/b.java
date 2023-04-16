package com.yxcorp.gifshow.v3.editor.cover.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.g;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment$a;
import java.lang.Object;
import java.util.Set;

public class b extends Accessor	// class@000e41
{
    public final CoverEditorFragment$a c;
    public final g d;

    public void b(g p0,CoverEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
