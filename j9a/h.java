package j9a.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j9a.h$a;
import j9a.h$b;
import j9a.h$c;
import j9a.h$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.q;
import java.lang.Runnable;
import ekd.k1;
import j9a.a;
import j9a.d;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import j9a.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.a;
import t45.d;
import brd.z;
import j9a.g;
import bf5.v;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.r0;
import uw9.o;
import q87.c;
import lnc.i3;
import java.lang.Boolean;
import k2b.u1;
import j9a.h$e;
import java.lang.StringBuilder;
import android.os.Build;
import android.os.Build$VERSION;
import j9a.b;
import com.kuaishou.aegon.NetworkSwitchCallback;
import com.kuaishou.aegon.NetworkActivationHelper;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uw9.l0;
import jf5.a;

public class h extends PresenterV2	// class@002997
{
    public String p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public int s;
    public boolean t;
    public final boolean u;
    public MilanoContainerEventBus v;
    public final Runnable w;
    public final Runnable x;
    public final Runnable y;
    public final q z;

    public void h(boolean p0){
       super();
       this.p = "";
       this.s = 0;
       this.t = false;
       this.w = new h$a(this);
       this.x = new h$b(this);
       this.y = new h$c(this);
       this.z = new h$d(this);
       this.u = p0;
       String str = (p0)? "NetworkActivationHelper Featured": "NetworkActivationHelper Detail";
       this.p = str;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q);
       this.r = slidePlayVie;
       slidePlayVie.e(this.z);
       if (this.u != null) {
          k1.o(this.x);
          k1.r(this.y, (long)(d.b().wifiPollInterval * 1000));
       }
       this.X7(this.v.V.subscribe(new f(this), Functions.d()));
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new g(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.r.b(this.z);
       this.s = 0;
       this.t = false;
       k1.m(this.w);
       k1.m(this.x);
       k1.m(this.y);
       return;
    }
    public void P8(v p0,Runnable p1,String p2){
       Object[] objArray;
       Object[] objArray1;
       d uod = d.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "4")) {
          return;
       }
       if (!r0.e(a.b())) {
          objArray = new Object[0];
          o.C().w(this.p, "uniformSwitchToMobileNetWork isWifiConnected false", objArray);
          return;
       }else if(PatchProxy.applyVoid(null, null, uod, "14")){
          i3 oi31 = i3.f();
          oi31.a("mark", Boolean.TRUE);
          u1.R("TRIGGER_SWITCH_NET_WORK", oi31.toString(), 14);
       }
       if (d.a() && !d.c()) {
          h$e uoe = new h$e(this, p0, p1);
          if (!PatchProxy.applyVoidTwoRefs(uoe, p2, null, uod, "5")) {
             objArray = new Object[0];
             o.C().w("NetworkActivationHelper SwitchNetWorkHelper", "switchToMobileNetWork::"+p2, objArray);
             if (!r0.e(a.b())) {
                objArray1 = new Object[0];
                o.C().w("NetworkActivationHelper SwitchNetWorkHelper", "isWifiConnected false", objArray1);
             }else if(d.e == 2){
                objArray1 = new Object[0];
                o.C().w("NetworkActivationHelper SwitchNetWorkHelper", "switchToMobileNetWork::mCurrNetType == NET_TYPE_MOBILE", objArray1);
             }else {
                i3 oi3 = i3.f();
                oi3.d("device", Build.MODEL);
                oi3.d("os", Build$VERSION.RELEASE);
                u1.R("START_SWITCH_NET_WORK", oi3.toString(), 14);
                String f = (d.b().enableSpeedTestInWifi != null)? d.f: "";
                NetworkActivationHelper.b(0, 0, f, new b(uoe, oi3));
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.v = this.q8(l0.class).X;
       return;
    }
}
