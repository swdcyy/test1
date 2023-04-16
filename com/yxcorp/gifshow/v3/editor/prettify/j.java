package com.yxcorp.gifshow.v3.editor.prettify.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.prettify.n;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import java.lang.Object;
import java.lang.Boolean;

public class j extends Accessor	// class@001182
{
    public final EditPrettifyFragment$c c;
    public final n d;

    public void j(n p0,EditPrettifyFragment$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.i);
    }
    public void set(Object p0){
       this.c.i = p0.booleanValue();
    }
}
