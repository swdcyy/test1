package kd9.a;
import kd9.n0;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import kd9.a$a;
import java.lang.Enum;
import com.yxcorp.gifshow.camera.record.frame.o;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.frame.m;
import java.lang.String;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import j8c.a;
import java.lang.Object;
import q87.c;
import tkd.b;
import tkd.d;
import os5.g;
import tm6.b;
import um6.f;
import kd9.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import android.view.View;
import com.kwai.gifshow.post.api.core.model.TakePictureType;

public class a extends d implements n0	// class@002c46
{
    public b n;

    public void a(CameraPageType p0,b p1,CameraFramePageType p2){
       Object[] objArray;
       super(p0, p1);
       switch (a$a.a[p2.ordinal()]){
           case 1:
             this.n = d.a(0x6d6c0f8b).WB(this.e, p1);
             break;
           case 2:
             String str = "live_anchor_plugin";
             int i = 0;
             if (g.e(str) || Dva.instance().isLoaded(str)) {
                objArray = new Object[i];
                a.D().w("BottomFrameController", "isSourceMode, or isPluginMode but loaded", objArray);
                this.n = d.a(0x3652a147).NO(this.e);
             }else {
                objArray = new Object[i];
                a.D().w("BottomFrameController", "isPluginMode, not loaded", objArray);
             }
             break;
           case 3:
           case 5:
           case 6:
           case 4:
             this.n = new m(this.e, p1);
             break;
           case 7:
           case 9:
           case 8:
             this.n = new o(this.e, p1);
             break;
           default:
       }
       return;
    }
    public void N6(int p0,int p1){
       m0.e(this, p0, p1);
    }
    public void Rf(int p0,int p1){
       m0.a(this, p0, p1);
    }
    public void Ya(boolean p0){
       m0.b(this, p0);
    }
    public void f7(int p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uoa, "3")) {
          return;
       }
       uoa = this.n;
       if (uoa != null) {
          uoa.b(p0, p1);
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.k(p0);
       a tn = this.n;
       if (tn != null) {
          tn.a();
       }
       return;
    }
    public void mb(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.n;
       if (uoa != null) {
          uoa.c(p0);
       }
       return;
    }
    public void v1(TakePictureType p0){
       m0.d(this, p0);
    }
}
