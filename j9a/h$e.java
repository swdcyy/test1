package j9a.h$e;
import java.lang.Runnable;
import j9a.h;
import bf5.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j9a.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uw9.c;
import android.content.SharedPreferences;
import java.lang.System;
import j9a.a;
import e17.i$b;
import e17.i;
import android.content.SharedPreferences$Editor;
import oe6.g;
import k2b.u1;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import bf5.u;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;

public class h$e implements Runnable	// class@002996
{
    public final v b;
    public final Runnable c;
    public final h d;

    public void h$e(h p0,v p1,Runnable p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$e.class, "1")) {
          return;
       }
       d uod = d.class;
       if (!PatchProxy.applyVoid(objArray, objArray, uod, "7")) {
          SharedPreferences$Editor obj = PatchProxy.apply(objArray, objArray, uod, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if((System.currentTimeMillis() - c.a.getLong("switchNetToastTime", 0)) - 0x5265c00 > 0){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             if (!PatchProxy.applyVoid(objArray, objArray, uod, "9")) {
                a uoa = d.b();
                if (uoa != null) {
                   uoa = uoa.toastType;
                   int i = 0x7f104d41;
                   if (uoa != 1 && uoa == 2) {
                      i = 0x7f104d40;
                   }
                   i$b uob = i.m();
                   uob.x(i);
                   uob.s(R.layout.arg_RES_7f0d15a1);
                   uob.o(3000);
                   i.z(uob);
                }
             }
             obj = c.a.edit();
             obj.putLong("switchNetToastTime", System.currentTimeMillis());
             g.a(obj);
             u1.R("TOAST_SWITCH_NETWOKR_SHOW", "", 14);
          }
       }
       h$e tb = this.b;
       if (tb != null) {
          this.d.v.W.onNext(new u(tb.a, tb.b));
       }
       tb = this.c;
       if (tb != null) {
          tb.run();
       }
       return;
    }
}
