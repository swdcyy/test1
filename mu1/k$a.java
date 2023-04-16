package mu1.k$a;
import mu1.i$a;
import mu1.k;
import java.lang.String;
import ya1.n0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import k2b.e0;
import mu1.g;
import mu1.i;
import com.kwai.robust.PatchProxyResult;

public class k$a extends i$a	// class@003225
{
    public final k b;

    public void k$a(k p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void a(boolean p0,n0 p1){
       boolean b;
       k$a uoa = k$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, str)) {
          return;
       }
       uoa = this.b;
       Objects.requireNonNull(uoa);
       k ok = k.class;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, uoa, ok, str)) {
          if (!p0) {
             Boolean fALSE = Boolean.FALSE;
             uoa.e.setValue(fALSE);
             uoa.f.setValue(fALSE);
          }else {
             Object[] objArray = null;
             if (p1 == null) {
                Boolean fALSE1 = Boolean.FALSE;
                uoa.f.setValue(fALSE1);
                if (uoa.i != null && uoa.j != null) {
                   if (!uoa.e.getValue().booleanValue() && !PatchProxy.applyVoid(objArray, uoa, ok, "3")) {
                      long l = uoa.w0(uoa.g);
                      if (uoa.v0(uoa.i, l)) {
                         uoa.c.c(l, uoa.d.c(), uoa.j, fALSE1);
                      }
                   }
                   uoa.e.setValue(Boolean.TRUE);
                }else {
                   uoa.e.setValue(fALSE1);
                }
             }else {
                k h = uoa.h;
                Object obj = PatchProxy.applyTwoRefs(h, p1, uoa, ok, "2");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(h == null || h.a() != p1.a()){
                   b = true;
                }else {
                   b = false;
                }
                if (b && !PatchProxy.applyVoid(objArray, uoa, ok, "5")) {
                   long l1 = uoa.w0(uoa.g);
                   if (uoa.v0(uoa.i, l1)) {
                      uoa.c.c(l1, uoa.d.c(), uoa.j, Boolean.TRUE);
                   }
                }
                uoa.f.setValue(Boolean.TRUE);
                uoa.e.setValue(Boolean.FALSE);
             }
             uoa.a.setValue(p1);
             uoa.h = p1;
          }
       }
       return;
    }
}
