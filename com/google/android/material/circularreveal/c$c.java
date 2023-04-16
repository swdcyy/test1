package com.google.android.material.circularreveal.c$c;
import android.util.Property;
import java.lang.String;
import com.google.android.material.circularreveal.c$e;
import java.lang.Class;
import com.google.android.material.circularreveal.c;
import java.lang.Object;

public class c$c extends Property	// class@001683
{
    public static final Property a;

    static {
       c$c.a = new c$c("circularReveal");
    }
    public void c$c(String p0){
       super(c$e.class, p0);
    }
    public c$e a(c p0){
       return p0.getRevealInfo();
    }
    public void b(c p0,c$e p1){
       p0.setRevealInfo(p1);
    }
    public Object get(Object p0){
       return this.a(p0);
    }
    public void set(Object p0,Object p1){
       this.b(p0, p1);
    }
}
