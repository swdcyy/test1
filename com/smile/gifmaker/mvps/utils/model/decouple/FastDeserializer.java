package com.smile.gifmaker.mvps.utils.model.decouple.FastDeserializer;
import com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer;
import ok.h;
import java.lang.Object;
import java.lang.Iterable;
import java.lang.Class;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
import java.lang.String;
import wl8.a;

public abstract class FastDeserializer extends BaseDecoupledDeserializer	// class@000fc8
{

    public void FastDeserializer(h p0,h p1){
       super(p0, p1);
    }
    public Iterable a(Object p0){
       p0 = p0.getClass().getDeclaredFields();
       ArrayList uArrayList = new ArrayList(p0.length);
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          int modifiers = oobject.getModifiers();
          if (Modifier.isStatic(modifiers) || (Modifier.isTransient(modifiers) || (!oobject.getType().isPrimitive() && !oobject.getType().isAssignableFrom(String.class)))) {
             uArrayList.add(a.a(oobject));
          }
       label_0042 :
          i = i + 1;
       }
       return uArrayList;
    }
}
