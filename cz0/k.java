package cz0.k;
import cz0.b;
import java.lang.Object;
import bz0.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import ht5.b;
import java.lang.Throwable;
import bz0.f;
import ug1.w0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import k2b.u1;
import java.util.HashMap;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.e0;
import java.util.Map;
import fq5.b;
import p91.m;
import lp3.e;
import xp5.i;
import lp3.c;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import cz0.a;

public class k implements b	// class@001ecd
{

    public void k(){
       super();
    }
    public boolean a(e p0){
       long l;
       String str = "1";
       e obj = PatchProxy.applyOneRefs(p0, this, k.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.b;
       e a = p0.a;
       StringBuilder str1 = null;
       try{
          l = Long.parseLong(QCurrentUser.me().getId());
       }catch(java.lang.NumberFormatException e0){
          l = str1;
       }
       if (l - str1 <= 0) {
          f.b(a, new IllegalArgumentException("visitorId should be positive number, bot now it is "+l));
          if (!PatchProxy.applyVoid(null, null, w0.class, str)) {
             String id = QCurrentUser.me().getId();
             b.c0(LiveLogTag.GIFT, "visitorIdError", "visitorId = ", id);
             u1.R("sendGiftVisitorIdError", "visitorId = "+id, 3);
          }
          this.c(p0, "CLIENT_SEND_PRE_CHECK", "[LivePreSendNormalGiftInterceptor][intercept]visitorId = "+l, 0x18705);
          return true;
       }else if(a.f == null){
          a.f = new HashMap();
       }
       a.f.put("exp_tag", e0.a(e0.c));
       a.f.put("expTagList", e0.b());
       FeedLogCtx uFeedLogCtx = e0.b().t5().a(i.class).c0();
       if (uFeedLogCtx != null) {
          a.f.put("interStid", uFeedLogCtx.stidContainer);
       }
       a.f.put("commonStid", b.a(0x4b316083).i(p0.b.R().t0().o(), null));
       return false;
    }
    public b b(int p0){
       return a.b(this, p0);
    }
    public void c(e p0,String p1,String p2,int p3){
       a.a(this, p0, p1, p2, p3);
    }
}
