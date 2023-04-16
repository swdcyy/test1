package com.yxcorp.gifshow.v3.editor.text.subtitle.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b$b;
import com.yxcorp.gifshow.v3.editor.text.subtitle.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.yxcorp.gifshow.v3.editor.text.subtitle.d;
import com.yxcorp.gifshow.v3.editor.text.subtitle.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@001499
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("EDITOR_SUBTITLE_LIST_MANAGER", new c(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       d uod = new d(this, p1);
       String str = "SUBTITLE_ITEM_DATA";
       try{
          p0.i(str, uod);
          p0.h(b$b.class, new e(this, p1));
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
