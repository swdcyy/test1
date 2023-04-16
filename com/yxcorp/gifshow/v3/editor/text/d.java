package com.yxcorp.gifshow.v3.editor.text.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.text.z;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView$e;

public class d extends Accessor	// class@0013bc
{
    public final TextEditorV3Fragment$a c;
    public final z d;

    public void d(z p0,TextEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
