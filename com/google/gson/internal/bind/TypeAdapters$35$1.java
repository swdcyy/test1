package com.google.gson.internal.bind.TypeAdapters$35$1;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters$35;
import java.lang.Class;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.JsonSyntaxException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.gson.stream.b;

public class TypeAdapters$35$1 extends TypeAdapter	// class@0005a6
{
    public final Class a;
    public final TypeAdapters$35 b;

    public void TypeAdapters$35$1(TypeAdapters$35 p0,Class p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object read(a p0){
       p0 = this.b.c.read(p0);
       if (p0 == null || this.a.isInstance(p0)) {
          return p0;
       }
       throw new JsonSyntaxException("Expected a "+this.a.getName()+" but was "+p0.getClass().getName());
    }
    public void write(b p0,Object p1){
       this.b.c.write(p0, p1);
    }
}
