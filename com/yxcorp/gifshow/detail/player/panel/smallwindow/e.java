package com.yxcorp.gifshow.detail.player.panel.smallwindow.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment$b;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.b;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.c;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@00163d
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("small_window_dismiss_listener", new a(this, p1));
       p0.i("play_controller", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "small_window_param";
       try{
          p0.i(str, uoc);
          p0.h(SmallWindowFragment$b.class, new d(this, p1));
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
