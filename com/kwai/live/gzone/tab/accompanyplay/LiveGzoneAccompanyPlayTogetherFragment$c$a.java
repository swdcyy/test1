package com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$c$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherItem;
import com.kwai.framework.model.user.User;
import y8c.d;
import dz1.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import g37.f;
import g37.g;
import e17.i;
import android.app.Activity;
import com.yxcorp.utility.n;
import f37.o0;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;

public class LiveGzoneAccompanyPlayTogetherFragment$c$a implements View$OnClickListener	// class@000dfb
{
    public final LiveGzoneAccompanyPlayTogetherFragment$c b;

    public void LiveGzoneAccompanyPlayTogetherFragment$c$a(LiveGzoneAccompanyPlayTogetherFragment$c p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       LiveGzoneAccompanyPlayTogetherFragment$c w;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyPlayTogetherFragment$c$a.class, "1")) {
          return;
       }
       String str = (p0.getId() == 0x7f0a1f1c)? "ACCOMPANY_CARD_LIST_ONBOARD_BUTTON": "ACCOMPANY_CARD_LIST_ONBOARD_AVATAR";
       ClientContent$LiveStreamPackage liveStreamPa = this.b.r.a();
       LiveGzoneAccompanyPlayTogetherFragment$c$a tb = this.b;
       LiveGzoneAccompanyPlayTogetherFragment$c p = tb.p;
       User mId = p.mUserInfo.mId;
       LiveGzoneAccompanyPlayTogetherItem mLiveStreamI = p.mLiveStreamId;
       int i = 1;
       int i1 = tb.q.get() - i;
       LiveGzoneAccompanyPlayTogetherFragment$c$a tb1 = this.b;
       LiveGzoneAccompanyPlayTogetherFragment$c u = tb1.u;
       LiveGzoneAccompanyPlayTogetherFragment$c t = tb1.t;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{liveStreamPa,str,mId,mLiveStreamI,Integer.valueOf(i1),u,t};
          if (PatchProxy.applyVoid(objArray, null, uoa, "42")) {
          label_0099 :
             if (TextUtils.n(this.b.p.mUserInfo.getId(), this.b.s)) {
                if (TextUtils.n(QCurrentUser.ME.getId(), this.b.s)) {
                   w = this.b.w;
                   if (w != null) {
                      w.a();
                   }
                }else {
                   w = this.b.v;
                   if (w != null && !w.a()) {
                      i.a(R.style.arg_RES_7f11066a, 0x7f102330);
                   }
                }
             }else {
                Activity uActivity = n.d(p0);
                LiveGzoneAccompanyPlayTogetherItem mLiveStreamI1 = this.b.p.mLiveStreamId;
                if (!PatchProxy.isSupport(o0.class) || (!PatchProxy.applyVoidThreeRefs(uActivity, mLiveStreamI1, Integer.valueOf(180), null, o0.class, "10") && !TextUtils.x(mLiveStreamI1))) {
                   Uri$Builder uBuilder = x0.f("kwai://live/play/"+mLiveStreamI1).buildUpon();
                   uBuilder.appendQueryParameter("sourceType", String.valueOf(180));
                   uBuilder.appendQueryParameter("internaljump", "kwailive://gzoneaccompanyplay");
                   o0.m(uActivity, uBuilder.build().toString());
                }
             }
             return;
          }
       }
       liveStreamPa.gameId = t;
       liveStreamPa.gameName = u;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = str;
       i3 oi3 = i3.f();
       oi3.d("card_list_author_id", mId);
       oi3.d("card_list_live_stream_id", mLiveStreamI);
       oi3.c("card_list_click_index", Integer.valueOf((i1 + i)));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       u1.v(i, uElementPack, uContentPack, null);
       goto label_0099 ;
    }
}
