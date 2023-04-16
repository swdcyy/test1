package com.yxcorp.gifshow.v3.editor.cover.g0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.h0;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$b;
import java.lang.Object;
import java.lang.Boolean;

public class g0 extends Accessor	// class@000e63
{
    public final PhotosCoverEditorV3Fragment$b c;
    public final h0 d;

    public void g0(h0 p0,PhotosCoverEditorV3Fragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.i);
    }
    public void set(Object p0){
       this.c.i = p0.booleanValue();
    }
}
