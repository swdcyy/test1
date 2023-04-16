package com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter$1;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import com.google.gson.internal.bind.ObjectTypeAdapter$a;
import java.lang.Enum;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.ArrayList;
import com.google.gson.stream.b;
import java.lang.Class;

public final class ObjectTypeAdapter extends TypeAdapter	// class@00057e
{
    public final Gson a;
    public static final j b;

    static {
       ObjectTypeAdapter.b = new ObjectTypeAdapter$1();
    }
    public void ObjectTypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       switch (ObjectTypeAdapter$a.a[p0.J().ordinal()]){
           case 1:
             ArrayList uArrayList = new ArrayList();
             p0.a();
             while (p0.l()) {
                uArrayList.add(this.read(p0));
             }
             p0.g();
             return uArrayList;
             break;
           case 2:
             LinkedTreeMap linkedTreeMa = new LinkedTreeMap();
             p0.c();
             while (p0.l()) {
                linkedTreeMa.put(p0.y(), this.read(p0));
             }
             p0.j();
             return linkedTreeMa;
             break;
           case 3:
             return p0.E();
           case 4:
             return Double.valueOf(p0.u());
           case 5:
             return Boolean.valueOf(p0.s());
           case 6:
             p0.A();
             return null;
           default:
             throw new IllegalStateException();
       }
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
          return;
       }else {
          TypeAdapter typeAdapter = this.a.k(p1.getClass());
          if (typeAdapter instanceof ObjectTypeAdapter) {
             p0.e();
             p0.j();
             return;
          }else {
             typeAdapter.write(p0, p1);
             return;
          }
       }
    }
}
