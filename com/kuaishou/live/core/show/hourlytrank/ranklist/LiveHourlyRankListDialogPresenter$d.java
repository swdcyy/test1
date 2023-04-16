package com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$d;
import jt5.b;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import p63.a;
import pm8.a;
import android.content.SharedPreferences;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import androidx.collection.SimpleArrayMap;
import java.lang.Boolean;
import ea2.f;
import vq5.b;
import vq5.d;
import oa1.a;
import lnc.a1;
import oa1.b;
import o63.a;
import lp3.c;
import lp3.e;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import ba2.v;
import p63.a$a;
import p63.a$b;
import ba2.h;
import java.lang.Number;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$e;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import p91.m;
import b61.b;
import t02.a0;
import com.kuaishou.live.common.core.component.follow.cache.c;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kwai.framework.abtest.f;
import ea2.j;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;
import xp5.a;
import com.kwai.live.gzone.common.keyswitch.a;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import o63.d;

public class LiveHourlyRankListDialogPresenter$d implements b	// class@000c25
{
    public final LiveHourlyRankListDialogPresenter a;

    public void LiveHourlyRankListDialogPresenter$d(LiveHourlyRankListDialogPresenter p0){
       this.a = p0;
       super();
    }
    public void a(LiveHourlyRankType p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHourlyRankListDialogPresenter$d.class, "1")) {
          return;
       }
       this.b(p0, p1, 0);
       return;
    }
    public void b(LiveHourlyRankType p0,String p1,int p2){
       if (PatchProxy.isSupport(LiveHourlyRankListDialogPresenter$d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveHourlyRankListDialogPresenter$d.class, "2")) {
          return;
       }
       this.c(p0, p1, p2, null);
       return;
    }
    public void c(LiveHourlyRankType p0,String p1,int p2,a p3){
       LiveHourlyRankType liveHourlyRa;
       LiveLogTag liveLogTag;
       v ov1;
       LiveKrnPageKey liveKrnPageK;
       c uoc1;
       b uob;
       a uoa1;
       int b2;
       LiveHourlyRankListDialogPresenter obj3;
       boolean b3;
       boolean b4;
       String str4;
       LiveHourlyRankListDialogPresenter$d uod = this;
       Object obj = p3;
       if (PatchProxy.isSupport(LiveHourlyRankListDialogPresenter$d.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, LiveHourlyRankListDialogPresenter$d.class, "3")) {
          return;
       }
       boolean b = true;
       boolean b1 = false;
       if (uod.a.E != null) {
          SharedPreferences a = a.a;
          String str = "hasSelectHourlyRankHighValueTab";
          if (!a.getBoolean(str, b1)) {
             b.Z(LiveLogTag.HOURLY_RANK, "requestShowHourlyRankPanel, force high value");
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(str, b);
             g.a(uEditor);
             liveHourlyRa = LiveHourlyRankType.HIGH_VALUE_RANK;
          label_004c :
             LiveHourlyRankListDialogPresenter$d a1 = uod.a;
             a1.C = p1;
             Objects.requireNonNull(a1);
             if (!PatchProxy.isSupport(LiveHourlyRankListDialogPresenter.class) || (!PatchProxy.applyVoidThreeRefs(liveHourlyRa, Integer.valueOf(p2), p3, a1, LiveHourlyRankListDialogPresenter.class, "7") && a1.getActivity() != null)) {
                a1.B = liveHourlyRa;
                String str1 = "2";
                if (obj) {
                   String str2 = "isNewMerchantRankStyle";
                   LiveHourlyRankListDialogPresenter obj1 = PatchProxy.applyOneRefs(str2, obj, a.class, str1);
                   if (obj1 != PatchProxyResult.class) {
                   }else {
                      a.p(str2, "key");
                      obj1 = obj.a.get(str2);
                   }
                   if (Boolean.parseBoolean(obj1)) {
                      liveLogTag = 1;
                   label_00a5 :
                      obj1 = a1.p;
                      if (obj1 != null) {
                         obj1.t5("hourly-show-loading", new f(a1));
                         a uoa = new a();
                         str = String.valueOf(a1.a(R.color.arg_RES_7f060774));
                         if (liveLogTag) {
                            str = String.valueOf(a1.a(R.color.arg_RES_7f062057));
                         }
                         uoa.e(str);
                         uoa.b(0x3f4a3d71);
                         b a2 = b.a;
                         c uoc = a1.r.a(a.class);
                         LiveKrnPageKey liveHourlyRa1 = LiveKrnPageKey.LiveHourlyRank;
                         v ov = v.class;
                         if (PatchProxy.isSupport(LiveHourlyRankListDialogPresenter.class)) {
                            ov1 = ov;
                            liveKrnPageK = liveHourlyRa1;
                            uoc1 = uoc;
                            uob = a2;
                            uoa1 = PatchProxy.applyThreeRefs(liveHourlyRa, Integer.valueOf(p2), p3, a1, LiveHourlyRankListDialogPresenter.class, "8");
                            if (uoa1 != PatchProxyResult.class) {
                            label_010f :
                               liveHourlyRa1 = liveKrnPageK;
                               c uoc2 = uoc1;
                               b uob1 = uob;
                               uob1.b(uoc2, liveHourlyRa1, uoa1, uoa);
                            }
                         }else {
                            ov1 = ov;
                            liveKrnPageK = liveHourlyRa1;
                            uoc1 = uoc;
                            uob = a2;
                         }
                         a$a uoa2 = a.b.a();
                         str = "12";
                         Object[] objArray = null;
                         String obj2 = PatchProxy.apply(objArray, a1, LiveHourlyRankListDialogPresenter.class, str);
                         if (obj2 != PatchProxyResult.class) {
                            b2 = obj2.booleanValue();
                         }else {
                            obj3 = a1.y;
                            b2 = (obj3 != null && obj3.d())? true: false;
                         }
                         uoa2 = uoa2.a("isEnableHeadLine", String.valueOf(b2));
                         obj2 = PatchProxy.applyOneRefs(liveHourlyRa, a1, LiveHourlyRankListDialogPresenter.class, "14");
                         int i = 2;
                         if (obj2 != PatchProxyResult.class) {
                            b2 = obj2.intValue();
                         }else {
                            switch (LiveHourlyRankListDialogPresenter$e.a[liveHourlyRa.ordinal()]){
                                case 1:
                                  b2 = 1;
                                  break;
                                case 2:
                                  b2 = 3;
                                  break;
                                case 3:
                                  b2 = 4;
                                  break;
                                case 4:
                                  b2 = 5;
                                  break;
                                case 5:
                                  b2 = 6;
                                  break;
                                case 6:
                                  b2 = 7;
                                  break;
                                case 7:
                                  b2 = 8;
                                  break;
                                default:
                                  b2 = 2;
                            }
                         }
                         uoa2 = uoa2.a("sourceRankType", String.valueOf(b2));
                         obj2 = PatchProxy.apply(objArray, a1, LiveHourlyRankListDialogPresenter.class, "9");
                         if (obj2 != PatchProxyResult.class) {
                         }else if(TextUtils.x(a1.C)){
                            obj2 = "UNKNOWN";
                         }else {
                            obj3 = a1.C;
                         }
                         uoa2 = uoa2.a("sourceType", obj2).a("isEnablePopularityHourlyRank", String.valueOf(a1.D)).a("isEnableHighValueHourlyRank", String.valueOf(a1.E)).a("anchorName", b.b(a1.q.I()));
                         String str3 = "";
                         obj2 = (a1.q.I().getAvatar() != null)? a1.q.I().getAvatar(): str3;
                         uoa2 = uoa2.a("anchorHeadUrl", obj2);
                         obj3 = PatchProxy.apply(objArray, a1, LiveHourlyRankListDialogPresenter.class, str1);
                         if (obj3 != PatchProxyResult.class) {
                            i = obj3.intValue();
                         }else {
                            obj3 = PatchProxy.apply(objArray, a1, LiveHourlyRankListDialogPresenter.class, "3");
                            str4 = "JOIN_FANS_GROUP";
                            if (obj3 != PatchProxyResult.class) {
                               str3 = obj3;
                            }else {
                               obj3 = a1.s;
                               if (obj3 != null && obj3.r1 != null) {
                                  if (!c.b().c(a1.s.Z2.d())) {
                                     str3 = "FOLLOW_JOIN_FANS_GROUP";
                                  }else if(a1.s.r1.Qi().mStatus == 3){
                                     str3 = str4;
                                  }else {
                                     str3 = "FOR_TA";
                                  }
                               }
                            }
                            Objects.requireNonNull(str3);
                            b2 = -1;
                            switch (str3.hashCode()){
                                case 0x2e1ae355:
                                  if (str3.equals(str4)) {
                                     b2 = 0;
                                  }
                                  break;
                                case 0x7460e6c7:
                                  if (str3.equals("FOLLOW_JOIN_FANS_GROUP")) {
                                     b2 = 1;
                                  }
                                  break;
                                case 0x7bf331c3:
                                  if (str3.equals("FOR_TA")) {
                                     b2 = 2;
                                  }
                                  break;
                                default:
                            }
                            switch (b2){
                                case 0:
                                  i = 3;
                                  break;
                                case 1:
                                  i = 4;
                                case 2:
                                  break;
                                default:
                                  i = 0;
                            }
                         }
                         uoa2 = uoa2.a("popularityType", String.valueOf(i));
                         obj3 = PatchProxy.apply(null, null, ov1, "3");
                         if (obj3 != PatchProxyResult.class) {
                            b3 = obj3.booleanValue();
                         }else {
                            LiveConfigStartupResponse$LiveDistrictRankConfig liveDistrict1 = a.l(LiveConfigStartupResponse$LiveDistrictRankConfig.class);
                            b3 = (liveDistrict1 != null && liveDistrict1.mDisableJumpToLiveStream == null)? true: false;
                         }
                         uoa2 = uoa2.a("canJumpToStream", String.valueOf(b3));
                         j obj4 = PatchProxy.apply(null, null, ov1, str);
                         if (obj4 != PatchProxyResult.class) {
                            b4 = obj4.booleanValue();
                         }else {
                            LiveConfigStartupResponse$LiveDistrictRankConfig liveDistrict = a.l(LiveConfigStartupResponse$LiveDistrictRankConfig.class);
                            b4 = (liveDistrict != null && liveDistrict.mEnableLiveSlide != null)? true: false;
                         }
                         uoa2 = uoa2.a("isEnableSlide", String.valueOf(b4)).a("merchantTabId", String.valueOf(p2)).a("isEnableNational", String.valueOf(v.g()));
                         objArray = null;
                         obj4 = PatchProxy.apply(objArray, a1, LiveHourlyRankListDialogPresenter.class, "10");
                         obj2 = "enableHourlyRankNewStyle";
                         b4 = (obj4 != PatchProxyResult.class)? obj4.booleanValue(): f.a(obj2);
                         uoa2 = uoa2.a(obj2, String.valueOf(b4));
                         obj4 = PatchProxy.apply(objArray, a1, LiveHourlyRankListDialogPresenter.class, "11");
                         obj2 = "enableOptimize";
                         b4 = (obj4 != PatchProxyResult.class)? obj4.booleanValue(): f.a(obj2);
                         uoa2 = uoa2.a(obj2, String.valueOf(b4));
                         obj4 = PatchProxy.apply(objArray, a1, LiveHourlyRankListDialogPresenter.class, "13");
                         if (obj4 != PatchProxyResult.class) {
                            b4 = obj4.booleanValue();
                         }else {
                            obj1 = a1.y;
                            b4 = (obj1 != null && obj1.b())? true: false;
                         }
                         uoa2 = uoa2.a("isEnableCityRank", String.valueOf(b4));
                         obj1 = a1.A;
                         if (obj1 != null) {
                            obj4 = obj1.a;
                            if (obj4 != null) {
                               uoa2.a("anchorDisRankInfo", Base64.encodeToString(MessageNano.toByteArray(obj4), 0));
                            label_0352 :
                               Iterator obj5 = PatchProxy.apply(null, a1, LiveHourlyRankListDialogPresenter.class, "15");
                               if (obj5 != PatchProxyResult.class) {
                                  b4 = obj5.booleanValue();
                               }else {
                                  obj1 = a1.s;
                                  b4 = (obj1 != null && obj1.t.c())? true: false;
                               }
                               if (b4) {
                                  b = (a.a() && a1.w != null)? true: false;
                                  uoa2.a("isEnableGameHourlyRank", String.valueOf(b));
                               }else {
                                  uoa2.a("isEnableMerchantHourlyRank", "true");
                               }
                               if (obj != null) {
                                  obj5 = p3.a().entrySet().iterator();
                                  while (obj5.hasNext()) {
                                     Map$Entry uEntry = obj5.next();
                                     obj2 = uEntry.getKey();
                                     uoa2.a(obj2, uEntry.getValue());
                                  }
                               }
                               uoa1 = uoa2.b();
                               goto label_010f ;
                            }
                         }
                         str4 = null;
                         goto label_0352 ;
                      }else {
                         b.Z(LiveLogTag.HOURLY_RANK, "show RN dialog error: router service is null");
                      }
                   }
                }
                liveLogTag = null;
                goto label_00a5 ;
             }
             return;
          }
       }
       liveHourlyRa = p0;
       goto label_004c ;
    }
}
