package com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a;
import java.lang.String;
import java.lang.Object;
import com.google.gson.stream.a;
import com.google.gson.stream.b;

public abstract class ReflectiveTypeAdapterFactory$a	// class@000580
{
    public final String a;
    public final boolean b;
    public final boolean c;

    public void ReflectiveTypeAdapterFactory$a(String p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public abstract void a(a p0,Object p1);
    public abstract void b(b p0,Object p1);
    public abstract boolean c(Object p0);
}
