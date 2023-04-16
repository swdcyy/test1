package com.yxcorp.gifshow.v3.editor.cover.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment$a;
import com.yxcorp.gifshow.v3.editor.cover.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.c;
import com.yxcorp.gifshow.v3.editor.cover.d;
import com.yxcorp.gifshow.v3.editor.cover.e;
import com.yxcorp.gifshow.v3.editor.cover.f;
import java.lang.Class;
import mm8.a;

public final class g implements b	// class@000e66
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("COVER_INFO_PROVIDERS", new b(this, p1));
       p0.i("COVER_OUTFILE_EVENT", new c(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, uoe);
          p0.h(CoverEditorFragment$a.class, new f(this, p1));
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
