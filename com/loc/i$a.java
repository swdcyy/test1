package com.loc.i$a;
import com.amap.api.location.AMapLocationListener;
import com.loc.i;
import java.lang.Object;
import com.amap.api.location.AMapLocation;
import java.lang.String;

public final class i$a implements AMapLocationListener	// class@001445
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public final void onLocationChanged(AMapLocation p0){
       if (i.c(this.a)) {
          i.a(this.a, i.a(p0));
       }
       return;
    }
}
