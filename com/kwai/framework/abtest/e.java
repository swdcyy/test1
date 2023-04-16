package com.kwai.framework.abtest.e;
import wu8.o;
import com.kwai.framework.abtest.ABTestInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e66.a;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.gifshow.tuna.player.poi.e;
import crd.b;
import java.lang.Runnable;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import i56.g;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j56.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import cjd.e;
import erd.o;
import com.kwai.framework.abtest.d;

public class e implements o	// class@0014c7
{
    public final ABTestInitModule a;

    public void e(ABTestInitModule p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       a.g("");
       this.c().subscribe(Functions.d(), e.b);
       return;
    }
    public void b(boolean p0,Runnable p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoe, "2")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          a.g("");
          if (p1 != null) {
             p1.run();
          }
          return;
       }else {
          t ot = this.c();
          if (p0) {
             String str = a.a();
             if (!TextUtils.isEmpty(str)) {
                ot = t.just(str);
             }
          }
          ot.subscribe(new g(p1), e.b);
          return;
       }
    }
    public final t c(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1888538300).getPassportServiceToken("kuaishou.abtest", RequestTiming.DEFAULT).map(new e()).map(d.b);
    }
}
