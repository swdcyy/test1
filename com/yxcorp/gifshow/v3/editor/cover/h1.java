package com.yxcorp.gifshow.v3.editor.cover.h1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.p1;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.widget.EditCoverSeekBar$c;

public class h1 extends Accessor	// class@000e68
{
    public final VideoCoverEditorV3Fragment$a c;
    public final p1 d;

    public void h1(p1 p0,VideoCoverEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
