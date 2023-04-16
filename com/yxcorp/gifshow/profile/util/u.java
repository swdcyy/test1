package com.yxcorp.gifshow.profile.util.u;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.profile.common.model.TagLabel;

public final class u implements Comparator	// class@0015e6
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.mPriority - p1.mPriority);
    }
}
