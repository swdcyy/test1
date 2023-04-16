package com.yxcorp.gifshow.v3.mixed.timeline.a;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups$b;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups;

public final class a implements Comparator	// class@001563
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (int)(p0.c - p1.c);
    }
}
