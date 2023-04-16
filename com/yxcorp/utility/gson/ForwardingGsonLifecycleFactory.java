package com.yxcorp.utility.gson.ForwardingGsonLifecycleFactory;
import zk.j;
import java.lang.Object;
import com.yxcorp.utility.gson.ForwardingGsonLifecycleFactory$1;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import mkd.a;
import com.yxcorp.utility.gson.ForwardingGsonLifecycleFactory$TypeAdapterWrapper;

public class ForwardingGsonLifecycleFactory implements j	// class@0009c3
{
    public j b;

    public void ForwardingGsonLifecycleFactory(j p0){
       super();
       this.b = new ForwardingGsonLifecycleFactory$1(this);
       if (p0 != null) {
          this.b = p0;
       }
       return;
    }
    public TypeAdapter a(Gson p0,a p1){
       if (!a.class.isAssignableFrom(p1.getRawType())) {
          return this.b.a(p0, p1);
       }
       TypeAdapter typeAdapter = this.b.a(p0, p1);
       if (typeAdapter == null) {
          typeAdapter = p0.l(this, p1);
       }
       return new ForwardingGsonLifecycleFactory$TypeAdapterWrapper(typeAdapter);
    }
}
