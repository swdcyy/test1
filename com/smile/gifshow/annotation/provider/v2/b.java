package com.smile.gifshow.annotation.provider.v2.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors$c;
import java.util.Map;
import java.lang.String;
import java.lang.Object;

public class b extends Accessor	// class@000c4f
{
    public final Map c;
    public final String d;
    public final Accessors$c e;

    public void b(Accessors$c p0,Map p1,String p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object get(){
       return this.c.get(this.d);
    }
    public void set(Object p0){
       this.c.put(this.d, p0);
    }
}
