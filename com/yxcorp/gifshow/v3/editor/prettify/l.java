package com.yxcorp.gifshow.v3.editor.prettify.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.prettify.n;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class l extends Accessor	// class@001184
{
    public final EditPrettifyFragment$c c;
    public final n d;

    public void l(n p0,EditPrettifyFragment$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
