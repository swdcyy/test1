package com.kwai.feature.component.screenshot.a$c;
import android.database.ContentObserver;
import com.kwai.feature.component.screenshot.a;
import android.content.Context;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.screenshot.c;
import io.reactivex.g;
import brd.t;
import e06.g;
import erd.a;
import e06.i;
import erd.r;
import com.kwai.feature.component.screenshot.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import com.kwai.feature.component.screenshot.f;
import e06.h;
import com.kwai.feature.component.screenshot.d;
import erd.g;
import crd.b;
import android.net.Uri;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.util.PermissionUtils;
import e06.a;
import java.lang.StringBuilder;
import q87.c;
import z1.a;

public class a$c extends ContentObserver	// class@001282
{
    public final Context a;
    public a b;
    public b c;
    public final a d;
    public static final int e;

    public void a$c(a p0,Context p1,Handler p2){
       this.d = p0;
       super(p2);
       this.a = p1;
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
       }else {
          this.c = t.create(new c(this)).doOnDispose(new g(this)).filter(new i(this)).distinct(e.b).timeInterval(TimeUnit.SECONDS).filter(f.b).subscribe(new h(this), d.b);
       }
       return;
    }
    public void onChange(boolean p0,Uri p1){
       boolean b;
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a$c.class, "4")) {
          return;
       }
       a$c td = this.d;
       Objects.requireNonNull(td);
       Object obj = PatchProxy.apply(null, td, a.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          boolean b1 = PermissionUtils.a(a.b(), "android.permission.READ_EXTERNAL_STORAGE");
          Object[] objArray = new Object[0];
          a.B().w("ScreenshotMonitor", "READ_EXTERNAL_STORAGE: "+b1+"----isOnForegroundServalTime: "+td.b, objArray);
          b = (td.b != null && b1)? true: false;
       }
       if (!b) {
          return;
       }else {
          super.onChange(p0, p1);
          a$c tb = this.b;
          if (tb != null) {
             tb.accept(p1);
          }
          return;
       }
    }
}
