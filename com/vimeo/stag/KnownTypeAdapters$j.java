package com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;

public final class KnownTypeAdapters$j	// class@001021
{

    public static float a(a p0,float p1){
       if (p0.J() != JsonToken.NULL) {
          return (float)p0.u();
       }
       p0.A();
       return p1;
    }
}
