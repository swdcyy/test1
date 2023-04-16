package com.yxcorp.gifshow.v3.editor.cover.h0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$b;
import com.yxcorp.gifshow.v3.editor.cover.y;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.z;
import com.yxcorp.gifshow.v3.editor.cover.a0;
import com.yxcorp.gifshow.v3.editor.cover.b0;
import com.yxcorp.gifshow.v3.editor.cover.c0;
import com.yxcorp.gifshow.v3.editor.cover.d0;
import com.yxcorp.gifshow.v3.editor.cover.e0;
import com.yxcorp.gifshow.v3.editor.cover.f0;
import com.yxcorp.gifshow.v3.editor.cover.g0;
import com.yxcorp.gifshow.v3.editor.cover.v;
import com.yxcorp.gifshow.v3.editor.cover.w;
import com.yxcorp.gifshow.v3.editor.cover.x;
import java.lang.Class;
import mm8.a;

public final class h0 implements b	// class@000e67
{

    public void h0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADJUST_DECORATION_VIEW_SIZE_PUBLISHER", new y(this, p1));
       p0.i("DECORATION_CONTAINER_VIEW", new z(this, p1));
       p0.i("COVER_FILTER_EVENT", new a0(this, p1));
       p0.i("PhotoCoverSeekChangeListener", new b0(this, p1));
       p0.i("FONT_VIEW_MODEL", new c0(this, p1));
       p0.i("FRAGMENT", new d0(this, p1));
       p0.i("HIDE_COVER_TEXT_LIBRARY_EVENT", new e0(this, p1));
       p0.i("HIDE_PHOTO_COVER_MODE_SWITCH", new f0(this, p1));
       p0.i("COVER_CROP_EDIT_VERSION", new g0(this, p1));
       p0.i("PAGE_TAG", new v(this, p1));
       w ow = new w(this, p1);
       String str = "TIME_LINE_SAVE_DATA";
       try{
          p0.i(str, ow);
          p0.h(PhotosCoverEditorV3Fragment$b.class, new x(this, p1));
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
