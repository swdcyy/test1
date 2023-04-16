package dg1.b;
import dg1.a;
import lp3.a;
import g03.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.effect.resource.download.common.e;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.List;
import java.lang.Integer;
import c03.l;
import cp1.c;
import tz2.a;
import cp1.c$a;
import e03.a;
import iy2.b;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.io.File;

public final class b extends a implements a	// class@001f93
{

    public void b(){
       super();
    }
    public a Bl(){
       a obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.b().Bl();
       a.o(obj, "LiveEffectResourceLoader¡­eEffectResourceProvider\(\)");
       return obj;
    }
    public long C1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.b().C1(p0);
    }
    public void Go(List p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "7")) {
          return;
       }
       a.p(p0, "renderRequests");
       e.b().Go(p0, p1);
       return;
    }
    public void Qg(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       a.p(p0, "resourceId");
       a.p(p1, "observer");
       e.b().Qg(p0, p1);
       return;
    }
    public void Qo(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "1")) {
          return;
       }
       a uoa = c.a.a();
       if (!PatchProxy.applyVoidOneRefs(uoa, this, uob, "2")) {
          a.p(uoa, "resourceConfig");
          e.b().lh(uoa);
       }
       return;
    }
    public void Xk(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       a.p(p0, "resourceId");
       a.p(p1, "observer");
       e.b().Xk(p0, p1);
       return;
    }
    public void ei(a p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       a.p(p0, "liveEffectResource");
       a.p(p1, "listener");
       e.b().ei(p0, p1);
       return;
    }
    public a he(){
       a obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.b().he();
       a.o(obj, "LiveEffectResourceLoader¡­cGiftDownloadController\(\)");
       return obj;
    }
    public void hl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       a.p(p0, "magicFaceId");
       e.b().hl(p0);
       return;
    }
    public void kb(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       e.b().kb();
       return;
    }
    public void lh(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "resourceConfig");
       e.b().lh(p0);
       return;
    }
    public void qn(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       e.b().qn(p0);
       return;
    }
    public File sk(){
       File obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.b().sk();
       a.o(obj, "LiveEffectResourceLoader¡­ce\(\).getMagicGiftFolder\(\)");
       return obj;
    }
}
