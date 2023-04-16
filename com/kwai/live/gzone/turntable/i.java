package com.kwai.live.gzone.turntable.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.live.gzone.turntable.m;
import com.kwai.live.gzone.turntable.b$a;
import java.lang.Object;
import y43.a;

public class i extends Accessor	// class@000e46
{
    public final b$a c;
    public final m d;

    public void i(m p0,b$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
