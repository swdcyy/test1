package com.kuaishou.live.core.show.quiz.notice.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.quiz.notice.b;
import com.kuaishou.live.core.show.quiz.notice.b$a;
import com.kuaishou.live.core.show.quiz.notice.c;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import fg2.g;
import mm8.a;

public final class d implements b	// class@000e31
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       b$a uoa = b$a.class;
       c uoc = new c(this, p1);
       try{
          p0.h(uoa, uoc);
          p0.h(b.class, new g(this, p1));
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
