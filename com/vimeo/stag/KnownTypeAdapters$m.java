package com.vimeo.stag.KnownTypeAdapters$m;
import com.google.gson.stream.a;
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Object;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.lang.Long;
import com.google.gson.stream.b;

public final class KnownTypeAdapters$m	// class@001023
{

    public static long[] a(a p0){
       long[] olongArray;
       ArrayList uArrayList = KnownTypeAdapters.h.read(p0);
       if (uArrayList != null) {
          olongArray = new long[uArrayList.size()];
          for (int i = 0; i < uArrayList.size(); i = i + 1) {
             olongArray[i] = uArrayList.get(i).longValue();
          }
       }else {
          olongArray = null;
       }
       return olongArray;
    }
    public static void b(b p0,long[] p1){
       if (p1 == null) {
          p0.u();
       }else {
          p0.c();
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             p0.K(p1[i]);
          }
          p0.g();
       }
       return;
    }
}
