package com.vimeo.stag.KnownTypeAdapters$h;
import com.google.gson.stream.a;
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Object;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.lang.Double;
import com.google.gson.stream.b;

public final class KnownTypeAdapters$h	// class@00101f
{

    public static double[] a(a p0){
       double[] uodoubleArra;
       ArrayList uArrayList = KnownTypeAdapters.i.read(p0);
       if (uArrayList != null) {
          uodoubleArra = new double[uArrayList.size()];
          for (int i = 0; i < uArrayList.size(); i = i + 1) {
             uodoubleArra[i] = uArrayList.get(i).doubleValue();
          }
       }else {
          uodoubleArra = null;
       }
       return uodoubleArra;
    }
    public static void b(b p0,double[] p1){
       if (p1 == null) {
          p0.u();
       }else {
          p0.c();
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             p0.J(p1[i]);
          }
          p0.g();
       }
       return;
    }
}
