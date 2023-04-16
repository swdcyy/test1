package com.yxcorp.gifshow.camera.record.intelligentidentify.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qd9.e;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.library.widget.popup.common.c;

public class a	// class@000e00
{
    public a a;

    public void a(){
       super();
    }
    public void a(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          if (p0) {
             k1.r(new e(uoa), 0);
          }else {
             uoa.a();
          }
          this.a = null;
       }
       return;
    }
    public void b(a$b p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       a$b b = p0.b;
       Object obj = PatchProxy.applyOneRefs(b, this, uoa, "3");
       int i = 0;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          uoa = this.a;
          b1 = (uoa == null)? false: TextUtils.n(uoa.b(), b);
       }
       if (b1) {
          return;
       }else {
          uoa = this.a;
          if (uoa != null) {
             uoa.a();
          }
          Object[] objArray = null;
          uoa = PatchProxy.apply(objArray, p0, a$b.class, "1");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new a(p0);
          }
          this.a = uoa;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(objArray, uoa, a.class, "1") && uoa.c != null) {
             objArray = new Object[i];
             a.D().s("IdentifyToast", "show "+uoa.b(), objArray);
             uoa.c.Z();
          }
          return;
       }
    }
}
