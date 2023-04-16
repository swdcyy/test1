package com.yxcorp.gifshow.v3.editor.sticker.d0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment$a;
import com.yxcorp.gifshow.v3.editor.sticker.u;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.sticker.v;
import com.yxcorp.gifshow.v3.editor.sticker.w;
import com.yxcorp.gifshow.v3.editor.sticker.x;
import com.yxcorp.gifshow.v3.editor.sticker.y;
import com.yxcorp.gifshow.v3.editor.sticker.z;
import com.yxcorp.gifshow.v3.editor.sticker.a0;
import com.yxcorp.gifshow.v3.editor.sticker.b0;
import com.yxcorp.gifshow.v3.editor.sticker.c0;
import com.yxcorp.gifshow.v3.editor.sticker.t;
import java.lang.Class;
import mm8.a;

public final class d0 implements b	// class@00121e
{

    public void d0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("DECORATION_PLAYER", new u(this, p1));
       p0.i("EDITOR_HELPER_CONTRACT", new v(this, p1));
       p0.i("FRAGMENT", new w(this, p1));
       p0.i("HIDE_STICKER_LIBRARY_EVENT", new x(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new y(this, p1));
       p0.i("DECORATION_CONTAINER_VIEW", new z(this, p1));
       p0.i("STICKER_GROUP_INFO", new a0(this, p1));
       p0.i("STICKER_LISTENERS", new b0(this, p1));
       c0 uoc0 = new c0(this, p1);
       String str = "STICKER_REQUEST_EVENT";
       try{
          p0.i(str, uoc0);
          p0.h(SinglePicStickerEditorFragment$a.class, new t(this, p1));
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
