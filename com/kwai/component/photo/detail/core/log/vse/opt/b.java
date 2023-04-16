package com.kwai.component.photo.detail.core.log.vse.opt.b;
import java.lang.Object;
import zd5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import crd.b;
import lnc.b9;
import zd5.b;
import com.kwai.component.photo.detail.core.log.vse.opt.b$b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import com.kwai.component.photo.detail.core.log.vse.opt.a;
import ok.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zd5.d;
import com.kwai.component.photo.detail.core.log.vse.opt.b$a;
import java.util.Objects;
import zd5.a;
import kotlin.jvm.internal.a;
import zd5.a$a;
import java.lang.Runnable;

public class b	// class@000a30
{
    public long a;
    public boolean b;
    public boolean c;
    public b d;
    public String e;
    public b$b f;
    public b g;

    public void b(){
       super();
       this.a = 15;
       boolean b = false;
       this.c = b;
       Object obj = PatchProxy.apply(null, null, h.class, "1");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("enableVseOptCollect", b);
       this.b = b;
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b9.a(this.g);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.e("doing_release");
       return;
    }
    public void c(b p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.c = false;
       this.d = p0;
       this.e = p1;
       this.d();
       b$b uob = new b$b(this);
       this.f = uob;
       ActivityContext.i(uob);
       this.e("init_only");
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.g = b9.c(this.g, new a(this));
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       if (!TextUtils.x(this.e) && this.c == null) {
          d uod = d.c();
          b te = this.e;
          b$a uoa = new b$a(this, p0);
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidTwoRefs(te, uoa, uod, d.class, "6")) {
             a uoa1 = uod.f();
             Objects.requireNonNull(uoa1);
             if (!PatchProxy.applyVoidTwoRefs(te, uoa, uoa1, a.class, "2")) {
                a.p(uoa, "runnable");
                uoa1.c(new a$a(false, false, te, uoa));
             }
          }
       }
       return;
    }
}
