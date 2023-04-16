package com.yxcorp.gifshow.v3.editor.sticker.x;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.sticker.d0;
import com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class x extends Accessor	// class@0012ee
{
    public final SinglePicStickerEditorFragment$a c;
    public final d0 d;

    public void x(d0 p0,SinglePicStickerEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h;
    }
    public void set(Object p0){
       this.c.h = p0;
    }
}
