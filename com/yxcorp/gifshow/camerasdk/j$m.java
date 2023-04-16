package com.yxcorp.gifshow.camerasdk.j$m;
import ui9.b;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qi9.q1;
import java.util.Objects;
import q87.c;
import qi9.c;
import com.yxcorp.gifshow.camerasdk.j$f;
import com.kwai.video.westeros.models.CameraFacing;
import java.lang.Enum;
import ui9.f;
import ui9.j;
import ui9.f$d;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ui9.a;

public class j$m implements b	// class@001026
{
    public final b b;
    public final j c;

    public void j$m(j p0,b p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(j$m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, j$m.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().D("CameraSDK", "[magicface][keypath][effect] ", "onBeforeEffectDescriptionUpdated", objArray);
       j$m tc = this.c;
       if (tc.r != null && tc.z == null) {
          if (p0 != null) {
             tc.J0 = p0.getRequirePreviewLayerRender();
          }else {
             p0.J0 = i;
          }
          j$m tc1 = this.c;
          tc1.h1(tc1.f0, tc1.g0);
       }
       return;
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       Object[] objArray;
       Object[] objArray2;
       j oj = j.class;
       if (PatchProxy.isSupport(j$m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, j$m.class, "2")) {
          return;
       }
       j$m tc = this.c;
       if (tc.r != null && tc.z == null) {
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(p0, tc, oj, "37")) {
             if (p0 == null || !p0.getNeedSubFrame()) {
                objArray2 = new Object[0];
                q1.C().s("CameraSDK", "close sub camera.", objArray2);
                tc.closeSubCamera();
             }else {
                objArray2 = new Object[0];
                q1.C().s("CameraSDK", "open sub camera.", objArray2);
                tc.openSubCamera();
             }
          }
          tc = this.c;
          Objects.requireNonNull(tc);
          String str = 1;
          if (!PatchProxy.applyVoidOneRefs(p0, tc, oj, "36")) {
             boolean b = (p0 == null || (!p0.getEnableVideoStabilization() || tc.G.k0 != null))? true: false;
             tc.N = b;
             tc.setDisableStabilization(b);
          }
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(p0, tc, oj, "38")) {
             if (tc.V()) {
                objArray = new Object[0];
                q1.C().s("CameraSDK", "user uvc camera can not  switch camera", objArray);
             }else if(tc.F0 == null && p0 != null){
                int i = j$f.a[p0.getCameraFacing().ordinal()];
                if (i != 2) {
                   if (i == 3) {
                      tc.switchCamera(str);
                   }
                }else {
                   tc.switchCamera(0);
                }
             }
          }
          objArray = new Object[0];
          q1.C().D("CameraSDK", "[magicface][keypath][effect] ", "onEffectDescriptionUpdated", objArray);
          SimpleMagicFace mId = (this.c.r.O0().a != null && this.c.r.O0().a.a != null)? this.c.r.O0().a.a.mId: null;
          if (this.c.S != null && (this.c.S.a != null && (this.c.S.a.a == null || !TextUtils.n(mId, this.c.S.a.a.mId)))) {
             this.c.S = null;
             this.b.X0(p0, p1, p2, p3);
          }else {
             p2.S = null;
             this.b.h(p0, p1);
             Object[] objArray1 = new Object[0];
             q1.C().w("CameraSDK", "skip restore magic update call back", objArray1);
          }
       }
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$m.class, "4")) {
          return;
       }
       j$m tc = this.c;
       if (tc.r != null && tc.z == null) {
          tc = this.c;
          tc.J0 = false;
          tc.h1(tc.f0, tc.g0);
          Object[] objArray = new Object[false];
          q1.C().D("CameraSDK", "[magicface][keypath][effect] ", "onEffectDescriptionUpdatedOnCancel", objArray);
          this.b.onEffectDescriptionUpdatedOnCancel(p0, p1, p2);
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$m.class, "3")) {
          return;
       }
       j$m tc = this.c;
       if (tc.r != null && tc.z == null) {
          Object[] objArray = new Object[0];
          q1.C().D("CameraSDK", "[magicface][keypath][effect] ", "onEffectDescriptionUpdatedOnError", objArray);
          this.b.onEffectDescriptionUpdatedOnError(p0, p1, p2);
       }
       return;
    }
}
