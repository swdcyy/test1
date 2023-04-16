package kd9.a0;
import u07.u;
import com.yxcorp.gifshow.camera.record.base.b;
import k2b.e0;
import java.lang.Object;
import u07.t;
import android.view.View;
import kd9.b0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class a0 implements u	// class@002c45
{
    public final boolean b;
    public final b c;
    public final e0 d;

    public void a0(boolean p0,b p1,e0 p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       a0 tb = this.b;
       a0 tc = this.c;
       a0 td = this.d;
       if (!PatchProxy.isSupport(b0.class) || !PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(tb), tc, td, null, b0.class, "5")) {
          if (tb != null) {
             b0.e0(p0, tc, td);
          }else {
             b0.f0(p0, td);
          }
       }
       return;
    }
}
