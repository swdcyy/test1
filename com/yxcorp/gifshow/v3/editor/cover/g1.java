package com.yxcorp.gifshow.v3.editor.cover.g1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.p1;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public class g1 extends Accessor	// class@000e64
{
    public final VideoCoverEditorV3Fragment$a c;
    public final p1 d;

    public void g1(p1 p0,VideoCoverEditorV3Fragment$a p1){
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
