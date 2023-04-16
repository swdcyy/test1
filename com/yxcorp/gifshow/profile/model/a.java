package com.yxcorp.gifshow.profile.model.a;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority;
import java.lang.Enum;

public final class a implements Comparator	// class@0013d7
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return p1.compareTo(p0);
    }
}
