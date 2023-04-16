package com.yxcorp.gifshow.action.h;
import erd.r;
import java.lang.Object;
import android.util.Pair;
import com.yxcorp.gifshow.action.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class h implements r	// class@001321
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (!TextUtils.x(p0.first) && !TextUtils.x(p0.second))? true: false;
       return b;
    }
}
