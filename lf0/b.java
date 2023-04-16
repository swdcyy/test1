package lf0.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gf0.a;
import java.util.Objects;
import java.lang.Float;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import k2b.u1;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import kf0.d;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import java.lang.CharSequence;
import zsd.u;
import u07.t$a;
import kf0.a;
import u07.u;
import kf0.b;
import u07.f;
import kf0.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class b extends m	// class@002ede
{
    public final TaskCommonParams c;

    public void b(TaskCommonParams p0){
       a.p(p0, "mParams");
       super();
       this.c = p0;
    }
    public void a(View p0){
       a a;
       String mCloseDialog;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       a = a.a;
       b tc = this.c;
       float x = p0.getX();
       float y = p0.getY();
       Objects.requireNonNull(a);
       int i = 1;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(tc, Float.valueOf(x), Float.valueOf(y), a, a.class, "5")) {
          a.p(tc, "taskParams");
          ClickMetaData uClickMetaDa = new ClickMetaData();
          uClickMetaDa.setType(i);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_CLOSE_NEW_TASK_PENDANT";
          uElementPack.params = a.a(tc, x, y).e();
          uClickMetaDa.setElementPackage(uElementPack);
          u1.B(uClickMetaDa);
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity != null) {
          d a1 = d.a;
          b tc1 = this.c;
          Objects.requireNonNull(a1);
          if (!PatchProxy.applyVoidThreeRefs(tc1, p0, uActivity, a1, d.class, "1")) {
             a.p(tc1, "taskParams");
             a.p(p0, "pendantView");
             a.p(uActivity, "activity");
             TaskPendantConfig mPendantConf = tc1.getMPendantConfig();
             if (mPendantConf != null) {
                TaskUIConfig mUiConfig = mPendantConf.getMUiConfig();
                if (mUiConfig != null) {
                   mCloseDialog = mUiConfig.getMCloseDialogText();
                label_00a8 :
                   if (mCloseDialog != null && !u.S1(mCloseDialog)) {
                      i = 0;
                   }
                   if (i) {
                      mCloseDialog = uActivity.getString(R.string.arg_RES_7f104c06);
                   }
                   a.o(mCloseDialog, "taskParams.mPendantConfi¡­\n        it\n      }\n    }");
                   t$a uoa = new t$a(uActivity);
                   uoa.X0(mCloseDialog);
                   uoa.S0(R.string.arg_RES_7f103a83);
                   uoa.Q0(R.string.cancel);
                   uoa.u0(new a(p0, tc1));
                   uoa.t0(new b(tc1));
                   f.e(uoa).Y(new c(tc1));
                }
             }
             mCloseDialog = null;
             goto label_00a8 ;
          }
       }
       return;
    }
}
