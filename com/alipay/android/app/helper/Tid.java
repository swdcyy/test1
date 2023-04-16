package com.alipay.android.app.helper.Tid;
import c7.a;
import java.lang.String;

public class Tid extends a	// class@000e35
{

    public void Tid(String p0,String p1,long p2){
       super(p0, p1, p2);
    }
    public static Tid fromRealTidModel(a p0){
       if (p0 == null) {
          return null;
       }
       return new Tid(p0.getTid(), p0.getTidSeed(), p0.getTimestamp());
    }
}
