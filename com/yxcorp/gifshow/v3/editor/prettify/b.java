package com.yxcorp.gifshow.v3.editor.prettify.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.prettify.n;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import java.lang.Object;
import java.lang.Integer;

public class b extends Accessor	// class@001145
{
    public final EditPrettifyFragment$c c;
    public final n d;

    public void b(n p0,EditPrettifyFragment$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.d);
    }
    public void set(Object p0){
       this.c.d = p0.intValue();
    }
}
