package com.kwai.roampanel.utils.a;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import com.kwai.roampanel.model.RoamCityResponse;
import nm7.a;
import brd.g;

public final class a implements g	// class@0013e2
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void subscribe(v p0){
       RoamCityResponse roamCityResp = a.c();
       if (roamCityResp != null) {
          p0.onNext(roamCityResp);
       }
       p0.onComplete();
       return;
    }
}
