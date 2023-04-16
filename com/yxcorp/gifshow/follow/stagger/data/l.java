package com.yxcorp.gifshow.follow.stagger.data.l;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.stagger.data.m;
import java.lang.Long;

public final class l implements Comparator	// class@00117b
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (- Long.compare(p0.created(), p1.created()));
    }
}
