package com.cmic.sso.sdk.e.o$a$2;
import java.lang.Thread$UncaughtExceptionHandler;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.a;
import android.content.Context;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import com.cmic.sso.sdk.d.a;
import java.util.concurrent.CopyOnWriteArrayList;
import com.cmic.sso.sdk.auth.AuthnHelper;
import java.lang.String;
import org.json.JSONObject;

public class o$a$2 implements Thread$UncaughtExceptionHandler	// class@000f6a
{
    public final a a;
    public final Context b;
    public final o$a c;

    public void o$a$2(o$a p0,a p1,Context p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void uncaughtException(Thread p0,Throwable p1){
       this.a.a().a.add(p1);
       AuthnHelper.getInstance(this.b).callBackResult("200025", "·¢ÉúÎ´Öª´íÎó", this.a, null);
    }
}
