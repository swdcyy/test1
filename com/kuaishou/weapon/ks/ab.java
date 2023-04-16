package com.kuaishou.weapon.ks.ab;
import dalvik.system.DexClassLoader;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Method;

public class ab extends DexClassLoader	// class@0011bd
{

    public void ab(String p0,String p1,String p2,ClassLoader p3){
       super(p0, p1, p2, p3);
    }
    public Class a(String p0){
       Class uClass = this.findLoadedClass(p0);
       if (uClass == null) {
          uClass = this.findClass(p0);
       }
       return uClass;
    }
    public Class loadClass(String p0,boolean p1){
       Class uClass = this.findLoadedClass(p0);
       if (uClass == null) {
          uClass = this.findClass(p0);
       }
       if (uClass == null) {
          if (this.getParent() != null) {
             uClass = this.getParent().loadClass(p0);
          }else {
             Class[] uClassArray = new Class[]{String.class};
             Object[] objArray = new Object[]{p0};
             uClass = this.getClass().getDeclaredMethod("findBootstrapClassOrNull", uClassArray).invoke(this, objArray);
          }
       }
       if (p1) {
          this.resolveClass(uClass);
       }
       if (uClass == null) {
          return super.loadClass(p0, p1);
       }else {
          return uClass;
       }
    }
}
