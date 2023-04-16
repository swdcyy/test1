package com.yxcorp.gifshow.camera.record.lensdirty.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import com.kwai.camerasdk.videoCapture.CameraController;
import j8c.a;
import q87.c;
import zd9.f;
import com.yxcorp.gifshow.camerasdk.q;
import zd9.g;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensInfo;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import wc9.v;
import com.yxcorp.gifshow.camera.record.base.b;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import zd9.b;
import io.reactivex.i;
import brd.a0;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import zd9.d;
import com.yxcorp.gifshow.camera.record.lensdirty.e;
import erd.g;
import crd.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class b implements Runnable	// class@000e15
{
    public final DirtyLensController b;
    public final boolean c;
    public final float d;

    public void b(DirtyLensController p0,boolean p1,float p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       Object[] objArray;
       boolean b1;
       Object[] objArray1;
       boolean b2;
       ClientEvent$ElementPackage uElementPack;
       CharSequence uCharSequenc;
       b uob = this;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       Objects.requireNonNull(b);
       if (!PatchProxy.isSupport(DirtyLensController.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(c), Float.valueOf(d), b, DirtyLensController.class, "8")) {
          if (b.h != null) {
             d f = b.f;
             if (f != null && !f.isDetached()) {
                b.i2(0);
                DirtyLensController r = b.r;
                if (b.h.isFrontCamera() != r) {
                   objArray = new Object[0];
                   a.D().y("DirtyLensController", "User switched front and back cameras", objArray);
                }else {
                   DirtyLensController y = b.y;
                   y.c = r;
                   y.b = c;
                   y.a = d;
                   b.h.i0(y.toString());
                   if (b.f2()) {
                      b1 = b.h.isFrontCamera();
                      if (!PatchProxy.isSupport(DirtyLensController.class) || (!PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b1), Boolean.valueOf(c), Float.valueOf(d), b, DirtyLensController.class, "10") && b.f != null)) {
                         y = (b1)? b.w: b.x;
                         g.a(0, c, d, b1, y);
                         if (c != null) {
                            if (!PatchProxy.applyVoid(null, b, DirtyLensController.class, "15")) {
                               if (b.p == null) {
                                  b.p = new DirtyLensInfo();
                               }
                               b.p.addCurrentDetectTimes();
                               b.h2(b.p);
                            }
                            objArray1 = new Object[0];
                            a.D().y("DirtyLensController", "The lens is dirty  after the second test, isFrontCamera: "+b1, objArray1);
                         }else {
                            objArray1 = new Object[0];
                            a.D().y("DirtyLensController", "The lens is clean after the second test, isFrontCamera: "+b1, objArray1);
                         }
                      }
                   }else {
                      b1 = b.h.isFrontCamera();
                      if (!PatchProxy.isSupport(DirtyLensController.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b1), Boolean.valueOf(c), Float.valueOf(d), b, DirtyLensController.class, "9")) {
                         if (b.q == null) {
                            String obj = PatchProxy.apply(null, b, DirtyLensController.class, "13");
                            if (obj != PatchProxyResult.class) {
                               b2 = obj.booleanValue();
                            }else if(b.f == null){
                               b2 = false;
                            }else {
                               b2 = b.d.d(v.e).b;
                            }
                            if (b2 == null) {
                               if (b1) {
                                  b.w = d;
                                  obj = a1.p(R.string.arg_RES_7f100a4c);
                               }else {
                                  b.x = d;
                                  obj = a1.p(R.string.arg_RES_7f100a4b);
                               }
                               boolean b3 = true;
                               g.a(b3, c, d, b1, d);
                               if (!PatchProxy.applyVoid(null, b, DirtyLensController.class, "29")) {
                                  d h = b.h;
                                  if (h != null) {
                                     b.n = (h.isFrontCamera())? b3: b3;
                                  }
                               }
                               if (c != null) {
                                  i.e(R.style.arg_RES_7f11066a, obj, 3000);
                                  if (!PatchProxy.isSupport(DirtyLensController.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), b, DirtyLensController.class, "12") && b.f != null)) {
                                     b.Y1(a0.k(new b(b1)).l(5000, TimeUnit.MILLISECONDS).T(d.c).G(d.a).R(new d(b), e.b));
                                  }
                                  if (!PatchProxy.applyVoid(null, b, DirtyLensController.class, "14")) {
                                     if (b.p == null) {
                                        b.p = new DirtyLensInfo();
                                     }
                                     b.p.setLastDetectionDaysByCurrentTime();
                                     b.h2(b.p);
                                  }
                                  g og = g.class;
                                  if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidThreeRefs(Boolean.TRUE, Float.valueOf(d), Boolean.valueOf(b1), null, g.class, "1")) {
                                     try{
                                        uElementPack = new ClientEvent$ElementPackage();
                                        uElementPack.action2 = "PRODUCE_DIRT_DETECT";
                                        uElementPack.name = "‘‡Œ€ºÏ≤‚";
                                        if (PatchProxy.isSupport(og)) {
                                           obj = PatchProxy.applyThreeRefs(Boolean.TRUE, Float.valueOf(d), Boolean.valueOf(b1), null, g.class, "3");
                                           if (obj != PatchProxyResult.class) {
                                           }else {
                                              JSONObject jSONObject = new JSONObject();
                                              jSONObject.put("dirt", (double)d);
                                              jSONObject.put("is_dirty", b3);
                                              String str = "camera_direction";
                                              if (b1) {
                                                 jSONObject.put(str, "front");
                                              }else {
                                                 jSONObject.put(str, "back");
                                              }
                                              uCharSequenc = jSONObject.toString();
                                           }
                                        }else {
                                           goto label_022f ;
                                        }
                                     }catch(org.json.JSONException e0){
                                        uCharSequenc = null;
                                     }
                                     if (!TextUtils.isEmpty(obj)) {
                                        uElementPack.params = obj;
                                     }
                                     u1.u0(6, uElementPack, null);
                                  }
                                  objArray1 = new Object[0];
                                  a.D().y("DirtyLensController", "The lens is dirty after the first test, isFrontCamera: "+b1, objArray1);
                               }else {
                                  objArray1 = new Object[0];
                                  a.D().y("DirtyLensController", "The lens is clean after the first test, isFrontCamera: "+b1, objArray1);
                               }
                            }
                         }
                         objArray = new Object[0];
                         a.D().y("DirtyLensController", "Counting down or shooting started", objArray);
                      }
                   }
                }
             }
          }
          objArray = new Object[0];
          a.D().y("DirtyLensController", "Fragment is null or detached", objArray);
       }
    label_02ad :
       return;
    }
}
