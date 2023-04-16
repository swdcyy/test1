package com.google.gson.Gson$4;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Number;
import java.util.concurrent.atomic.AtomicLong;
import com.google.gson.stream.b;
import java.lang.Long;

public class Gson$4 extends TypeAdapter	// class@000550
{
    public final TypeAdapter a;

    public void Gson$4(TypeAdapter p0){
       this.a = p0;
       super();
    }
    public Object read(a p0){
       return new AtomicLong(this.a.read(p0).longValue());
    }
    public void write(b p0,Object p1){
       this.a.write(p0, Long.valueOf(p1.get()));
    }
}
