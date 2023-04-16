package com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig$ToggleConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig$ToggleConfig;
import com.google.gson.stream.b;

public final class GameCenterKeyConfig$TypeAdapter extends TypeAdapter	// class@000865
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       GameCenterKeyConfig$TypeAdapter.c = a.get(GameCenterKeyConfig.class);
    }
    public void GameCenterKeyConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(GameCenterKeyConfig$ToggleConfig$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, GameCenterKeyConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new GameCenterKeyConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xbe21423f:
                      if (str.equals("needThrowException")) {
                         i = 0;
                      }
                      break;
                    case 0xca3ae5b8:
                      if (str.equals("showFloatingCardInterval")) {
                         i = 1;
                      }
                      break;
                    case 0xca4b7893:
                      if (str.equals("longTimeNotInstallDelIntervalMinute")) {
                         i = 2;
                      }
                      break;
                    case 0xd4c2f442:
                      if (str.equals("cloudGameShortcutSingleTime")) {
                         i = 3;
                      }
                      break;
                    case 0xd5ffe246:
                      if (str.equals("cloudGameNoOperationTimeInMills")) {
                         i = 4;
                      }
                      break;
                    case 0xd917bfd2:
                      if (str.equals("installVpnServiceRomList")) {
                         i = 5;
                      }
                      break;
                    case 0xdf5a34e4:
                      if (str.equals("showReserveRemind")) {
                         i = 6;
                      }
                      break;
                    case 0xbfcfd84:
                      if (str.equals("cloudGameShortcutTotalTime")) {
                         i = 7;
                      }
                      break;
                    case 0x130f7d54:
                      if (str.equals("reqAppointedGameIdInterval")) {
                         i = 8;
                      }
                      break;
                    case 0x27365bb6:
                      if (str.equals("toggleConfig")) {
                         i = 9;
                      }
                      break;
                    case 0x3792b013:
                      if (str.equals("cloudGameNoOperationCountDownTimeInMills")) {
                         i = 10;
                      }
                      break;
                    case 0x3c3c81eb:
                      if (str.equals("syncInstalledGamesIntervalInMills")) {
                         i = 11;
                      }
                      break;
                    case 0x43f630a2:
                      if (str.equals("enableSpringTabShow")) {
                         i = 12;
                      }
                      break;
                    case 0x626fb4a8:
                      if (str.equals("welfareTitleBarUrl")) {
                         i = 13;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mNeedThrowException = KnownTypeAdapters$g.a(p0, obj.mNeedThrowException);
                      break;
                    case 1:
                      obj.mShowFloatingCardInterval = KnownTypeAdapters$n.a(p0, obj.mShowFloatingCardInterval);
                      break;
                    case 2:
                      obj.mLongTimeNotInstallDelIntervalMinute = KnownTypeAdapters$n.a(p0, obj.mLongTimeNotInstallDelIntervalMinute);
                      break;
                    case 3:
                      obj.mCloudGameShortcutSingleTime = KnownTypeAdapters$n.a(p0, obj.mCloudGameShortcutSingleTime);
                      break;
                    case 4:
                      obj.mCloudGameNoOperationTimeInMills = KnownTypeAdapters$n.a(p0, obj.mCloudGameNoOperationTimeInMills);
                      break;
                    case 5:
                      obj.mInstallVpnServiceRomList = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mShowReserveRemind = KnownTypeAdapters$g.a(p0, obj.mShowReserveRemind);
                      break;
                    case 7:
                      obj.mCloudGameShortcutTotalTime = KnownTypeAdapters$n.a(p0, obj.mCloudGameShortcutTotalTime);
                      break;
                    case 8:
                      obj.mReqAppointedGameIdInterval = KnownTypeAdapters$n.a(p0, obj.mReqAppointedGameIdInterval);
                      break;
                    case 9:
                      obj.mToggleConfig = this.b.read(p0);
                      break;
                    case 10:
                      obj.mCloudGameNoOperationCountDownloadTimeInMills = KnownTypeAdapters$n.a(p0, obj.mCloudGameNoOperationCountDownloadTimeInMills);
                      break;
                    case 11:
                      obj.mSyncInstalledGamesIntervalInMills = KnownTypeAdapters$n.a(p0, obj.mSyncInstalledGamesIntervalInMills);
                      break;
                    case 12:
                      obj.mEnableSpringTabShow = KnownTypeAdapters$g.a(p0, obj.mEnableSpringTabShow);
                      break;
                    case 13:
                      obj.mWelfareTitleBarUrl = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameCenterKeyConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enableSpringTabShow");
          p0.P(p1.mEnableSpringTabShow);
          if (p1.mToggleConfig != null) {
             p0.r("toggleConfig");
             this.b.write(p0, p1.mToggleConfig);
          }
          if (p1.mInstallVpnServiceRomList != null) {
             p0.r("installVpnServiceRomList");
             TypeAdapters.A.write(p0, p1.mInstallVpnServiceRomList);
          }
          p0.r("reqAppointedGameIdInterval");
          p0.K(p1.mReqAppointedGameIdInterval);
          p0.r("longTimeNotInstallDelIntervalMinute");
          p0.K(p1.mLongTimeNotInstallDelIntervalMinute);
          p0.r("showFloatingCardInterval");
          p0.K(p1.mShowFloatingCardInterval);
          p0.r("needThrowException");
          p0.P(p1.mNeedThrowException);
          p0.r("cloudGameNoOperationTimeInMills");
          p0.K(p1.mCloudGameNoOperationTimeInMills);
          p0.r("cloudGameNoOperationCountDownTimeInMills");
          p0.K(p1.mCloudGameNoOperationCountDownloadTimeInMills);
          p0.r("cloudGameShortcutSingleTime");
          p0.K(p1.mCloudGameShortcutSingleTime);
          p0.r("cloudGameShortcutTotalTime");
          p0.K(p1.mCloudGameShortcutTotalTime);
          p0.r("syncInstalledGamesIntervalInMills");
          p0.K(p1.mSyncInstalledGamesIntervalInMills);
          p0.r("showReserveRemind");
          p0.P(p1.mShowReserveRemind);
          if (p1.mWelfareTitleBarUrl != null) {
             p0.r("welfareTitleBarUrl");
             TypeAdapters.A.write(p0, p1.mWelfareTitleBarUrl);
          }
          p0.j();
       }
       return;
    }
}
