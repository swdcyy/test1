package com.yxcorp.gifshow.v3.editor.text.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.text.z;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment;

public class f extends Accessor	// class@001428
{
    public final TextEditorV3Fragment$a c;
    public final z d;

    public void f(z p0,TextEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}