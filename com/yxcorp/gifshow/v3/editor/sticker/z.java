package com.yxcorp.gifshow.v3.editor.sticker.z;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.sticker.d0;
import com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public class z extends Accessor	// class@0012f4
{
    public final SinglePicStickerEditorFragment$a c;
    public final d0 d;

    public void z(d0 p0,SinglePicStickerEditorFragment$a p1){
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
