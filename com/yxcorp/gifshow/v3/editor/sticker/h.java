package com.yxcorp.gifshow.v3.editor.sticker.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.sticker.StickerEditorV3Fragment$a;
import com.yxcorp.gifshow.v3.editor.sticker.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.sticker.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@001255
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       f uof = new f(this, p1);
       String str = "FRAGMENT";
       try{
          p0.i(str, uof);
          p0.h(StickerEditorV3Fragment$a.class, new g(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
