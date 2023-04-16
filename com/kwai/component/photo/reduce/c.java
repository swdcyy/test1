package com.kwai.component.photo.reduce.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.component.photo.reduce.o$a;
import com.kwai.component.photo.reduce.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.component.photo.reduce.b;
import java.lang.Class;
import mm8.a;

public final class c implements b	// class@000adc
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       a uoa = new a(this, p1);
       String str = "PHOTO_REDUCE_FIRST_REASON";
       try{
          p0.i(str, uoa);
          p0.h(o$a.class, new b(this, p1));
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
