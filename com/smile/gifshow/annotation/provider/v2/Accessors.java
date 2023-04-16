package com.smile.gifshow.annotation.provider.v2.Accessors;
import com.smile.gifshow.annotation.provider.v2.Accessors$a;
import com.smile.gifshow.annotation.provider.v2.Accessors$b;
import com.smile.gifshow.annotation.provider.v2.Accessors$c;
import com.smile.gifshow.annotation.provider.v2.Accessors$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.smile.gifshow.annotation.provider.v2.Accessors$Holder;
import mm8.b;
import java.util.Map;
import im8.c;
import java.lang.ClassLoader;
import im8.g;
import java.util.Collection;
import java.util.Iterator;
import com.google.common.base.Optional;
import com.smile.gifshow.annotation.provider.v2.a;

public class Accessors	// class@000c4d
{
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static boolean e;

    static {
       Accessors.a = new Accessors$a();
       Accessors.b = new Accessors$b();
       Accessors.c = new Accessors$c();
       Accessors.d = new Accessors$d();
    }
    public void Accessors(){
       super();
    }
    public void Accessors(Accessors$a p0){
       super();
    }
    public static String c(Class p0){
       String name = p0.getName();
       if (name.contains("$")) {
          String str = ".";
          String[] stringArray = name.split("\\$");
          name = name.substring(0, name.lastIndexOf(str))+str+stringArray[(stringArray.length - 1)];
       }
       return name+"Accessor";
    }
    public static Accessors d(){
       return Accessors$Holder.INSTANCE.getInstance();
    }
    public b a(Object p0){
       Class class = p0.getClass();
       if (Map.class.isAssignableFrom(class)) {
          return Accessors.c;
       }
       if (c.class.isAssignableFrom(class)) {
          return Accessors.d;
       }
       if (Accessors.e) {
          while (true) {
             if (class != null) {
                try{
                   if (class.getClassLoader().loadClass(Accessors.c(class)) != null) {
                      p0 = 1;
                   label_0036 :
                      if (p0) {
                         return Accessors.b;
                      }
                   }else {
                      class = e0.getSuperclass();
                   }
                }catch(java.lang.ClassNotFoundException e0){
                }
             }else {
                p0 = null;
                goto label_0036 ;
             }
          }
       }else if(g.class.isAssignableFrom(class)){
          p0 = p0.getObjectsByTag("provider");
          if (p0 != null) {
             p0 = p0.values().iterator();
             while (p0.hasNext()) {
                if (p0.next() != null) {
                   return Accessors.b;
                }
             }
          }
       }
       return null;
    }
    public b b(Object p0){
       return Optional.fromNullable(this.a(p0)).or(Accessors.a).init();
    }
    public a e(Object p0){
       return this.b(p0).b(p0);
    }
}
