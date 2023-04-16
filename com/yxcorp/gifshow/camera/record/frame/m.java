package com.yxcorp.gifshow.camera.record.frame.m;
import tm6.b;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import tm6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import j8c.a;
import q87.c;
import android.view.View;
import android.widget.ImageView;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import sm6.b;
import kd9.o0;
import java.lang.Runnable;
import sh9.c;

public class m implements b	// class@000deb
{
    public final Activity a;
    public final b b;
    public boolean c;
    public int d;

    public void m(Activity p0,b p1){
       super();
       this.c = true;
       this.d = 0;
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       this.c = true;
    }
    public void b(int p0,long p1){
       a.b(this, p0, p1);
    }
    public void c(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("PhotoBottomAreaImpl", "handleBottomArea", objArray);
       View view = this.a.findViewById(R.id.action_bar_layout);
       View view1 = this.a.findViewById(R.id.capture_finish_action_bar);
       View view2 = this.a.findViewById(R.id.shoot_cover_tips_tv);
       ImageView imageView = this.a.findViewById(R.id.cover_image_view);
       View view3 = this.a.findViewById(R.id.capture_finish_layout);
       AnimCameraView uAnimCameraV = this.b.b().z7();
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "2");
          if (obj != PatchProxyResult.class) {
             p0 = obj.intValue();
          }else if(p0 == 1){
             p0 = b.r(this.a);
          }else {
             p0 = b.q(this.a);
          }
       }else {
          goto label_0077 ;
       }
       int i = (this.c != null)? p0: p0 - this.d;
       this.d = p0;
       this.c = false;
       b.a(view, i);
       if (view1 != null) {
          b.a(view1, i);
       }
       if (view2 != null) {
          b.a(view2, i);
       }
       if (imageView != null && (view3 != null && uAnimCameraV != null)) {
          uAnimCameraV.post(new o0(imageView, uAnimCameraV, view3));
       }
    label_00b0 :
       c.f2(this.a);
       return;
    }
}
