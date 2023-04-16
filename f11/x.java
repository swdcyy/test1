package f11.x;
import com.kuaishou.live.common.core.component.like.count.b$b;
import f11.w;
import java.lang.Object;
import io1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import iz1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Boolean;
import k2b.e0;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import java.lang.StringBuilder;
import z12.e;
import com.kuaishou.live.common.core.component.like.count.b;
import com.kuaishou.live.common.core.component.like.count.LiveLikeResponse;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.like.LikeMessage;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import com.kuaishou.live.basic.model.QLiveMessage;
import n81.a;

public class x implements b$b	// class@00228b
{
    public final w a;

    public void x(w p0){
       this.a = p0;
       super();
    }
    public void a(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.a.u = SystemClock.elapsedRealtime();
       int i = 1;
       if (a.c(this.a.r.c) && !PatchProxy.applyVoid(null, null, uob, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_LIVE_LIKE_RESULT";
          u1.u(i, uElementPack, null);
       }
       LivePlayFragment livePlayFrag = this.a.r.R().t0();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.r.Z2.a();
       w r = this.a.r;
       a0 g = r.g;
       FeedLogCtx uFeedLogCtx = r.c0();
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{livePlayFrag,liveStreamPa,Boolean.valueOf(g),"CLICK",uFeedLogCtx};
          if (PatchProxy.applyVoid(objArray, null, uob, "1")) {
          label_0083 :
             return;
          }
       }
       b.c(livePlayFrag, 1, liveStreamPa, 0, g, null, "CLICK", uFeedLogCtx);
       goto label_0083 ;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "3")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceLikePresenter", "request add like failed: "+p0.getMessage(), stringArray);
       x ta = this.a;
       b.c(this.a.r.R().t0(), 8, this.a.r.Z2.a(), (SystemClock.elapsedRealtime() - ta.u), ta.r.g, ta.y.a(), "CLICK", this.a.r.c0());
       return;
    }
    public void c(LiveLikeResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       String str = "LiveAudienceLikePresenter";
       e.c(str, "request add like success, isPostToServer: "+p0.mFeedPosted, stringArray);
       if (p0.mFeedPosted != null) {
          LikeMessage likeMessage = LiveCommentsMocker.d(this.a.r.b2.d(QCurrentUser.me().getId()).ordinal());
          if (this.a.r.X != null) {
             String[] stringArray1 = new String[i];
             e.c(str, "add like message to comment_list", stringArray1);
             this.a.r.X.R0(likeMessage);
          }
       }
       x ta = this.a;
       b.c(this.a.r.R().t0(), 7, this.a.r.Z2.a(), (SystemClock.elapsedRealtime() - ta.u), ta.r.g, ta.y.a(), "CLICK", this.a.r.c0());
       return;
    }
}
