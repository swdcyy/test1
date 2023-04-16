package cl2.c;
import r33.d;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import java.util.Map;
import i33.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kwai.framework.model.user.QCurrentUser;
import cl2.a;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import cl2.b;
import com.kuaishou.live.core.show.subscribe.plc.f;

public class c implements d	// class@000551
{

    public void c(){
       super();
    }
    public final void F(Activity p0,QPhoto p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "5")) {
          return;
       }
       j.m(p0, p2, p1, p3);
       return;
    }
    public void FS(Activity p0,Map p1,Map p2){
       Map map = p1;
       Map map1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
          return;
       }
       b.P(d.r0, "onCommercialSubscribeAction");
       String str = null;
       if (map1) {
          str = map1.get("QPhoto");
       }
       Object obj = map.get("reservationId");
       Object obj1 = map.get("source");
       if (TextUtils.x(obj)) {
          b.B(LiveLogTag.AD, "reservationId is null");
          return;
       }else if(!QCurrentUser.me().isLogined()){
          if (!PatchProxy.applyVoidFourRefs(p0, str, obj, obj1, this, c.class, "4")) {
             a uoa = new a(this, p0, str, obj, obj1);
             y.a(p0, null, "commercial_live_subscribe_fragment_action", 0, null, null, null, null, v18);
          }
          int i = this;
       }else {
          this.F(p0, str, obj, obj1);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public final void n(Activity p0,QPhoto p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "7")) {
          return;
       }
       j.m(p0, p2, p1, p3);
       return;
    }
    public void ow(Activity p0,Map p1,Map p2){
       Map map = p1;
       Map map1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "2")) {
          return;
       }
       b.P(d.r0, "onSubscribeAction");
       String str = null;
       if (map1) {
          str = map1.get("QPhoto");
       }
       Object obj = map.get("reservationId");
       Object obj1 = map.get("source");
       if (TextUtils.x(obj)) {
          return;
       }else if(!QCurrentUser.me().isLogined()){
          if (!PatchProxy.applyVoidFourRefs(p0, str, obj, obj1, this, c.class, "6")) {
             b uob = new b(this, p0, str, obj, obj1);
             y.a(p0, null, "live_subscribe_fragment_action", 0, null, null, null, null, v18);
          }
          int i = this;
       }else {
          this.n(p0, str, obj, obj1);
       }
       return;
    }
    public void x10(Activity p0,Map p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "3")) {
          return;
       }
       b.P(d.r0, "onDirectlyAction");
       f.e(p0, p1, p2);
       return;
    }
}
