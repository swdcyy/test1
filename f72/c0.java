package f72.c0;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import im8.f;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.live.core.basic.utils.e;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import e72.p;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import yp.x;
import java.util.Map;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class c0 extends c	// class@0028c4
{
    public QPhoto p;
    public RecyclerFragment q;
    public f r;
    public LiveDoubleListParam s;
    public static String sLivePresenterClassName = "LiveDoubleListFeedShowLoggerPresenter";

    public void c0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "2")) {
          return;
       }
       c0 tp = this.p;
       if (tp != null && !tp.isShowed()) {
          tp = this.p;
          QPhoto mEntity = tp.mEntity;
          tp.setShowed(true);
          r1.g5(this.p.mEntity, this.r.get().intValue());
          e.u(this.p.mEntity);
          int i = this.p.isCloseLive() ^ true;
          c0 tq = this.q;
          LiveDoubleListParam mLogExtraPar = this.s.mLogExtraParamMap;
          if (!PatchProxy.isSupport(p.class) || (!PatchProxy.applyVoidFourRefs(Boolean.valueOf(i), mEntity, tq, mLogExtraPar, null, p.class, "3") && mEntity != null)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_CARD_SHOW";
             JsonObject jsonObject = new JsonObject();
             jsonObject.H("is_living", Boolean.valueOf(i));
             jsonObject.c0("lv_params", x.g(mEntity));
             p.d(jsonObject, mLogExtraPar);
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = p.a(mEntity);
             u1.B0(new ShowMetaData().setLogPage(tq).setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r1.O0(mEntity)));
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.r = this.x8("ADAPTER_POSITION");
       this.q = this.r8("FRAGMENT");
       this.s = this.r8("LIVE_EXPLORE_PARAM");
       return;
    }
}
