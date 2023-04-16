package com.google.common.collect.m;
import java.lang.Class;
import java.lang.String;
import com.google.common.collect.m$a;
import java.lang.reflect.Field;
import java.lang.AssertionError;
import java.lang.Object;
import qk.g0;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class m	// class@0018c1
{

    public static m$a a(Class p0,String p1){
       try{
          return new m$a(p0.getDeclaredField(p1));
       }catch(java.lang.NoSuchFieldException e0){
          throw new AssertionError(e0);
       }
    }
    public static void b(g0 p0,ObjectInputStream p1,int p2){
       int i = 0;
       while (i < p2) {
          Collection uCollection = p0.get(p1.readObject());
          int i1 = p1.readInt();
          for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
             uCollection.add(p1.readObject());
          }
          i = i + 1;
       }
       return;
    }
    public static int c(ObjectInputStream p0){
       return p0.readInt();
    }
    public static void d(g0 p0,ObjectOutputStream p1){
       p1.writeInt(p0.asMap().size());
       Iterator iterator = p0.asMap().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p1.writeObject(uEntry.getKey());
          p1.writeInt(uEntry.getValue().size());
          Iterator iterator1 = uEntry.getValue().iterator();
          while (iterator1.hasNext()) {
             p1.writeObject(iterator1.next());
          }
       }
       return;
    }
}
