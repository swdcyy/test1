package com.yxcorp.gifshow.camera.record.photo.r;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import zb9.q;
import hg9.g1;
import java.lang.Class;
import erd.g;
import crd.b;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.KeyEvent;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camera.record.CameraLogger$VideoRecStartType;

public class r extends d0	// class@000efb
{
    public View o;
    public boolean p;

    public void r(CameraPageType p0,b p1){
       super(p0, p1);
       this.p = false;
       this.d.l(q.class, new g1(this));
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       super.k(p0);
       this.o = p0.findViewById(0x7f0a3d49);
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, or, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != 24 && (p0 == 25 && (!this.f2() && (!p1.getRepeatCount() && this.o.isEnabled())))) {
          d th = this.h;
          if (th == null || (th.R() && this.p == null)) {
             this.o.setTag(CameraLogger$VideoRecStartType.VolumeRecord);
             this.o.performClick();
             return true;
          }
       }
    label_0057 :
       return false;
    }
}
