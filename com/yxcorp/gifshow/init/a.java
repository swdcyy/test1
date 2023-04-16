package com.yxcorp.gifshow.init.a;
import com.kuaishou.android.security.internal.init.SecDidProxy;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.deviceid.i;

public final class a implements SecDidProxy	// class@0011c1
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final String getNewDid(){
       return i.c();
    }
}
