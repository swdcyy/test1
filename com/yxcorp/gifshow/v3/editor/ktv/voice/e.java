package com.yxcorp.gifshow.v3.editor.ktv.voice.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.voice.g;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment$a;
import java.lang.Object;
import java.lang.String;

public class e extends Accessor	// class@001001
{
    public final KtvEditOperationFragment$a c;
    public final g d;

    public void e(g p0,KtvEditOperationFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
