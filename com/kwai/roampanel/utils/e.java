package com.kwai.roampanel.utils.e;
import erd.r;
import java.lang.Object;
import com.kwai.roampanel.model.RoamCityResponse;
import nm7.a;
import java.util.Collection;
import ekd.q;

public final class e implements r	// class@0013e6
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 != null && (!q.f(p0.mAllCitiesInfo) || !q.f(p0.mHotCitiesInfo)))? true: false;
       return b;
    }
}
