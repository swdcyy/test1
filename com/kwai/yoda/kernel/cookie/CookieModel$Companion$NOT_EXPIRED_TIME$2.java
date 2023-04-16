package com.kwai.yoda.kernel.cookie.CookieModel$Companion$NOT_EXPIRED_TIME$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.kernel.cookie.CookieModel;
import java.text.SimpleDateFormat;
import com.kwai.yoda.kernel.cookie.CookieModel$a;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.a;
import java.text.DateFormat;

public final class CookieModel$Companion$NOT_EXPIRED_TIME$2 extends Lambda implements a	// class@001294
{
    public static final CookieModel$Companion$NOT_EXPIRED_TIME$2 INSTANCE;

    static {
       CookieModel$Companion$NOT_EXPIRED_TIME$2.INSTANCE = new CookieModel$Companion$NOT_EXPIRED_TIME$2();
    }
    public void CookieModel$Companion$NOT_EXPIRED_TIME$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, CookieModel$Companion$NOT_EXPIRED_TIME$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Calendar instance = Calendar.getInstance();
       instance.add(1, 1);
       a.h(instance, "calendar");
       return CookieModel.j.a().format(new Date(instance.getTimeInMillis()));
    }
}
