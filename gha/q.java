package gha.q;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.component.feedstaggercard.experiment.HomeCardExperimentUtil;
import tkd.b;
import tkd.d;
import hn5.n;
import android.content.Context;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.util.DisplayMetrics;
import java.util.Objects;
import android.view.WindowManager;
import android.view.Display;
import cw9.c;
import usd.q;

public final class q	// class@002ae2
{
    public static float a = 0.000000;
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final float a(Activity p0){
       float f;
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (!q.a - 1 || (HomeCardExperimentUtil.h.a() && (p0 != null && (d.a(-1883158055).U3(p0) && !FollowConfigUtil.i())))) {
          if (p0 == null) {
             Application uApplication = a.b();
             a.o(uApplication, "AppEnv.getAppContext\(\)");
             f = this.b(uApplication);
          }else {
             f = this.b(p0);
          }
          q.a = f;
       }
    label_004f :
       return q.a;
    }
    public final float b(Context p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, this, q.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = new DisplayMetrics();
       p0 = p0.getSystemService("window");
       Objects.requireNonNull(p0, "null cannot be cast to non-null type android.view.WindowManager");
       c.d(p0.getDefaultDisplay(), obj);
       obj = obj.density;
       return q.t(((float)obj.widthPixels / obj), ((float)obj.heightPixels / obj));
    }
}
