package com.yxcorp.gifshow.editor.fine.tuning.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.editor.fine.tuning.k;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import java.lang.Object;
import java.lang.Integer;

public class c extends Accessor	// class@001b9e
{
    public final FineTuningEditorFragment$b c;
    public final k d;

    public void c(k p0,FineTuningEditorFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.f);
    }
    public void set(Object p0){
       this.c.f = p0.intValue();
    }
}
