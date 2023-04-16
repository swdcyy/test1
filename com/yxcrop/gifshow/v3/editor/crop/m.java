package com.yxcrop.gifshow.v3.editor.crop.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import com.yxcrop.gifshow.v3.editor.crop.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcrop.gifshow.v3.editor.crop.e;
import com.yxcrop.gifshow.v3.editor.crop.f;
import com.yxcrop.gifshow.v3.editor.crop.g;
import com.yxcrop.gifshow.v3.editor.crop.h;
import com.yxcrop.gifshow.v3.editor.crop.i;
import com.yxcrop.gifshow.v3.editor.crop.j;
import com.yxcrop.gifshow.v3.editor.crop.k;
import com.yxcrop.gifshow.v3.editor.crop.l;
import com.yxcrop.gifshow.v3.editor.crop.a;
import com.yxcrop.gifshow.v3.editor.crop.b;
import com.yxcrop.gifshow.v3.editor.crop.c;
import java.lang.Class;
import mm8.a;

public final class m implements b	// class@000a1c
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADJUST_DECORATION_VIEW_SIZE_PUBLISHER", new d(this, p1));
       p0.i("CURRENT_PROGRESS", new e(this, p1));
       p0.i("DECORATION_CONTAINER_VIEW", new f(this, p1));
       p0.i("DECORATION_IMPL", new g(this, p1));
       p0.i("DECORATION_PLAYER", new h(this, p1));
       p0.i("EDITOR_HELPER_CONTRACT", new i(this, p1));
       p0.i("FRAGMENT", new j(this, p1));
       p0.i("PAGE_TAG", new k(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new l(this, p1));
       p0.i("STOP_SCROLL_LISTENER", new a(this, p1));
       b uob = new b(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, uob);
          p0.h(CropEditorFragment$b.class, new c(this, p1));
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
