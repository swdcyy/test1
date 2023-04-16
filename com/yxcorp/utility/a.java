package com.yxcorp.utility.a;
import javax.inject.Provider;
import java.lang.Object;
import ekd.e;
import com.kuaishou.ug.deviceinfo.DeviceInfoManager;
import java.lang.Integer;

public final class a implements Provider	// class@001406
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return Integer.valueOf(DeviceInfoManager.d.k());
    }
}
