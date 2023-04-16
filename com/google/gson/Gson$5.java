package com.google.gson.Gson$5;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Number;
import java.lang.Long;
import java.util.concurrent.atomic.AtomicLongArray;
import com.google.gson.stream.b;

public class Gson$5 extends TypeAdapter	// class@000551
{
    public final TypeAdapter a;

    public void Gson$5(TypeAdapter p0){
       this.a = p0;
       super();
    }
    public Object read(a p0){
       ArrayList uArrayList = new ArrayList();
       p0.a();
       while (p0.l()) {
          uArrayList.add(Long.valueOf(this.a.read(p0).longValue()));
       }
       p0.g();
       int i = uArrayList.size();
       AtomicLongArray uAtomicLongA = new AtomicLongArray(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uAtomicLongA.set(i1, uArrayList.get(i1).longValue());
       }
       return uAtomicLongA;
    }
    public void write(b p0,Object p1){
       p0.c();
       int i = p1.length();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.a.write(p0, Long.valueOf(p1.get(i1)));
       }
       p0.g();
       return;
    }
}
