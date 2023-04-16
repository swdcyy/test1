package com.yxcorp.gifshow.v3.editor.ktv.crop.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment$a;
import com.yxcorp.gifshow.v3.editor.ktv.crop.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.crop.b;
import com.yxcorp.gifshow.v3.editor.ktv.crop.c;
import com.yxcorp.gifshow.v3.editor.ktv.crop.d;
import com.yxcorp.gifshow.v3.editor.ktv.crop.e;
import com.yxcorp.gifshow.v3.editor.ktv.crop.f;
import java.lang.Class;
import mm8.a;

public final class g implements b	// class@000fc7
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("EDITOR_HELPER_CONTRACT", new a(this, p1));
       p0.i("FRAGMENT", new b(this, p1));
       p0.i("PAGE_TAG", new c(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, uoe);
          p0.h(KtvCropFragment$a.class, new f(this, p1));
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
