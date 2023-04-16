package com.yxcorp.gifshow.v3.editor.text.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.text.z;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.model.f;

public class o extends Accessor	// class@00147d
{
    public final TextEditorV3Fragment$a c;
    public final z d;

    public void o(z p0,TextEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.q;
    }
    public void set(Object p0){
       this.c.q = p0;
    }
}
