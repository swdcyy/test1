package m76.a;
import aa7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.RomUtils;
import android.os.Build$VERSION;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;
import aa7.c;
import kotlin.jvm.internal.a;
import m76.a$a;
import java.util.concurrent.Callable;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import m76.a$b;
import erd.o;
import m76.a$c;
import java.lang.CharSequence;
import e17.i;
import android.content.Context;
import aa7.b;

public final class a implements a	// class@001e53
{

    public void a(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (RomUtils.w() || (RomUtils.s() && Build$VERSION.SDK_INT <= 24))? true: false;
       return b;
    }
    public final t b(Activity p0,String p1,boolean p2){
       t ot;
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.a()) {
          PermissionUtils.s(p0);
          ot = t.just(new c(p1, true));
          a.o(ot, "Observable.just\(KwaiPermission\(permission, true\)\)");
          return ot;
       }else {
          ot = t.fromCallable(new a$a(p0)).subscribeOn(AzerothSchedulers.b.c()).flatMap(new a$b(p0, p1, p2)).map(a$c.b);
          a.o(ot, "Observable.fromCallable ¡­t.name, it.granted\)\n    }");
          return ot;
       }
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "text");
       i.d(R.style.arg_RES_7f110668, p0);
       return;
    }
    public boolean h(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "context");
       a.p(p1, "permission");
       if (this.a()) {
          return false;
       }
       return PermissionUtils.a(p0, p1);
    }
    public t i(Activity p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "permission");
       return this.b(p0, p1, false);
    }
    public t j(Activity p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "permission");
       return this.b(p0, p1, p2);
    }
    public t k(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "title");
       a.p(p1, "content");
       a.q(p0, "title");
       a.q(p1, "content");
       t ot = t.just(new b(false));
       a.h(ot, "Observable.just\(KwaiDialogResult\(false\)\)");
       return ot;
    }
    public t l(Context p0,String p1){
       t ot;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "permission");
       if (this.a()) {
          ot = t.just(Boolean.FALSE);
          a.o(ot, "Observable.just\(false\)");
          return ot;
       }else {
          ot = t.just(Boolean.valueOf(PermissionUtils.a(p0, p1)));
          a.o(ot, "Observable.just\(Permissi¡­ion\(context, permission\)\)");
          return ot;
       }
    }
}
