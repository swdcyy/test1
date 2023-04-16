package com.yxcorp.gifshow.channel.stagger.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.channel.stagger.c$a;
import com.yxcorp.gifshow.channel.stagger.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.channel.stagger.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@001068
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       d uod = new d(this, p1);
       String str = "PHOTO_DETAIL_PARAM_PROCESSOR";
       try{
          p0.i(str, uod);
          p0.h(c$a.class, new e(this, p1));
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
