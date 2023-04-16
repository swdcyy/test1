package com.kwai.framework.network.keyconfig.KeyConfigErrorToastPolicy;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import com.kwai.framework.network.keyconfig.TimeRange;
import java.lang.Object;
import java.util.concurrent.TimeUnit;

public class KeyConfigErrorToastPolicy	// class@000c1a
{
    public boolean disableToast;
    public String mToastMessage;
    public TimeRange mToastValidTime;
    public long toastMinIntervalMs;
    public static final String a;
    public static final TimeRange b;

    static {
       KeyConfigErrorToastPolicy.a = a.a().a().getString(0x7f1038e7);
       KeyConfigErrorToastPolicy.b = new TimeRange(0x16fd76c5a00, 0x16fd8b5f100);
    }
    public void KeyConfigErrorToastPolicy(){
       super();
       this.disableToast = false;
       this.toastMinIntervalMs = TimeUnit.SECONDS.toMillis(120);
    }
}
