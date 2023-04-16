package com.kwai.nearby.local.pendant.c;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import cd7.g;
import java.lang.String;

public final class c implements Comparator	// class@000fa2
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getName()).compareTo(p1.getName());
    }
}
