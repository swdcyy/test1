package com.kuaishou.live.core.show.conditionredpacket.dialog.c$a;
import x52.a;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import u52.u;
import com.google.common.collect.ImmutableMap;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import e17.i;
import com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog;
import android.os.SystemClock;
import java.lang.Long;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.dialog.b;
import x52.f;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import jga.c;
import wca.b;
import y41.i$a;
import com.kuaishou.live.core.basic.utils.e;
import f82.c;
import java.lang.Number;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import y41.i;

public class c$a implements a	// class@000a71
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(User p0){
       f uof;
       int i1;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c$a.class, str)) {
          return;
       }
       String str1 = (TextUtils.x(obj.a.Q))? "UNKNOWN": obj.a.Q;
       String str2 = str1;
       ClientContent$LiveStreamPackage liveStreamPa = obj.a.K.Z2.a();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = obj.a.K.Z2.y();
       c$a a = obj.a;
       String str3 = (a.U != null)? str: "0";
       String str4 = a.L.d();
       u ou = u.class;
       int i = 0;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{liveStreamPa,liveVoicePar,str3,str2,str4};
          if (PatchProxy.applyVoid(objArray, null, ou, str)) {
          label_0086 :
             if (obj.a.getActivity() instanceof GifshowActivity) {
                c$a a1 = obj.a;
                Objects.requireNonNull(a1);
                b obj2 = PatchProxy.apply(null, a1, c.class, "4");
                if (obj2 != PatchProxyResult.class) {
                   i = obj2.booleanValue();
                }else if(!QCurrentUser.me().isLogined()){
                   i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10306e));
                   i = true;
                }
                if (!i) {
                   a1 = obj.a;
                   Objects.requireNonNull(a1);
                   if (!PatchProxy.applyVoid(null, a1, c.class, "14")) {
                      c p = a1.P;
                      if (p != null) {
                         p.yh();
                      }
                   }
                   long l = SystemClock.elapsedRealtime();
                   c$a a2 = obj.a;
                   Objects.requireNonNull(a2);
                   if (PatchProxy.isSupport(c.class)) {
                      obj2 = PatchProxy.applyThreeRefs(p0, Long.valueOf(l), str2, a2, c.class, "7");
                      if (obj2 != PatchProxyResult.class) {
                      label_0105 :
                         c$a a3 = obj.a;
                         Objects.requireNonNull(a3);
                         if (PatchProxy.isSupport(c.class)) {
                            uof = PatchProxy.applyTwoRefs(Long.valueOf(l), str2, a3, c.class, "8");
                            if (uof != PatchProxyResult.class) {
                            label_0124 :
                               c uoc = b.c(obj.a.K.c.mEntity);
                               i$a uoa = new i$a(obj.a.getActivity(), obj.a.L.getLiveStreamId());
                               uoa.o(obj1);
                               uoa.m(e.j(obj.a.K.c));
                               Object obj3 = PatchProxy.applyOneRefs(str2, null, c.class, "10");
                               if (obj3 != PatchProxyResult.class) {
                                  i1 = obj3.intValue();
                               }else {
                                  i1 = 127;
                                  if (str2 != null && str2.equals("GIFT_PANEL")) {
                                     i1 = 136;
                                  }
                               }
                               uoa.n(i1);
                               uoa.r(1);
                               uoa.g(obj.a.O);
                               uoa.j(obj2);
                               uoa.f(uoc);
                               uoa.i(uof).a().c();
                               return;
                            }
                         }
                         uof = new f(a3, l, str2);
                         goto label_0124 ;
                      }
                   }
                   obj2 = new b(a2, p0, str2, l);
                   goto label_0105 ;
                }
             }
             obj.a.d9("not login", str2);
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = u.a(liveVoicePar, liveStreamPa);
       uContentPack.imGroupSessionPackage = u.c(str4);
       u1.u(1, u.b("JOIN_FANS_GROUP_BUTTON_CLICK", ImmutableMap.of("is_flash_join", str3, "source", str2)), uContentPack);
       goto label_0086 ;
    }
}
