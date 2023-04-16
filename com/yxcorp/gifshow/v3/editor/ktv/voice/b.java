package com.yxcorp.gifshow.v3.editor.ktv.voice.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.voice.g;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment;

public class b extends Accessor	// class@000ffe
{
    public final KtvEditOperationFragment$a c;
    public final g d;

    public void b(g p0,KtvEditOperationFragment$a p1){
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
