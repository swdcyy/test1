package com.yxcorp.gifshow.childlock.fragment.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.childlock.fragment.ChildLockGuideFragment$a;
import com.yxcorp.gifshow.childlock.fragment.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.childlock.fragment.c;
import java.lang.Class;
import mm8.a;

public final class d implements b	// class@001086
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       b uob = new b(this, p1);
       String str = "GUIDE_FRAGMENT_FREEWINDOW_SWITCH_SUBJECT";
       try{
          p0.i(str, uob);
          p0.h(ChildLockGuideFragment$a.class, new c(this, p1));
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
