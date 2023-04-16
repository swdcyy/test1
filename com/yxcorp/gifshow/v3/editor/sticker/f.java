package com.yxcorp.gifshow.v3.editor.sticker.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.sticker.h;
import com.yxcorp.gifshow.v3.editor.sticker.StickerEditorV3Fragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.StickerEditorV3Fragment;

public class f extends Accessor	// class@00124d
{
    public final StickerEditorV3Fragment$a c;
    public final h d;

    public void f(h p0,StickerEditorV3Fragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
