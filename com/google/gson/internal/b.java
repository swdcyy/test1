package com.google.gson.internal.b;
import com.google.gson.stream.a;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonToken;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.Object;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.JsonIOException;
import zk.f;
import com.google.gson.stream.b;
import java.lang.Appendable;
import java.io.Writer;
import com.google.gson.internal.b$a;

public final class b	// class@000572
{

    public static JsonElement a(a p0){
       JsonSyntaxException jsonSyntaxEx;
       try{
          p0.J();
          try{
             jsonSyntaxEx = 0;
             return TypeAdapters.X.read(p0);
          }catch(java.io.EOFException e2){
          }catch(java.io.IOException e2){
             throw new JsonIOException(e2);
          }catch(java.lang.NumberFormatException e2){
             throw new JsonSyntaxException(e2);
          }
          if (jsonSyntaxEx) {
             return f.a;
          }
          throw new JsonSyntaxException(e2);
       }catch(java.io.EOFException e2){
          jsonSyntaxEx = 1;
          goto label_0026 ;
       }catch(com.google.gson.stream.MalformedJsonException e2){
          throw new JsonSyntaxException(e2);
       }catch(java.io.IOException e2){
       }catch(java.lang.NumberFormatException e2){
       }
    }
    public static void b(JsonElement p0,b p1){
       TypeAdapters.X.write(p1, p0);
    }
    public static Writer c(Appendable p0){
       if (p0 instanceof Writer) {
       }else {
          b$a uoa = new b$a(p0);
       }
       return p0;
    }
}
