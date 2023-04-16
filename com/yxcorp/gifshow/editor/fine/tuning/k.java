package com.yxcorp.gifshow.editor.fine.tuning.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import com.yxcorp.gifshow.editor.fine.tuning.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.editor.fine.tuning.c;
import com.yxcorp.gifshow.editor.fine.tuning.d;
import com.yxcorp.gifshow.editor.fine.tuning.e;
import com.yxcorp.gifshow.editor.fine.tuning.f;
import com.yxcorp.gifshow.editor.fine.tuning.g;
import com.yxcorp.gifshow.editor.fine.tuning.h;
import com.yxcorp.gifshow.editor.fine.tuning.i;
import com.yxcorp.gifshow.editor.fine.tuning.j;
import com.yxcorp.gifshow.editor.fine.tuning.a;
import java.lang.Class;
import mm8.a;

public final class k implements b	// class@001ba7
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADJUST_DECORATION_VIEW_SIZE_PUBLISHER", new b(this, p1));
       p0.i("CURRENT_PROGRESS", new c(this, p1));
       p0.i("DECORATION_IMPL", new d(this, p1));
       p0.i("DECORATION_PLAYER", new e(this, p1));
       p0.i("EDITOR_HELPER_CONTRACT", new f(this, p1));
       p0.i("FRAGMENT", new g(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new h(this, p1));
       p0.i("STOP_SCROLL_LISTENER", new i(this, p1));
       j oj = new j(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, oj);
          p0.h(FineTuningEditorFragment$b.class, new a(this, p1));
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
