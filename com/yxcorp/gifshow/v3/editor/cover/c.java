package com.yxcorp.gifshow.v3.editor.cover.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.g;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class c extends Accessor	// class@000e45
{
    public final CoverEditorFragment$a c;
    public final g d;

    public void c(g p0,CoverEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
