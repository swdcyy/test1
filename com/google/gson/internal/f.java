package com.google.gson.internal.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Modifier;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class f	// class@0005b9
{

    public void f(){
       super();
    }
    public static void a(Class p0){
       int modifiers = p0.getModifiers();
       if (Modifier.isInterface(modifiers)) {
          throw new UnsupportedOperationException("Interface can\'t be instantiated! Interface name: "+p0.getName());
       }
       if (!Modifier.isAbstract(modifiers)) {
          return;
       }
       throw new UnsupportedOperationException("Abstract class can\'t be instantiated! Class name: "+p0.getName());
    }
    public abstract Object b(Class p0);
}
