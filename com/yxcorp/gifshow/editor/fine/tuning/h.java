package com.yxcorp.gifshow.editor.fine.tuning.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.editor.fine.tuning.k;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import java.lang.Object;
import java.lang.Integer;

public class h extends Accessor	// class@001ba4
{
    public final FineTuningEditorFragment$b c;
    public final k d;

    public void h(k p0,FineTuningEditorFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.intValue();
    }
}
