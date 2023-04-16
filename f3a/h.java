package f3a.h;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import psb.c;
import psb.b;
import cjd.e;
import erd.o;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.detail.ocrtext.OcrResponse;
import la6.b;
import java.lang.CharSequence;
import e17.i;

public final class h extends f	// class@002282
{
    public final String p;

    public void h(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       t obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a().z(this.p).map(new e());
       a.o(obj, "DetailApiService.getInst¡­ .map\(ResponseFunction\(\)\)");
       return obj;
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(OcrResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
          return;
       }
       if (p0 != null) {
          String mEmptyMsg = p0.getMEmptyMsg();
          if (mEmptyMsg != null) {
             int i = (mEmptyMsg.length() > 0)? 1: 0;
             if (i) {
                i.d(R.style.arg_RES_7f11066a, mEmptyMsg);
             }
          }
       }
       super.d2(p0, p1);
       return;
    }
}
