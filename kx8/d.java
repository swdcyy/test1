package kx8.d;
import cta.c;
import com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew;
import java.lang.Object;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Status;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import hsa.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import isa.a;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fw8.d;

public final class d implements c	// class@002c3a
{
    public final OperateLazyLoadFragmentContainerNew a;

    public void d(OperateLazyLoadFragmentContainerNew p0){
       this.a = p0;
    }
    public final void a(DynamicTabConfig p0,DynamicTabConfig$Status p1){
       boolean b;
       Object[] objArray1;
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, ta, OperateLazyLoadFragmentContainerNew.class, "2")) {
       }else {
          Object[] objArray = new Object[0];
          b.C().w("OperateLazyLoadFragmentContainer", "updateActivityConfig "+p1, objArray);
          if (p1 == DynamicTabConfig$Status.CHANGE) {
             f uof = new f(p0);
             objArray = new Object[0];
             b.C().w("OperateLazyLoadFragmentContainer", "updateActivityConfig: activityId "+uof.m()+", type "+uof.i(), objArray);
             p0 = PatchProxy.applyOneRefs(uof, ta, OperateLazyLoadFragmentContainerNew.class, "11");
             if (p0 != PatchProxyResult.class) {
                b = p0.booleanValue();
             }else {
                objArray = new Object[0];
                b.C().w("OperateLazyLoadFragmentContainer", "needReplaceFragmentIfNeed last: "+ta.t+", "+ta.v+", "+ta.u.c()+"; current: "+uof.i()+", "+uof.c(), objArray);
                StringBuilder str = 2;
                if (uof.i() == str || (ta.t == uof.i() && ta.v instanceof OperateWebViewFragment)) {
                   if (uof.i() == str) {
                      OperateLazyLoadFragmentContainerNew u = ta.u;
                      if (u != null && TextUtils.n(u.c(), uof.c())) {
                      }
                   }else if(uof.k() != ta.u.k() && d.b()){
                      objArray1 = new Object[0];
                      b.C().w("OperateLazyLoadFragmentContainer", "bottomAlpha change", objArray1);
                   }else {
                      b = false;
                   }
                }
             label_010b :
                b = true;
             }
             if (b) {
                objArray1 = new Object[0];
                b.C().w("OperateLazyLoadFragmentContainer", "need replace fragment  "+p1, objArray1);
                ta.t = uof.i();
                ta.u = uof;
                ta.ph(uof);
             }else {
                objArray1 = new Object[0];
                b.C().w("OperateLazyLoadFragmentContainer", "no need replace fragment "+p1, objArray1);
                ta.t = uof.i();
                ta.u = uof;
             }
             ta.sh();
             if (d.b()) {
                ta.qh();
             }
          }
       }
       return;
    }
}
