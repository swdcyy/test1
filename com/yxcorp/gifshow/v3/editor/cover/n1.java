package com.yxcorp.gifshow.v3.editor.cover.n1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.p1;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.model.f;

public class n1 extends Accessor	// class@000e84
{
    public final VideoCoverEditorV3Fragment$a c;
    public final p1 d;

    public void n1(p1 p0,VideoCoverEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
