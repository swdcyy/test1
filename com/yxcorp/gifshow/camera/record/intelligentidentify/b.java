package com.yxcorp.gifshow.camera.record.intelligentidentify.b;
import sd9.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import qd9.g;
import qi9.u1;
import com.yxcorp.gifshow.camerasdk.q;
import td9.a;
import com.kwai.robust.PatchProxyResult;
import lnc.l8;
import java.util.Objects;
import fg6.a;
import com.google.gson.Gson;

public class b	// class@000e01
{
    public boolean a;
    public q b;
    public c c;

    public void b(c p0){
       super();
       this.c = p0;
    }
    public void a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.b != null && this.a != p0) {
          Object[] objArray = new Object[0];
          a.D().w("IntelligentIdentifySdkHelper", "enable sdk "+this.a+" -> "+p0, objArray);
          this.a = p0;
          Object[] objArray1 = null;
          if (p0) {
             this.b.K0(new g(this));
             b tb = this.b;
             String str = PatchProxy.apply(objArray1, objArray1, a.class, "1");
             if (str != PatchProxyResult.class) {
             }else {
                a uoa = new a();
                uoa.mEnablePosInfo = 0;
                uoa.mEnableQualityOut = 0;
                Objects.requireNonNull(l8.f);
                String d = l8.d;
                if (d == null) {
                   d = "";
                }
                uoa.mExtParams = d;
                str = a.a.q(uoa);
             }
             tb.Y0(str);
          }else {
             this.b.K0(objArray1);
             this.b.c1();
          }
       }
       return;
    }
    public c b(){
       return this.c;
    }
    public void c(q p0){
       this.b = p0;
    }
}
