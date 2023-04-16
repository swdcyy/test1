package com.google.android.material.circularreveal.c$d;
import android.util.Property;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import com.google.android.material.circularreveal.c;
import java.lang.Object;

public class c$d extends Property	// class@001684
{
    public static final Property a;

    static {
       c$d.a = new c$d("circularRevealScrimColor");
    }
    public void c$d(String p0){
       super(Integer.class, p0);
    }
    public Integer a(c p0){
       return Integer.valueOf(p0.getCircularRevealScrimColor());
    }
    public void b(c p0,Integer p1){
       p0.setCircularRevealScrimColor(p1.intValue());
    }
    public Object get(Object p0){
       return this.a(p0);
    }
    public void set(Object p0,Object p1){
       this.b(p0, p1);
    }
}
