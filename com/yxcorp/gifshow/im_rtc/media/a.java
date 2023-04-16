package com.yxcorp.gifshow.im_rtc.media.a;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.im_rtc.media.a$a;
import zwa.b;
import zwa.a;
import java.lang.String;
import dc5.c;
import java.util.Iterator;
import java.util.List;
import cxa.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zwa.v;
import cxa.b;
import java.lang.Runnable;
import yb7.p;
import com.yxcorp.gifshow.im_rtc.media.f;
import com.yxcorp.gifshow.im_rtc.media.h;
import com.yxcorp.gifshow.im_rtc.media.i;
import com.yxcorp.gifshow.im_rtc.media.IMRTCVolumeAdjustController;

public class a	// class@001933
{
    public final List a;
    public boolean b;
    public final v c;

    public void a(){
       super();
       this.a = new ArrayList();
       this.b = false;
       this.c = new a$a(this);
    }
    public static void a(a p0){
       p0.d();
    }
    private void d(){
       if (this.b != null) {
          return;
       }
       if (!("REQUESTED").equals(a.a().getCurState())) {
          return;
       }
       c.g("IMRTCMedia", "onRequestedNotify");
       this.b = true;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().e();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().destroy();
       }
       this.a.clear();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a.a().unregisterIMRTCListener(this.c);
       this.b();
       this.b = false;
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       p.d(new b(this));
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b();
       this.a.add(new f());
       this.a.add(new h());
       this.a.add(new i());
       this.a.add(new IMRTCVolumeAdjustController());
       a.a().registerIMRTCListener(this.c);
       return;
    }
}
