package com.yxcorp.gifshow.v3.editor.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.yxcorp.gifshow.v3.editor.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.b;
import com.yxcorp.gifshow.v3.editor.c;
import com.yxcorp.gifshow.v3.editor.d;
import com.yxcorp.gifshow.v3.editor.e;
import com.yxcorp.gifshow.v3.editor.f;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.yxcorp.gifshow.v3.editor.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@000fac
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("EDITOR_CONTROL_LISTENER", new a(this, p1));
       p0.i("EDITOR_DELEGATE", new b(this, p1));
       p0.i("START_EDIT_TIME", new c(this, p1));
       p0.i("SUB_TYPE", new d(this, p1));
       p0.i("EDITOR_VIEW_LISTENERS", new e(this, p1));
       p0.i("WORKSPACE", new f(this, p1));
       if (p1.f != null) {
          Accessors.d().b(p1.f).a(p0, p1.f);
       }
       try{
          p0.h(BaseEditorFragment$d.class, new g(this, p1));
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
