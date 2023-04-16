package com.yxcorp.gifshow.growth.push.coin.PushCoinUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.yxcorp.gifshow.growth.push.coin.PushCoinUriHandler$a;
import nsd.u;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.net.Uri;
import xh7.a;
import ekd.x0;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.growth.push.coin.PushCoinUriHandler$b;
import qh7.b;
import qh7.a;
import wkd.b;
import yma.a;
import yma.b;
import brd.t;
import com.yxcorp.gifshow.growth.push.coin.PushCoinUriHandler$c;
import erd.g;
import crd.b;

public final class PushCoinUriHandler extends AnnotationUriHandler	// class@00149a
{
    public static final PushCoinUriHandler$a b;

    static {
       PushCoinUriHandler.b = new PushCoinUriHandler$a(null);
    }
    public void PushCoinUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PushCoinUriHandler.class, "1")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "callback");
       Uri uri = p0.g();
       a.o(uri, "request.uri");
       String str = x0.a(uri, "scheme");
       Object[] objArray = new Object[0];
       w.C().y("PushCoinUriHandler", "#handleInternal : \nuri = "+uri+" \nscheme = "+str, objArray);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity == null) {
          uActivity = a.B;
       }
       if (uActivity != null) {
          b uob = b.j(uActivity, str);
          if (!uActivity instanceof Activity) {
             uob.o(0x10000000);
          }
          Object[] objArray1 = new Object[0];
          w.C().y("PushCoinUriHandler", "#handleInternal : startUriRequest ==> \nscheme = "+str, objArray1);
          a.b(uob, new PushCoinUriHandler$b(str, p1));
       }
       String str1 = x0.a(uri, "pas");
       if (str1 == null) {
          str1 = "";
       }
       Object[] objArray2 = new Object[0];
       w.C().y("PushCoinUriHandler", "#handleInternal : pas = "+str1, objArray2);
       p1 = b.a(-1257347683);
       a.o(p1, "Singleton.get\(GrowthApi::class.java\)");
       p1.b().c(str1).subscribe(PushCoinUriHandler$c.b);
       return;
    }
}
