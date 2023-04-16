package com.yxcorp.gifshow.v3.editor.text.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.text.z;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;

public class e extends Accessor	// class@0013f3
{
    public final TextEditorV3Fragment$a c;
    public final z d;

    public void e(z p0,TextEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.w;
    }
    public void set(Object p0){
       this.c.w = p0;
    }
}
