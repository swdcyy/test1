package com.yxcorp.gifshow.v3.editor.sticker.b0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.sticker.d0;
import com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment$a;
import java.lang.Object;
import java.util.Set;

public class b0 extends Accessor	// class@001217
{
    public final SinglePicStickerEditorFragment$a c;
    public final d0 d;

    public void b0(d0 p0,SinglePicStickerEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
