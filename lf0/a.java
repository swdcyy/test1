package lf0.a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import o56.f;
import gf0.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zsd.u;
import lf0.a$a;
import java.lang.Runnable;
import qf0.b;
import xh7.b;
import lf0.a$b;
import qh7.b;
import qh7.a;

public final class a extends m	// class@002edd
{
    public final TaskCommonParams c;

    public void a(TaskCommonParams p0){
       a.p(p0, "mTaskParam");
       super();
       this.c = p0;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       TaskPendantConfig mPendantConf = this.c.getMPendantConfig();
       int mClickPolicy = (mPendantConf != null)? mPendantConf.getMClickPolicy(): 0;
       if (mClickPolicy) {
          if (mClickPolicy == 1 && !PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
             if (this.b()) {
                ActivityContext uActivityCon = ActivityContext.g();
                a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                Activity uActivity = uActivityCon.e();
                if (uActivity != null && !f.b(uActivity)) {
                   a.a.b(this.c, p0.getX(), p0.getY(), false);
                   uActivity.finish();
                }
             }
             this.c(p0);
          }
       }else {
          this.c(p0);
       }
       return;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.isTaskComplete();
    }
    public final void c(View p0){
       TaskPendantConfig mPendantConf;
       String mCompleteLin;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       Context context = p0.getContext();
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       Object obj = null;
       objectRef.element = obj;
       if (this.b()) {
          mPendantConf = this.c.getMPendantConfig();
          mCompleteLin = (mPendantConf != null)? mPendantConf.getMCompleteLinkUrl(): obj;
          if (!TextUtils.x(mCompleteLin)) {
             mPendantConf = this.c.getMPendantConfig();
             mCompleteLin = (mPendantConf != null)? mPendantConf.getMCompleteLinkUrl(): obj;
             objectRef.element = mCompleteLin;
          }
       }
       if (!this.b()) {
          mPendantConf = this.c.getMPendantConfig();
          mCompleteLin = (mPendantConf != null)? mPendantConf.getMInProgressLinkUrl(): obj;
          if (!TextUtils.x(mCompleteLin)) {
             mPendantConf = this.c.getMPendantConfig();
             mCompleteLin = (mPendantConf != null)? mPendantConf.getMInProgressLinkUrl(): obj;
             objectRef.element = mCompleteLin;
          }
       }
       Ref$ObjectRef element = objectRef.element;
       boolean b = true;
       element = (element == null || u.S1(element))? 1: null;
       if (!element) {
          if (u.q2(objectRef.element, "http", false, 2, obj)) {
             a.o(context, "context");
             b.n(context, objectRef.element, new a$a(context, objectRef));
          }else {
             a.b(b.j(context, objectRef.element), a$b.a);
          }
       }else {
          b = false;
       }
       a.a.b(this.c, p0.getX(), p0.getY(), b);
       return;
    }
}
