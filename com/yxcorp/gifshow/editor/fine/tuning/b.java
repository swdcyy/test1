package com.yxcorp.gifshow.editor.fine.tuning.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.editor.fine.tuning.k;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class b extends Accessor	// class@001b9d
{
    public final FineTuningEditorFragment$b c;
    public final k d;

    public void b(k p0,FineTuningEditorFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
