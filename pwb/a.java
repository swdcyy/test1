package pwb.a;
import java.lang.Object;
import android.os.Handler$Callback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import pwb.a$a;
import android.util.SparseArray;
import ukd.a;
import android.app.Instrumentation;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import android.content.Context;
import com.kwai.android.longinus.Longinus;
import sg7.g;

public final class a	// class@002205
{
    public static a$a a;
    public static Handler b;
    public static final a c;

    static {
       a.c = new a();
    }
    public void a(){
       super();
    }
    public final void a(int p0,Handler$Callback p1){
       a$a a;
       a uoa = a.class;
       String str = "2";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, str)) {
          return;
       }
       String str1 = "callback";
       a.p(p1, str1);
       a = a.a;
       if (a != null && (!PatchProxy.isSupport(a$a.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, a, a$a.class, str))) {
          a.p(p1, str1);
          if (a.d == null) {
             a.d = new SparseArray();
          }
          a$a d = a.d;
          a.m(d);
          d.append(p0, p1);
       }
       return;
    }
    public final void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       Instrumentation instrumentat = a.d(p0, "mInstrumentation");
       if (SystemUtil.I() && (!a.g("androidx.test.runner.AndroidJUnitRunner", instrumentat.getClass().getName()) && (a.g("io.qameta.allure.android.runners.AllureAndroidJUnitRunner", instrumentat.getClass().getName()) || a.g("com.kwai.auto.test.library.core.KwaiAndroidJUnitRunner", instrumentat.getClass().getName())))) {
          return;
       }
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       a.o(instrumentat, "oldInstr");
       Longinus.setOriginInstrumentation(b, instrumentat);
       a.o(p0, "mInstrumentation", new g(instrumentat));
       return;
    }
}
