package com.google.gson.internal.bind.TypeAdapters$26;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.sql.Timestamp;
import java.util.Date;
import com.google.gson.internal.bind.TypeAdapters$26$1;

public class TypeAdapters$26 implements j	// class@00059c
{

    public void TypeAdapters$26(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       if (p1.getRawType() != Timestamp.class) {
          return null;
       }
       return new TypeAdapters$26$1(this, p0.k(Date.class));
    }
}
