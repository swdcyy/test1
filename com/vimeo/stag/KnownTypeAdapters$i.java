package com.vimeo.stag.KnownTypeAdapters$i;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;

public final class KnownTypeAdapters$i	// class@001020
{

    public static double a(a p0,double p1){
       if (p0.J() != JsonToken.NULL) {
          return p0.u();
       }
       p0.A();
       return p1;
    }
}
