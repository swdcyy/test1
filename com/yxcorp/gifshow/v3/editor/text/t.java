package com.yxcorp.gifshow.v3.editor.text.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.text.z;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import java.lang.Object;
import java.lang.Integer;

public class t extends Accessor	// class@0014b5
{
    public final TextEditorV3Fragment$a c;
    public final z d;

    public void t(z p0,TextEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.l);
    }
    public void set(Object p0){
       this.c.l = p0.intValue();
    }
}
