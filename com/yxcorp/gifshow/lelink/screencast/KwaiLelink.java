package com.yxcorp.gifshow.lelink.screencast.KwaiLelink;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink$mIBindSdkListenerList$2;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink$mIConnectListenerList$2;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink$mIBrowseListenerList$2;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink$mILelinkPlayerListenerList$2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.hpplay.sdk.source.api.LelinkSourceSDK;
import com.hpplay.sdk.source.api.IConnectListener;
import c0b.b;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import c0b.a;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import c0b.c;
import kotlin.jvm.internal.a;

public final class KwaiLelink	// class@001a4f
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public boolean e;
    public static final p f;
    public static final KwaiLelink$a g;

    static {
       KwaiLelink.g = new KwaiLelink$a(null);
       KwaiLelink.f = s.b(LazyThreadSafetyMode.SYNCHRONIZED, KwaiLelink$Companion$instance$2.INSTANCE);
    }
    public void KwaiLelink(){
       super();
       this.a = s.c(KwaiLelink$mIBindSdkListenerList$2.INSTANCE);
       this.b = s.c(KwaiLelink$mIConnectListenerList$2.INSTANCE);
       this.c = s.c(KwaiLelink$mIBrowseListenerList$2.INSTANCE);
       this.d = s.c(KwaiLelink$mILelinkPlayerListenerList$2.INSTANCE);
    }
    public void KwaiLelink(u p0){
       super();
       this.a = s.c(KwaiLelink$mIBindSdkListenerList$2.INSTANCE);
       this.b = s.c(KwaiLelink$mIConnectListenerList$2.INSTANCE);
       this.c = s.c(KwaiLelink$mIBrowseListenerList$2.INSTANCE);
       this.d = s.c(KwaiLelink$mILelinkPlayerListenerList$2.INSTANCE);
    }
    public static final KwaiLelink a(){
       Object obj = PatchProxy.apply(null, null, KwaiLelink.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiLelink.g.a();
    }
    public final ArrayList b(){
       Object obj = PatchProxy.apply(null, this, KwaiLelink.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final ArrayList c(){
       Object obj = PatchProxy.apply(null, this, KwaiLelink.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final ArrayList d(){
       Object obj = PatchProxy.apply(null, this, KwaiLelink.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final void e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiLelink kwaiLelink = KwaiLelink.class;
       if (PatchProxy.applyVoid(null, this, kwaiLelink, "5")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       LelinkSourceSDK instance = LelinkSourceSDK.getInstance();
       b uob = PatchProxy.apply(null, this, kwaiLelink, "6");
       if (uob != patchProxyRe) {
       }else {
          uob = new b(this);
       }
       instance.setConnectListener(uob);
       instance = LelinkSourceSDK.getInstance();
       a uoa = PatchProxy.apply(null, this, kwaiLelink, "7");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a(this);
       }
       instance.setBrowseResultListener(uoa);
       instance = LelinkSourceSDK.getInstance();
       c uoc = PatchProxy.apply(null, this, kwaiLelink, "8");
       if (uoc != patchProxyRe) {
       }else {
          uoc = new c(this);
       }
       instance.setPlayListener(uoc);
       this.e = true;
       return;
    }
    public final void f(IBrowseListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiLelink.class, "13")) {
          return;
       }
       a.p(p0, "browseListener");
       if (!this.b().contains(p0)) {
          this.b().add(p0);
       }
       return;
    }
    public final void g(IConnectListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiLelink.class, "11")) {
          return;
       }
       a.p(p0, "connectListener");
       if (!this.c().contains(p0)) {
          this.c().add(p0);
       }
       return;
    }
    public final void h(ILelinkPlayerListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiLelink.class, "15")) {
          return;
       }
       a.p(p0, "lelinkPlayerListener");
       if (!this.d().contains(p0)) {
          this.d().add(p0);
       }
       return;
    }
}
