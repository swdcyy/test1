package com.smile.gifshow.annotation.provider.v2.Accessors$c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import mm8.a;

public final class Accessors$c implements b	// class@000c4a
{

    public void Accessors$c(){
       super();
    }
    public void a(a p0,Object p1){
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          String key = iterator.next().getKey();
          p0.i(key, new b(this, p1, key));
       }
       return;
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
