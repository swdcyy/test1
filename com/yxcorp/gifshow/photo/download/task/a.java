package com.yxcorp.gifshow.photo.download.task.a;
import erd.g;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.yxcorp.gifshow.photo.download.utils.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import java.io.File;
import com.yxcorp.gifshow.photo.download.utils.e;
import qkd.b;
import exb.b;
import ixb.c;
import java.lang.Runnable;
import t45.c;
import brd.t;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import t45.d;
import ixb.b;
import io.reactivex.internal.functions.Functions;
import ixb.a;
import crd.b;

public final class a implements g	// class@000eed
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.b == null) {
          p0 = tb.e.mSource;
          if (!PatchProxy.applyVoidOneRefs(p0, null, c.class, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "download_fail_no_permission";
             i3 oi3 = i3.f();
             oi3.d("source", p0);
             uElementPack.params = oi3.e();
             u1.u0(0, uElementPack, null);
          }
          p0 = tb.c;
          PermissionUtils.o(p0, p0.getString(R.string.arg_RES_7f104ab5));
       }else {
          p0 = e.c(tb.b);
          if (b.S(p0)) {
             tb.d.a();
             c.a(new c(tb, p0));
          }else {
             tb.b().subscribeOn(b.b(c.c())).observeOn(d.a).doOnNext(new b(tb)).subscribe(Functions.d(), new a(tb));
          }
       }
       return;
    }
}
