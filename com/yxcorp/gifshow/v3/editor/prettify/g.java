package com.yxcorp.gifshow.v3.editor.prettify.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.prettify.n;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class g extends Accessor	// class@00117f
{
    public final EditPrettifyFragment$c c;
    public final n d;

    public void g(n p0,EditPrettifyFragment$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.l;
    }
    public void set(Object p0){
       this.c.l = p0;
    }
}
