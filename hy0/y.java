package hy0.y;
import java.lang.Object;
import t02.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import ry1.b;
import android.app.Activity;
import lnc.a1;
import d61.y;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;

public class y	// class@0027bb
{
    public Map a;

    public void y(){
       super();
    }
    public static boolean a(a0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          y.c("livePlayCallerContext is null");
          return b;
       }else {
          FragmentActivity activity = p0.S.getActivity();
          if (activity == null) {
             y.c("activity is null");
             return b;
          }else {
             LiveTimeConsumingUserStatusResponse liveTimeCons = p0.b3.d0();
             if (liveTimeCons == null) {
                y.c("audience status is null");
                return b;
             }else if(a1.i(activity) && y.e(activity)){
                y.c("is Landscape");
                return b;
             }else {
                liveTimeCons = liveTimeCons.mLivePayBulletResponse;
                if (liveTimeCons != null) {
                   y.d("livePayBulletResponse.getEnablePayBullet", liveTimeCons.getEnablePayBullet());
                   return liveTimeCons.getEnablePayBullet();
                }else {
                   y.c("livePayBulletResponse null");
                   return b;
                }
             }
          }
       }
    }
    public static LivePayBulletResponse b(a0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       LiveTimeConsumingUserStatusResponse liveTimeCons = p0.b3.d0();
       if (liveTimeCons != null) {
          return liveTimeCons.mLivePayBulletResponse;
       }
       return null;
    }
    public static void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, y.class, "6")) {
          return;
       }
       y.d(p0, false);
       return;
    }
    public static void d(String p0,boolean p1){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oy, "7")) {
          return;
       }
       b.a0(LiveLogTag.LIVE_BULLET_COMMENT, "can send barrage", c.k("reason", p0, "canSend", Boolean.valueOf(p1)));
       return;
    }
}
