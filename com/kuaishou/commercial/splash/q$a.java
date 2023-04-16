package com.kuaishou.commercial.splash.q$a;
import com.yxcorp.gifshow.w$b;
import com.kuaishou.commercial.splash.q;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.kuaishou.commercial.splash.i;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tjc.d;
import tjc.c$b;
import wkd.b;
import com.yxcorp.gifshow.w;
import java.lang.ref.WeakReference;
import android.content.Intent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import uv8.o1;

public class q$a implements w$b	// class@001618
{
    public final q a;

    public void q$a(q p0){
       this.a = p0;
       super();
    }
    public void a(Activity p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "1")) {
          return;
       }
       int i = 0;
       if (this.a.S()) {
          Object[] objArray = new Object[i];
          j0.f("SplashDataManager", "Already has a splash", objArray);
          return;
       }else {
          i.b(p0);
          q$a ta = this.a;
          Objects.requireNonNull(ta);
          Object obj = PatchProxy.applyOneRefs(p0, ta, q.class, "18");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p0 == null){
             d uod = ta.j();
             if (uod != null && uod.c(p0)) {
                b = true;
             }
          }
          b = false;
          if (b) {
             c$b uob = new c$b();
             uob.e = true;
             boolean b1 = (b.a(-1343064608).getLaunchSource() == 6)? true: false;
             uob.b = b1;
             this.a.i = new WeakReference(p0);
             if (TextUtils.n(p0.getIntent().getAction(), "com.yxcorp.gifshow.shortcut.forward_2_camera") && p0.getIntent().getBooleanExtra("HOME_ACTIVITY_FORBID_AD", i)) {
                i = true;
             }
             uob.a = i;
             uob.f = b.a(-1343064608).getLaunchSource();
             b.a(-1343064608).d0();
             this.a.P(uob);
          }
          return;
       }
    }
    public void b(){
       o1.a(this);
    }
    public void c(int p0,String p1){
       o1.d(this, p0, p1);
    }
    public void d(Activity p0){
       o1.c(this, p0);
    }
    public void e(Activity p0){
       o1.b(this, p0);
    }
}
