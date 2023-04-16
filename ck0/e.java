package ck0.e;
import com.facebook.react.uimanager.f$b;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import lj0.c;
import java.lang.Object;
import com.kuaishou.krn.utils.Weak;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.f;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import ze.x;
import ze.s0;
import java.lang.Integer;
import com.facebook.react.uimanager.a;
import java.util.concurrent.CopyOnWriteArraySet;
import ck0.e$a;
import com.facebook.react.uimanager.f$a;
import com.kwai.robust.PatchProxyResult;

public final class e implements f$b	// class@0004d6
{
    public final Weak a;
    public long b;
    public long c;
    public final int d;
    public static final n[] e;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(e.class, "uiImplementation", "getUiImplementation\(\)Lcom/facebook/react/uimanager/UIImplementation;", 0))};
       e.e = onArray;
    }
    public void e(int p0,c p1){
       super();
       this.d = p0;
       Weak weak = new Weak();
       this.a = weak;
       if (p1 != null) {
          a uoa = p1.r();
          if (uoa != null && uoa.t()) {
             ReactContext reactContext = uoa.n();
             if (reactContext != null) {
                UIManagerModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
                if (nativeModule != null) {
                   f uIImplementa = nativeModule.getUIImplementation();
                   uIImplementa.a(this);
                   if (!PatchProxy.applyVoidOneRefs(uIImplementa, this, e.class, "2")) {
                      weak.b(this, e.e[0], uIImplementa);
                   }
                }
             }
          }
       }
       return;
    }
    public void a(x p0,boolean p1){
       s0.b(this, p0, p1);
    }
    public void b(x p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "3")) {
          return;
       }
       if (p0 != null && p0.getReactTag() == this.d) {
          this.b = a.c();
          f uof = this.d();
          if (uof != null && !PatchProxy.applyVoidOneRefs(this, uof, f.class, "58")) {
             uof.m();
             uof.k.remove(this);
          }
          uof = this.d();
          if (uof != null) {
             uof.A(new e$a(this));
          }
       }
    label_004d :
       return;
    }
    public void c(x p0){
       s0.c(this, p0);
    }
    public final f d(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a(this, e.e[0]);
    }
}
