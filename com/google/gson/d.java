package com.google.gson.d;
import java.util.Iterator;
import java.io.Reader;
import java.lang.Object;
import com.google.gson.stream.a;
import java.lang.String;
import java.io.StringReader;
import com.google.gson.JsonElement;
import com.google.gson.internal.b;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.io.EOFException;
import java.util.NoSuchElementException;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.lang.UnsupportedOperationException;

public final class d implements Iterator	// class@00194a
{
    public final a b;
    public final Object c;

    public void d(Reader p0){
       super();
       a uoa = new a(p0);
       this.b = uoa;
       uoa.M(true);
       this.c = new Object();
    }
    public void d(String p0){
       super(new StringReader(p0));
    }
    public JsonElement a(){
       NoSuchElementException noSuchElemen;
       if (this.hasNext()) {
          return b.a(this.b);
       }
       throw new NoSuchElementException();
    }
    public boolean hasNext(){
       d tc = this.c;
       _monitor_enter(tc);
       try{
          boolean b = (this.b.J() != JsonToken.END_DOCUMENT)? true: false;
          _monitor_exit(tc);
          return b;
       }catch(com.google.gson.stream.MalformedJsonException e1){
          throw new JsonSyntaxException(e1);
       }catch(java.io.IOException e1){
          throw new JsonIOException(e1);
       }
    }
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException();
    }
}
