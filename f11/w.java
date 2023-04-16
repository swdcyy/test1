package f11.w;
import im8.g;
import k51.c;
import f11.s;
import f11.w$a;
import f11.w$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import brd.t;
import ry1.b;
import f11.v;
import erd.o;
import f11.u;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f11.w$c;
import f11.y;
import iq5.b;
import iq5.a;
import com.kuaishou.live.common.core.component.like.count.b;
import f11.r;
import f11.x;
import ok.x;
import com.kuaishou.live.common.core.component.like.count.b$b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import f11.w$d;
import android.view.View$OnTouchListener;
import android.opengl.GLSurfaceView;
import f11.z;
import ds5.c;
import ds5.a;
import f11.t;
import vq5.b;
import vq5.d;
import android.view.MotionEvent;
import java.lang.Boolean;
import z12.e;
import j47.a;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import va1.d0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import lo1.c;
import tj3.k;
import tj3.e;
import tj3.r;
import tj3.i;
import ho1.j;
import android.net.Uri;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import f11.c0;
import java.util.Map;
import java.util.HashMap;
import lp3.e;

public class w extends c implements g	// class@00228a
{
    public b A;
    public final c B;
    public final c p;
    public LivePlayGLSurfaceView q;
    public a0 r;
    public e s;
    public j t;
    public long u;
    public e v;
    public boolean w;
    public a x;
    public b y;
    public GestureDetector$SimpleOnGestureListener z;
    public static String sLivePresenterClassName = "LiveAudienceLikePresenter";

    public void w(){
       super();
       this.p = s.b;
       this.w = false;
       this.x = new w$a(this);
       this.B = new w$b(this);
    }
    public void E8(){
       w ow = w.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow, "3")) {
          return;
       }
       this.X7(this.r.b3.T3().map(v.b).subscribe(new u(this)));
       if (!PatchProxy.applyVoid(objArray, this, ow, "9")) {
          y oy = new y(this, new w$c(this, objArray));
          this.A = oy;
          a0 u1 = this.r.u1;
          if (u1 != null) {
             u1.b(oy);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ow, "7")) {
          b uob = new b(1, new r(this), new x(this));
          this.y = uob;
          w tr = this.r;
          if (tr != null) {
             uob.d(tr.c);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ow, "10")) {
          this.q.setOnTouchListener(new w$d(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, ow, "11")) {
          this.z = new z(this);
       }
       this.r.J.gd(this.B);
       this.r.p2.t5("likeanchor", new t(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, w.class, "4")) {
          return;
       }
       w ty = this.y;
       if (ty != null) {
          ty.c();
       }
       ty = this.r;
       ty.V = objArray;
       a0 u1 = ty.u1;
       if (u1 != null) {
          u1.c(this.A);
       }
       this.r.J.fo(this.B);
       this.q.setOnTouchListener(objArray);
       this.r.p2.Z4("likeanchor");
       return;
    }
    public void P8(MotionEvent p0,boolean p1){
       String[] stringArray1;
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ow, "8")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       String str = "LiveAudienceLikePresenter";
       e.c(str, "doLike", stringArray);
       if (this.r.E1.uk()) {
          stringArray1 = new String[i];
          e.c(str, "screen locked£¬return", stringArray1);
          return;
       }else if(!QCurrentUser.me().isLogined()){
          stringArray1 = new String[i];
          e.c(str, "need login£¬return", stringArray1);
          y.a(this.getContext(), d0.a(this.r.c), "live_like", 39, a.a().a().getString(R.string.arg_RES_7f103079), this.r.c.mEntity, null, null, null);
          return;
       }else if(this.w != null){
          return;
       }else {
          this.y.b();
          if (p1) {
             this.r.T1.c(p0, i);
          }
          this.s.x().b();
          this.s.h().b();
          this.t.d(1);
          return;
       }
    }
    public final float R8(Uri p0,String p1,float p2){
       if (PatchProxy.isSupport(w.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), this, w.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       try{
          p2 = Float.parseFloat(p0.getQueryParameter(p1));
       }catch(java.lang.Exception e0){
          b.B(LiveLogTag.LIVE_LIKE, "parse float from param like animate point"+p1);
       }
       return p2;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2885);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, w.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(w.class, new c0());
       }else {
          obj.put(w.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.r = this.q8(a0.class);
       this.s = this.r8("LIVE_LOG_REPORTER");
       this.t = this.q8(j.class);
       this.v = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
