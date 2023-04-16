package com.yxcorp.gifshow.h;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.HomeActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import android.content.res.Resources;
import lnc.a1;
import android.content.res.Configuration;
import java.lang.Float;
import java.lang.String;
import java.lang.Number;
import q2b.h$b;
import k2b.u1;

public final class h implements Runnable	// class@001e2d
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void run(){
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.c("font_scale", Float.valueOf(a1.m().getConfiguration().fontScale));
       uElementPack.params = oi3.e();
       uElementPack.action2 = "SYSTEM_FONT_SIZE";
       h$b uob = h$b.e(10, "SYSTEM_FONT_SIZE");
       uob.k(uElementPack);
       u1.r0(uob);
    }
}
