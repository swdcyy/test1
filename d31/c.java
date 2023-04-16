package d31.c;
import lf3.g;
import d31.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveUserTaskProto$LiveUserTaskCommonRoute;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import ekd.j;
import com.kuaishou.livestream.message.nano.LiveUserTaskProto$LiveUserTaskCommonRouteModel;
import f31.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s51.c;
import lp3.c;
import lp3.e;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lf3.f;

public final class c implements g	// class@001efe
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       LiveUserTaskProto$LiveUserTaskCommonRoute commonRoute;
       boolean b;
       c tb = this.b;
       Objects.requireNonNull(tb);
       LiveLogTag lIVE_TASK_CE = LiveLogTag.LIVE_TASK_CENTER;
       b.c0(lIVE_TASK_CE, "onReceiveUserTaskCommonRoute", "msg", p0);
       if (j.h(p0.commonRoute)) {
          b.B(lIVE_TASK_CE, "commonRoute is empty");
       }else {
          commonRoute = p0.commonRoute;
          int len = commonRoute.length;
          int i = 0;
          while (i < len) {
             object oobject = commonRoute[i];
             tb.N.f(oobject);
             LiveLogTag obj = PatchProxy.applyOneRefs(oobject, tb, e.class, "6");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(oobject == null || TextUtils.x(oobject.routeUrl)){
                b.B(LiveLogTag.LIVE_TASK_CENTER, "tryShowTaskPopup fail, routeUrl is empty");
             }else {
                obj = LiveLogTag.LIVE_TASK_CENTER;
                b.c0(obj, "tryShowTaskPopup", "url", oobject.routeUrl);
                if (!tb.N.b(oobject.bizId)) {
                   b.B(obj, "tryShowTaskPopup fail, frequency invalid");
                }else {
                   tb.N.d(oobject.bizId);
                   b = tb.K.a(c.class).r4(oobject.routeUrl, tb.getContext());
                }
             }
             b = false;
             if (!b) {
                i = i + 1;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
