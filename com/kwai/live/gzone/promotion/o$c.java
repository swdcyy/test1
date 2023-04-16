package com.kwai.live.gzone.promotion.o$c;
import erd.g;
import com.kwai.live.gzone.promotion.o;
import java.lang.Object;
import android.util.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameResourceListResponse;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameListResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import pp.d;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Integer;
import com.kwai.live.gzone.common.keyswitch.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.b;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import com.kwai.live.gzone.common.keyswitch.b$d;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameListResponse$BigCardConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import s67.s0;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.promotion.s;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import s67.t0;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame$ExtraDesc;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame$ExtraDescUrl;
import s67.j1;
import s67.k1;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import s67.l1;
import com.kwai.framework.model.feed.BaseFeed;
import fq5.b;
import android.widget.ProgressBar;
import s67.m1;
import rq5.a;
import pq5.c;
import java.util.ArrayList;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionSoGame;
import t67.a;
import com.yxcorp.utility.SystemUtil;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameListResponse$GzonePromotionGameNotice;
import s67.a;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneQuickPromotionInfo;

public class o$c implements g	// class@000dd3
{
    public final o b;

    public void o$c(o p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       ArrayList uArrayList;
       Iterator iterator;
       a uoa;
       LiveGzonePromotionGame liveGzonePro1;
       LiveGzonePromotionGame liveGzonePro2;
       o q;
       Object obj = this;
       Pair obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, o$c.class, "1")) {
       }else {
          Pair second = obj1.second;
          if (second != null) {
             obj.b.C = second.mLiveGzonePromotionResourceList;
          }
          o$c b = obj.b;
          obj1 = obj1.first;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(obj1, b, o.class, "11")) {
             LiveLogTag gZONE = LiveLogTag.GZONE;
             b.v.h(gZONE, "getGameList accept"+obj1+" mBottomIconPushToggle:"+b.L);
             if (b.L != null) {
                boolean b1 = true;
                if (obj1 == null || (q.f(obj1.mLiveGzonePromotionGameList) && (q.f(obj1.mLiveGzonePromotionActivityList) && q.f(obj1.mSoGameList)))) {
                   o k = b.K;
                   if (k == null || TextUtils.x(k.sogamePromotionKwailink)) {
                      b1 = false;
                   }
                   b.d9(b1);
                }else {
                   o v = b.v;
                   LiveGzonePromotionGameListResponse mLiveGzonePr = obj1.mLiveGzonePromotionGameList;
                   int i = (mLiveGzonePr == null)? 0: mLiveGzonePr.size();
                   Integer integer = Integer.valueOf(i);
                   mLiveGzonePr = obj1.mLiveGzonePromotionActivityList;
                   i = (mLiveGzonePr == null)? 0: mLiveGzonePr.size();
                   Integer integer1 = Integer.valueOf(i);
                   mLiveGzonePr = obj1.mSoGameList;
                   i = (mLiveGzonePr == null)? 0: mLiveGzonePr.size();
                   v.k(gZONE, "accept size:", "gameListSize", integer, "activityListSize", integer1, "soGameListSize", Integer.valueOf(i));
                   b.P8();
                   Object[] objArray = null;
                   String str = "13";
                   LiveGzonePromotionGameListResponse obj2 = PatchProxy.apply(objArray, objArray, a.class, str);
                   boolean b2 = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): b.b().a(LiveGzoneKeys.KEY_SWITCH_ENABLE_GAME_PROMOTION_CARD).a();
                   if (b2 && (obj1.mBigCardConfig != null && (!q.f(obj1.mLiveGzonePromotionGameList) && !TextUtils.x(obj1.mBigCardConfig.mGameId)))) {
                      obj2 = obj1.mLiveGzonePromotionGameList;
                      LiveGzonePromotionGameListResponse mBigCardConf = obj1.mBigCardConfig;
                      if (!PatchProxy.applyVoidTwoRefs(obj2, mBigCardConf, b, o.class, str)) {
                         Iterator iterator2 = obj2.iterator();
                         while (true) {
                            if (iterator2.hasNext()) {
                               liveGzonePro1 = iterator2.next();
                               if (TextUtils.n(mBigCardConf.mGameId, liveGzonePro1.mGameId)) {
                                  objArray = liveGzonePro1;
                               }
                            }
                            if (objArray != null) {
                               if (b.N == null) {
                                  View view = a.a(b.getContext(), R.layout.arg_RES_7f0d0bbc);
                                  view.setOnClickListener(new s0(b));
                                  b.N = new s(b.getActivity(), view);
                               }
                               v = b.N;
                               q = b.q;
                               o s = b.s;
                               t0 ot0 = new t0(b);
                               Objects.requireNonNull(v);
                               if (PatchProxy.isSupport(s.class)) {
                                  Object[] objArray1 = new Object[]{mBigCardConf,objArray,q,s,ot0};
                                  if (PatchProxy.applyVoid(objArray1, v, s.class, "2")) {
                                  label_0217 :
                                     b.z.eo(b.N);
                                  }
                               }
                               v.t = objArray;
                               v.u = s;
                               v.s.U(mBigCardConf.mBackgroundPics);
                               v.k.setText(objArray.mGameName);
                               liveGzonePro2 = objArray.mExtraDescs;
                               if (liveGzonePro2 != null && liveGzonePro2.size() >= 2) {
                                  v.l.setText(objArray.mExtraDescs.get(0).mDesc);
                                  v.m.setText(objArray.mExtraDescs.get(b1).mDesc);
                               }
                               liveGzonePro2 = objArray.mExtraDescUrls;
                               if (liveGzonePro2 != null && liveGzonePro2.size() >= 2) {
                                  v.p.setText(objArray.mExtraDescUrls.get(0).mTitle);
                                  v.p.setOnClickListener(new j1(v, objArray));
                                  v.q.setText(objArray.mExtraDescUrls.get(b1).mTitle);
                                  v.q.setOnClickListener(new k1(v, objArray));
                                  v.r.setVisibility(0);
                               }else {
                                  v.r.setVisibility(8);
                               }
                               v.z(d.a(-1986139969).getGameCenterDownloadInfoByGameId(objArray.mGameId));
                               v.n.setOnClickListener(new l1(v, objArray, q, s));
                               v.j.setOnClickListener(new m1(objArray, s, ot0));
                               goto label_0217 ;
                            }
                         }
                      }
                   }
                label_021e :
                   if (!q.f(obj1.mSoGameList)) {
                      uArrayList = new ArrayList();
                      iterator = obj1.mSoGameList.iterator();
                      while (iterator.hasNext()) {
                         LiveGzonePromotionSoGame liveGzonePro = iterator.next();
                         uoa = new a(b1, liveGzonePro.mGameId);
                         uoa.d = liveGzonePro;
                         uArrayList.add(uoa);
                      }
                      b.D.addAll(uArrayList);
                   }
                   obj2 = obj1.mLiveGzonePromotionGameList;
                   if (!PatchProxy.applyVoidOneRefs(obj2, b, o.class, "15") && !q.f(obj2)) {
                      iterator = obj2.iterator();
                      ArrayList uArrayList1 = new ArrayList();
                      while (iterator.hasNext()) {
                         liveGzonePro2 = iterator.next();
                         if (SystemUtil.M(b.getActivity(), liveGzonePro2.mIdentifier)) {
                            iterator.remove();
                            uArrayList1.add(liveGzonePro2);
                         }else {
                            continue ;
                         }
                      }
                      obj2.addAll(uArrayList1);
                   }
                   if (!q.f(obj1.mLiveGzonePromotionGameList)) {
                      uArrayList = new ArrayList();
                      iterator = obj1.mLiveGzonePromotionGameList.iterator();
                      while (iterator.hasNext()) {
                         liveGzonePro1 = iterator.next();
                         uoa = new a(0, liveGzonePro1.mGameId);
                         uoa.c = liveGzonePro1;
                         uArrayList.add(uoa);
                      }
                      b.D.addAll(uArrayList);
                   }
                   b.I = obj1.mLiveGzonePromotionActivityList;
                   b.d9(b1);
                   b.p.b(obj1.mGzonePromotionGameNotice);
                   b.H.onNext(b.D);
                   Iterator iterator1 = b.D.iterator();
                   while (iterator1.hasNext()) {
                      a uoa1 = iterator1.next();
                      if (uoa1.a == b1 || TextUtils.x(uoa1.b)) {
                         continue ;
                      }else {
                         uoa1 = uoa1.b;
                         if (PatchProxy.applyVoidOneRefs(uoa1, b, o.class, "22")) {
                            continue ;
                         }else {
                            GameCenterDownloadParams$DownloadInfo gameCenterDo = d.a(-1986139969).getGameCenterDownloadInfoByGameId(uoa1);
                            b.E.put(uoa1, gameCenterDo);
                            if (TextUtils.x(b.F) && (gameCenterDo != null && gameCenterDo.isDownloadingStatus())) {
                               b.F = uoa1;
                            }
                         label_0320 :
                            b.c9();
                         }
                      }
                   }
                   b.c9();
                }
             }
          }
       }
       return;
    }
}
