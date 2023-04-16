package com.yxcorp.gifshow.editor.fine.tuning.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.editor.fine.tuning.k;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import java.lang.Object;
import rwc.j;

public class i extends Accessor	// class@001ba5
{
    public final FineTuningEditorFragment$b c;
    public final k d;

    public void i(k p0,FineTuningEditorFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
