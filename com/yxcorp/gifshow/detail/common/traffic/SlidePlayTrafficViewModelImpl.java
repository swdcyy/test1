package com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl;
import zz9.c;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$b;
import nsd.u;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import lnc.a1;
import java.lang.Boolean;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public final class SlidePlayTrafficViewModelImpl extends ViewModel implements c	// class@0014f5
{
    public long b;
    public long c;
    public final PublishSubject d;
    public final PublishSubject e;
    public static final p f;
    public static final SlidePlayTrafficViewModelImpl$a g;
    public static final SlidePlayTrafficViewModelImpl$b h;

    static {
       SlidePlayTrafficViewModelImpl.h = new SlidePlayTrafficViewModelImpl$b(null);
       SlidePlayTrafficViewModelImpl.f = s.c(SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2.INSTANCE);
       SlidePlayTrafficViewModelImpl.g = new SlidePlayTrafficViewModelImpl$a();
    }
    public void SlidePlayTrafficViewModelImpl(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.d = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<String>\(\)");
       this.e = publishSubje;
    }
    public void D(String p0,long p1){
       SlidePlayTrafficViewModelImpl slidePlayTra = SlidePlayTrafficViewModelImpl.class;
       if (PatchProxy.isSupport(slidePlayTra) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, slidePlayTra, "1")) {
          return;
       }
       a.p(p0, "photoId");
       this.b = this.b + p1;
       Log.l("SlidePlayTrafficVM", "saveTraffic: "+this.b);
       SlidePlayTrafficViewModelImpl$b h = SlidePlayTrafficViewModelImpl.h;
       if (h.b() - null > 0 && (this.b - this.c) - h.b() >= 0) {
          SlidePlayTrafficViewModelImpl tb = this.b;
          this.c = tb;
          long l = 1024;
          if (tb - l >= 0) {
             tb = (this.c / l)+"MB";
          }else {
             Object[] objArray = new Object[]{Float.valueOf(((float)this.c / (float)0x100000))};
             String str = String.format("%.1f", Arrays.copyOf(objArray, 1));
             a.o(str, "java.lang.String.format\(format, *args\)");
             tb = str;
             tb = tb+"GB";
          }
          this.e.onNext(a1.r(R.string.arg_RES_7f103cb2, tb));
       }
       return;
    }
    public void I(boolean p0){
       SlidePlayTrafficViewModelImpl slidePlayTra = SlidePlayTrafficViewModelImpl.class;
       if (PatchProxy.isSupport(slidePlayTra) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayTra, "3")) {
          return;
       }
       this.d.onNext(Boolean.valueOf(p0));
       return;
    }
    public b X(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SlidePlayTrafficViewModelImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "onNext");
       a.p(p1, "onError");
       b uob = this.d.subscribe(p0, p1);
       a.o(uob, "mSaveTrafficSubject.subscribe\(onNext, onError\)");
       return uob;
    }
    public void b0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayTrafficViewModelImpl.class, "5")) {
          return;
       }
       a.p(p0, "toast");
       this.e.onNext(p0);
       return;
    }
    public b s(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SlidePlayTrafficViewModelImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "onNext");
       a.p(p1, "onError");
       b uob = this.e.subscribe(p0, p1);
       a.o(uob, "trafficToastPublisher.subscribe\(onNext, onError\)");
       return uob;
    }
}
