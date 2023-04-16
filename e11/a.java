package e11.a;
import k51.c;
import e11.a$b;
import nsd.u;
import e11.a$a;
import e11.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import e11.d;
import z61.b;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import e11.b;
import qrd.l1;
import kotlin.jvm.internal.a;
import x61.c;
import brd.t;
import ry1.b;
import e11.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hf3.a;
import v51.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMiniProgramAudienceBottomEntrance;
import lf3.g;
import com.kwai.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import z61.l;
import ow0.a;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import lp3.i;
import vq5.d;
import lp3.c;

public final class a extends c	// class@002081
{
    public final g A;
    public c p;
    public d q;
    public b r;
    public a s;
    public MutableLiveData t;
    public LiveNormalBottomBarItem u;
    public boolean v;
    public String w;
    public CDNUrl[] x;
    public CDNUrl[] y;
    public String z;
    public static final c B;
    public static final a$b C;
    public static String sLivePresenterClassName;

    static {
       a.C = new a$b(null);
       a.B = a$a.b;
    }
    public void a(){
       super();
       this.A = new a$c(this);
    }
    public void E8(){
       a tt;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       this.t = new MutableLiveData();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          d uod = new d();
          uod.mFeatureId = 1045;
          uod.mIsVisible = Boolean.FALSE;
          uod.mIconRes = 0x7f08112d;
          uod.mClickCallback = new b(uod, this);
          this.u = uod;
          tt = this.t;
          if (tt != null) {
             tt.setValue(uod);
          }
       }
       a tp = this.p;
       if (tp == null) {
          a.S("bottomBarService");
       }
       tt = this.t;
       a.m(tt);
       tp.v1(tt);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          tp = this.r;
          if (tp == null) {
             a.S("statusObtainService");
          }
          this.X7(tp.W().subscribe(new c(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          uoa = this.s;
          if (uoa == null) {
             a.S("longConnectManager");
          }
          uoa.u().u0(1082, SCLiveMiniProgramAudienceBottomEntrance.class, this.A);
       }
       return;
    }
    public void J8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "6")) {
          uoa = this.s;
          if (uoa == null) {
             a.S("longConnectManager");
          }
          uoa.u().o(1082, this.A);
       }
       uoa = this.p;
       if (uoa == null) {
          a.S("bottomBarService");
       }
       uoa.O0(1045);
       this.t = null;
       this.v = false;
       return;
    }
    public final String P8(){
       String obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SimpleDateFormat("yyyy.MM.dd").format(new Date(System.currentTimeMillis()));
       a.o(obj, "simpleDateFormat.format\(date\)");
       return obj;
    }
    public final void R8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "8")) {
          return;
       }
       c b = a.B;
       b.Z(b, "toggle bottomBarVisibility: "+p0);
       a tu = this.u;
       if (tu != null && (a.g(tu.mIsVisible, Boolean.valueOf(p0)) ^ 1)) {
          tu.mIsVisible = Boolean.valueOf(p0);
          tu.mLottieAnimation = this.x;
          String str = null;
          if (p0) {
             String obj = PatchProxy.apply(null, this, uoa, "10");
             if (obj != PatchProxyResult.class) {
                obj = obj.booleanValue();
             }else {
                obj = a.a.getString("live_interactive_function_animate_last_occur_date", "");
                obj = (obj == null || !TextUtils.n(this.P8(), obj))? true: false;
             }
             if (obj) {
                obj = this.P8();
                if (!PatchProxy.applyVoidOneRefs(obj, this, uoa, "11")) {
                   SharedPreferences$Editor uEditor = a.a.edit();
                   uEditor.putString("live_interactive_function_animate_last_occur_date", obj);
                   g.a(uEditor);
                }
                b.Z(b, "show animation on "+obj);
                tu.mEnableBreathAnimator = true;
             label_00aa :
                a tt = this.t;
                if (tt != null) {
                   tt.setValue(tu);
                }
             }
          }
          tu.mEnableBreathAnimator = str;
          goto label_00aa ;
       }
    label_00b1 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       c obj = this.r8("LIVE_ROUTER_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_ROUTER_SERVICE\)");
       this.q = obj;
       obj = oi.a(c.class);
       a.o(obj, "serviceManager.getServic¡­omBarService::class.java\)");
       this.p = obj;
       obj = oi.a(b.class);
       a.o(obj, "serviceManager.getServic¡­btainService::class.java\)");
       this.r = obj;
       c uoc = oi.a(a.class);
       a.o(uoc, "serviceManager.getServic¡­nnectManager::class.java\)");
       this.s = uoc;
       return;
    }
}
