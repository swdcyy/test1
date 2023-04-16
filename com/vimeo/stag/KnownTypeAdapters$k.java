package com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;

public final class KnownTypeAdapters$k	// class@000fff
{

    public static int a(a p0,int p1){
       if (p0.J() != JsonToken.NULL) {
          return p0.v();
       }
       p0.A();
       return p1;
    }
}
