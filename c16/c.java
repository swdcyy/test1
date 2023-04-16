package c16.c;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.a1;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.lang.Runnable;
import zsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.SystemUtil;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public final class c	// class@00063d
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public static final boolean a(Long p0,String p1){
       p0 = PatchProxy.applyTwoRefs(null, p1, null, c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (c.c() && a.g(a1.p(0x7f10015e), p1))? true: false;
       return b;
    }
    public static final boolean b(Activity p0,String p1,String p2,boolean p3,Runnable p4){
       c uoc = c.class;
       int i = 1;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, null, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "context");
       a.p(p4, "loginHandler");
       if (a.g(a1.p(0x7f100b0b), p2) || (p1 != null && u.q2(p1, "kwai://aicut", 0, 2, null) == i)) {
          if (!p0 instanceof GifshowActivity) {
             return i;
          }else if(!c.c()){
             i.a(R.style.arg_RES_7f11066a, 0x7f100144);
             if (!p3) {
                p0.finish();
             }
             return i;
          }else {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (!qCurrentUser.isLogined()) {
                i.a(R.style.arg_RES_7f11066a, 0x7f103078);
                p4.run();
             }else {
                i = false;
             }
             return i;
          }
       }else {
          return 0;
       }
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.d();
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = SystemUtil.t();
       Object[] objArray = new Object[0];
       p3.D().w("AICutUtils", "RAM="+l+" , 3.4G=3.6507222016E9", objArray);
       if ((double)l - 0x41eb333333333333 < 0) {
          return 0;
       }
       return true;
    }
}
