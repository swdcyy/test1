package com.yxcorp.gifshow.channel.stagger.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.channel.stagger.f;
import com.yxcorp.gifshow.channel.stagger.c$a;
import java.lang.Object;
import vm5.o;

public class d extends Accessor	// class@001066
{
    public final c$a c;
    public final f d;

    public void d(f p0,c$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.p;
    }
    public void set(Object p0){
       this.c.p = p0;
    }
}
