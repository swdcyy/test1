package com.yxcrop.gifshow.v3.editor.crop.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcrop.gifshow.v3.editor.crop.m;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import java.lang.Object;
import java.lang.Integer;

public class e extends Accessor	// class@000a14
{
    public final CropEditorFragment$b c;
    public final m d;

    public void e(m p0,CropEditorFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.g);
    }
    public void set(Object p0){
       this.c.g = p0.intValue();
    }
}
