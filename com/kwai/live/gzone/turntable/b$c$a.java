package com.kwai.live.gzone.turntable.b$c$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.turntable.b$c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableTask;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import android.content.pm.PackageManager;
import android.content.Intent;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import com.kwai.live.gzone.turntable.b$b;
import y43.a;
import fq5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadAction;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import u07.t$a;
import com.kwai.live.gzone.turntable.c;
import u07.u;
import n77.h;
import u07.f;
import com.kwai.live.gzone.turntable.e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import java.lang.ref.WeakReference;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import u37.h;
import u37.e;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.live.gzone.turntable.b;
import ft5.b;
import java.lang.Integer;
import jk1.e;

public class b$c$a extends m	// class@000e31
{
    public final b$c c;

    public void b$c$a(b$c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String liveStreamId;
       ClientEvent$ElementPackage obj2;
       String str2;
       String str3;
       int i1;
       b$c w1;
       Object obj = this;
       LiveGzoneTurntableLogger obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b$c$a.class, "1")) {
          return;
       }
       b$c$a c = obj.c;
       b$c w = c.w;
       Objects.requireNonNull(c);
       b$c uoc = b$c.class;
       if (!PatchProxy.applyVoidTwoRefs(obj1, w, c, uoc, "11")) {
          if (!PatchProxy.applyVoidOneRefs(w, c, uoc, "12")) {
             LiveGzoneTurntableTask mType = w.mType;
             if (mType != 1) {
                if (mType != 2) {
                   String str = 3;
                   if (mType != str) {
                      int i = -1986139969;
                      switch (mType){
                          case 9:
                            if (!TextUtils.x(w.mLink)) {
                               c.R8(w.mLink);
                               mType = w.mTaskId;
                               if (!PatchProxy.applyVoidOneRefs(mType, c, uoc, "19")) {
                                  c.X7(e.d().e(c.x.m.getLiveStreamId(), mType).subscribe(Functions.d()));
                               }
                            }
                            break;
                          case 10:
                            GifshowActivity activity = c.getActivity();
                            if (a1.i(activity)) {
                               liveStreamId = c.x.m.getLiveStreamId();
                               b uob = d.a(i);
                               LiveGzoneTurntableTask mGameId = w.mGameId;
                               int page = activity.getPage();
                               WeakReference weakReferenc = new WeakReference(activity);
                               String str1 = c.x.m.d();
                               mType = w.mGameId;
                               obj2 = PatchProxy.applyTwoRefs(liveStreamId, mType, c, uoc, "13");
                               if (obj2 != PatchProxyResult.class) {
                                  str2 = obj2;
                               }else {
                                  i3 oi3 = i3.f();
                                  oi3.d("room_id", liveStreamId);
                                  oi3.d("gameId", mType);
                                  oi3.d("sceneId", "128");
                                  str2 = oi3.e();
                               }
                               uob.appointGame(liveStreamId, mGameId, page, weakReferenc, 0, 2, "liveroom_turntable", str1, str2);
                               obj1 = c.v.g();
                               str3 = c.x.m.d();
                               liveStreamId = c.x.m.getLiveStreamId();
                               Objects.requireNonNull(obj1);
                               if (!PatchProxy.applyVoidThreeRefs(str3, liveStreamId, w, obj1, LiveGzoneTurntableLogger.class, "25")) {
                                  obj2 = obj1.a("RESERVE_GAME");
                                  obj2.params = obj1.e(str3, liveStreamId, w);
                                  u1.u(1, obj2, obj1.g());
                               }
                               c.S8(w.mTaskId, 2);
                            }
                            break;
                          case 11:
                            if (!PatchProxy.applyVoid(null, c, uoc, "14")) {
                               Activity activity1 = c.getActivity();
                               if (SystemUtil.M(activity1, c.w.mPkgName)) {
                                  if (!PatchProxy.applyVoidOneRefs(activity1, c, uoc, "7")) {
                                     Intent launchIntent = activity1.getPackageManager().getLaunchIntentForPackage(c.w.mPkgName);
                                     if (launchIntent != null) {
                                        i1 = 0x10000000;
                                        try{
                                           launchIntent.addFlags(i1);
                                           activity1.startActivity(launchIntent);
                                        }catch(android.content.ActivityNotFoundException e0){
                                           b.I(LiveLogTag.GZONE, "open game", e0);
                                        }
                                     }
                                  }
                               }else {
                                  GameCenterDownloadParams$DownloadInfo gameCenterDo = d.a(i).getGameCenterDownloadInfoByGameId(c.w.mGameId);
                                  if (gameCenterDo == null) {
                                     c.V8();
                                     c.v.g().m(c.x.m.d(), c.x.m.getLiveStreamId(), c.w);
                                  }else {
                                     GameCenterDownloadParams$DownloadInfo mStage = gameCenterDo.mStage;
                                     Objects.requireNonNull(mStage);
                                     switch (mStage.hashCode()){
                                         case 0xae7a2e7a:
                                           if (!mStage.equals("cancel")) {
                                           label_0161 :
                                              i1 = -1;
                                           }else {
                                              i1 = 0;
                                           }
                                           break;
                                         case 0xc454c22d:
                                           if (!mStage.equals("progress")) {
                                              goto label_0161 ;
                                           }else {
                                              i1 = 1;
                                           }
                                           break;
                                         case 0xc84dc82d:
                                           if (!mStage.equals("resume")) {
                                              goto label_0161 ;
                                           }else {
                                              i1 = 2;
                                           }
                                           break;
                                         case 0xdc453139:
                                           if (!mStage.equals("complete")) {
                                              goto label_0161 ;
                                           }
                                           break;
                                         case 0x379175:
                                           if (!mStage.equals("wait")) {
                                              goto label_0161 ;
                                           }else {
                                              i1 = 4;
                                           }
                                           break;
                                         case 0x5c4d208:
                                           if (!mStage.equals("error")) {
                                              goto label_0161 ;
                                           }else {
                                              i1 = 5;
                                           }
                                           break;
                                         case 0x65825f6:
                                           if (!mStage.equals("pause")) {
                                              goto label_0161 ;
                                           }else {
                                              i1 = 6;
                                           }
                                           break;
                                         case 0x68ac462:
                                           if (!mStage.equals("start")) {
                                              goto label_0161 ;
                                           }else {
                                              i1 = 7;
                                           }
                                           break;
                                         default:
                                           goto label_0161 ;
                                     }
                                     switch (i1){
                                         case 0:
                                           c.V8();
                                           c.v.g().m(c.x.m.d(), c.x.m.getLiveStreamId(), c.w);
                                           break;
                                         case 1:
                                         case 7:
                                         case 2:
                                           d.a(i).gameDownload(c.getActivity(), c.P8(gameCenterDo, GameCenterDownloadParams$DownloadAction.PAUSE));
                                           if (!PatchProxy.applyVoidOneRefs(gameCenterDo, c, uoc, "15")) {
                                              t$a uoa = new t$a(c.getActivity());
                                              uoa.y0(R.string.arg_RES_7f101145);
                                              uoa.S0(R.string.arg_RES_7f10117e);
                                              uoa.Q0(R.string.arg_RES_7f100a98);
                                              uoa.t0(c.b);
                                              uoa.u0(new h(c, gameCenterDo));
                                              t$a uoa1 = f.e(uoa);
                                              c.z = uoa1.Y(new e(c));
                                           }
                                           obj1 = c.v.g();
                                           str3 = c.x.m.d();
                                           liveStreamId = c.x.m.getLiveStreamId();
                                           w1 = c.w;
                                           Objects.requireNonNull(obj1);
                                           if (!PatchProxy.applyVoidThreeRefs(str3, liveStreamId, w1, obj1, LiveGzoneTurntableLogger.class, "27")) {
                                              obj2 = obj1.a("DOWNLOAD_PAUSE");
                                              obj2.params = obj1.e(str3, liveStreamId, w1);
                                              u1.u(1, obj2, obj1.g());
                                           }
                                           break;
                                         case 3:
                                           obj1 = c.v.g();
                                           str3 = c.x.m.d();
                                           liveStreamId = c.x.m.getLiveStreamId();
                                           w1 = c.w;
                                           Objects.requireNonNull(obj1);
                                           if (!PatchProxy.applyVoidThreeRefs(str3, liveStreamId, w1, obj1, LiveGzoneTurntableLogger.class, "29")) {
                                              obj2 = obj1.a("INSTALL_CLICK");
                                              obj2.params = obj1.e(str3, liveStreamId, w1);
                                              u1.u(1, obj2, obj1.g());
                                           }
                                           break;
                                         case 4:
                                         case 6:
                                         case 5:
                                           d.a(i).gameDownload(c.getActivity(), c.P8(gameCenterDo, GameCenterDownloadParams$DownloadAction.RESUME));
                                           obj1 = c.v.g();
                                           str3 = c.x.m.d();
                                           liveStreamId = c.x.m.getLiveStreamId();
                                           w1 = c.w;
                                           Objects.requireNonNull(obj1);
                                           if (!PatchProxy.applyVoidThreeRefs(str3, liveStreamId, w1, obj1, LiveGzoneTurntableLogger.class, "28")) {
                                              obj2 = obj1.a("DOWNLOAD_CONTINUE");
                                              obj2.params = obj1.e(str3, liveStreamId, w1);
                                              u1.u(1, obj2, obj1.g());
                                           }
                                           break;
                                         default:
                                     }
                                  }
                               }
                            }
                            c.S8(w.mTaskId, 2);
                            break;
                          default:
                            if (!TextUtils.x(w.mLink)) {
                               c.R8(w.mLink);
                            }else {
                               c.C.x.f();
                            }
                      }
                   }else {
                      mType = w.mCommentContent;
                      if (!PatchProxy.applyVoidOneRefs(mType, c, uoc, "21")) {
                         c.C.x.f();
                         c.C.x.e();
                         c.x.R.Zn(mType, "UNKNOWN");
                      }
                   }
                }else {
                   c.v.f();
                   c.C.x.e();
                }
             }else {
                mType = w.mGiftId;
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mType), c, uoc, "25")) {
                   c.C.x.e();
                   c.x.Q.Vg(mType);
                   b.c0(LiveLogTag.GZONE, "LiveGzoneAudienceTurntableTaskAdapter", "openGiftView", String.valueOf(mType));
                   c.C.x.f();
                }
             }
          }
          obj1 = c.v.g();
          Objects.requireNonNull(obj1);
          if (!PatchProxy.applyVoidOneRefs(w, obj1, LiveGzoneTurntableLogger.class, "7")) {
             ClientEvent$ElementPackage uElementPack = obj1.a("LIVE_TURNTABLE_DOTASK_BUTTON");
             uElementPack.params = obj1.d(w);
             u1.u(1, uElementPack, obj1.g());
          }
       }
       return;
    }
}
