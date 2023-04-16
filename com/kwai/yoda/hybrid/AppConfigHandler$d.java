package com.kwai.yoda.hybrid.AppConfigHandler$d;
import erd.g;
import com.kwai.yoda.hybrid.AppConfigHandler;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.yoda.Yoda;
import com.kwai.yoda.api.YodaApi;
import qx7.c;
import brd.t;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import hy7.d;
import brd.y;
import crd.b;
import xa7.a;

public final class AppConfigHandler$d implements g	// class@00126c
{
    public final AppConfigHandler b;

    public void AppConfigHandler$d(AppConfigHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppConfigHandler$d.class, "1")) {
       }else {
          AppConfigHandler$d tb = this.b;
          a.h(p0, "params");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, AppConfigHandler.class, "11")) {
             Yoda yoda = Yoda.get();
             a.h(yoda, "Yoda.get\(\)");
             AzerothSchedulers$a b = AzerothSchedulers.b;
             yoda.getYodaApi().a().a(p0).subscribeOn(b.d()).observeOn(b.b()).subscribeWith(new d(tb)).b();
          }
       }
       return;
    }
}
