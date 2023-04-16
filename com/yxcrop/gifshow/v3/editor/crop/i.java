package com.yxcrop.gifshow.v3.editor.crop.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcrop.gifshow.v3.editor.crop.m;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.i;

public class i extends Accessor	// class@000a18
{
    public final CropEditorFragment$b c;
    public final m d;

    public void i(m p0,CropEditorFragment$b p1){
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
