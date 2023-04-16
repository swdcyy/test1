package fj2.e;
import android.view.View$OnClickListener;
import fj2.o;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kuaishou.screencast.c;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import fj2.c;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import t02.a0;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class e implements View$OnClickListener	// class@00296d
{
    public final o b;

    public void e(o p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs("bottom", tb, o.class, "14")) {
       }else {
          boolean i = -1851168653;
          ScreencastDeviceInfo screencastDe = b.a(i).a();
          LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_SCREENCAST;
          String str = "LiveAudienceScreencastPresenter";
          lIVE_AUDIENC.appendTag(str);
          String str1 = "clickScreenCastButton";
          b.S(lIVE_AUDIENC, str1, "currentCastDeviceInfo", screencastDe);
          if (screencastDe == null) {
             tb.e9();
          }else {
             String str2 = b.a(i).b();
             b.S(lIVE_AUDIENC.appendTag(str), str1, "currentScreencastFeedId", str2);
             if (!TextUtils.x(tb.q.getPhotoId()) && (tb.q.getPhotoId()).equals(str2)) {
                tb.d9(b.a(i).f, screencastDe);
             }else {
                tb.e9();
             }
          }
          i = y.d(tb.getActivity());
          o r = tb.r;
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(i), "bottom", r, null, c.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_WATCH_PROJECTION";
             uElementPack.params = c.a(r, "bottom").e();
             u1.u(1, uElementPack, c.b(i, r));
          }
       }
       return;
    }
}
