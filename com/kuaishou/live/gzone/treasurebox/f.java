package com.kuaishou.live.gzone.treasurebox.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.gzone.treasurebox.a$b;
import com.kuaishou.live.gzone.treasurebox.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.gzone.treasurebox.d;
import com.kuaishou.live.gzone.treasurebox.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@001c68
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("listener", new c(this, p1));
       d uod = new d(this, p1);
       String str = "treasureBoxServiceManager";
       try{
          p0.i(str, uod);
          p0.h(a$b.class, new e(this, p1));
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
