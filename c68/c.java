package c68.c;
import ma8.s;
import com.mini.app.model.page.LaunchPageInfo;
import e68.a;
import h88.c;
import java.lang.Object;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import r58.b;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import mh8.b$a;
import ma8.r;
import yd8.b;
import java.lang.Runnable;
import java.util.Objects;
import m68.m;
import androidx.fragment.app.Fragment;
import com.mini.app.fragment.LoadingMiniAppFragment;
import com.mini.app.page.g;
import com.mini.app.fragment.MiniAppFragment;
import com.mini.app.page.loading.view.PageLoadingLauncher;
import java.util.Queue;
import f68.c;
import java.lang.Integer;
import f68.d;
import com.mini.d;
import org.json.JSONObject;
import oi8.l;
import n88.b;
import java.lang.StringBuilder;
import com.google.common.base.Optional;
import c68.b;
import c68.a;
import c68.c$a;
import java.util.concurrent.TimeUnit;
import com.mini.app.page.loading.RouteLoadingCallbackProxy;
import f68.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import zi8.d0;

public abstract class c implements s	// class@0003bb
{
    public m a;
    public final Handler b;
    public final f c;
    public final LaunchPageInfo d;
    public final a e;
    public final c f;
    public c$a g;
    public boolean h;
    public int i;
    public boolean j;
    public final boolean k;

    public void c(int p0,LaunchPageInfo p1,a p2,c p3){
       boolean b;
       super();
       this.i = p0;
       f uof = a.d.b();
       this.c = uof;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.b = new Handler(Looper.getMainLooper());
       p2 = PatchProxy.apply(null, this, c.class, "4");
       if (p2 != PatchProxyResult.class) {
          b = p2.booleanValue();
       }else if(p1 == null){
          b = false;
       }else {
          b o = uof.y.o;
          b = o.i(o.c(p1.b));
       }
       this.k = b;
       return;
    }
    public void a(b$a p0){
       r.b(this, p0);
    }
    public void b(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "10")) {
          return;
       }
       c tg = this.g;
       if (tg != null) {
          this.b.removeCallbacks(tg);
       }
       if (this.h != null) {
          return;
       }else {
          this.g(p1, p0);
          c ta = this.a;
          if (ta != null) {
             LaunchPageInfo m = this.d.m;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(m, ta, m.class, "8")) {
                Fragment uFragment = ta.f();
                if (uFragment instanceof LoadingMiniAppFragment) {
                   Objects.requireNonNull(uFragment);
                   if (PatchProxy.applyVoidOneRefs(m, uFragment, LoadingMiniAppFragment.class, "5") || (uFragment.Zg() != null && uFragment.d != null)) {
                      LoadingMiniAppFragment k = uFragment.k;
                      Objects.requireNonNull(k);
                      if (!PatchProxy.applyVoid(null, k, PageLoadingLauncher.class, "4")) {
                         k.f.clear();
                         k.d(new c(k));
                      }
                      uFragment.Zg().y(m, uFragment.d);
                      uFragment.n = true;
                   }
                }
             }
          }
          return;
       }
    }
    public void c(Integer p0,c p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "9")) {
          return;
       }
       c tg = this.g;
       if (tg != null) {
          this.b.removeCallbacks(tg);
       }
       if (this.h != null) {
          return;
       }else {
          this.g(p1, p2);
          p1 = this.a;
          if (p1 != null && p1.f() != null) {
             LoadingMiniAppFragment loadingMiniA = this.a.f();
             int i = p0.intValue();
             Objects.requireNonNull(loadingMiniA);
             if (!PatchProxy.isSupport(LoadingMiniAppFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), loadingMiniA, LoadingMiniAppFragment.class, "4")) {
                LoadingMiniAppFragment k = loadingMiniA.k;
                Objects.requireNonNull(k);
                if (!PatchProxy.applyVoid(null, k, PageLoadingLauncher.class, "5")) {
                   k.d(new d(k));
                }
             }
          }
          return;
       }
    }
    public void d(){
       LoadingMiniAppFragment loadingMiniA;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          return;
       }
       String str = "#PageLoading#";
       d.c(str, "onBefore navigateTo: ");
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          d.c(str, "sendLoadingStartEvent");
          this.c.a.n0().technologyEventLog(this.c.c(), "page_loading_start", this.e().toString());
       }
       m om = (this.a == null)? 1: null;
       if (om) {
          this.a = this.f();
          d.c(str, "routeForResult : "+this.a);
          uoc = this.a;
          if (uoc == null) {
             this.g(this.f, b.a(0x4a77e, "route result is null"));
             return;
          }else if(!uoc.g()){
             this.g(this.f, b.a(Optional.fromNullable(this.a.d()).or(Integer.valueOf(0x4a77d)).intValue(), this.a.e()));
             return;
          }else {
             loadingMiniA = this.a.f();
             if (loadingMiniA != null) {
                loadingMiniA.l = new b(this);
                loadingMiniA.m = new a(this);
             }
          }
       }
       uoc = this.g;
       if (uoc != null) {
          this.b.removeCallbacks(uoc);
       }
       c$a uoa = new c$a(this);
       this.g = uoa;
       this.b.postDelayed(uoa, TimeUnit.SECONDS.toMillis((long)RouteLoadingCallbackProxy.getSwitchTimeout()));
       uoc = this.a;
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, m.class, "7")) {
          Fragment uFragment = uoc.f();
          if (uFragment instanceof LoadingMiniAppFragment) {
             Objects.requireNonNull(uFragment);
             if (!PatchProxy.applyVoid(objArray, uFragment, LoadingMiniAppFragment.class, "3")) {
                loadingMiniA = uFragment.k;
                Objects.requireNonNull(loadingMiniA);
                if (!PatchProxy.applyVoid(objArray, loadingMiniA, PageLoadingLauncher.class, "7")) {
                   loadingMiniA.d(new e(loadingMiniA));
                }
             }
          }
       }
       return;
    }
    public final JSONObject e(){
       boolean b;
       c td;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       JSONObject obj = PatchProxy.apply(null, this, uoc, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new JSONObject();
       Object obj1 = PatchProxy.apply(null, this, uoc, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          td = this.d;
          b = (td == null)? false: TextUtils.isEmpty(this.c.y.o.c(td.b)) ^ 0x01;
       }
       d0.m(obj, "isSubPkgPath", Boolean.valueOf(b));
       d0.m(obj, "isSubPkgInstall", Boolean.valueOf(this.k));
       td = this.d;
       LaunchPageInfo b1 = (td != null)? td.b: "";
       d0.m(obj, "path", b1);
       return obj;
    }
    public abstract m f();
    public final void g(c p0,b p1){
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "1")) {
          return;
       }
       if (p0 != null && p1 != null) {
          String str = "#PageLoading#";
          if (this.j != null) {
             d.c(str, "hasSendResult: "+p1);
             return;
          }else {
             d.c(str, "sendResultToConsumer");
             this.j = true;
             if (!PatchProxy.applyVoid(null, this, uoc, "2")) {
                d.c(str, "sendCallBackEndEvent");
                this.c.a.n0().technologyEventLog(this.c.c(), "page_loading_end", this.e().toString());
             }
             p0.accept(p1);
          }
       }
       return;
    }
}
