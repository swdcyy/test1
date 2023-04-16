package f72.u;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import k2b.u1;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class u extends c	// class@0028db
{
    public LiveStreamFeed p;
    public LiveCoverIconView q;
    public LiveCoverIconView$c r;
    public static String sLivePresenterClassName = "LiveDoubleListFeedCoverMarkPresenter";

    public void u(){
       super();
    }
    public void E8(){
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "3")) {
          return;
       }
       u tp = this.p;
       int i = 8;
       if (tp == null) {
          this.q.setVisibility(i);
          return;
       }else {
          LiveStreamFeed mLiveStreamM = tp.mLiveStreamModel;
          if (mLiveStreamM == null) {
             this.q.setVisibility(i);
             return;
          }else {
             LiveCoverWidgetModel liveCoverWid = mLiveStreamM.getLiveCoverWidgetModel(2);
             if (liveCoverWid == null) {
                this.q.setVisibility(i);
                return;
             }else {
                u tq = this.q;
                tq.L = this.r;
                tq.setVisibility(0);
                LiveStreamFeed mCommonMeta = this.p.mCommonMeta;
                if (mCommonMeta != null && mCommonMeta.mIsCloseLive != null) {
                   this.q.X();
                }else {
                   this.q.N(liveCoverWid);
                }
                if (!PatchProxy.applyVoid(objArray, this, ou, "4")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "LIVE_ICON_TYPE";
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = x.e(this.p, 2);
                   u1.u0(3, uElementPack, uContentPack);
                }
                return;
             }
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1c99);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.p = this.s8(LiveStreamFeed.class);
       return;
    }
}
