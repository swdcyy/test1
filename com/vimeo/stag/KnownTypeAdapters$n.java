package com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;

public final class KnownTypeAdapters$n	// class@001002
{

    public static long a(a p0,long p1){
       if (p0.J() != JsonToken.NULL) {
          return p0.x();
       }
       p0.A();
       return p1;
    }
}
