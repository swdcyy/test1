package com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter;
import b93.d;
import com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter$a;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter$b;
import vq5.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vq5.b;
import com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter$a$a;
import java.util.Map;
import c93.b;
import o63.a;
import d93.a;
import e93.c;

public final class LiveLiteWebViewPopupPresenter extends d	// class@000bb7
{
    public final ConcurrentHashMap A;
    public final b B;
    public d v;
    public c w;
    public a x;
    public e y;
    public KwaiDialogFragment z;
    public static final LiveLiteWebViewPopupPresenter$a C;

    static {
       LiveLiteWebViewPopupPresenter.C = new LiveLiteWebViewPopupPresenter$a(null);
    }
    public void LiveLiteWebViewPopupPresenter(){
       super();
       this.A = new ConcurrentHashMap();
       this.B = new LiveLiteWebViewPopupPresenter$b(this);
    }
    public static final d c9(LiveLiteWebViewPopupPresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("liveRouterManager");
       }
       return p0;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteWebViewPopupPresenter.class, "3")) {
          return;
       }
       super.F8();
       LiveLiteWebViewPopupPresenter tv = this.v;
       if (tv == null) {
          a.S("liveRouterManager");
       }
       tv.t5("webview", this.B);
       this.y = new LiveLiteWebViewPopupPresenter$a$a(this.A);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteWebViewPopupPresenter.class, "4")) {
          return;
       }
       LiveLiteWebViewPopupPresenter tv = this.v;
       if (tv == null) {
          a.S("liveRouterManager");
       }
       tv.Z4("webview");
       this.A.clear();
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteWebViewPopupPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(d.class);
       this.x = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteWebViewPopupPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(c.class);
       LiveLiteWebViewPopupPresenter tA = this.A;
       LiveLiteWebViewPopupPresenter tx = this.x;
       if (tx == null) {
          a.S("liveLiteJsBridgeService");
       }
       tA.put(a.class, tx);
       return;
    }
}
