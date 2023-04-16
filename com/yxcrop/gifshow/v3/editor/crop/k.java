package com.yxcrop.gifshow.v3.editor.crop.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcrop.gifshow.v3.editor.crop.m;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import java.lang.Object;
import java.lang.String;

public class k extends Accessor	// class@000a1a
{
    public final CropEditorFragment$b c;
    public final m d;

    public void k(m p0,CropEditorFragment$b p1){
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
