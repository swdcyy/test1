package com.yxcorp.gifshow.v3.editor.sticker.y;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.sticker.d0;
import com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class y extends Accessor	// class@0012f2
{
    public final SinglePicStickerEditorFragment$a c;
    public final d0 d;

    public void y(d0 p0,SinglePicStickerEditorFragment$a p1){
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
