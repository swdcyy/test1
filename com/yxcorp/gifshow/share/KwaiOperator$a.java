package com.yxcorp.gifshow.share.KwaiOperator$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.OperationModel;
import mhc.p1;
import xxb.b;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.KwaiOperator$Style;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import mhc.v1;
import msd.p;
import java.lang.Integer;
import android.content.Context;
import o56.c;
import o56.a;
import android.app.Application;

public final class KwaiOperator$a	// class@001b47
{

    public void KwaiOperator$a(){
       super();
    }
    public void KwaiOperator$a(u p0){
       super();
    }
    public final KwaiOperator a(GifshowActivity p0,OperationModel p1,p1 p2,b p3){
       Object obj = PatchProxy.applyFourRefsWithListener(p0, p1, p2, p3, this, KwaiOperator$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "operation");
       KwaiOperator kwaiOperator = new KwaiOperator(p0, p1, KwaiOperator$Style.NONE, null, CollectionsKt__CollectionsKt.E());
       if (!PatchProxy.applyVoidTwoRefs(p2, p3, v7, KwaiOperator.class, "3")) {
          a.p(p2, "operation");
          v7.a(p3).invoke(p2, Integer.valueOf(0));
       }
       PatchProxy.onMethodExit(KwaiOperator$a.class, "2");
       return v7;
    }
    public final Context b(){
       c obj = PatchProxy.apply(null, this, KwaiOperator$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       Application uApplication = obj.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       return uApplication;
    }
}
