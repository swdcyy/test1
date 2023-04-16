package com.kwai.component.photo.reduce.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.component.photo.reduce.i;
import yf5.d0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import yf5.e0;
import com.kwai.component.photo.reduce.i$b;
import com.kwai.component.photo.reduce.j;
import java.lang.Class;
import yf5.f0;
import yf5.g0;
import android.view.View$OnClickListener;
import yf5.h0;
import com.yxcorp.gifshow.entity.QPhoto;
import yf5.i0;
import yf5.j0;
import yf5.k0;
import yf5.x;
import yf5.y;
import yf5.z;
import yf5.a0;
import yf5.b0;
import yf5.c0;
import mm8.a;

public final class k implements b	// class@000aef
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PHOTO_REDUCE_ACTIVITY", new d0(this, p1));
       p0.i("PHOTO_REDUCE_ANCHOR_RECT", new e0(this, p1));
       p0.h(i$b.class, new j(this, p1));
       p0.i("PHOTO_REDUCE_FRAGMENT", new f0(this, p1));
       p0.i("PHOTO_REDUCE_LONG_CLICK", new g0(this, p1));
       p0.h(View$OnClickListener.class, new h0(this, p1));
       p0.h(QPhoto.class, new i0(this, p1));
       p0.i("PHOTO_REDUCE_POPUP_WIDTH", new j0(this, p1));
       p0.i("PHOTO_REDUCE_REASONS", new k0(this, p1));
       p0.i("PHOTO_REDUCE_MODE", new x(this, p1));
       p0.i("PHOTO_REDUCE_REFERER", new y(this, p1));
       p0.i("PHOTO_REDUCE_POPUP_WRAP_CONTENT_HORIZONTALLY", new z(this, p1));
       p0.i("SOURCE", new a0(this, p1));
       b0 uob0 = new b0(this, p1);
       String str = "PHOTO_REDUCE_SOURCE_VIEW_RECT";
       try{
          p0.i(str, uob0);
          p0.h(i.class, new c0(this, p1));
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
