package com.kuaishou.gifshow.kuaishan.model.a;
import java.util.Comparator;
import java.lang.Object;
import h90.e;
import java.lang.Long;

public final class a implements Comparator	// class@001a99
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p0.F, p1.F);
    }
}
