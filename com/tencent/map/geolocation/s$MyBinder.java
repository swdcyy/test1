package com.tencent.map.geolocation.s$MyBinder;
import android.os.Binder;
import com.tencent.map.geolocation.s;

public class s$MyBinder extends Binder	// class@000e64
{
    public final s a;

    public void s$MyBinder(s p0){
       this.a = p0;
       super();
    }
    public s getService(){
       return this.a;
    }
}
