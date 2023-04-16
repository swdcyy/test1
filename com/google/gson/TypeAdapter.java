package com.google.gson.TypeAdapter;
import java.lang.Object;
import java.io.Reader;
import com.google.gson.stream.a;
import java.lang.String;
import java.io.StringReader;
import com.google.gson.JsonElement;
import com.google.gson.internal.bind.a;
import com.google.gson.JsonIOException;
import java.lang.Throwable;
import com.google.gson.TypeAdapter$1;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.AssertionError;
import com.google.gson.stream.b;
import com.google.gson.internal.bind.b;

public abstract class TypeAdapter	// class@00055e
{

    public void TypeAdapter(){
       super();
    }
    public final Object fromJson(Reader p0){
       return this.read(new a(p0));
    }
    public final Object fromJson(String p0){
       return this.fromJson(new StringReader(p0));
    }
    public final Object fromJsonTree(JsonElement p0){
       try{
          return this.read(new a(p0));
       }catch(java.io.IOException e2){
          throw new JsonIOException(e2);
       }
    }
    public final TypeAdapter nullSafe(){
       return new TypeAdapter$1(this);
    }
    public abstract Object read(a p0);
    public final String toJson(Object p0){
       try{
          StringWriter stringWriter = new StringWriter();
          this.toJson(stringWriter, p0);
          return stringWriter.toString();
       }catch(java.io.IOException e2){
          throw new AssertionError(e2);
       }
    }
    public final void toJson(Writer p0,Object p1){
       this.write(new b(p0), p1);
    }
    public final JsonElement toJsonTree(Object p0){
       try{
          b uob = new b();
          this.write(uob, p0);
          return uob.R();
       }catch(java.io.IOException e2){
          throw new JsonIOException(e2);
       }
    }
    public abstract void write(b p0,Object p1);
}
