package dg9.a;
import android.view.View$OnClickListener;
import dg9.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import com.yxcorp.gifshow.camera.record.base.b;
import oc9.d0;
import e17.i;
import oc9.w;
import qi9.c;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraLogger;

public final class a implements View$OnClickListener	// class@001f2d
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       int i;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "7")) {
       }else if(!tb.p.isEnabled()){
          StabilityType stabilityTyp = tb.d.c(StabilityType.class);
          if (stabilityTyp != null && (stabilityTyp.shouldDisableFlash() && tb.f2())) {
             i.a(R.style.arg_RES_7f11066a, 0x7f104edf);
          }else if(tb.q != null){
             i.a(R.style.arg_RES_7f11066a, 0x7f104eec);
          }else if(tb.d.b().E9().a != null){
             i.a(R.style.arg_RES_7f11066a, 0x7f1040e2);
          }else {
             i.a(R.style.arg_RES_7f11066a, 0x7f1040e1);
          }
       }else {
          i = tb.p.isSelected() ^ 0x01;
          tb.g2(i);
          String str = (i)? "on": "false";
          CameraLogger.n(1, 1, "flash_light", null, str, tb.e);
       }
       return;
    }
}
