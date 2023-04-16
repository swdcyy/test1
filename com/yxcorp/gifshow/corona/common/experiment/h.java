package com.yxcorp.gifshow.corona.common.experiment.h;
import ok.x;
import java.lang.Object;
import gq9.a;
import java.lang.String;
import xf6.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class h implements x	// class@0011f1
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object get(){
       Integer integer;
       String str = "coronaShowSharedAnimationMaxCountPerDayInterval";
       int i = b.b(str);
       if (i != 1) {
          if (i != 2) {
             integer = (i != 3)? Integer.valueOf(a.t().a(str, 3)): Integer.valueOf(5);
          }else {
             integer = Integer.valueOf(1);
          }
       }else {
          integer = Integer.valueOf(3);
       }
       return integer;
    }
}
