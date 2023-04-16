package com.yxcorp.gifshow.homepage.kcube.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.homepage.kcube.f$a;
import com.kwai.kcube.decorator.IContainerDecorator;
import com.yxcorp.gifshow.homepage.kcube.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import wq6.f;
import com.yxcorp.gifshow.homepage.kcube.b;
import com.yxcorp.gifshow.homepage.kcube.c;
import mm8.a;

public final class d implements b	// class@001725
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(IContainerDecorator.class, new a(this, p1));
       f uof = f.class;
       b uob = new b(this, p1);
       try{
          p0.h(uof, uob);
          p0.h(f$a.class, new c(this, p1));
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
