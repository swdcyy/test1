package ng.d;
import erd.g;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeListBridgeParams;
import com.yxcorp.gifshow.activity.GifshowActivity;
import og.k;
import java.lang.Object;
import um6.j;
import r16.f;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import kotlin.jvm.internal.a;
import w26.c;
import java.lang.String;
import android.app.Activity;
import android.content.Intent;
import com.feature.post.bridge.karaoke.KaraokeBridgeBaseParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import og.l;
import q87.c;
import com.feature.post.bridge.karaoke.KaraokeHelper;
import n3d.a;

public final class d implements g	// class@002705
{
    public final KaraokeHelper$KaraokeListBridgeParams b;
    public final GifshowActivity c;
    public final k d;

    public void d(KaraokeHelper$KaraokeListBridgeParams p0,GifshowActivity p1,k p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       x6 ox6 = y6.r(f.class);
       a.m(ox6);
       x6 ox61 = y6.r(c.class);
       a.m(ox61);
       String channel = this.b.getChannel();
       if (channel == null) {
       }else {
          int i = channel.hashCode();
          if (i != -1361215066) {
             if (i != 0x36ebbd) {
                if (i != 0x3af610bc || !channel.equals("recommend")) {
                label_0069 :
                   p0 = null;
                label_006a :
                   if (p0 == null) {
                      this.d.f("activity not found");
                   }else {
                      p0.putExtra("activity", this.b.getActivity());
                      p0.putExtra("atFriends", this.b.getAtFriends());
                      String str = "tag";
                      if (TextUtils.isEmpty(this.b.getTopic())) {
                         p0.putExtra(str, this.b.getTag());
                      }else {
                         p0.putExtra(str, this.b.getTopic());
                      }
                      p0.putExtra("INTENT_GO_HOME_ON_POST_COMPLETE", (this.b.getReturnToOriginalPage() ^ 1));
                      p0.putExtra("forbidRecoverDraft", this.b.getForbidRecoverDraft());
                      if (!this.b.getHoldPostSession()) {
                         Object[] objArray = new Object[0];
                         l.D().w("startKaraokeList", "onClipFinished", objArray);
                         p0.putExtra("discard_current_post_session", 1);
                      }
                      this.c.t1(p0, 1, KaraokeHelper.a.a(this.d, 1, ox6, ox61));
                   }
                   return;
                }
             }else if(channel.equals("used")){
             }
             p0 = p0.tw(this.c);
             if (p0 != null) {
                p0.putExtra("ktv_tune_tab", this.b.getChannel());
                goto label_006a ;
             }else {
                goto label_006a ;
             }
          }else if(channel.equals("chorus")){
             p0 = p0.FJ(this.c);
             goto label_006a ;
          }else {
             goto label_0069 ;
          }
       }
    }
}
