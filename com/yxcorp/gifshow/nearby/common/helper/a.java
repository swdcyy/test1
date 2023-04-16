package com.yxcorp.gifshow.nearby.common.helper.a;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public final class a implements Comparator	// class@00210b
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i;
       if (p0 == null && p1 == null) {
          i = 0;
       }else if(p0 == null){
          i = 1;
       }else if(p1 == null){
          i = -1;
       }else {
          i = p1.numberOfLike() - p0.numberOfLike();
       }
       return i;
    }
}
