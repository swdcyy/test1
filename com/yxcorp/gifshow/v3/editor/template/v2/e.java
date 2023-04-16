package com.yxcorp.gifshow.v3.editor.template.v2.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2$a;
import com.yxcorp.gifshow.v3.editor.template.v2.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.template.v2.b;
import com.yxcorp.gifshow.v3.editor.template.v2.c;
import com.yxcorp.gifshow.v3.editor.template.v2.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@001384
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("FRAGMENT", new a(this, p1));
       p0.i("IS_KEYBOARD_SHOWING", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "IS_STICKER_LIBRARY_SHOWING";
       try{
          p0.i(str, uoc);
          p0.h(PicTemplateEditorFragmentV2$a.class, new d(this, p1));
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
