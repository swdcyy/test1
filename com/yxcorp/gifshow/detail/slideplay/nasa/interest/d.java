package com.yxcorp.gifshow.detail.slideplay.nasa.interest.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestManagementFragment$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.c;
import java.lang.Class;
import mm8.a;

public final class d implements b	// class@001748
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("INTERESTS_CHANGE_EVENT_OBSERVABLE", new a(this, p1));
       b uob = new b(this, p1);
       String str = "INTERESTS_CHANGE_EVENT_OBSERVER";
       try{
          p0.i(str, uob);
          p0.h(InterestManagementFragment$a.class, new c(this, p1));
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
