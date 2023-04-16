package com.yxcorp.gifshow.share.widget.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.share.widget.d$b;
import com.yxcorp.gifshow.share.widget.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.share.widget.f;
import java.lang.Class;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.share.widget.g;
import com.yxcorp.gifshow.share.widget.h;
import com.yxcorp.gifshow.share.widget.i;
import com.yxcorp.gifshow.share.widget.j;
import mm8.a;

public final class k implements b	// class@001d2a
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("DOWNLOAD_DIALOG_IM_LIST", new e(this, p1));
       p0.h(PublishSubject.class, new f(this, p1));
       p0.h(QPhoto.class, new g(this, p1));
       p0.i("DOWNLOAD_DIALOG_SOURCE", new h(this, p1));
       i oi = new i(this, p1);
       String str = "DOWNLOAD_DIALOG_SUBBIZ";
       try{
          p0.i(str, oi);
          p0.h(d$b.class, new j(this, p1));
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
