package lg9.d;
import om6.p;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import lnc.n4;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import android.text.TextUtils;
import brd.t;
import ve9.a;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import lnc.s6;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import om6.q$a;
import oa0.a;
import lnc.o5;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import java.lang.Runnable;
import java.lang.Boolean;
import ye9.j;
import java.util.Map;
import ye9.i;
import ekd.k1;
import ce9.r;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import com.yxcorp.gifshow.camera.record.magic.f;
import io.reactivex.g;
import java.lang.Long;
import e4b.a;
import e4b.c;

public class d implements p	// class@002de2
{

    public void d(){
       super();
    }
    public String AS(Intent p0){
       MagicEmoji$MagicFace obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n4.i(p0);
       if (obj != null) {
          return obj.mId;
       }
       String str = n4.j(p0);
       if (!TextUtils.isEmpty(str)) {
          return str;
       }
       return n4.g(p0);
    }
    public t LR(String p0,String p1){
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "id");
          a.p(p1, "taskId");
          t ot = t.just(new ArrayList());
          int i = s6.v();
          Object[] objArray = new Object[0];
          b.D().w("MagicFaceMockCardRecoModel", "loadMagicRecoInfo start with type "+i, objArray);
          switch (i){
              case 0:
                a.o(ot, "emptyObservable");
             label_0083 :
                obj = ot;
                break;
              case 1:
                ot1 = a.a.b(3, p0, p1);
             label_007e :
                obj = ot1;
                break;
              case 2:
                ot1 = a.a.a(3, p0, p1);
                goto label_007e ;
                break;
              case 3:
                ot1 = a.a.b(1, p0, p1);
                goto label_007e ;
                break;
              case 4:
                ot1 = a.a.a(1, p0, p1);
                goto label_007e ;
                break;
              case 5:
              case 7:
              case 8:
              case 9:
              case 6:
                ot1 = a.a.b(1, p0, p1);
                goto label_007e ;
                break;
              default:
                a.o(ot, "emptyObservable");
                goto label_0083 ;
          }
       }
       return obj;
    }
    public q$a WJ(){
       q$a obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new q$a();
       obj.a = o5.c(a.D0());
       obj.b = a.e();
       obj.c = o5.c(a.Z());
       obj.d = a.a0();
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
    public String oo(Intent p0){
       MagicEmoji$MagicFace obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n4.i(p0);
       if (obj != null) {
          return obj.mChildId;
       }
       String str = n4.h(p0);
       if (!TextUtils.isEmpty(str)) {
          return str;
       }
       return n4.f(p0);
    }
    public t uw(GifshowActivity p0,SimpleMagicFace p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y00(p0, p1, "");
    }
    public boolean xD(Activity p0,String p1,Runnable p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, j.class, "9");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          Map map = j.e(p1);
          if (map == null || map.isEmpty()) {
             b = false;
          }else {
             k1.o(new i(map, p0, p1, p2));
             b = true;
          }
       }
       return b;
    }
    public t y00(GifshowActivity p0,SimpleMagicFace p1,String p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, r.class, "1");
       if (obj != patchProxyRe) {
       }else if(p1 == null){
          obj = null;
       }else {
          obj = t.create(new f(p0, p1, p2));
       }
       return obj;
    }
    public t yF(long p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uod, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.a().j(p0);
    }
}
