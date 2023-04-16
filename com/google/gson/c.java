package com.google.gson.c;
import java.lang.Object;
import com.google.gson.stream.a;
import com.google.gson.JsonElement;
import com.google.gson.internal.b;
import com.google.gson.JsonParseException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import java.io.Reader;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonIOException;
import java.io.StringReader;

public final class c	// class@000561
{

    public void c(){
       super();
    }
    public static JsonElement b(a p0){
       boolean b = p0.o();
       try{
          p0.M(true);
          p0.M(b);
          return b.a(p0);
       }catch(java.lang.StackOverflowError e3){
          throw new JsonParseException(v1+p0+v0, e3);
       }catch(java.lang.OutOfMemoryError e3){
          throw new JsonParseException(v1+p0+v0, e3);
       }
    }
    public static JsonElement c(Reader p0){
       try{
          a uoa = new a(p0);
          JsonElement jsonElement = c.b(uoa);
          if (jsonElement.D() || uoa.J() == JsonToken.END_DOCUMENT) {
             return jsonElement;
          }
          throw new JsonSyntaxException("Did not consume the entire document.");
       }catch(com.google.gson.stream.MalformedJsonException e2){
          throw new JsonSyntaxException(e2);
       }catch(java.io.IOException e2){
          throw new JsonIOException(e2);
       }catch(java.lang.NumberFormatException e2){
          throw new JsonSyntaxException(e2);
       }
    }
    public static JsonElement d(String p0){
       return c.c(new StringReader(p0));
    }
    public JsonElement a(String p0){
       return c.d(p0);
    }
}
