package com.yxcorp.gifshow.v3.editor.cover.p1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment$a;
import com.yxcorp.gifshow.v3.editor.cover.g1;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.h1;
import com.yxcorp.gifshow.v3.editor.cover.i1;
import com.yxcorp.gifshow.v3.editor.cover.j1;
import com.yxcorp.gifshow.v3.editor.cover.k1;
import com.yxcorp.gifshow.v3.editor.cover.l1;
import com.yxcorp.gifshow.v3.editor.cover.m1;
import com.yxcorp.gifshow.v3.editor.cover.n1;
import com.yxcorp.gifshow.v3.editor.cover.o1;
import java.lang.Class;
import mm8.a;

public final class p1 implements b	// class@000e8a
{

    public void p1(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("DECORATION_CONTAINER_VIEW", new g1(this, p1));
       p0.i("VideoCoverSeekChangeListener", new h1(this, p1));
       p0.i("availableExpandFoldView", new i1(this, p1));
       p0.i("FONT_VIEW_MODEL", new j1(this, p1));
       p0.i("FRAGMENT", new k1(this, p1));
       p0.i("HIDE_COVER_TEXT_LIBRARY_EVENT", new l1(this, p1));
       p0.i("PAGE_TAG", new m1(this, p1));
       n1 on1 = new n1(this, p1);
       String str = "TIME_LINE_SAVE_DATA";
       try{
          p0.i(str, on1);
          p0.h(VideoCoverEditorV3Fragment$a.class, new o1(this, p1));
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
