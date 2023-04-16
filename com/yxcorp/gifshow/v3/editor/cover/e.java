package com.yxcorp.gifshow.v3.editor.cover.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.g;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment$a;
import java.lang.Object;
import java.lang.String;

public class e extends Accessor	// class@000e5e
{
    public final CoverEditorFragment$a c;
    public final g d;

    public void e(g p0,CoverEditorFragment$a p1){
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
