package bg3.g;
import yf3.a$a;
import bg3.e;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import yf3.a;
import zf3.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;
import com.yxcorp.gifshow.log.c0;

public class g implements a$a	// class@0003a6
{
    public final e a;

    public void g(e p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       if (this.a.I == null) {
          b.B(LiveLogTag.MERCHANT, "mChainSideBarAdapter is null");
          return;
       }else {
          ClientContent$LiveStreamPackage liveStreamPa = x.e(p0.getEntity(), 2);
          liveStreamPa.showIndexPlusOne = (long)(this.a.I.s1(p0) + 1);
          this.a.R8(p0);
          p0 = p0.mEntity;
          int i = 7;
          if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(p0, liveStreamPa, Integer.valueOf(i), null, a.class, "4") && p0 != null)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MERCHANT_MORELIST_CONTENT";
             u1.B(new ClickMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(a.a(p0, liveStreamPa, i)).setFeedLogCtx(r1.O0(p0)));
          }
          return;
       }
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       if (this.a.I == null) {
          b.B(LiveLogTag.MERCHANT, "mChainSideBarAdapter is null");
          return;
       }else if(!p0.isShowed()){
          p0.setShowed(true);
          ClientContent$LiveStreamPackage liveStreamPa = x.e(p0.getEntity(), 2);
          liveStreamPa.showIndexPlusOne = (long)(this.a.I.s1(p0) + true);
          a.b(p0.mEntity, liveStreamPa, 7);
          r1.g5(p0.mEntity, this.a.I.s1(p0));
          c0.q().k(p0.mEntity);
       }
       return;
    }
}
