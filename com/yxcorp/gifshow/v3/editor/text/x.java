package com.yxcorp.gifshow.v3.editor.text.x;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.text.z;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class x extends Accessor	// class@00150f
{
    public final TextEditorV3Fragment$a c;
    public final z d;

    public void x(z p0,TextEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
