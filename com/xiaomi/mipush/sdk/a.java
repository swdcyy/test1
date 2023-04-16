package com.xiaomi.mipush.sdk.a;
import java.lang.Runnable;
import java.lang.String;
import com.xiaomi.mipush.sdk.MiPushClient$b;
import java.lang.Object;
import com.xiaomi.mipush.sdk.MiPushClient;
import android.content.Context;
import com.xiaomi.mipush.sdk.MiPushClient$c;

public final class a implements Runnable	// class@0010e6
{
    public final String b;
    public final String c;
    public final String d;
    public final MiPushClient$b e;

    public void a(String p0,String p1,String p2,MiPushClient$b p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void run(){
       MiPushClient.initialize(MiPushClient.sContext, this.b, this.c, null, this.d, this.e);
    }
}
