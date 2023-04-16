package com.yxcorp.gifshow.editor.fine.tuning.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.editor.fine.tuning.k;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.i;

public class f extends Accessor	// class@001ba2
{
    public final FineTuningEditorFragment$b c;
    public final k d;

    public void f(k p0,FineTuningEditorFragment$b p1){
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
