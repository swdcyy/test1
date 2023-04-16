package com.yxcorp.gifshow.v3.editor.prettify.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.prettify.n;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public class e extends Accessor	// class@00115d
{
    public final EditPrettifyFragment$c c;
    public final n d;

    public void e(n p0,EditPrettifyFragment$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.g;
    }
    public void set(Object p0){
       this.c.g = p0;
    }
}
