package com.yxcorp.gifshow.record.album.utils.a;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.util.Iterator;
import java.lang.Double;
import tkd.b;
import tkd.d;
import om6.r;
import java.lang.Integer;

public final class a implements o	// class@00175d
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       p0 = p0.iterator();
       double d = 0;
       while (p0.hasNext()) {
          d = d + p0.next().doubleValue();
       }
       d = d * 0x408f400000000000;
       int i = -831446984;
       int i1 = 2;
       if (d - (double)d.a(i).uK(i1) > 0) {
          i1 = 4;
       }else if(d - (double)d.a(i).uK(0) > 0){
          i1 = 0;
       }
       return Integer.valueOf(i1);
    }
}
