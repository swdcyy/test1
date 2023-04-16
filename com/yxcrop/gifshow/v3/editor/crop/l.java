package com.yxcrop.gifshow.v3.editor.crop.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcrop.gifshow.v3.editor.crop.m;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import java.lang.Object;
import java.lang.Integer;

public class l extends Accessor	// class@000a1b
{
    public final CropEditorFragment$b c;
    public final m d;

    public void l(m p0,CropEditorFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.intValue();
    }
}
