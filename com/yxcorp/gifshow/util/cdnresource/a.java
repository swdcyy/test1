package com.yxcorp.gifshow.util.cdnresource.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import r85.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import pnc.c;
import java.lang.StringBuilder;
import q87.c;
import pnc.a;
import java.lang.Runnable;
import t45.c;
import com.kwai.component.bifrost.res.BifrostZipResourceEntry;
import com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import wkd.b;
import te6.b;
import com.yxcorp.gifshow.util.cdnresource.a$a;
import r85.b;
import we6.b;

public class a	// class@001f67
{
    public static final Map a;
    public static final List b;
    public static final boolean c;

    static {
       a.a = new ConcurrentHashMap();
       a.b = new CopyOnWriteArrayList();
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("enableBifrostActivityLikeAnimation", false);
       a.c = b;
    }
    public static boolean a(String p0,String p1){
       List b = a.b;
       boolean b1 = (b != null && !b.isEmpty())? b.contains(p0): false;
       boolean c = a.c;
       boolean b2 = (c && (b1 && !TextUtils.isEmpty(p1)))? true: false;
       if (c && !b2) {
          Object[] objArray = new Object[0];
          c.C().w("BifrostResourceManager", "enableBifrost : false:  activityType: "+p0+" : "+b1+"  activityId: "+p1, objArray);
       }
       return b2;
    }
    public static void b(String p0,String p1,String p2){
       if (!TextUtils.isEmpty(p0)) {
          c.a(new a(p0, p1, p2));
       }else {
          Object[] objArray = new Object[0];
          c.C().w("BifrostResourceManager", "handleWarmupResource  path null, activityId : "+p1, objArray);
       }
       return;
    }
    public static void c(BifrostZipResourceEntry p0,String p1,String p2){
       String url;
       b uob = null;
       String str = "BifrostResourceManager";
       if (p0 != null && p0.isValid()) {
          if (p0.isAlreadyWarmup()) {
             a.b(b.a(-1427269270).B(p0.getUrl()), p1, p2);
          }else {
             Object[] objArray = new Object[uob];
             c.C().w(str, "initKeymapConfig: warmup failed, registerWarmUpListener", objArray);
             url = p0.getUrl();
             a$a uoa = new a$a(p1, p2);
             if (!PatchProxy.applyVoidTwoRefs(url, uoa, null, b.class, "3")) {
                b uob1 = b.a(-1427269270);
                uob1.d(uob1.a(url), uoa);
             }
          }
       }else {
          Object[] objArray1 = new Object[uob];
          c.C().w(str, "initKeymapConfig: url invalid!", objArray1);
       }
       return;
    }
}
