package com.yxcorp.gifshow.v3.editor.prettify.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import com.yxcorp.gifshow.v3.editor.prettify.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.prettify.f;
import com.yxcorp.gifshow.v3.editor.prettify.g;
import com.yxcorp.gifshow.v3.editor.prettify.h;
import com.yxcorp.gifshow.v3.editor.prettify.i;
import com.yxcorp.gifshow.v3.editor.prettify.j;
import com.yxcorp.gifshow.v3.editor.prettify.k;
import com.yxcorp.gifshow.v3.editor.prettify.l;
import com.yxcorp.gifshow.v3.editor.prettify.m;
import com.yxcorp.gifshow.v3.editor.prettify.a;
import com.yxcorp.gifshow.v3.editor.prettify.b;
import com.yxcorp.gifshow.v3.editor.prettify.c;
import com.yxcorp.gifshow.v3.editor.prettify.d;
import java.lang.Class;
import mm8.a;

public final class n implements b	// class@00119b
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("DECORATION_CONTAINER_VIEW", new e(this, p1));
       p0.i("EDITOR_HELPER_CONTRACT", new f(this, p1));
       p0.i("GENERATE_FILTER_FRAGMETN", new g(this, p1));
       p0.i("FILTER_UPDATE_LISTENER", new h(this, p1));
       p0.i("FRAGMENT", new i(this, p1));
       p0.i("PRETTIFY_FIRST_SHOW", new j(this, p1));
       p0.i("prettifyEdit", new k(this, p1));
       p0.i("PRETTIFY_FRAGMENT", new l(this, p1));
       p0.i("PRETTIFY_NAME_HELPER", new m(this, p1));
       p0.i("GENERATE_FRAGMENT", new a(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, uoc);
          p0.h(EditPrettifyFragment$c.class, new d(this, p1));
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
