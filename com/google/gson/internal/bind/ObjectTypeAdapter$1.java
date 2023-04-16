package com.google.gson.internal.bind.ObjectTypeAdapter$1;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import com.google.gson.internal.bind.ObjectTypeAdapter;

public class ObjectTypeAdapter$1 implements j	// class@00057c
{

    public void ObjectTypeAdapter$1(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       if (p1.getRawType() == Object.class) {
          return new ObjectTypeAdapter(p0);
       }
       return null;
    }
}
