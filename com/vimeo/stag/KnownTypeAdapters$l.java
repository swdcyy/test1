package com.vimeo.stag.KnownTypeAdapters$l;
import com.google.gson.stream.a;
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Object;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.lang.Integer;
import com.google.gson.stream.b;

public final class KnownTypeAdapters$l	// class@001022
{

    public static int[] a(a p0){
       int[] ointArray;
       ArrayList uArrayList = KnownTypeAdapters.g.read(p0);
       if (uArrayList != null) {
          ointArray = new int[uArrayList.size()];
          for (int i = 0; i < uArrayList.size(); i = i + 1) {
             ointArray[i] = uArrayList.get(i).intValue();
          }
       }else {
          ointArray = null;
       }
       return ointArray;
    }
    public static void b(b p0,int[] p1){
       if (p1 == null) {
          p0.u();
       }else {
          p0.c();
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             p0.K((long)p1[i]);
          }
          p0.g();
       }
       return;
    }
}
