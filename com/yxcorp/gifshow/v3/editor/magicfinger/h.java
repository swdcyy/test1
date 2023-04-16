package com.yxcorp.gifshow.v3.editor.magicfinger.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment$a;
import com.yxcorp.gifshow.v3.editor.magicfinger.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.magicfinger.b;
import com.yxcorp.gifshow.v3.editor.magicfinger.c;
import com.yxcorp.gifshow.v3.editor.magicfinger.d;
import com.yxcorp.gifshow.v3.editor.magicfinger.e;
import com.yxcorp.gifshow.v3.editor.magicfinger.f;
import com.yxcorp.gifshow.v3.editor.magicfinger.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@001031
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("EDITOR_HELPER_CONTRACT", new a(this, p1));
       p0.i("FRAGMENT", new b(this, p1));
       p0.i("PAGE_TAG", new c(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new d(this, p1));
       p0.i("EDITOR_SHOW_MODE", new e(this, p1));
       f uof = new f(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, uof);
          p0.h(MagicFingerFragment$a.class, new g(this, p1));
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
