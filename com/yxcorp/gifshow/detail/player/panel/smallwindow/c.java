package com.yxcorp.gifshow.detail.player.panel.smallwindow.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.e;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment$b;
import java.lang.Object;
import m3a.s;

public class c extends Accessor	// class@00163b
{
    public final SmallWindowFragment$b c;
    public final e d;

    public void c(e p0,SmallWindowFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
