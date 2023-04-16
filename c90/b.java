package c90.b;
import c90.c;
import java.lang.Object;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import c90.c$a;
import android.graphics.BitmapFactory;
import brd.t;
import java.lang.Integer;
import com.kuaishou.edit.draft.Workspace$From;
import java.lang.RuntimeException;
import java.lang.Number;
import java.lang.Boolean;

public final class b implements c	// class@000cf9
{

    public void b(){
       super();
    }
    public Bitmap a(Resources p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "resource");
       Bitmap uBitmap = PatchProxy.applyTwoRefs(this, p0, null, c$a.class, "3");
       if (uBitmap != patchProxyRe) {
       }else {
          a.p(p0, "resource");
          uBitmap = BitmapFactory.decodeResource(p0, this.f());
          a.o(uBitmap, "BitmapFactory.decodeReso¡­urce, getBackgroundRes\(\)\)");
       }
       return uBitmap;
    }
    public t b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(this, null, c$a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = t.just(Integer.valueOf(100));
          a.o(obj, "Observable.just\(ONE_HUNDRED\)");
       }
       return obj;
    }
    public Workspace$From c(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Workspace$From.FROM_UNKNOW;
    }
    public t d(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new RuntimeException("EmptyDataLoader should never be called");
    }
    public t e(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new RuntimeException("EmptyDataLoader should never be called");
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f0816f0;
    }
    public t g(boolean p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(c$a.class)) {
          ot = PatchProxy.applyTwoRefs(this, Boolean.valueOf(p0), null, c$a.class, "2");
          if (ot != patchProxyRe) {
          label_0040 :
             return ot;
          }
       }
       ot = t.just(Integer.valueOf(100));
       a.o(ot, "Observable.just\(ONE_HUNDRED\)");
       goto label_0040 ;
    }
    public int getVideoType(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       throw new RuntimeException("EmptyDataLoader should never be called");
    }
}
