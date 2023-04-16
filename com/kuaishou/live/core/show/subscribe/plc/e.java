package com.kuaishou.live.core.show.subscribe.plc.e;
import com.kuaishou.live.core.show.subscribe.plc.LiveHalfSubscribeDialogFragment$b;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LiveSubscribeStat;
import brd.t;
import com.kuaishou.live.core.show.subscribe.plc.f;
import bp6.a;
import com.kuaishou.live.core.show.subscribe.plc.e$a;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import zk2.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.feed.PhotoType;
import y41.i$a;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.live.core.show.profilecard.follow.b;
import y41.i;
import zk2.o;
import zk2.n;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;

public class e implements LiveHalfSubscribeDialogFragment$b	// class@00115f
{
    public final LiveSubscribeStatInfo a;
    public final Activity b;
    public final QPhoto c;
    public final String d;
    public final String e;

    public void e(LiveSubscribeStatInfo p0,Activity p1,QPhoto p2,String p3,String p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(LiveSubscribeBookStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       ta.mLiveSubscribeStat.mBookStatus = p0;
       f.a(this.b, this.c, this.d, this.e, false, false, ta).subscribe(new a(), new e$a(this));
       return;
    }
    public void b(boolean p0){
       e uoe = e.class;
       String str = "2";
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, str)) {
          return;
       }
       uoe = this.c;
       if (uoe == null) {
          return;
       }
       UserInfo mId = this.a.mLiveSubscribeStat.mUserInfo.mId;
       if (p0) {
          Object obj = null;
          Object[] obj1 = PatchProxy.applyOneRefs(mId, obj, q.class, str);
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(TextUtils.x(mId)){
             obj1 = new Object[]{mId,String.valueOf(PhotoType.LIVESTREAM.toInt())};
             i$a uoa = new i$a().p(mId);
             uoa.k(0);
             uoa.d(String.format("%s_%s", obj1));
             uoa.r(1);
             uoa.h(b.c(obj));
             obj = uoa.a().d();
          }
          if (obj != null) {
             obj.subscribe(new o(this.c));
          }
       }else {
          f.b(this.b, uoe, mId, 235, new n(uoe));
       }
       return;
    }
}
