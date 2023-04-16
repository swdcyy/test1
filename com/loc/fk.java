package com.loc.fk;
import java.lang.Math;
import java.util.Calendar;
import java.util.Date;

public final class fk	// class@001430
{

    public static long a(long p0){
       return (p0 - fk.b(p0));
    }
    public static long a(long p0,long p1){
       long l = fk.b(p1) + fk.a(p0);
       p0 = Math.abs((l - p1));
       Calendar instance = Calendar.getInstance();
       instance.setTime(new Date(l));
       int i = instance.get(11);
       if (i == 23 && p0 - 0x4ef6d80 >= 0) {
          l = l - 0x5265c00;
       }
       if (!i && p0 - 0x4ef6d80 >= 0) {
          l = l + 0x5265c00;
       }
       return l;
    }
    public static long a(long p0,long p1,int p2){
       if (p2 > 0 && Math.abs((p0 - p1)) - ((long)p2 * 0x757b12c00) > 0) {
          p0 = fk.a(p0, p1);
       }
       return p0;
    }
    public static long b(long p0){
       Calendar instance = Calendar.getInstance();
       instance.setTime(new Date(p0));
       instance.set(11, 0);
       instance.set(12, 0);
       instance.set(13, 0);
       instance.set(14, 0);
       return instance.getTimeInMillis();
    }
}
