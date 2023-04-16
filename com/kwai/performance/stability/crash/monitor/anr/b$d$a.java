package com.kwai.performance.stability.crash.monitor.anr.b$d$a;
import zk.a;
import java.lang.Object;
import java.lang.Class;
import zk.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import al.a;

public final class b$d$a implements a	// class@0011b4
{

    public void b$d$a(){
       super();
    }
    public boolean shouldSkipClass(Class p0){
       return false;
    }
    public boolean shouldSkipField(b p0){
       List list = Arrays.asList(p0.a.getAnnotations());
       if (!list.size()) {
          return false;
       }
       Iterator iterator = list.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          Annotation uAnnotation = iterator.next();
          if (uAnnotation instanceof a && (!uAnnotation.deserialize() || !uAnnotation.serialize())) {
             break ;
          }
       }
       return true;
    }
}
