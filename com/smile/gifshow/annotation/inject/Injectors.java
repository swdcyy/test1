package com.smile.gifshow.annotation.inject.Injectors;
import com.smile.gifshow.annotation.inject.Injectors$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.smile.gifshow.annotation.inject.Injectors$Holder;

public class Injectors	// class@000c41
{
    public static final b a;
    public static boolean b;

    static {
       Injectors.a = new Injectors$a();
    }
    public void Injectors(){
       super();
    }
    public void Injectors(Injectors$a p0){
       super();
    }
    public static String a(Class p0){
       String name = p0.getName();
       if (name.contains("$")) {
          String str = ".";
          String[] stringArray = name.split("\\$");
          name = name.substring(0, name.lastIndexOf(str))+str+stringArray[(stringArray.length - 1)];
       }
       return name+"Injector";
    }
    public static Injectors b(){
       return Injectors$Holder.INSTANCE.getInstance();
    }
}
