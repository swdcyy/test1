package com.smile.gifshow.annotation.provider.v2.Accessors$b;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.InstantiationException;
import java.lang.IllegalAccessException;
import im8.g;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import mm8.a;

public final class Accessors$b implements b	// class@000c49
{

    public void Accessors$b(){
       super();
    }
    public void a(a p0,Object p1){
       if (Accessors.e) {
          for (Class class = p1.getClass(); class != null; class = e0.getSuperclass()) {
             try{
                class.getClassLoader().loadClass(Accessors.c(class)).newInstance().a(p0, p1);
             }catch(java.lang.ClassNotFoundException e0){
             }catch(java.lang.IllegalAccessException e1){
                e1.printStackTrace();
             }catch(java.lang.InstantiationException e1){
                e1.printStackTrace();
             }
          }
       }else if(!g.class.isAssignableFrom(p1.getClass())){
          return;
       }else {
          Iterator iterator = p1.getObjectsByTag("provider").entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue() instanceof b) {
                uEntry.getValue().a(p0, p1);
             }
          }
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
