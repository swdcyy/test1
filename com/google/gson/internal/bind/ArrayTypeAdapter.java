package com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ArrayTypeAdapter$1;
import com.google.gson.Gson;
import java.lang.Class;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import java.lang.reflect.Type;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.util.ArrayList;
import java.lang.reflect.Array;
import com.google.gson.stream.b;

public final class ArrayTypeAdapter extends TypeAdapter	// class@000574
{
    public final Class a;
    public final TypeAdapter b;
    public static final j c;

    static {
       ArrayTypeAdapter.c = new ArrayTypeAdapter$1();
    }
    public void ArrayTypeAdapter(Gson p0,TypeAdapter p1,Class p2){
       super();
       this.b = new TypeAdapterRuntimeTypeWrapper(p0, p1, p2);
       this.a = p2;
    }
    public Object read(a p0){
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          return null;
       }else {
          ArrayList uArrayList = new ArrayList();
          p0.a();
          while (p0.l()) {
             uArrayList.add(this.b.read(p0));
          }
          p0.g();
          int i = uArrayList.size();
          Object obj = Array.newInstance(this.a, i);
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             Array.set(obj, i1, uArrayList.get(i1));
          }
          return obj;
       }
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.c();
          int length = Array.getLength(p1);
          for (int i = 0; i < length; i = i + 1) {
             this.b.write(p0, Array.get(p1, i));
          }
          p0.g();
          return;
       }
    }
}
