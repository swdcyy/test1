package com.yxcorp.gifshow.v3.previewer.ktv.t;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.previewer.ktv.u$a;
import com.yxcorp.gifshow.v3.previewer.ktv.q;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.previewer.ktv.r;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.yxcorp.gifshow.v3.previewer.ktv.s;
import java.lang.Class;
import mm8.a;

public final class t implements b	// class@0015d1
{

    public void t(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("KTV_INFO", new q(this, p1));
       p0.i("WORKSPACE", new r(this, p1));
       if (p1.b != null) {
          Accessors.d().b(p1.b).a(p0, p1.b);
       }
       try{
          p0.h(u$a.class, new s(this, p1));
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
