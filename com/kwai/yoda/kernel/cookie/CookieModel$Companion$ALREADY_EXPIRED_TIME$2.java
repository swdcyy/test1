package com.kwai.yoda.kernel.cookie.CookieModel$Companion$ALREADY_EXPIRED_TIME$2;
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
import java.util.Date;
import java.text.DateFormat;

public final class CookieModel$Companion$ALREADY_EXPIRED_TIME$2 extends Lambda implements a	// class@001293
{
    public static final CookieModel$Companion$ALREADY_EXPIRED_TIME$2 INSTANCE;

    static {
       CookieModel$Companion$ALREADY_EXPIRED_TIME$2.INSTANCE = new CookieModel$Companion$ALREADY_EXPIRED_TIME$2();
    }
    public void CookieModel$Companion$ALREADY_EXPIRED_TIME$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, CookieModel$Companion$ALREADY_EXPIRED_TIME$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CookieModel.j.a().format(new Date(0));
    }
}
