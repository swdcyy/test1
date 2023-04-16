package com.yxcorp.gifshow.v3.editor.prettify.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.prettify.n;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import java.lang.Object;
import p0c.h;

public class a extends Accessor	// class@001144
{
    public final EditPrettifyFragment$c c;
    public final n d;

    public void a(n p0,EditPrettifyFragment$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
