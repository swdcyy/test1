package com.kuaishou.commercial.photoreduce.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.commercial.photoreduce.g$e;
import com.kuaishou.commercial.photoreduce.h;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.commercial.photoreduce.i;
import java.lang.Class;
import mm8.a;

public final class j implements b	// class@001531
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       h oh = new h(this, p1);
       String str = "PHOTO_REDUCE_FIRST_REASON";
       try{
          p0.i(str, oh);
          p0.h(g$e.class, new i(this, p1));
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
