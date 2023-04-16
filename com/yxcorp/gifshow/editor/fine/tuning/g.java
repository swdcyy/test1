package com.yxcorp.gifshow.editor.fine.tuning.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.editor.fine.tuning.k;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import java.lang.Object;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment;

public class g extends Accessor	// class@001ba3
{
    public final FineTuningEditorFragment$b c;
    public final k d;

    public void g(k p0,FineTuningEditorFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
