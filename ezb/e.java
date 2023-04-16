package ezb.e;
import ezb.a;
import ezb.e$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import ezb.f;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.framework.abtest.f;
import java.util.Map;
import b66.k$a;
import java.lang.System;
import pm6.m;
import java.lang.Number;
import rq.a;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils;
import java.util.Objects;
import qrd.p;
import i46.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import ezb.e$b;
import ezb.e$c;
import erd.g;
import crd.b;

public abstract class e extends a	// class@00250a
{
    public final String r;
    public boolean s;
    public static boolean t;
    public static final e$a u;

    static {
       e.u = new e$a(null);
       e.t = true;
    }
    public void e(){
       super();
       this.r = "BottomCameraPresenter";
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final String W8(){
       String obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (a.g(this.S8().e(), this.S8().d()) && (this.s == null && this.S8().k.isShown()))? String.valueOf(f.f("produceEntranceOptimization4adr", 0)): "";
       return obj;
    }
    public final void X8(boolean p0){
       this.s = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(e.class, null);
       return objectsByTag;
    }
    public final void onEventMainThread(k$a p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       a.p(p0, "event");
       long l = System.currentTimeMillis();
       CameraEntranceUtils obj = PatchProxy.apply(null, null, m.class, "9");
       long l1 = (obj != patchProxyRe)? obj.longValue(): a.F();
       l = l - l1;
       obj = CameraEntranceUtils.h;
       Objects.requireNonNull(obj);
       Number number = PatchProxy.apply(null, obj, CameraEntranceUtils.class, "1");
       if (number == patchProxyRe) {
          number = CameraEntranceUtils.a.getValue();
       }
       if (l - (number.longValue() * 0xea60) < 0) {
          return;
       }else {
          LoadPolicy loadPolicy = 2;
          if (e.t) {
             e.t = false;
             i = 1;
          }else {
             i = 2;
          }
          p0 = p0.a;
          if (p0 == loadPolicy || p0 == 3) {
             y6.s(b.class, LoadPolicy.SILENT_IF_DOWNLOADED).R(new e$b(i), new e$c(this));
          }
          return;
       }
    }
}
