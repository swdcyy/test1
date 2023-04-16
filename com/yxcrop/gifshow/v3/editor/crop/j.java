package com.yxcrop.gifshow.v3.editor.crop.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcrop.gifshow.v3.editor.crop.m;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment;

public class j extends Accessor	// class@000a19
{
    public final CropEditorFragment$b c;
    public final m d;

    public void j(m p0,CropEditorFragment$b p1){
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
