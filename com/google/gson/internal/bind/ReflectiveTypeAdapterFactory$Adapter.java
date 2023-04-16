package com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter;
import com.google.gson.TypeAdapter;
import bl.p;
import java.util.Map;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a;
import java.lang.AssertionError;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.util.Collection;
import java.util.Iterator;

public final class ReflectiveTypeAdapterFactory$Adapter extends TypeAdapter	// class@00057f
{
    public final p a;
    public final Map b;

    public void ReflectiveTypeAdapterFactory$Adapter(p p0,Map p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object read(a p0){
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          return null;
       }else {
          Object obj = this.a.a();
          try{
             p0.c();
             while (p0.l()) {
                ReflectiveTypeAdapterFactory$a uoa = this.b.get(p0.y());
                if (uoa == null || uoa.c == null) {
                   p0.Q();
                }else {
                   uoa.a(p0, obj);
                }
             }
             p0.j();
             return obj;
          }catch(java.lang.IllegalStateException e4){
             throw new JsonSyntaxException(e4);
          }catch(java.lang.IllegalAccessException e4){
             throw new AssertionError(e4);
          }
       }
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
          return;
       }else {
          try{
             p0.e();
             Iterator iterator = this.b.values().iterator();
             while (iterator.hasNext()) {
                ReflectiveTypeAdapterFactory$a uoa = iterator.next();
                if (uoa.c(p1)) {
                   p0.r(uoa.a);
                   uoa.b(p0, p1);
                }
             }
             p0.j();
             return;
          }catch(java.lang.IllegalAccessException e4){
             throw new AssertionError(e4);
          }
       }
    }
}
