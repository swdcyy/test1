package com.kwai.framework.network.cronet.h;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import java.lang.String;

public final class h implements Comparator	// class@0017ae
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getName()).compareTo(p1.getName());
    }
}
