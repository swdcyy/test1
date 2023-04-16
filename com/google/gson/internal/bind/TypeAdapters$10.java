package com.google.gson.internal.bind.TypeAdapters$10;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicIntegerArray;
import com.google.gson.stream.b;

public class TypeAdapters$10 extends TypeAdapter	// class@00058a
{

    public void TypeAdapters$10(){
       super();
    }
    public Object read(a p0){
       ArrayList uArrayList = new ArrayList();
       p0.a();
       while (p0.l()) {
          try{
             uArrayList.add(Integer.valueOf(p0.v()));
          }catch(java.lang.NumberFormatException e5){
             throw new JsonSyntaxException(e5);
          }
       }
       p0.g();
       int i = uArrayList.size();
       AtomicIntegerArray uAtomicInteg = new AtomicIntegerArray(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uAtomicInteg.set(i1, uArrayList.get(i1).intValue());
       }
       return uAtomicInteg;
    }
    public void write(b p0,Object p1){
       p0.c();
       int i = p1.length();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p0.K((long)p1.get(i1));
       }
       p0.g();
       return;
    }
}
