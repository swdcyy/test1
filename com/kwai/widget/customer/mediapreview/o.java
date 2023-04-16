package com.kwai.widget.customer.mediapreview.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment$b;
import com.kwai.widget.customer.mediapreview.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.widget.customer.mediapreview.g;
import com.kwai.widget.customer.mediapreview.h;
import com.kwai.widget.customer.mediapreview.i;
import com.kwai.widget.customer.mediapreview.j;
import com.kwai.widget.customer.mediapreview.k;
import com.kwai.widget.customer.mediapreview.l;
import com.kwai.widget.customer.mediapreview.m;
import com.kwai.widget.customer.mediapreview.n;
import com.kwai.widget.customer.mediapreview.a;
import com.kwai.widget.customer.mediapreview.b;
import com.kwai.widget.customer.mediapreview.c;
import com.kwai.widget.customer.mediapreview.d;
import com.kwai.widget.customer.mediapreview.e;
import java.lang.Class;
import mm8.a;

public final class o implements b	// class@00113e
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PREVIEW_MEDIA_PREVIEW_ADAPTER", new f(this, p1));
       p0.i("PREVIEW_MEDIA_PREVIEW_DRAG_STATE", new g(this, p1));
       p0.i("PREVIEW_MEDIA_PREVIEW_EXIT", new h(this, p1));
       p0.i("PREVIEW_MEDIA_PREVIEW_POSITION_INIT", new i(this, p1));
       p0.i("PREVIEW_MEDIA_PREVIEW_ORIGIN_RECT", new j(this, p1));
       p0.i("PREVIEW_MEDIA_PREVIEW_CONTAINERECT", new k(this, p1));
       p0.i("PREVIEW_MEDIA_PREVIEW_MEDIA_PREPARED", new l(this, p1));
       p0.i("PREVIEW_MEDIA_OPTION_VIEW_CLICK", new m(this, p1));
       p0.i("PREVIEW_MEDIA_PREVIEW_POSITION", new n(this, p1));
       p0.i("PREVIEW_MEDIA_PREVIEW_INFO", new a(this, p1));
       p0.i("PREVIEW_MEDIA_FRAGMENT", new b(this, p1));
       p0.i("PREVIEW_MEDIA_PAGE_INDEX", new c(this, p1));
       d uod = new d(this, p1);
       String str = "PREVIEW_MEDIA_PREVIEW_STYLE_CONFIG";
       try{
          p0.i(str, uod);
          p0.h(PreviewMediaFragment$b.class, new e(this, p1));
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
