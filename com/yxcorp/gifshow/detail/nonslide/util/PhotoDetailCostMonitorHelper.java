package com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCostMonitorHelper;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import rvb.k;
import rvb.k$a;
import java.util.List;
import rvb.b;
import rvb.n;
import rvb.g$b;
import rvb.f;
import rvb.c;
import rvb.c$a;
import svb.d;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCostMonitorHelper$a;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class PhotoDetailCostMonitorHelper	// class@0015f9
{
    public static final p a;
    public static final PhotoDetailCostMonitorHelper b;

    static {
       PhotoDetailCostMonitorHelper.b = new PhotoDetailCostMonitorHelper();
       PhotoDetailCostMonitorHelper.a = s.c(PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2.INSTANCE);
    }
    public void PhotoDetailCostMonitorHelper(){
       super();
    }
    public static final void b(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PhotoDetailCostMonitorHelper.class, "6")) {
          return;
       }
       a.p(p0, "owner");
       if (!PhotoDetailCostMonitorHelper.b.a()) {
          return;
       }
       n.f(k.n, p0, null, 4, null).f(g$b.b);
       return;
    }
    public static final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, PhotoDetailCostMonitorHelper.class, "7")) {
          return;
       }
       if (!PhotoDetailCostMonitorHelper.b.a()) {
          return;
       }
       n.f(k.n, objArray, objArray, 6, objArray).b(g$b.b);
       return;
    }
    public static final void d(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PhotoDetailCostMonitorHelper.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       if (!PhotoDetailCostMonitorHelper.b.a()) {
          return;
       }
       n.f(k.n, p0, null, 4, null).f(g$b.c);
       return;
    }
    public static final void e(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PhotoDetailCostMonitorHelper.class, "5")) {
          return;
       }
       a.p(p0, "owner");
       if (!PhotoDetailCostMonitorHelper.b.a()) {
          return;
       }
       c$a[] uoaArray = new c$a[]{new d(PhotoDetailCostMonitorHelper$a.b)};
       n.d(k.n, p0, uoaArray);
       return;
    }
    public static final void f(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PhotoDetailCostMonitorHelper.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       if (!PhotoDetailCostMonitorHelper.b.a()) {
          return;
       }
       n.f(k.n, p0, null, 4, null).f(g$b.a);
       return;
    }
    public static final void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, PhotoDetailCostMonitorHelper.class, "3")) {
          return;
       }
       if (!PhotoDetailCostMonitorHelper.b.a()) {
          return;
       }
       n.f(k.n, objArray, objArray, 6, objArray).b(g$b.a);
       return;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailCostMonitorHelper.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = PhotoDetailCostMonitorHelper.a.getValue();
       }
       return obj.booleanValue();
    }
}
