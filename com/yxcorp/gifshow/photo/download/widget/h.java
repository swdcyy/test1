package com.yxcorp.gifshow.photo.download.widget.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog$a;
import com.yxcorp.gifshow.photo.download.widget.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.photo.download.widget.b;
import com.yxcorp.gifshow.photo.download.widget.c;
import com.yxcorp.gifshow.photo.download.widget.d;
import com.yxcorp.gifshow.photo.download.widget.e;
import com.yxcorp.gifshow.photo.download.widget.f;
import com.yxcorp.gifshow.photo.download.widget.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@000f46
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("DOWNLOAD_DIALOG_FRAGMENT", new a(this, p1));
       p0.i("DOWNLOAD_PHOTO_INFO_RESPONSE", new b(this, p1));
       p0.i("DOWNLOAD_PIC_INDEX", new c(this, p1));
       p0.i("DOWNLOAD_PHOTO", new d(this, p1));
       p0.i("SELECTED_PIC_TARGETS", new e(this, p1));
       f uof = new f(this, p1);
       String str = "DOWNLOAD_SOURCE";
       try{
          p0.i(str, uof);
          p0.h(DownloadPicOptDialog$a.class, new g(this, p1));
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
