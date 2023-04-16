package com.google.gson.internal.bind.TypeAdapters$26$1;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters$26;
import com.google.gson.stream.a;
import java.lang.Object;
import java.util.Date;
import java.sql.Timestamp;
import com.google.gson.stream.b;

public class TypeAdapters$26$1 extends TypeAdapter	// class@001955
{
    public final TypeAdapter a;
    public final TypeAdapters$26 b;

    public void TypeAdapters$26$1(TypeAdapters$26 p0,TypeAdapter p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object read(a p0){
       Date uDate = this.a.read(p0);
       Timestamp timestamp = (uDate != null)? new Timestamp(uDate.getTime()): null;
       return timestamp;
    }
    public void write(b p0,Object p1){
       this.a.write(p0, p1);
    }
}
