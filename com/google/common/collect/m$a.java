package com.google.common.collect.m$a;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.AssertionError;

public final class m$a	// class@0018c0
{
    public final Field a;

    public void m$a(Field p0){
       super();
       this.a = p0;
       p0.setAccessible(true);
    }
    public void a(Object p0,Object p1){
       try{
          this.a.set(p0, p1);
          return;
       }catch(java.lang.IllegalAccessException e2){
          throw new AssertionError(e2);
       }
    }
}
