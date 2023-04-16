package com.kuaishou.growth.privacy.dialog.helper.b;
import java.lang.Runnable;
import java.lang.Object;
import tkd.b;
import tkd.d;
import cyb.a;
import com.yxcorp.gifshow.plugin.impl.growth.fingerprint.DataEvent;

public final class b implements Runnable	// class@000710
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       d.a(-316532073).l6(DataEvent.IMEI_AUTHORIZED_POPUP);
    }
}
