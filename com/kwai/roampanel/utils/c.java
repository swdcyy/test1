package com.kwai.roampanel.utils.c;
import erd.g;
import java.lang.Object;
import com.kwai.roampanel.model.RoamCityResponse;
import nm7.a;
import java.util.Collection;
import ekd.q;

public final class c implements g	// class@0013e4
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       if (!q.f(p0.mAllCitiesInfo) && !q.f(p0.mHotCitiesInfo)) {
          a.a(p0);
       }
       return;
    }
}
