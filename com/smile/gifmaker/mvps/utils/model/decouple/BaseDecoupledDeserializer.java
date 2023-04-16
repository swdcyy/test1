package com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer;
import com.google.gson.b;
import ok.h;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.model.decouple.a;
import java.lang.Iterable;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.google.gson.JsonObject;
import java.lang.Exception;
import com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer$a;
import java.util.Iterator;
import wl8.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import ekd.k0;
import java.lang.reflect.Field;
import java.lang.IllegalAccessException;
import mkd.a;

public abstract class BaseDecoupledDeserializer implements b	// class@000fc7
{
    public final h a;
    public final h b;
    public BaseDecoupledDeserializer$a c;

    public void BaseDecoupledDeserializer(h p0,h p1){
       super();
       this.c = a.a;
       this.a = p0;
       this.b = p1;
    }
    public abstract Iterable a(Object p0);
    public final Object b(JsonElement p0,Type p1,a p2){
       Object obj1;
       Object obj2;
       Object obj = null;
       try{
          obj1 = p0;
       }catch(java.lang.Exception e1){
          this.c.a(e1, p0, p1);
          obj1 = obj;
       }
       if (!obj1) {
          return this.b.apply(obj);
       }
       p1 = this.a.apply(obj1);
       if (p1 == null) {
          return this.b.apply(obj);
       }
       Iterator iterator = this.a(p1).iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          try{
             a c = uoa.c;
             if (TextUtils.x(c)) {
                obj2 = p2.c(p0, uoa.b);
             }else if(k0.a(obj1, c)){
                obj2 = p2.c(k0.e(obj1, c), uoa.b);
             }else if(uoa.d != null){
                obj2 = p2.c(p0, uoa.b);
             }else {
                obj2 = obj;
             }
             if (obj2 != null) {
                a e = uoa.e;
                try{
                   e.setAccessible(true);
                   uoa.e.set(p1, obj2);
                }catch(java.lang.IllegalAccessException e4){
                   e4.printStackTrace();
                   goto label_002c ;
                }
             }
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
             this.c.a(e4, p0, uoa.b);
             goto label_002c ;
          }
       }
       if (p1 instanceof a) {
          p1.afterDeserialize();
       }
       return p1;
    }
}
