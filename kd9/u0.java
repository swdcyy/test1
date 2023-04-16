package kd9.u0;
import kd9.n0;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import kd9.u0$a;
import java.lang.Enum;
import kd9.t0;
import android.app.Activity;
import kd9.p0;
import java.lang.String;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import j8c.a;
import java.lang.Object;
import q87.c;
import tkd.b;
import tkd.d;
import os5.g;
import tm6.d;
import um6.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import kd9.m0;
import com.kwai.gifshow.post.api.core.model.TakePictureType;

public class u0 extends d implements n0	// class@002c6e
{
    public d n;

    public void u0(CameraPageType p0,b p1,CameraFramePageType p2){
       Object[] objArray;
       super(p0, p1);
       switch (u0$a.a[p2.ordinal()]){
           case 1:
             d uod = d.a(0x6d6c0f8b).Yk(this.e);
             this.n = uod;
             if (uod != null) {
                uod.b(true);
             }
             break;
           case 2:
             String str = "live_anchor_plugin";
             int i = 0;
             if (g.e(str) || Dva.instance().isLoaded(str)) {
                objArray = new Object[i];
                a.D().w("TopFrameController", "isSourceMode, or isPluginMode but loaded", objArray);
                this.n = d.a(0x3652a147).yL(this.e);
             }else {
                objArray = new Object[i];
                a.D().w("TopFrameController", "isPluginMode, not loaded", objArray);
             }
             break;
           case 3:
           case 5:
           case 6:
           case 4:
             this.n = new p0(this.e);
             break;
           case 7:
           case 9:
           case 8:
             this.n = new t0(this.e);
             break;
           default:
       }
       return;
    }
    public void N6(int p0,int p1){
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ou0, "3")) {
          return;
       }
       ou0 = this.n;
       if (ou0 != null) {
          ou0.d(p0, p1);
       }
       return;
    }
    public void Rf(int p0,int p1){
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ou0, "2")) {
          return;
       }
       ou0 = this.n;
       if (ou0 != null && ou0.c()) {
          this.n.e(p0, p1);
       }
       return;
    }
    public void Ya(boolean p0){
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou0, "4")) {
          return;
       }
       ou0 = this.n;
       if (ou0 != null) {
          ou0.b(p0);
       }
       return;
    }
    public void f7(int p0,long p1){
       m0.c(this, p0, p1);
    }
    public void mb(int p0){
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ou0, "1")) {
          return;
       }
       ou0 = this.n;
       if (ou0 != null) {
          ou0.a(p0);
       }
       return;
    }
    public void v1(TakePictureType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u0.class, "5")) {
          return;
       }
       u0 tn = this.n;
       if (tn != null) {
          tn.v1(p0);
       }
       return;
    }
}
