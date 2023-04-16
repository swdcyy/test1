package com.yxcorp.gifshow.v3.editor.ktv.voice.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.voice.g;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class d extends Accessor	// class@001000
{
    public final KtvEditOperationFragment$a c;
    public final g d;

    public void d(g p0,KtvEditOperationFragment$a p1){
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
