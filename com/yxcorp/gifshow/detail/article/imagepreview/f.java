package com.yxcorp.gifshow.detail.article.imagepreview.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment$a;
import com.yxcorp.gifshow.detail.article.imagepreview.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.article.imagepreview.b;
import com.yxcorp.gifshow.detail.article.imagepreview.c;
import com.yxcorp.gifshow.detail.article.imagepreview.d;
import com.yxcorp.gifshow.detail.article.imagepreview.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@001350
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("IMAGE_PREVIEW_PUBLISH_SUBJECT", new a(this, p1));
       p0.i("IMAGE_PREVIEW_CURRENT_POSITION", new b(this, p1));
       p0.i("IMAGE_PREVIEW_PHOTO", new c(this, p1));
       d uod = new d(this, p1);
       String str = "IMAGE_PREVIEW_MODELS_FRAGMENT";
       try{
          p0.i(str, uod);
          p0.h(ImagePreviewFragment$a.class, new e(this, p1));
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
