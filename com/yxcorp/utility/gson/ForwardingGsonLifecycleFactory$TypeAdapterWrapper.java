package com.yxcorp.utility.gson.ForwardingGsonLifecycleFactory$TypeAdapterWrapper;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import mkd.a;
import com.google.gson.stream.b;

public class ForwardingGsonLifecycleFactory$TypeAdapterWrapper extends TypeAdapter	// class@0009c2
{
    public TypeAdapter a;

    public void ForwardingGsonLifecycleFactory$TypeAdapterWrapper(TypeAdapter p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       p0 = this.a.read(p0);
       if (p0 != null) {
          p0.afterDeserialize();
       }
       return p0;
    }
    public void write(b p0,Object p1){
       this.a.write(p0, p1);
    }
}
