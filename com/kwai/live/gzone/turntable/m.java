package com.kwai.live.gzone.turntable.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.live.gzone.turntable.b$a;
import y43.a;
import com.kwai.live.gzone.turntable.i;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.live.gzone.turntable.j;
import java.lang.String;
import com.kwai.live.gzone.turntable.k;
import com.kwai.live.gzone.turntable.l;
import mm8.a;

public final class m implements b	// class@000e4a
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new i(this, p1));
       p0.i("LIVE_TURNTABLE_SCROLL_SUBJECT", new j(this, p1));
       k ok = new k(this, p1);
       String str = "LIVE_GZONE_TURNTABLE_TASK_ITEM_CALLBACK";
       try{
          p0.i(str, ok);
          p0.h(b$a.class, new l(this, p1));
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
