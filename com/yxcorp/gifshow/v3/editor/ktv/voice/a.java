package com.yxcorp.gifshow.v3.editor.ktv.voice.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.voice.g;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.i;

public class a extends Accessor	// class@000ffd
{
    public final KtvEditOperationFragment$a c;
    public final g d;

    public void a(g p0,KtvEditOperationFragment$a p1){
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
