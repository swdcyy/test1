package b92.a;
import im8.g;
import k51.c;
import sg1.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p91.m;
import wkd.b;
import com.kuaishou.live.common.core.component.friend.a;
import java.util.Objects;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFriendFeedConfig;
import java.lang.reflect.Type;
import wg3.a;
import android.os.SystemClock;
import com.kuaishou.live.common.core.component.friend.LiveFriendApiService;
import va1.f;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import sg1.b;
import sg1.a;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import b92.d;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends c implements g	// class@00036d
{
    public m p;
    public final c q;
    public static String sLivePresenterClassName = "LiveFriendPresenter";

    public void a(){
       super();
       this.q = new d();
    }
    public void E8(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, a.class, str)) {
          return;
       }
       if (!this.p.U()) {
          a uoa = b.a(-636999202);
          Objects.requireNonNull(uoa);
          a uoa1 = a.class;
          if (!PatchProxy.applyVoid(objArray, uoa, uoa1, str)) {
             LiveConfigStartupResponse$LiveFriendFeedConfig liveFriendFe = a.r(LiveConfigStartupResponse$LiveFriendFeedConfig.class);
             if (liveFriendFe != null && liveFriendFe.mEnableEnterRoomRequestFriend != null) {
                LiveConfigStartupResponse$LiveFriendFeedConfig mEnterRoomFr = liveFriendFe.mEnterRoomFriendExpireTimeMillis;
                if (mEnterRoomFr <= 0) {
                   mEnterRoomFr = a.d;
                }
                if ((SystemClock.elapsedRealtime() - uoa.b) - mEnterRoomFr > 0 && (!PatchProxy.applyVoid(objArray, uoa, uoa1, "3") && uoa.c == null)) {
                   uoa.c = true;
                   f.a(LiveFriendApiService.class).a(QCurrentUser.ME.getId()).subscribeOn(d.b).observeOn(d.a).map(new e()).subscribe(new b(uoa), new a(uoa));
                }
             }
          }
       }
    label_008f :
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
