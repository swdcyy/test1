package com.google.gson.internal.bind.TypeAdapters$1;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import com.google.gson.stream.b;
import java.lang.Class;
import java.lang.StringBuilder;

public class TypeAdapters$1 extends TypeAdapter	// class@000594
{

    public void TypeAdapters$1(){
       super();
    }
    public Object read(a p0){
       throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }
    public void write(b p0,Object p1){
       throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: "+p1.getName()+". Forgot to register a type adapter?");
    }
}
