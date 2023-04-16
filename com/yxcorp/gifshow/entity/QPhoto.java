package com.yxcorp.gifshow.entity.QPhoto;
import zp.i;
import lnc.z9;
import bw6.a;
import im8.g;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import java.util.ArrayList;
import mrd.a;
import java.util.HashMap;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto$c;
import com.kwai.component.homepage_interface.channel.model.ChannelTemplateFeed;
import fi5.u;
import com.kwai.components.nearbymodel.model.q;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardFeed;
import com.yxcorp.gifshow.follow.common.data.SurveyFeed;
import nfd.r2;
import com.yxcorp.plugin.search.utils.y;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Boolean;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Long;
import com.kuaishou.android.model.mix.FollowShootModel;
import com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo;
import com.kuaishou.android.live.model.QLivePlayConfig;
import up.a;
import com.kuaishou.android.model.mix.CoverMeta;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.AnalysisEntranceModel;
import java.lang.Integer;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.kuaishou.android.model.mix.ImageMetaExt;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kuaishou.android.model.mix.BottomComponentMaterial;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.mix.BottomEntryInfoModel;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import com.kuaishou.android.model.mix.CoCreateInfo;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kuaishou.android.model.mix.CoronaModelMeta;
import com.kuaishou.android.model.mix.CoronaExpParams;
import com.kuaishou.android.model.mix.CoronaFeedVipInfo;
import da6.c;
import com.kuaishou.android.model.mix.ExtMeta;
import com.yxcorp.gifshow.model.EditInfo;
import com.kuaishou.android.model.mix.ExtEntryModel;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.FansGroupV2Info;
import com.kuaishou.android.model.mix.FansTopDisplayStyle;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kuaishou.android.model.mix.FindTkFeedMeta;
import com.kuaishou.android.model.mix.FindTkInfoData;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import java.util.Map;
import com.kuaishou.android.model.mix.KMovieTemplate;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import com.kuaishou.android.model.mix.LipsSyncModel;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import com.kuaishou.android.model.mix.Location;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicWheelInfo;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo;
import com.kuaishou.android.model.mix.PosterSpecialEffect;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
import zp.a0;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import com.kuaishou.android.model.mix.SameFrameInfo;
import com.kuaishou.android.model.mix.TubeMeta;
import com.kwai.framework.model.user.UserStatusExt;
import com.kwai.framework.model.user.UserStatus;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Void;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import vca.i;
import com.yxcorp.gifshow.entity.n2;
import tl8.d;
import ok.h;
import tl8.e;
import java.lang.Number;
import com.yxcorp.gifshow.entity.c;
import com.yxcorp.gifshow.entity.o2;
import com.yxcorp.gifshow.entity.p2;
import com.yxcorp.gifshow.entity.q2;
import com.yxcorp.gifshow.entity.r2;
import com.kuaishou.android.model.mix.FusionInfo;
import com.yxcorp.gifshow.entity.l7;
import com.kuaishou.android.model.mix.FeedSwitchesInfo;
import com.yxcorp.gifshow.entity.s2;
import com.yxcorp.gifshow.entity.t2;
import com.yxcorp.gifshow.entity.u2;
import com.yxcorp.gifshow.entity.v2;
import com.yxcorp.gifshow.entity.d;
import com.yxcorp.gifshow.entity.w2;
import com.yxcorp.gifshow.entity.x2;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.entity.a8;
import com.yxcorp.gifshow.entity.e;
import com.yxcorp.gifshow.entity.y2;
import com.yxcorp.gifshow.entity.c1;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.yxcorp.gifshow.entity.z2;
import com.yxcorp.gifshow.entity.a3;
import com.yxcorp.gifshow.entity.b3;
import com.yxcorp.gifshow.entity.c3;
import com.yxcorp.gifshow.entity.p1;
import com.yxcorp.gifshow.entity.w1;
import com.yxcorp.gifshow.entity.q1;
import kp.h0;
import com.yxcorp.gifshow.entity.r1;
import java.lang.Float;
import tca.q2;
import tca.r2;
import kp.i0;
import com.yxcorp.gifshow.entity.d3;
import com.yxcorp.gifshow.entity.q7;
import com.yxcorp.gifshow.entity.y1;
import com.yxcorp.gifshow.entity.f;
import com.yxcorp.gifshow.entity.g;
import com.yxcorp.gifshow.entity.h;
import com.yxcorp.gifshow.entity.i;
import com.yxcorp.gifshow.entity.e3;
import com.yxcorp.gifshow.entity.f3;
import com.yxcorp.gifshow.entity.j;
import com.kuaishou.android.model.mix.ColumnMeta;
import com.yxcorp.gifshow.entity.g3;
import com.kuaishou.android.model.mix.CommentMeta;
import com.yxcorp.gifshow.entity.h3;
import com.yxcorp.gifshow.entity.i3;
import com.yxcorp.gifshow.entity.x6;
import com.yxcorp.gifshow.entity.a1;
import com.yxcorp.gifshow.entity.b1;
import zp.d;
import com.kuaishou.android.model.mix.CoverMetaExt;
import kp.r1;
import tca.n0;
import com.yxcorp.gifshow.entity.d1;
import com.yxcorp.gifshow.entity.e1;
import com.yxcorp.gifshow.entity.f1;
import com.yxcorp.gifshow.entity.g1;
import com.yxcorp.gifshow.entity.k;
import kp.k1;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.entity.k1;
import com.yxcorp.gifshow.entity.l;
import com.kuaishou.android.model.mix.w;
import lnc.a1;
import com.yxcorp.gifshow.entity.j3;
import com.yxcorp.gifshow.entity.k3;
import com.yxcorp.gifshow.entity.l3;
import com.yxcorp.gifshow.entity.m3;
import com.yxcorp.gifshow.entity.m;
import com.yxcorp.gifshow.entity.n3;
import com.yxcorp.gifshow.entity.o3;
import com.yxcorp.gifshow.entity.h1;
import com.yxcorp.gifshow.entity.m7;
import com.kuaishou.android.model.fanstop.FansTopCommentTopBarInfo;
import com.yxcorp.gifshow.entity.n;
import com.yxcorp.gifshow.entity.p3;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.q3;
import com.yxcorp.gifshow.entity.r3;
import com.yxcorp.gifshow.entity.s3;
import com.yxcorp.gifshow.entity.t3;
import com.yxcorp.gifshow.entity.u3;
import com.yxcorp.gifshow.entity.m1;
import com.yxcorp.gifshow.entity.y6;
import com.yxcorp.gifshow.entity.v3;
import com.yxcorp.gifshow.entity.o;
import com.yxcorp.gifshow.entity.z6;
import com.yxcorp.gifshow.entity.a7;
import com.yxcorp.gifshow.entity.p;
import com.yxcorp.gifshow.entity.w3;
import com.yxcorp.gifshow.entity.b7;
import com.yxcorp.gifshow.entity.x3;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo;
import kp.n0;
import com.yxcorp.gifshow.entity.y3;
import com.yxcorp.gifshow.entity.z3;
import java.util.Collections;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import com.yxcorp.gifshow.entity.a4;
import com.yxcorp.gifshow.entity.b4;
import com.yxcorp.gifshow.entity.q;
import com.yxcorp.gifshow.entity.r7;
import com.yxcorp.gifshow.entity.s7;
import com.kuaishou.android.live.model.LiveStreamModel$Live;
import java.lang.Enum;
import com.yxcorp.gifshow.entity.t7;
import com.yxcorp.gifshow.entity.u7;
import com.yxcorp.gifshow.entity.v7;
import com.yxcorp.gifshow.entity.x1;
import com.yxcorp.gifshow.entity.r;
import com.yxcorp.gifshow.entity.s;
import com.yxcorp.gifshow.entity.c4;
import com.yxcorp.gifshow.entity.d4;
import com.yxcorp.gifshow.entity.e4;
import com.yxcorp.gifshow.entity.f4;
import com.yxcorp.gifshow.entity.g4;
import com.yxcorp.gifshow.entity.h4;
import com.yxcorp.gifshow.entity.i4;
import com.yxcorp.gifshow.entity.j4;
import com.yxcorp.gifshow.entity.k4;
import com.yxcorp.gifshow.entity.l4;
import com.yxcorp.gifshow.entity.s1;
import com.yxcorp.gifshow.entity.m4;
import tca.u2;
import com.yxcorp.gifshow.entity.n4;
import com.yxcorp.gifshow.entity.i1;
import com.yxcorp.gifshow.entity.t;
import com.yxcorp.gifshow.entity.o4;
import com.yxcorp.gifshow.entity.u;
import com.yxcorp.gifshow.entity.p4;
import com.yxcorp.gifshow.entity.w7;
import com.yxcorp.gifshow.entity.q4;
import com.yxcorp.gifshow.entity.v;
import com.yxcorp.gifshow.entity.w;
import com.yxcorp.gifshow.entity.r4;
import com.yxcorp.gifshow.entity.s4;
import com.yxcorp.gifshow.entity.x;
import com.yxcorp.gifshow.entity.t4;
import com.yxcorp.gifshow.entity.u4;
import com.yxcorp.gifshow.entity.y;
import com.yxcorp.gifshow.entity.v4;
import com.yxcorp.gifshow.entity.z;
import com.yxcorp.gifshow.entity.a0;
import com.yxcorp.gifshow.entity.b0;
import com.yxcorp.gifshow.entity.w4;
import com.kuaishou.android.model.recruit.RecruitCardInfoModel;
import com.kuaishou.android.model.feed.VideoFeed;
import com.yxcorp.gifshow.entity.c0;
import com.yxcorp.gifshow.entity.x4;
import com.yxcorp.gifshow.entity.c7;
import com.yxcorp.gifshow.entity.d0;
import com.yxcorp.gifshow.entity.e0;
import com.yxcorp.gifshow.entity.f0;
import com.yxcorp.gifshow.entity.g0;
import com.yxcorp.gifshow.entity.h0;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import com.yxcorp.gifshow.entity.y4;
import com.yxcorp.gifshow.entity.z4;
import com.yxcorp.gifshow.entity.t1;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.yxcorp.gifshow.entity.n1;
import com.yxcorp.gifshow.entity.u1;
import com.yxcorp.gifshow.entity.v1;
import com.yxcorp.gifshow.entity.a5;
import com.yxcorp.gifshow.entity.b5;
import com.yxcorp.gifshow.entity.i0;
import com.yxcorp.gifshow.entity.c5;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.yxcorp.gifshow.entity.d5;
import com.yxcorp.gifshow.entity.e5;
import com.yxcorp.gifshow.entity.f5;
import com.kuaishou.android.model.mix.TemplateFeedMeta;
import com.yxcorp.gifshow.entity.g5;
import com.yxcorp.gifshow.entity.j0;
import com.yxcorp.gifshow.entity.h5;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.tube.TubeEntryInfo;
import com.yxcorp.gifshow.entity.u6;
import com.kuaishou.android.model.feed.PhotoType;
import kp.l1;
import com.kuaishou.android.model.feed.e0;
import com.yxcorp.gifshow.entity.j7;
import com.yxcorp.gifshow.entity.p7;
import com.yxcorp.gifshow.entity.i5;
import com.yxcorp.gifshow.entity.l1;
import com.yxcorp.gifshow.entity.d7;
import com.yxcorp.gifshow.entity.e7;
import com.yxcorp.gifshow.entity.f7;
import com.yxcorp.gifshow.entity.k0;
import com.yxcorp.gifshow.entity.g7;
import com.yxcorp.gifshow.entity.l0;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.j5;
import wkd.b;
import ip.b;
import com.yxcorp.gifshow.entity.a2;
import com.yxcorp.gifshow.entity.k5;
import com.yxcorp.gifshow.entity.m0;
import com.kuaishou.android.model.feed.ActivityTemplateFeed;
import com.yxcorp.gifshow.entity.g2;
import com.yxcorp.gifshow.entity.h2;
import com.yxcorp.gifshow.entity.l5;
import com.yxcorp.gifshow.entity.m5;
import kp.w1;
import kp.j0;
import com.yxcorp.gifshow.entity.n5;
import com.yxcorp.gifshow.entity.n0;
import com.yxcorp.gifshow.entity.o5;
import com.yxcorp.gifshow.entity.j1;
import com.yxcorp.gifshow.entity.o0;
import com.yxcorp.gifshow.entity.p5;
import com.yxcorp.gifshow.entity.p0;
import com.yxcorp.gifshow.entity.q5;
import com.kuaishou.android.model.feed.AggregateTemplateFeed;
import com.yxcorp.gifshow.entity.k7;
import com.yxcorp.gifshow.entity.i2;
import com.yxcorp.gifshow.entity.q0;
import com.yxcorp.gifshow.entity.v6;
import com.yxcorp.gifshow.detail.qphotoplayer.b;
import com.kuaishou.android.model.feed.ImageFeed;
import com.yxcorp.gifshow.entity.r5;
import com.yxcorp.gifshow.entity.r0;
import com.yxcorp.gifshow.entity.s5;
import com.yxcorp.gifshow.entity.b2;
import com.yxcorp.gifshow.entity.j2;
import com.yxcorp.gifshow.entity.k2;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.feed.LocationPermissionFeed;
import com.yxcorp.gifshow.entity.s0;
import com.yxcorp.gifshow.entity.t0;
import kp.l0;
import com.yxcorp.gifshow.entity.h7;
import com.yxcorp.gifshow.entity.i7;
import com.yxcorp.gifshow.entity.t5;
import com.kuaishou.android.model.feed.MusicRadioFeed;
import com.yxcorp.gifshow.entity.u0;
import com.yxcorp.gifshow.entity.u5;
import com.yxcorp.gifshow.entity.x7;
import com.yxcorp.gifshow.entity.v5;
import ip.c;
import com.yxcorp.gifshow.entity.w5;
import kp.l;
import com.yxcorp.gifshow.entity.c2;
import com.yxcorp.gifshow.entity.x5;
import com.yxcorp.gifshow.entity.y7;
import com.yxcorp.gifshow.entity.d2;
import com.yxcorp.gifshow.entity.e2;
import com.yxcorp.gifshow.entity.y5;
import com.yxcorp.gifshow.entity.v0;
import com.yxcorp.gifshow.entity.z5;
import com.yxcorp.gifshow.entity.z7;
import com.yxcorp.gifshow.entity.b8;
import com.yxcorp.gifshow.entity.a6;
import com.yxcorp.gifshow.entity.b6;
import com.yxcorp.gifshow.entity.w0;
import com.yxcorp.gifshow.entity.x0;
import com.yxcorp.gifshow.entity.o1;
import com.yxcorp.gifshow.entity.y0;
import com.yxcorp.gifshow.entity.l2;
import com.yxcorp.gifshow.entity.m2;
import com.yxcorp.gifshow.entity.o7;
import com.yxcorp.gifshow.entity.c6;
import com.kuaishou.android.model.feed.TemplateFeed;
import com.yxcorp.gifshow.entity.d6;
import com.yxcorp.gifshow.entity.n7;
import com.kwai.framework.model.feed.UnknownFeed;
import com.yxcorp.gifshow.entity.e6;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.z0;
import java.lang.System;
import com.yxcorp.gifshow.entity.f6;
import com.yxcorp.gifshow.entity.g6;
import com.yxcorp.gifshow.entity.h6;
import com.yxcorp.gifshow.entity.z1;
import com.yxcorp.gifshow.entity.i6;
import xf6.d;
import xf6.l;
import com.yxcorp.gifshow.entity.j6;
import com.yxcorp.gifshow.entity.k6;
import com.yxcorp.gifshow.entity.l6;
import com.yxcorp.gifshow.entity.m6;
import brd.t;
import ei5.c;
import q87.c;
import ekd.j;
import com.yxcorp.gifshow.entity.QPhoto$a;
import java.lang.Runnable;
import t45.c;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.n6;
import com.yxcorp.gifshow.entity.o6;
import com.yxcorp.gifshow.entity.p6;
import com.yxcorp.gifshow.entity.q6;
import tca.u;
import tca.s1;
import tca.t1;
import tca.j;
import tca.u1;
import tca.k;
import tca.a0;
import tca.b0;
import tca.c1;
import tca.i;
import tca.x0;
import tca.v1;
import tca.r1;
import tca.o0;
import tca.k2;
import tca.q0;
import tca.l2;
import tca.d1;
import tca.t;
import tca.e0;
import tca.x1;
import tca.y1;
import tca.c0;
import tca.s;
import tca.z1;
import tca.y;
import tca.p0;
import tca.l;
import tca.m;
import tca.b1;
import tca.e1;
import tca.n2;
import tca.f1;
import tca.g1;
import tca.h1;
import tca.a2;
import tca.d0;
import tca.z;
import tca.x;
import tca.i1;
import tca.f0;
import tca.j1;
import tca.b2;
import tca.r0;
import tca.s0;
import tca.t0;
import tca.n;
import tca.u0;
import tca.w;
import tca.k1;
import tca.c2;
import tca.o;
import tca.p;
import tca.q;
import tca.m2;
import tca.a1;
import tca.d2;
import tca.e2;
import tca.z0;
import tca.v;
import tca.l1;
import tca.r;
import tca.f2;
import tca.v0;
import tca.m1;
import tca.g2;
import tca.g0;
import tca.n1;
import tca.y0;
import tca.h0;
import tca.o2;
import tca.i0;
import tca.j0;
import tca.k0;
import tca.l0;
import tca.i2;
import tca.o1;
import tca.p1;
import tca.w1;
import tca.m0;
import tca.j2;
import tca.h2;
import tca.q1;
import tca.w0;
import tca.p2;
import com.yxcorp.gifshow.entity.f2;
import com.yxcorp.gifshow.entity.r6;
import com.yxcorp.gifshow.entity.s6;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import erd.g;
import yl8.b;
import java.io.File;
import zp.c0;
import qkd.b;
import j80.c;
import lnc.d4;
import java.util.Set;
import im8.e;
import com.yxcorp.gifshow.entity.t6;
import com.yxcorp.gifshow.entity.w6;

public class QPhoto extends DefaultSyncable implements i, z9, a, g	// class@001080
{
    public boolean isChecked;
    public BaseFeed mEntity;
    public final a mSubject;
    public Map mTransientTags;
    public static final int ILLEGAL_POSITION = 255;
    public static final String INVOKER_ID = "QPhotoRegister";
    public static final float MAX_ASPECT_RATIO = 1.777778;
    public static final float MIN_ASPECT_RATIO = 0.000000;
    public static List sInvalidFeedCheckerList;
    public static List sPhotoWrapperIdProviderList;
    public static final long serialVersionUID;

    static {
       QPhoto.sInvalidFeedCheckerList = new ArrayList();
       QPhoto.sPhotoWrapperIdProviderList = new ArrayList();
       QPhoto.doRegister();
    }
    public void QPhoto(){
       super();
       this.mSubject = a.g();
       this.mTransientTags = new HashMap();
    }
    public void QPhoto(BaseFeed p0){
       super();
       this.mEntity = p0;
    }
    public static void addInvalidFeedChecker(QPhoto$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, QPhoto.class, "289")) {
          return;
       }
       QPhoto.sInvalidFeedCheckerList.add(p0);
       return;
    }
    public static void addPhotoWrapperIdProvider(QPhoto$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, QPhoto.class, "46")) {
          return;
       }
       QPhoto.sPhotoWrapperIdProviderList.add(p0);
       return;
    }
    public static void doRegister(){
       if (PatchProxy.applyVoid(null, null, QPhoto.class, "1")) {
          return;
       }
       ChannelTemplateFeed.addInvalidFeedChecker();
       if (!PatchProxy.applyVoid(null, null, u.class, "4")) {
          QPhoto.addInvalidFeedChecker(q.a);
       }
       CommonInsertCardFeed.addInvalidFeedChecker();
       SurveyBigCardFeed.addInvalidFeedChecker();
       SurveyFeed.addInvalidFeedChecker();
       if (!PatchProxy.applyVoid(null, null, r2.class, "1")) {
          QPhoto.addPhotoWrapperIdProvider(y.a);
       }
       return;
    }
    public static Boolean lambda$canRewarded$61(PhotoMeta p0){
       p0 = p0.mRewardPhotoInfo;
       boolean b = (p0 != null && p0.mCanReward != null)? true: false;
       return Boolean.valueOf(b);
    }
    public static Long lambda$created$37(CommonMeta p0){
       return Long.valueOf(p0.mCreated);
    }
    public static Boolean lambda$disableFollowShoot$63(PhotoMeta p0){
       p0 = p0.mFollowShootModel;
       boolean b = (p0 != null && p0.mDisableFollowShoot != null)? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$disableTranscodeHiddenUserInfo$55(PhotoMeta p0){
       return Boolean.valueOf(p0.mDisableTranscodeHiddenUserInfo);
    }
    public static Boolean lambda$enableActivityLike$110(PhotoMeta p0){
       return Boolean.valueOf(p0.activityLike);
    }
    public static Boolean lambda$enableActivityPressLike$111(PhotoMeta p0){
       return Boolean.valueOf(p0.activityPressLike);
    }
    public static Boolean lambda$enableShowLikeList$109(PhotoMeta p0){
       return Boolean.valueOf(p0.mShowLikeList);
    }
    public static Boolean lambda$enableShowQuickCommentGuide$57(PhotoMeta p0){
       return Boolean.valueOf(p0.mCanShowQuickCommentGuide);
    }
    public static Boolean lambda$enableShowRewardBubbleTip$59(PhotoMeta p0){
       boolean b;
       p0 = p0.mRewardPhotoInfo;
       if (p0 != null) {
          RewardPhotoInfo mRewardBubbl = p0.mRewardBubbleInfo;
          if (mRewardBubbl != null && mRewardBubbl.mEnableBubble != null) {
             b = true;
          label_000f :
             return Boolean.valueOf(b);
          }
       }
       b = false;
       goto label_000f ;
    }
    public static Boolean lambda$enableSpecialFocus$56(PhotoMeta p0){
       return Boolean.valueOf(p0.mEnableSpecialFocus);
    }
    public static Boolean lambda$enableTimeStamp$198(CommonMeta p0){
       return Boolean.valueOf(p0.mEnableTimestamp);
    }
    public static Boolean lambda$enableToolbarRewardPhoto$58(PhotoMeta p0){
       p0 = p0.mRewardPhotoInfo;
       boolean b = (p0 != null && (p0.mHeadButton != null || p0.mHeadButtonNow != null))? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$enableV4Head$46(PhotoMeta p0){
       return Boolean.valueOf(p0.mEnableV4Head);
    }
    public static Boolean lambda$expectFreeTraffic$25(QLivePlayConfig p0){
       return Boolean.valueOf(p0.mExpectFreeTraffic);
    }
    public static Boolean lambda$expectFreeTraffic$26(CommonMeta p0){
       return Boolean.valueOf(p0.mExpectFreeTraffic);
    }
    public static a lambda$getActionReportFetcher$214(PhotoMeta p0){
       return p0.mPhotoActionReportFetcher;
    }
    public static CDNUrl[] lambda$getAdCoverThumbnailUrls$75(CoverMeta p0){
       return p0.mOverrideCoverThumbnailUrls;
    }
    public static Long lambda$getAiCutPhotoStyleId$234(PhotoMeta p0){
       return Long.valueOf(p0.mAiCutPhotoStyleId);
    }
    public static AnalysisEntranceModel lambda$getAnalysisEntrance$241(PhotoMeta p0){
       return p0.mAnalysisEntranceModel;
    }
    public static Integer lambda$getAtMePhotoPrivacyStatus$122(PhotoMeta p0){
       return Integer.valueOf(p0.mAtMePhotoPrivacyStatus);
    }
    public static String lambda$getAtlasDetailTitle$280(PhotoMeta p0){
       return p0.mAtlasDetailTitle;
    }
    public static ImageMeta$Atlas lambda$getAtlasInfo$179(ImageMeta p0){
       return p0.mAtlas;
    }
    public static List lambda$getAtlasPhotosCdn$177(int p0,ImageMeta p1){
       return ImageMetaExt.getAtlasPhotoCdn(p1, p0);
    }
    public static ImageMeta$AtlasCoverSize lambda$getAtlasSize$178(int p0,ImageMeta p1){
       return ImageMetaExt.getAtlasSize(p1, p0);
    }
    public static BottomComponentMaterial lambda$getBottomComponentMaterial$121(PhotoMeta p0){
       return p0.mBottomComponentMaterial;
    }
    public static BottomEntryInfoModel lambda$getBottomEntryInfo$135(LiveStreamModel p0){
       return p0.mBottomEntryInfo;
    }
    public static String lambda$getCaption$30(CommonMeta p0){
       return p0.mCaption;
    }
    public static CaptionSearchInfo lambda$getCaptionSearchInfo$32(CommonMeta p0){
       return p0.mCaptionSearchInfo;
    }
    public static String lambda$getCaptionTitle$35(CommonMeta p0){
       return p0.mCaptionTitle;
    }
    public static String lambda$getCaptionToComment$31(CommonMeta p0){
       return p0.mCaptionToComment;
    }
    public static CoCreateInfo lambda$getCoCreateInfo$287(PhotoMeta p0){
       return p0.mCoCreateInfo;
    }
    public static CoCreateInvitationInfo lambda$getCoCreateInvitationInfo$291(PhotoMeta p0){
       return p0.mCoCreateInvitationInfo;
    }
    public static Integer lambda$getColor$99(CommonMeta p0){
       return Integer.valueOf(p0.mColor);
    }
    public static String lambda$getCommentAtBubbleMessage$123(PhotoMeta p0){
       return p0.mCommentAtBubbleMessage;
    }
    public static List lambda$getCommentPanelDynamicTabsInfo$261(PhotoMeta p0){
       return p0.mCommentDynamicTabsInfo;
    }
    public static Boolean lambda$getCommentPhotoInfoSucceed$258(PhotoMeta p0){
       return Boolean.valueOf(p0.mCommentPhotoInfoSucceed);
    }
    public static Integer lambda$getContinuePlayStrategy$52(VideoMeta p0){
       return Integer.valueOf(p0.mContinuePlayStrategy);
    }
    public static CoronaExpParams lambda$getCoronaExpParams$285(CoronaModelMeta p0){
       return p0.mCoronaExpParams;
    }
    public static CoronaFeedVipInfo lambda$getCoronaFeedVipInfo$284(CoronaModelMeta p0){
       return p0.mCoronaFeedVipInfo;
    }
    public static Object lambda$getCoverMetaExtra$186(String p0,CoverMeta p1){
       return p1.getExtra(p0);
    }
    public static String lambda$getCoverThumbnailUrl$72(CoverMeta p0){
       return p0.mCoverThumbnailUrl;
    }
    public static CDNUrl[] lambda$getCoverThumbnailUrls$73(CoverMeta p0){
       return p0.mCoverThumbnailUrls;
    }
    public static String lambda$getCoverUrl$70(CoverMeta p0){
       return p0.mCoverUrl;
    }
    public static CDNUrl[] lambda$getCoverUrls$71(CoverMeta p0){
       return p0.mCoverUrls;
    }
    public static Integer lambda$getCurrentPosition$0(CommonMeta p0){
       return Integer.valueOf(p0.mCurrentPosition);
    }
    public static Integer lambda$getDelay$93(ExtMeta p0){
       return Integer.valueOf(p0.mDelay);
    }
    public static Integer lambda$getDirection$158(CommonMeta p0){
       return Integer.valueOf(p0.mDirection);
    }
    public static String lambda$getDisclaimerMessage$184(PhotoMeta p0){
       return p0.mDisclaimerMessage;
    }
    public static String lambda$getDisplayTime$183(PhotoMeta p0){
       return p0.mDisplayTime;
    }
    public static EditInfo lambda$getEditInfo$232(PhotoMeta p0){
       return p0.mEditInfo;
    }
    public static Boolean lambda$getEnableCommentPhotoInfoRequest$262(PhotoMeta p0){
       return Boolean.valueOf(p0.mEnableCommentPhotoInfoRequest);
    }
    public static String lambda$getExpTag$102(CommonMeta p0){
       return p0.mExpTag;
    }
    public static ExtEntryModel lambda$getExtEntryModel$98(PhotoMeta p0){
       return p0.mExtEntryModel;
    }
    public static Long lambda$getExtraSaveProgressTime$41(PhotoMeta p0){
       return Long.valueOf(p0.mExtraSaveProgressTime);
    }
    public static CDNUrl[] lambda$getFFCoverThumbnailUrls$74(CoverMeta p0){
       return p0.mFFCoverThumbnailUrls;
    }
    public static FansGroupV2Info lambda$getFansGroupInfo$8(User p0){
       return p0.mFansGroupV2Info;
    }
    public static FansTopDisplayStyle lambda$getFansTopStyle$29(CommonMeta p0){
       return p0.mFansTopDisplayStyle;
    }
    public static Integer lambda$getFastCommentType$244(PhotoMeta p0){
       return Integer.valueOf(p0.mFastCommentType);
    }
    public static PostStatus lambda$getFeedStatus$212(PhotoMeta p0){
       return p0.mPostWorkStatus;
    }
    public static String lambda$getFeedbackDetailParams$243(PhotoMeta p0){
       return p0.mFeedbackDetailParams;
    }
    public static List lambda$getFeedbackEntryIdList$242(PhotoMeta p0){
       return p0.mFeedbackEntryIds;
    }
    public static Integer lambda$getFilterAbnormalPhotoReason$202(PhotoMeta p0){
       return Integer.valueOf(p0.mFilterAbnormalPhotoReason);
    }
    public static Integer lambda$getFilterStatus$200(PhotoMeta p0){
       return Integer.valueOf(p0.mFilterStatus);
    }
    public static FindTkInfoData lambda$getFindTkInfoData$286(FindTkFeedMeta p0){
       return p0.mTkDInfo;
    }
    public static FlashPhotoTemplate lambda$getFlashPhotoTemplate$53(VideoMeta p0){
       return p0.mFlashPhotoTemplate;
    }
    public static FollowShootModel lambda$getFollowShootModel$125(PhotoMeta p0){
       return p0.mFollowShootModel;
    }
    public static Map lambda$getForwardStatsParams$7(CommonMeta p0){
       return p0.mForwardStatsParams;
    }
    public static CDNUrl[] lambda$getH265VideoUrls$66(VideoMeta p0){
       return p0.mH265Urls;
    }
    public static CDNUrl[] lambda$getH265VideoUrlsNullable$69(VideoMeta p0){
       return p0.mH265Urls;
    }
    public static Integer lambda$getHeight$95(CommonMeta p0){
       return Integer.valueOf(p0.mHeight);
    }
    public static Integer lambda$getInteractStickerType$128(PhotoMeta p0){
       return Integer.valueOf(p0.mInteractStickerType);
    }
    public static KMovieTemplate lambda$getKMovieTemplate$54(VideoMeta p0){
       return p0.kmovieTemplate;
    }
    public static KaraokeChorusModel lambda$getKaraokeChorusModel$127(PhotoMeta p0){
       return p0.mKaraokeChorusModel;
    }
    public static KaraokeScoreInfo lambda$getKaraokeScore$180(PhotoMeta p0){
       return p0.mKaraokeScoreInfo;
    }
    public static List lambda$getKgTags$250(PhotoMeta p0){
       return p0.mKgTags;
    }
    public static String lambda$getKwaiId$113(PhotoMeta p0){
       return p0.mKwaiId;
    }
    public static LipsSyncModel lambda$getLipsSyncModel$120(PhotoMeta p0){
       return p0.mLipsSyncModel;
    }
    public static String lambda$getListLoadSequenceID$139(CommonMeta p0){
       return p0.mListLoadSequenceID;
    }
    public static String lambda$getLiveAudienceCount$130(LiveStreamModel p0){
       return p0.mAudienceCount;
    }
    public static Integer lambda$getLiveBizType$205(LiveStreamModel p0){
       return Integer.valueOf(p0.mLiveBizType);
    }
    public static List lambda$getLiveDisplayDistrictRank$207(LiveStreamModel p0){
       return p0.mDisplayDistrictRank;
    }
    public static String lambda$getLiveLikeCount$129(LiveStreamModel p0){
       return p0.mLikeCount;
    }
    public static String lambda$getLiveStreamId$131(LiveStreamModel p0){
       return p0.mLiveStreamId;
    }
    public static String lambda$getLiveStreamIdStr$133(LivePlaybackMeta p0){
       return p0.mLiveStreamIdEncryption;
    }
    public static Location lambda$getLocation$168(CommonMeta p0){
       return p0.mLocation;
    }
    public static String lambda$getLogReportContent$142(CommonMeta p0){
       return p0.mLogReportContext;
    }
    public static SimpleMagicFace lambda$getMagicFace$117(PhotoMeta p0){
       return p0.mMagicFace;
    }
    public static List lambda$getMagicFaces$118(PhotoMeta p0){
       return p0.mMagicFaces;
    }
    public static String lambda$getMessageGroupId$204(PhotoMeta p0){
       return p0.mMessageGroupId;
    }
    public static String lambda$getMockFeedMagicFaceRecoId$221(PhotoMeta p0){
       return p0.mMockFeedMagicFaceRecoId;
    }
    public static String lambda$getMockFeedMagicFaceRecoTaskId$223(PhotoMeta p0){
       return p0.mMockFeedMagicFaceRecoTaskId;
    }
    public static String lambda$getMockFeedPostAgainText$219(PhotoMeta p0){
       return p0.mMockFeedPostAgainText;
    }
    public static Integer lambda$getMockFeedTarget$216(PhotoMeta p0){
       return Integer.valueOf(p0.mMockFeedTarget);
    }
    public static String lambda$getMockFeedUploadSuccessText$217(PhotoMeta p0){
       return p0.mMockFeedUploadSuccessText;
    }
    public static Long lambda$getMoodTemplateId$235(PhotoMeta p0){
       return Long.valueOf(p0.mMoodTemplateId);
    }
    public static Music lambda$getMusic$115(PhotoMeta p0){
       return p0.mMusic;
    }
    public static MusicWheelInfo lambda$getMusicWheelInfo$269(PhotoMeta p0){
       return p0.mMusicWheelInfo;
    }
    public static Integer lambda$getOverallDetailSlideDifferent$264(PhotoMeta p0){
       return Integer.valueOf(p0.mOverallDetailSlideDifferent);
    }
    public static CDNUrl[] lambda$getOverrideCoverThumbnailUrls$191(CoverMeta p0){
       return p0.mOverrideCoverThumbnailUrls;
    }
    public static Integer lambda$getPageIndex$137(CommonMeta p0){
       return Integer.valueOf(p0.mPageIndex);
    }
    public static PhotoDisplayLocationInfo lambda$getPhotoDisplayLocationInfo$252(PhotoMeta p0){
       return p0.mPhotoDisplayLocationInfo;
    }
    public static List lambda$getPhotoMmuTagInfo$164(CommonMeta p0){
       return p0.mPhotoMmuTagInfo;
    }
    public static PlcEntryStyleInfo lambda$getPlcEntryStyleInfo$165(PhotoMeta p0){
       return p0.mPlcEntryStyleInfo;
    }
    public static PlcEntryStyleInfo lambda$getPlcFeatureEntry$134(LiveStreamModel p0){
       return p0.mPlcEntryStyleInfo;
    }
    public static Long lambda$getPlcResponseTime$166(PhotoMeta p0){
       return Long.valueOf(p0.mPlcResponseTime);
    }
    public static Integer lambda$getPosition$159(CommonMeta p0){
       return Integer.valueOf(p0.mPosition);
    }
    public static Integer lambda$getPositionInPage$20(CommonMeta p0){
       return Integer.valueOf(p0.mPositionInPage);
    }
    public static PostOperationEntranceInfo lambda$getPostOperationEntranceInfo$124(PhotoMeta p0){
       return p0.mPostOperationEntranceInfo;
    }
    public static Integer lambda$getPostWorkInfoId$226(PhotoMeta p0){
       return Integer.valueOf(p0.mPostWorkInfoId);
    }
    public static PosterSpecialEffect lambda$getPosterSpecialEffect$33(CommonMeta p0){
       return p0.mPosterSpecialEffect;
    }
    public static String lambda$getPrefetchReason$16(PhotoMeta p0){
       return p0.mPrefetchReason;
    }
    public static QuestionnaireInfo lambda$getQuestionnaireInfo$185(PhotoMeta p0){
       return p0.mQuestionnaireInfo;
    }
    public static Integer lambda$getRealRelationType$196(CommonMeta p0){
       return Integer.valueOf(p0.mRealRelationType);
    }
    public static List lambda$getRecentViewers$281(PhotoMeta p0){
       return p0.mRecentViewers;
    }
    public static String lambda$getRecoReason$162(CommonMeta p0){
       return p0.mRecoReason;
    }
    public static String lambda$getRecoTag$13(CommonMeta p0){
       return p0.getRankFeatures().q;
    }
    public static List lambda$getRecoTags$163(CommonMeta p0){
       return p0.mRecoTags;
    }
    public static RecreationSettingInfo lambda$getRecreationSettingInfo$245(PhotoMeta p0){
       return p0.mRecreationSettingInfo;
    }
    public static String lambda$getReportContext$106(CommonMeta p0){
       return p0.mReportContext;
    }
    public static SameFrameInfo lambda$getSameFrameInfo$119(PhotoMeta p0){
       return p0.mSameFrameInfo;
    }
    public static CDNUrl[] lambda$getSdVideoUrl$67(VideoMeta p0){
       return p0.mSdUrls;
    }
    public static String lambda$getSearchSessionId$145(CommonMeta p0){
       return p0.mSearchSessionId;
    }
    public static String lambda$getSearchUssid$143(CommonMeta p0){
       return p0.mUssId;
    }
    public static String lambda$getServerExpTag$103(CommonMeta p0){
       return p0.mServerExpTag;
    }
    public static String lambda$getSharePassingParam$101(CommonMeta p0){
       return p0.mSharePassingParam;
    }
    public static String lambda$getShareScene$104(CommonMeta p0){
       return p0.mShareScene;
    }
    public static Long lambda$getShowCount$136(PhotoMeta p0){
       return Long.valueOf(p0.mShowCount);
    }
    public static Boolean lambda$getShowFlowFeedback$228(PhotoMeta p0){
       return Boolean.valueOf(p0.mShowFlowFeedback);
    }
    public static Long lambda$getSnapShowDeadline$85(PhotoMeta p0){
       return Long.valueOf(p0.mSnapShowDeadline);
    }
    public static Music lambda$getSoundTrack$116(PhotoMeta p0){
       return p0.mSoundTrack;
    }
    public static String lambda$getSource$100(CommonMeta p0){
       return p0.mSource;
    }
    public static Boolean lambda$getStarci$39(PhotoMeta p0){
       return Boolean.valueOf(p0.mStarci);
    }
    public static Integer lambda$getSupportType$253(PhotoMeta p0){
       int i = (p0 == null)? 0: p0.mSupportType;
       return Integer.valueOf(i);
    }
    public static Integer lambda$getTagHashType$2(PhotoMeta p0){
       return Integer.valueOf(p0.mTagHashType);
    }
    public static List lambda$getTags$114(PhotoMeta p0){
       return p0.mTagItems;
    }
    public static Long lambda$getTimeStamp$270(PhotoMeta p0){
       return Long.valueOf(p0.mTimeStamp);
    }
    public static Integer lambda$getTopFeedIndex$233(CommonMeta p0){
       return Integer.valueOf(p0.mTopFeedIndex);
    }
    public static String lambda$getTransferParam$279(PhotoMeta p0){
       return p0.ptp;
    }
    public static TubeMeta lambda$getTubeMeta$126(TubeMeta p0){
       return p0;
    }
    public static UserStatus lambda$getUserStatus$199(UserStatusExt p0){
       return p0.mUserStatusMeta;
    }
    public static Integer lambda$getVideoColdStartType$254(PhotoMeta p0){
       int i = (p0 == null)? 0: p0.mVideoColdStartType;
       return Integer.valueOf(i);
    }
    public static Long lambda$getVideoDuration$96(ExtMeta p0){
       return Long.valueOf(p0.mVideoDuration);
    }
    public static Long lambda$getVideoMetaDuration$97(VideoMeta p0){
       return Long.valueOf(p0.mDuration);
    }
    public static String lambda$getVideoUrl$49(VideoMeta p0){
       return p0.mVideoUrl;
    }
    public static CDNUrl[] lambda$getVideoUrls$65(VideoMeta p0){
       return p0.mVideoUrls;
    }
    public static Long lambda$getViewTime$38(CommonMeta p0){
       return Long.valueOf(p0.mViewTime);
    }
    public static Long lambda$getWatchTime$68(VideoMeta p0){
       return Long.valueOf(p0.mWatchTime);
    }
    public static Integer lambda$getWidth$94(CommonMeta p0){
       return Integer.valueOf(p0.mWidth);
    }
    public static Boolean lambda$hasAtlasText$283(PhotoMeta p0){
       return Boolean.valueOf(p0.mHasAtlasText);
    }
    public static Boolean lambda$hasRewarded$60(PhotoMeta p0){
       p0 = p0.mRewardPhotoInfo;
       boolean b = (p0 != null && p0.mHasReward != null)? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$hasShowVertically$187(CommonMeta p0){
       return Boolean.valueOf(p0.mVerticalShowed);
    }
    public static Boolean lambda$isAlreadyConsumed$275(PhotoMeta p0){
       return Boolean.valueOf(p0.mAlreadyConsumed);
    }
    public static Boolean lambda$isAlreadyShowGodComment$271(PhotoMeta p0){
       return Boolean.valueOf(p0.mAlreadyShowGodComment);
    }
    public static Boolean lambda$isAuthorSubscribed$289(PhotoMeta p0){
       return Boolean.valueOf(p0.mSubscribeNotification);
    }
    public static Boolean lambda$isCloseLive$154(CommonMeta p0){
       return Boolean.valueOf(p0.mIsCloseLive);
    }
    public static Boolean lambda$isCollected$19(PhotoMeta p0){
       return Boolean.valueOf(p0.mCollected);
    }
    public static Boolean lambda$isCoverPrefetched$160(CoverMeta p0){
       return Boolean.valueOf(p0.mCoverPrefetched);
    }
    public static Boolean lambda$isCreatedSearchCard$149(CommonMeta p0){
       return Boolean.valueOf(p0.mCreatedSearchCard);
    }
    public static Boolean lambda$isDisallowShot$251(PhotoMeta p0){
       return Boolean.valueOf(p0.mDisallowShot);
    }
    public static Boolean lambda$isEnablePaidQuestion$195(CommonMeta p0){
       return Boolean.valueOf(p0.mEnablePaidQuestion);
    }
    public static Boolean lambda$isFeatureToFollowGuideShow$268(PhotoMeta p0){
       return Boolean.valueOf(p0.mFeatureToFollowGuideShow);
    }
    public static Boolean lambda$isFromPrePage$3(CommonMeta p0){
       return Boolean.valueOf(p0.mIsFromPrePage);
    }
    public static Boolean lambda$isInappropriate$181(PhotoMeta p0){
       return Boolean.valueOf(p0.mInappropriate);
    }
    public static Boolean lambda$isInsertedBackgroundPlayItem$5(CommonMeta p0){
       return Boolean.valueOf(p0.mInsertBackgroundPlayItem);
    }
    public static Boolean lambda$isIntelligenceAlbum$230(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsIntelligenceAlbum);
    }
    public static Boolean lambda$isLogEndCoveredRegion$249(CommonMeta p0){
       return Boolean.valueOf(p0.mLogEndCoveredRegion);
    }
    public static Boolean lambda$isLogStartCoveredRegion$247(CommonMeta p0){
       return Boolean.valueOf(p0.mLogStartCoveredRegion);
    }
    public static Boolean lambda$isLongVideo$50(VideoMeta p0){
       boolean b = (p0.mFusionInfo != null)? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$isLongVideo$51(VideoMeta p0){
       return Boolean.valueOf(p0.mIsLongVideo);
    }
    public static Boolean lambda$isManualHideSubscribeAuthor$277(PhotoMeta p0){
       return Boolean.valueOf(p0.mManualHideSubscribeAuthor);
    }
    public static Boolean lambda$isNeedRetryFreeTraffic$208(CommonMeta p0){
       return Boolean.valueOf(p0.mNeedRetryFreeTraffic);
    }
    public static Boolean lambda$isNeedShowGodComment$273(PhotoMeta p0){
       return Boolean.valueOf(p0.mNeedShowGodComment);
    }
    public static Boolean lambda$isNewLiveMode$206(LiveStreamModel p0){
       return Boolean.valueOf(p0.mChatStyle);
    }
    public static Boolean lambda$isNoNeedToRequestPlcEntryStyleInfo$167(PhotoMeta p0){
       return Boolean.valueOf(p0.mNoNeedToRequestPlcEntryStyleInfo);
    }
    public static Boolean lambda$isPauseStatus$43(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsPauseStatus);
    }
    public static Boolean lambda$isPlayFailed$18(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsPlayFailed);
    }
    public static Boolean lambda$isPlayLiving$156(LiveStreamModel p0){
       return Boolean.valueOf(p0.mIsPlayLiving);
    }
    public static Boolean lambda$isQuickCommentShownByDelay$266(PhotoMeta p0){
       return Boolean.valueOf(p0.mQuickCommentShownByDelay);
    }
    public static Boolean lambda$isRecShowed$151(CommonMeta p0){
       return Boolean.valueOf(p0.mRecoShowed);
    }
    public static Boolean lambda$isRecreationPhoto$237(PhotoMeta p0){
       p0 = p0.mRecreationSettingInfo;
       boolean b = (p0 != null && p0.mIsRecreationPhoto != null)? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$isRedPacket$175(LiveStreamModel p0){
       return Boolean.valueOf(p0.mRedPack);
    }
    public static Boolean lambda$isShareCountExp$255(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsShareCountExp);
    }
    public static Boolean lambda$isShowFollowingIntensify$112(PhotoMeta p0){
       boolean b = (p0.mPhotoFollowingIntensify > null)? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$isShowed$147(CommonMeta p0){
       return Boolean.valueOf(p0.mShowed);
    }
    public static Boolean lambda$isShowedCoinReward$256(CommonMeta p0){
       return Boolean.valueOf(p0.mShowedCoinReward);
    }
    public static Boolean lambda$isSocailFamilarRelation$197(CommonMeta p0){
       return Boolean.valueOf(p0.mSocialRelationFamilar);
    }
    public static Boolean lambda$isStatusLiked$9(UserStatus p0){
       return Boolean.valueOf(p0.mIsLiked);
    }
    public static Boolean lambda$isTagTop$40(PhotoMeta p0){
       return Boolean.valueOf(p0.mTagTop);
    }
    public static Boolean lambda$isTopPhoto$182(PhotoMeta p0){
       return Boolean.valueOf(p0.mTopPhoto);
    }
    public static Boolean lambda$isUnFollowPhoto$238(User p0){
       boolean b = (p0.mFollowStatus == User$FollowStatus.UNFOLLOW)? true: false;
       return Boolean.valueOf(b);
    }
    public static Boolean lambda$isUserStatusPhoto$236(PhotoMeta p0){
       return Boolean.valueOf(p0.mIsUserStatus);
    }
    public static String lambda$newComment$176(CommonMeta p0){
       return p0.mId;
    }
    public static Long lambda$numberOfCollects$79(PhotoMeta p0){
       return Long.valueOf(p0.mCollectCount);
    }
    public static Integer lambda$numberOfComments$78(PhotoMeta p0){
       return Integer.valueOf(p0.mCommentCount);
    }
    public static Integer lambda$numberOfDownload$91(PhotoMeta p0){
       return Integer.valueOf(p0.mDownloadCount);
    }
    public static Integer lambda$numberOfLikeOnLine$77(PhotoMeta p0){
       return Integer.valueOf(p0.mLikeCount);
    }
    public static Integer lambda$numberOfReview$76(PhotoMeta p0){
       return Integer.valueOf(p0.mViewCount);
    }
    public static Integer lambda$numberOfReward$62(PhotoMeta p0){
       p0 = p0.mRewardPhotoInfo;
       int i = (p0 == null)? 0: p0.mRewardCount;
       return Integer.valueOf(i);
    }
    public static Integer lambda$numberOfShare$90(PhotoMeta p0){
       return Integer.valueOf(p0.mShareCount);
    }
    public static Integer lambda$numberOfViewers$80(PhotoMeta p0){
       return Integer.valueOf(p0.mViewerCount);
    }
    public static String lambda$recommendHintText$82(PhotoMeta p0){
       return p0.mRecommendHintText;
    }
    public static String lambda$recommendHintTextSourceId$83(PhotoMeta p0){
       return p0.mRecommendHintTextSourceId;
    }
    public static String lambda$recommendHintTextSourceType$84(PhotoMeta p0){
       return p0.mRecommendHintTextSourceType;
    }
    public static Integer lambda$recreationSetting$64(PhotoMeta p0){
       return Integer.valueOf(p0.mRecreationSetting);
    }
    public static a lambda$setActionReportFetcher$213(a p0,PhotoMeta p1){
       p1.mPhotoActionReportFetcher = p0;
       return p0;
    }
    public static Boolean lambda$setAlreadyConsumed$276(boolean p0,PhotoMeta p1){
       p1.mAlreadyConsumed = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setAlreadyShowGodComment$272(boolean p0,PhotoMeta p1){
       p1.mAlreadyShowGodComment = p0;
       return Boolean.valueOf(p0);
    }
    public static Void lambda$setAtMePhotoPrivacyStatus$89(int p0,PhotoMeta p1){
       return p1.setAtMePhotoPrivacyStatus(p0);
    }
    public static Boolean lambda$setAuthorSubscribed$290(boolean p0,PhotoMeta p1){
       p1.mSubscribeNotification = p0;
       return Boolean.valueOf(p0);
    }
    public static Integer lambda$setCacheType$10(int p0,PhotoMeta p1){
       p1.mCacheType = p0;
       return Integer.valueOf(p0);
    }
    public static String lambda$setCaption$34(String p0,CommonMeta p1){
       p1.mCaption = p0;
       return p0;
    }
    public static String lambda$setCaptionTitle$36(String p0,CommonMeta p1){
       p1.mCaptionTitle = p0;
       return p0;
    }
    public static Boolean lambda$setCloseLive$153(boolean p0,CommonMeta p1){
       p1.mIsCloseLive = p0;
       return Boolean.valueOf(p0);
    }
    public static Integer lambda$setColor$172(int p0,CommonMeta p1){
       p1.mColor = p0;
       return Integer.valueOf(p0);
    }
    public static List lambda$setCommentPanelDynamicTabsInfo$260(List p0,PhotoMeta p1){
       p1.mCommentDynamicTabsInfo = p0;
       return p0;
    }
    public static Boolean lambda$setCommentPhotoInfoSucceed$259(boolean p0,PhotoMeta p1){
       p1.mCommentPhotoInfoSucceed = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setCoverPrefetched$161(boolean p0,CoverMeta p1){
       p1.mCoverPrefetched = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setCoverThumbnailUrl$169(String p0,CoverMeta p1){
       p1.mCoverThumbnailUrl = p0;
       return p0;
    }
    public static CDNUrl[] lambda$setCoverThumbnailUrls$189(CDNUrl[] p0,CoverMeta p1){
       p1.mCoverThumbnailUrls = p0;
       return p0;
    }
    public static String lambda$setCoverUrl$170(String p0,CoverMeta p1){
       p1.mCoverUrl = p0;
       return p0;
    }
    public static CDNUrl[] lambda$setCoverUrls$190(CDNUrl[] p0,CoverMeta p1){
       p1.mCoverUrls = p0;
       return p0;
    }
    public static Boolean lambda$setCreatedSearchCard$150(boolean p0,CommonMeta p1){
       p1.mCreatedSearchCard = p0;
       return Boolean.valueOf(p0);
    }
    public static Integer lambda$setCurrentPosition$1(int p0,CommonMeta p1){
       p1.mCurrentPosition = p0;
       return Integer.valueOf(p0);
    }
    public static Integer lambda$setDirection$157(int p0,CommonMeta p1){
       p1.mDirection = p0;
       return Integer.valueOf(p0);
    }
    public static Boolean lambda$setEnableCommentPhotoInfoRequest$263(boolean p0,PhotoMeta p1){
       p1.mEnableCommentPhotoInfoRequest = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setEnableV4Head$45(boolean p0,PhotoMeta p1){
       p1.mEnableV4Head = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setExpTag$107(String p0,CommonMeta p1){
       p1.mExpTag = p0;
       return p0;
    }
    public static Long lambda$setExtraSaveProgressTime$42(long p0,PhotoMeta p1){
       p1.mExtraSaveProgressTime = p0;
       return Long.valueOf(p0);
    }
    public static Boolean lambda$setFeatureToFollowGuideShow$267(boolean p0,PhotoMeta p1){
       p1.mFeatureToFollowGuideShow = p0;
       return Boolean.valueOf(p0);
    }
    public static PostStatus lambda$setFeedStatus$211(PostStatus p0,PhotoMeta p1){
       p1.mPostWorkStatus = p0;
       return p0;
    }
    public static Integer lambda$setFeedStreamType$239(int p0,CommonMeta p1){
       p1.mFeedStreamType = p0;
       return Integer.valueOf(p0);
    }
    public static Integer lambda$setFilterAbnormalPhotoReason$203(int p0,PhotoMeta p1){
       p1.mFilterAbnormalPhotoReason = p0;
       return Integer.valueOf(p0);
    }
    public static Integer lambda$setFilterStatus$201(int p0,PhotoMeta p1){
       p1.mFilterStatus = p0;
       return Integer.valueOf(p0);
    }
    public static Boolean lambda$setFreeTraffic$27(boolean p0,QLivePlayConfig p1){
       p1.mExpectFreeTraffic = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setFreeTraffic$28(boolean p0,CommonMeta p1){
       p1.mExpectFreeTraffic = p0;
       return Boolean.valueOf(p0);
    }
    public static CDNUrl[] lambda$setH265VideoUrls$194(CDNUrl[] p0,VideoMeta p1){
       p1.mH265Urls = p0;
       return p0;
    }
    public static Boolean lambda$setIsBackgroundPlayPhoto$11(boolean p0,CommonMeta p1){
       p1.mIsBackgroundPlayPhoto = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setIsFromPrePage$4(boolean p0,CommonMeta p1){
       p1.mIsFromPrePage = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setIsInsertedBackgroundPlayItem$6(boolean p0,CommonMeta p1){
       p1.mInsertBackgroundPlayItem = p0;
       return Boolean.valueOf(p0);
    }
    public static Void lambda$setIsPending$22(boolean p0,PhotoMeta p1){
       return p1.setIsPending(p0);
    }
    public static String lambda$setListLoadSequenceID$140(String p0,CommonMeta p1){
       p1.mListLoadSequenceID = p0;
       return p0;
    }
    public static String lambda$setLiveStreamId$132(String p0,LiveStreamModel p1){
       p1.mLiveStreamId = p0;
       return p0;
    }
    public static VideoMeta lambda$setLocalVideoUrl$174(CDNUrl p0,VideoMeta p1){
       return p1.setLocalUrl(p0);
    }
    public static Boolean lambda$setLogEndCoveredRegion$248(boolean p0,CommonMeta p1){
       p1.mLogEndCoveredRegion = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setLogReportContent$141(String p0,CommonMeta p1){
       p1.mLogReportContext = p0;
       return p0;
    }
    public static Boolean lambda$setLogStartCoveredRegion$246(boolean p0,CommonMeta p1){
       p1.mLogStartCoveredRegion = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setManualHideSubscribeAuthor$278(boolean p0,PhotoMeta p1){
       p1.mManualHideSubscribeAuthor = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setMockFeedMagicFaceRecoId$222(String p0,PhotoMeta p1){
       p1.mMockFeedMagicFaceRecoId = p0;
       return p0;
    }
    public static String lambda$setMockFeedMagicFaceRecoTaskId$224(String p0,PhotoMeta p1){
       p1.mMockFeedMagicFaceRecoTaskId = p0;
       return p0;
    }
    public static String lambda$setMockFeedPostAgainText$220(String p0,PhotoMeta p1){
       p1.mMockFeedPostAgainText = p0;
       return p0;
    }
    public static Integer lambda$setMockFeedTarget$215(int p0,PhotoMeta p1){
       p1.mMockFeedTarget = p0;
       return Integer.valueOf(p0);
    }
    public static String lambda$setMockFeedUploadSuccessText$218(String p0,PhotoMeta p1){
       p1.mMockFeedUploadSuccessText = p0;
       return p0;
    }
    public static Music lambda$setMusic$48(Music p0,PhotoMeta p1){
       p1.mMusic = p0;
       return p0;
    }
    public static Boolean lambda$setNeedRetryFreeTraffic$209(boolean p0,CommonMeta p1){
       p1.mNeedRetryFreeTraffic = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setNeedShowGodComment$274(boolean p0,PhotoMeta p1){
       p1.mNeedShowGodComment = p0;
       return Boolean.valueOf(p0);
    }
    public static Void lambda$setNumberOfComments$87(int p0,PhotoMeta p1){
       return p1.setCommentCount(p0);
    }
    public static Void lambda$setNumberOfLike$86(int p0,PhotoMeta p1){
       return p1.setLikeCount(p0);
    }
    public static Void lambda$setNumberOfShares$88(int p0,PhotoMeta p1){
       return p1.setShareCount(p0);
    }
    public static CDNUrl[] lambda$setOverrideCoverThumbnailUrls$192(CDNUrl[] p0,CoverMeta p1){
       p1.mOverrideCoverThumbnailUrls = p0;
       return p0;
    }
    public static Integer lambda$setPageIndex$138(int p0,CommonMeta p1){
       p1.mPageIndex = p0;
       return Integer.valueOf(p0);
    }
    public static Boolean lambda$setPauseStatus$44(boolean p0,PhotoMeta p1){
       p1.mIsPauseStatus = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setPlayFailed$17(boolean p0,PhotoMeta p1){
       p1.mIsPlayFailed = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setPlayLiving$155(boolean p0,LiveStreamModel p1){
       p1.mIsPlayLiving = p0;
       return Boolean.valueOf(p0);
    }
    public static PlcEntryStyleInfo lambda$setPlcEntryStyleInfo$229(PlcEntryStyleInfo p0,PhotoMeta p1){
       p1.mPlcEntryStyleInfo = p0;
       return p0;
    }
    public static Integer lambda$setPositionInPage$21(int p0,CommonMeta p1){
       p1.mPositionInPage = p0;
       return Integer.valueOf(p0);
    }
    public static Integer lambda$setPostWorkInfoId$225(int p0,PhotoMeta p1){
       p1.mPostWorkInfoId = p0;
       return Integer.valueOf(p0);
    }
    public static Boolean lambda$setPrefetch$12(boolean p0,PhotoMeta p1){
       p1.mPrefetch = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setPrefetchReason$15(String p0,PhotoMeta p1){
       p1.mPrefetchReason = p0;
       return p0;
    }
    public static Boolean lambda$setProductsNeedBoostFansTop$210(boolean p0,CommonMeta p1){
       p1.mProductsNeedBoostFansTop = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setQuickCommentShownByDelay$265(boolean p0,PhotoMeta p1){
       p1.mQuickCommentShownByDelay = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setRealActionSubBizTag$240(String p0,CommonMeta p1){
       p1.mRealActionSubBizTag = p0;
       return p0;
    }
    public static Boolean lambda$setRecShowed$152(boolean p0,CommonMeta p1){
       p1.mRecoShowed = p0;
       return Boolean.valueOf(p0);
    }
    public static List lambda$setRecentViewers$282(List p0,PhotoMeta p1){
       p1.mRecentViewers = p0;
       return p0;
    }
    public static String lambda$setRecoTag$14(String p0,CommonMeta p1){
       p1.q = p0;
       return p0;
    }
    public static CDNUrl[] lambda$setSdVideoUrl$173(CDNUrl[] p0,VideoMeta p1){
       p1.mSdUrls = p0;
       return p0;
    }
    public static String lambda$setSearchSessionId$146(String p0,CommonMeta p1){
       p1.mSearchSessionId = p0;
       return p0;
    }
    public static String lambda$setSearchUssid$144(String p0,CommonMeta p1){
       p1.mUssId = p0;
       return p0;
    }
    public static String lambda$setServerExpTag$108(String p0,CommonMeta p1){
       p1.mServerExpTag = p0;
       return p0;
    }
    public static String lambda$setShareScene$105(String p0,CommonMeta p1){
       p1.mShareScene = p0;
       return p0;
    }
    public static Boolean lambda$setShowFlowFeedback$227(boolean p0,PhotoMeta p1){
       p1.mShowFlowFeedback = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setShowed$148(boolean p0,CommonMeta p1){
       p1.mShowed = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setShowedCoinReward$257(boolean p0,CommonMeta p1){
       p1.mShowedCoinReward = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setSource$23(String p0,CommonMeta p1){
       p1.mSource = p0;
       return p0;
    }
    public static String lambda$setSource$24(int p0,CommonMeta p1){
       String str = "p"+p0;
       p1.mSource = str;
       return str;
    }
    public static Boolean lambda$setTagTop$47(boolean p0,PhotoMeta p1){
       p1.mTagTop = p0;
       return Boolean.valueOf(p0);
    }
    public static Integer lambda$setTopFeedIndex$231(int p0,CommonMeta p1){
       p1.mTopFeedIndex = p0;
       return Integer.valueOf(p0);
    }
    public static Boolean lambda$setVerticalShown$188(boolean p0,CommonMeta p1){
       p1.mVerticalShowed = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setVideoUrl$171(String p0,VideoMeta p1){
       p1.mVideoUrl = p0;
       return p0;
    }
    public static CDNUrl[] lambda$setVideoUrls$193(CDNUrl[] p0,VideoMeta p1){
       p1.mVideoUrls = p0;
       return p0;
    }
    public static Boolean lambda$shouldShowViewersPage$81(PhotoMeta p0){
       return Boolean.valueOf(p0.mViewerEntrance);
    }
    public static Boolean lambda$showCoCreateIcon$288(PhotoMeta p0){
       return Boolean.valueOf(p0.mShowCoCreateIcon);
    }
    public static Boolean lambda$useLive$92(PhotoMeta p0){
       return Boolean.valueOf(p0.mUseLive);
    }
    public static void removeInvalidFeedChecker(QPhoto$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, QPhoto.class, "290")) {
          return;
       }
       QPhoto.sInvalidFeedCheckerList.add(p0);
       return;
    }
    public static void removePhotoWrapperIdProvider(QPhoto$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, QPhoto.class, "47")) {
          return;
       }
       QPhoto.sPhotoWrapperIdProviderList.add(p0);
       return;
    }
    public boolean canDownload(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "297");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isSupportDownloadType() && (this.isMine() || (this.isAllowPhotoDownload() && !i.d(this))))? true: false;
       return b;
    }
    public boolean canRewarded(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, n2.b);
    }
    public long created(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, CommonMeta.class, c.b);
    }
    public boolean disableFollowShoot(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, o2.b);
    }
    public boolean disableTranscodeHiddenUserInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, p2.b);
    }
    public boolean enableActivityLike(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "148");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, q2.b);
    }
    public boolean enableActivityPressLike(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "149");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, r2.b);
    }
    public boolean enableFusionSDKFetch(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getFusionInfo() != null && this.getFusionInfo().isEnableSDKFetch != null)? true: false;
       return b;
    }
    public boolean enableMissYou(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, User.class, l7.b);
    }
    public boolean enablePictureCommentForPhoto(){
       PhotoMeta obj = PatchProxy.apply(null, this, QPhoto.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getPhotoMeta() == null) {
          return b;
       }
       obj = this.getPhotoMeta().mFeedSwitches;
       if (obj != null && obj.mEnablePictureCommentForPhoto != null) {
          b = true;
       }
       return b;
    }
    public boolean enableShowLikeList(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "147");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, s2.b);
    }
    public boolean enableShowQuickCommentGuide(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, t2.b);
    }
    public boolean enableShowRewardBubbleTip(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, u2.b);
    }
    public boolean enableSpecialFocus(){
       String str = "86";
       Object obj = PatchProxy.apply(null, this, QPhoto.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, str.b);
    }
    public boolean enableTimeStamp(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "296");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, CommonMeta.class, d.b);
       }
       return obj.booleanValue();
    }
    public boolean enableToolbarRewardPhoto(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, w2.b);
    }
    public boolean enableV4Head(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, x2.b);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "277");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof QPhoto) {
          return this.mEntity.equals(p0.mEntity);
       }
       if (p0 instanceof BaseFeed) {
          return this.mEntity.equals(p0);
       }
       return super.equals(p0);
    }
    public boolean expectFreeTraffic(){
       QPhoto obj = PatchProxy.apply(null, this, QPhoto.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntity;
       if (obj instanceof LiveStreamFeed) {
          return e.a(obj, QLivePlayConfig.class, a8.b);
       }
       return e.a(obj, CommonMeta.class, e.b);
    }
    public a getActionReportFetcher(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "320");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, y2.b);
    }
    public CDNUrl[] getAdCoverThumbnailUrls(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CoverMeta.class, c1.b);
    }
    public PhotoAdvertisementInterface getAdvertisement(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "213");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.get("AD");
    }
    public long getAiCutPhotoStyleId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "340");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, PhotoMeta.class, z2.b);
    }
    public AnalysisEntranceModel getAnalysisEntrance(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "347");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, a3.b);
    }
    public int getAtMePhotoPrivacyStatus(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "162");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, b3.b);
    }
    public String getAtlasDetailTitle(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "406");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, PhotoMeta.class, c3.b);
    }
    public int[] getAtlasIndices(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "253");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, ImageMeta.class, p1.b);
    }
    public ImageMeta$Atlas getAtlasInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "255");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, ImageMeta.class, w1.b);
    }
    public List getAtlasList(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "251");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.i(this.mEntity, ImageMeta.class, q1.b, new ArrayList());
    }
    public int getAtlasListSize(){
       List obj = PatchProxy.apply(null, this, QPhoto.class, "252");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getAtlasList();
       if (obj != null) {
          return obj.size();
       }
       return 0;
    }
    public CDNUrl[] getAtlasMusicCdn(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "245");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, ImageMeta.class, h0.b);
    }
    public float getAtlasMusicVolume(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "243");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return e.i(this.mEntity, ImageMeta.class, r1.b, Float.valueOf(0x3f000000)).floatValue();
    }
    public List getAtlasPhotosCdn(int p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, QPhoto.class, "244");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return e.h(this.mEntity, ImageMeta.class, new q2(p0));
    }
    public ImageMeta$AtlasCoverSize getAtlasSize(int p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, QPhoto.class, "250");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return e.h(this.mEntity, ImageMeta.class, new r2(p0));
    }
    public ImageMeta$AtlasCoverSize[] getAtlasSizes(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "246");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, ImageMeta.class, i0.b);
    }
    public String getBizId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "359");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.getBizId();
    }
    public BottomComponentMaterial getBottomComponentMaterial(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "161");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, d3.b);
    }
    public BottomEntryInfoModel getBottomEntryInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "177");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, LiveStreamModel.class, q7.b);
    }
    public int getCacheType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, y1.b);
    }
    public String getCaption(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, f.b);
    }
    public CaptionSearchInfo getCaptionSearchInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, g.b);
    }
    public String getCaptionTitle(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, h.b);
    }
    public String getCaptionToComment(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, i.b);
    }
    public CoCreateInfo getCoCreateInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "417");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, e3.b);
    }
    public CoCreateInvitationInfo getCoCreateInvitationInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "421");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, f3.b);
    }
    public int getColor(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "132");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, j.b);
    }
    public ColumnMeta getColumnMeta(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "302");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(ColumnMeta.class);
    }
    public String getCommentAtBubbleMessage(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "163");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, g3.b);
    }
    public CommentMeta getCommentMeta(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "303");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(CommentMeta.class);
    }
    public List getCommentPanelDynamicTabsInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "385");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, h3.b);
    }
    public boolean getCommentPhotoInfoSucceed(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "382");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, PhotoMeta.class, i3.b);
       }
       return obj.booleanValue();
    }
    public CommonMeta getCommonMeta(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "299");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(CommonMeta.class);
    }
    public int getContinuePlayStrategy(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, VideoMeta.class, x6.b);
    }
    public CoronaExpParams getCoronaExpParams(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "412");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CoronaModelMeta.class, a1.b);
    }
    public CoronaFeedVipInfo getCoronaFeedVipInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "411");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CoronaModelMeta.class, b1.b);
    }
    public float getCoverAspectRatioPrioritizeAdCover(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "131");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = d.a(this.mEntity);
       if (f < 0) {
          f = CoverMetaExt.getCoverAspectRatioPrioritizeAdCover(this.mEntity.a(CoverMeta.class), this.mEntity.a(CommonMeta.class));
       }
       return f;
    }
    public CoverMeta getCoverMeta(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "300");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.D0(this.mEntity);
    }
    public Object getCoverMetaExtra(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "278");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CoverMeta.class, new n0(p0));
    }
    public String getCoverThumbnailUrl(){
       return e.h(this.mEntity, CoverMeta.class, d1.b);
    }
    public CDNUrl[] getCoverThumbnailUrls(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "104");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CoverMeta.class, e1.b);
    }
    public String getCoverUrl(){
       return e.h(this.mEntity, CoverMeta.class, f1.b);
    }
    public CDNUrl[] getCoverUrls(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CoverMeta.class, g1.b);
    }
    public int getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, k.b);
    }
    public CDNUrl getDefaultVideoCdnUrl(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "374");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Optional.fromNullable(e.h(this.mEntity, VideoMeta.class, k1.b)).or(new CDNUrl("", ""));
    }
    public int getDelay(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "125");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, ExtMeta.class, k1.b);
    }
    public float getDetailDisplayAspectRatio(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "292");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float detailRealAs = this.getDetailRealAspectRatio();
       if (this.isKtvSong() && detailRealAs - 0x3f800000 > 0) {
          return 0x3f800000;
       }
       return detailRealAs;
    }
    public float getDetailRealAspectRatio(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "293");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (!this.getHeight()) {
          return 0x3f800000;
       }
       return ((float)this.getWidth() / (float)this.getHeight());
    }
    public int getDirection(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "203");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, l.b);
    }
    public String getDisclaimerMessage(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "272");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (w.s0(this)) {
          return a1.p(0x7f104226);
       }
       return e.h(this.mEntity, PhotoMeta.class, j3.b);
    }
    public String getDisplayTime(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "270");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, k3.b);
    }
    public EditInfo getEditInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "338");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, l3.b);
    }
    public boolean getEnableCommentPhotoInfoRequest(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "386");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, PhotoMeta.class, m3.b);
       }
       return obj.booleanValue();
    }
    public BaseFeed getEntity(){
       return this.mEntity;
    }
    public String getExpTag(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "135");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, m.b);
    }
    public ExtEntryModel getExtEntryModel(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "130");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, n3.b);
    }
    public long getExtraSaveProgressTime(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, PhotoMeta.class, o3.b);
    }
    public CDNUrl[] getFFCoverThumbnailUrls(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "105");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CoverMeta.class, h1.b);
    }
    public FansGroupV2Info getFansGroupInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, User.class, m7.b);
    }
    public FansTopCommentTopBarInfo getFansTopCommentTopBarInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getPhotoMeta() == null) {
          return null;
       }
       return this.getPhotoMeta().mFansTopCommentTopBarInfo;
    }
    public String getFansTopPurchaseText(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getPhotoMeta() == null) {
          return null;
       }
       return this.getPhotoMeta().mFansTopPurchaseText;
    }
    public String getFansTopPurchaseUrl(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPhotoMeta().mFansTopPurchaseUrl;
    }
    public FansTopDisplayStyle getFansTopStyle(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, n.b);
    }
    public int getFastCommentType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "350");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.h(this.mEntity, PhotoMeta.class, p3.b).intValue();
    }
    public FeedLogCtx getFeedLogCtx(){
       Object[] objArray = null;
       CommonMeta obj = PatchProxy.apply(objArray, this, QPhoto.class, "139");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mEntity.a(CommonMeta.class);
       if (obj != null) {
          objArray = obj.mFeedLogCtx;
       }
       return objArray;
    }
    public String getFeedLogCtxString(){
       Object[] objArray = null;
       FeedLogCtx obj = PatchProxy.apply(objArray, this, QPhoto.class, "140");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getFeedLogCtx();
       if (obj != null) {
          objArray = obj.toJsonString();
       }
       return objArray;
    }
    public PostStatus getFeedStatus(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "318");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, q3.b);
    }
    public String getFeedbackDetailParams(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "349");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, r3.b);
    }
    public List getFeedbackEntryIdList(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "348");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, s3.b);
    }
    public int getFilterAbnormalPhotoReason(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "308");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.i(this.mEntity, PhotoMeta.class, t3.b, Integer.valueOf(0)).intValue();
    }
    public int getFilterStatus(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "306");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.i(this.mEntity, PhotoMeta.class, u3.b, Integer.valueOf(0)).intValue();
    }
    public FindTkInfoData getFindTkInfoData(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "416");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, FindTkFeedMeta.class, m1.b);
    }
    public FindTkFeedMeta getFindTkModel(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "415");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(FindTkFeedMeta.class);
    }
    public FlashPhotoTemplate getFlashPhotoTemplate(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, VideoMeta.class, y6.b);
    }
    public FollowShootModel getFollowShootModel(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, this.b);
    }
    public Map getForwardStatsParams(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, o.b);
    }
    public String getFullSource(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "152");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.R0(this.mEntity);
    }
    public FusionInfo getFusionInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.S0(this.mEntity);
    }
    public String getGrootId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "423");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.getGrootId();
    }
    public CDNUrl[] getH265VideoUrls(){
       CDNUrl[] obj = PatchProxy.apply(null, this, QPhoto.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.h(this.mEntity, VideoMeta.class, z6.b);
       if (obj == null) {
          obj = new CDNUrl[0];
       }
       return obj;
    }
    public CDNUrl[] getH265VideoUrlsNullable(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "101");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, VideoMeta.class, a7.b);
    }
    public int getHeight(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "127");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, p.b);
    }
    public ImageMeta getImageMeta(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "301");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.W0(this.mEntity);
    }
    public int getInteractStickerType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, w3.b);
    }
    public KMovieTemplate getKMovieTemplate(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, VideoMeta.class, b7.b);
    }
    public KaraokeChorusModel getKaraokeChorusModel(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, x3.b);
    }
    public KaraokeModel$KaraokeInfo getKaraokeInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "257");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, n0.b);
    }
    public KaraokeScoreInfo getKaraokeScore(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "258");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, y3.b);
    }
    public List getKgTags(){
       List obj = PatchProxy.apply(null, this, QPhoto.class, "356");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.h(this.mEntity, PhotoMeta.class, z3.b);
       if (obj == null) {
          obj = Collections.emptyList();
       }
       return obj;
    }
    public String getKsOrderId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "141");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.w0(this.mEntity).mKsOrderId;
    }
    public CDNUrl[] getKtvMusicCdn(){
       Object[] objArray = null;
       KaraokeModel$KaraokeInfo obj = PatchProxy.apply(objArray, this, QPhoto.class, "248");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getKaraokeInfo();
       if (obj != null) {
          objArray = ImageMetaExt.createCdn(obj.mCdnList, obj.mMusic);
       }
       return objArray;
    }
    public String getKwaiId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "151");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, a4.b);
    }
    public String getLikeActivityResourceId(){
       PhotoMeta obj = PatchProxy.apply(null, this, QPhoto.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (this.getPhotoMeta() == null) {
          return str;
       }
       obj = this.getPhotoMeta().mFeedSwitches;
       if (obj != null) {
          str = obj.mLikeActivityResourceId;
       }
       return str;
    }
    public LipsSyncModel getLipsSyncModel(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "159");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, b4.b);
    }
    public String getListLoadSequenceID(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "181");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, q.b);
    }
    public Long getListLoadSequenceIDLong(){
       String obj = PatchProxy.apply(null, this, QPhoto.class, "182");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getListLoadSequenceID();
       try{
          return Long.valueOf(obj);
       }catch(java.lang.Exception e0){
          return Long.valueOf(0);
       }
    }
    public String getLiveAudienceCount(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "172");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, LiveStreamModel.class, r7.b);
    }
    public int getLiveBizType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "311");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.i(this.mEntity, LiveStreamModel.class, s7.b, Integer.valueOf(LiveStreamModel$Live.FREE_LIVE.ordinal())).intValue();
    }
    public List getLiveDisplayDistrictRank(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "313");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, LiveStreamModel.class, t7.b);
    }
    public String getLiveLikeCount(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "171");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, LiveStreamModel.class, u7.b);
    }
    public QLivePlayConfig getLivePlayConfig(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "102");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(QLivePlayConfig.class);
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "173");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, LiveStreamModel.class, v7.b);
    }
    public String getLiveStreamIdStr(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "175");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, LivePlaybackMeta.class, x1.b);
    }
    public Location getLocation(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "219");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, r.b);
    }
    public String getLogReportContent(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "185");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, s.b);
    }
    public SimpleMagicFace getMagicFace(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "156");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, c4.b);
    }
    public List getMagicFaces(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "157");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, d4.b);
    }
    public String getMessageGroupId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "310");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, e4.b);
    }
    public String getMockFeedMagicFaceRecoId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "327");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, f4.b);
    }
    public String getMockFeedMagicFaceRecoTaskId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "329");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, g4.b);
    }
    public String getMockFeedPostAgainText(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "325");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, h4.b);
    }
    public int getMockFeedTarget(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "322");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.h(this.mEntity, PhotoMeta.class, i4.b).intValue();
    }
    public String getMockFeedUploadSuccessText(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "323");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, j4.b);
    }
    public long getMoodTemplateId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "341");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, PhotoMeta.class, k4.b);
    }
    public Music getMusic(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "154");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, l4.b);
    }
    public String getMusicUrl(){
       return e.h(this.mEntity, ImageMeta.class, s1.b);
    }
    public MusicWheelInfo getMusicWheelInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "395");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, m4.b);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "424");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "425");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(QPhoto.class, new u2());
       }else {
          obj.put(QPhoto.class, null);
       }
       return obj;
    }
    public int getOverallDetailSlideDifferent(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "388");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, n4.b);
    }
    public CDNUrl[] getOverrideCoverThumbnailUrls(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "283");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CoverMeta.class, i1.b);
    }
    public int getPageIndex(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "179");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.h(this.mEntity, CommonMeta.class, t.b).intValue();
    }
    public PhotoDisplayLocationInfo getPhotoDisplayLocationInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "375");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.getEntity(), PhotoMeta.class, o4.b);
    }
    public String getPhotoId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.getId();
    }
    public PhotoMeta getPhotoMeta(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "298");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(PhotoMeta.class);
    }
    public List getPhotoMmuTagInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "212");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, u.b);
    }
    public PlcEntryStyleInfo getPlcEntryStyleInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "214");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, p4.b);
    }
    public PlcEntryStyleInfo getPlcFeatureEntry(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "176");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, LiveStreamModel.class, w7.b);
    }
    public long getPlcResponseTime(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "216");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.h(this.mEntity, PhotoMeta.class, q4.b).longValue();
    }
    public int getPlcType(){
       PlcEntryStyleInfo obj = PatchProxy.apply(null, this, QPhoto.class, "215");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getPlcEntryStyleInfo();
       if (obj != null) {
          return obj.mBizType;
       }
       return 0;
    }
    public int getPosition(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "204");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, v.b);
    }
    public int getPositionInPage(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, w.b);
    }
    public PostOperationEntranceInfo getPostOperationEntranceInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "164");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, r4.b);
    }
    public int getPostWorkInfoId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "332");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.h(this.mEntity, PhotoMeta.class, s4.b).intValue();
    }
    public PosterSpecialEffect getPosterSpecialEffect(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, x.b);
    }
    public String getPrefetchReason(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, PhotoMeta.class, t4.b);
    }
    public QuestionnaireInfo getQuestionnaireInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "274");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, u4.b);
    }
    public String getQuestionnaireLink(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "275");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isQuestionnaire()) {
          return this.getQuestionnaireInfo().mTargetUrl;
       }
       return "";
    }
    public String getQuestionnaireText(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "276");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isQuestionnaire()) {
          return this.getQuestionnaireInfo().mText;
       }
       return "";
    }
    public int getRealRelationType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "294");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.h(this.mEntity, CommonMeta.class, y.b).intValue();
    }
    public List getRecentViewers(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "407");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, v4.b);
    }
    public String getRecoReason(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "210");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, z.b);
    }
    public String getRecoTag(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, CommonMeta.class, a0.b);
    }
    public List getRecoTags(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "211");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, b0.b);
    }
    public RecreationSettingInfo getRecreationSettingInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "351");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, w4.b);
    }
    public RecruitCardInfoModel getRecruitCardInfo(){
       QPhoto tmEntity = this.mEntity;
       if (tmEntity instanceof VideoFeed) {
          return tmEntity.mRecruitCardInfoModel;
       }
       if (tmEntity instanceof LiveStreamFeed) {
          return tmEntity.mLiveStreamModel.mRecruitCardInfoModel;
       }
       return null;
    }
    public String getReportContext(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "142");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, c0.b);
    }
    public SameFrameInfo getSameFrameInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, x4.b);
    }
    public CDNUrl[] getSdVideoUrl(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "98");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, VideoMeta.class, c7.b);
    }
    public String getSearchSessionId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "188");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, d0.b);
    }
    public String getSearchUssid(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "186");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, e0.b);
    }
    public String getServerExpTag(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "136");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, f0.b);
    }
    public String getSharePassingParam(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "134");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, g0.b);
    }
    public int getShareRateInflateHundredMillion(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "414");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.numberOfReview();
       if (!i) {
          return 0;
       }
       int i1 = this.numberOfShare();
       if (i1 > i) {
          return 0x5f5e100;
       }
       return (int)(((long)i1 * 0x5f5e100) / (long)i);
    }
    public String getShareScene(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "137");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, h0.b);
    }
    public ShareToFollowModel getShareToFollowModel(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "363");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.L1(this.mEntity);
    }
    public long getShowCount(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "178");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, PhotoMeta.class, y4.b);
    }
    public boolean getShowFlowFeedback(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "334");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, PhotoMeta.class, z4.b);
       }
       return obj.booleanValue();
    }
    public List getSinglePhotoList(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "254");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, ImageMeta.class, t1.b);
    }
    public ImageMeta$SinglePicture getSinglePicture(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "256");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, ImageMeta.class, n1.b);
    }
    public CDNUrl[] getSinglePictureMusicCdn(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "247");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, ImageMeta.class, u1.b);
    }
    public float getSinglePictureMusicVolume(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "249");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return e.i(this.mEntity, ImageMeta.class, ImageMeta.class.b, Float.valueOf(0x3f800000)).floatValue();
    }
    public long getSnapShowDeadline(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "117");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, PhotoMeta.class, a5.b);
    }
    public Music getSoundTrack(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "155");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, b5.b);
    }
    public String getSource(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "133");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, i0.b);
    }
    public boolean getStarci(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, c5.b);
    }
    public int getStereoType(){
       KwaiManifest obj = PatchProxy.apply(null, this, QPhoto.class, "287");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = r1.q1(this.mEntity);
       if (obj != null) {
          return obj.mStereoType;
       }
       return 0;
    }
    public int getSupportType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "376");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, d5.b);
    }
    public int getTagHashType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, e5.b);
    }
    public List getTags(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "153");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, PhotoMeta.class, f5.b);
    }
    public TemplateFeedMeta getTemplateFeedModel(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "230");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(TemplateFeedMeta.class);
    }
    public long getTimeStamp(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "396");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, PhotoMeta.class, g5.b);
    }
    public int getTopFeedIndex(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "339");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.h(this.mEntity, CommonMeta.class, j0.b).intValue();
    }
    public String getTransferParam(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "405");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, PhotoMeta.class, h5.b);
    }
    public Map getTransientTags(){
       return this.mTransientTags;
    }
    public String getTubeKoi(){
       TubeMeta obj = PatchProxy.apply(null, this, QPhoto.class, "365");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getTubeMeta();
       if (obj == null) {
          return null;
       }
       TubeMeta mTubeEpisode = obj.mTubeEpisodeInfo;
       if (mTubeEpisode != null && !TextUtils.x(mTubeEpisode.mKoi)) {
          return mTubeEpisode.mKoi;
       }
       obj = obj.mTubeEntryInfo;
       if (obj != null) {
          return obj.mKoi;
       }
       return null;
    }
    public TubeMeta getTubeMeta(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "166");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, TubeMeta.class, u6.b);
    }
    public int getType(){
       return PhotoType.fromFeed(this.mEntity).toInt();
    }
    public User getUser(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(User.class);
    }
    public String getUserId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, User.class, l1.b);
    }
    public String getUserName(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, User.class, e0.b);
    }
    public String getUserSex(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, User.class, j7.b);
    }
    public UserStatus getUserStatus(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "304");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, UserStatusExt.class, p7.b);
    }
    public UserStatusExt getUserStatusExt(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "305");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(UserStatusExt.class);
    }
    public int getVideoColdStartType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "377");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, i5.b);
    }
    public long getVideoDuration(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "128");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (r1.y2(this.mEntity)) {
          return r1.S0(this.mEntity).mDuration;
       }
       if (this.getCoronaFeedVipInfo() != null && this.getCoronaFeedVipInfo().vipPhoto != null) {
          return this.getVideoMetaDuration();
       }
       return e.e(this.mEntity, ExtMeta.class, l1.b);
    }
    public long getVideoMetaDuration(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "129");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (r1.y2(this.mEntity)) {
          return r1.S0(this.mEntity).mDuration;
       }
       return e.e(this.mEntity, VideoMeta.class, d7.b);
    }
    public String getVideoUrl(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, VideoMeta.class, e7.b);
    }
    public CDNUrl[] getVideoUrls(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, VideoMeta.class, f7.b);
    }
    public long getViewTime(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, CommonMeta.class, k0.b);
    }
    public long getWatchTime(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, VideoMeta.class, g7.b);
    }
    public int getWidth(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "126");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, l0.b);
    }
    public String getWrapperPhotoId(){
       String str;
       Iterator obj = PatchProxy.apply(null, this, QPhoto.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QPhoto.sPhotoWrapperIdProviderList.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return this.getPhotoId();
          }
          str = obj.next().a(this.mEntity);
          if (!TextUtils.x(str)) {
             break ;
          }
       }
       return str;
    }
    public boolean hasAtlasText(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "409");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, j5.b);
    }
    public boolean hasCaptionUrls(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "209");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isAd() && b.a(-570058679).j(this.mEntity))? true: false;
       return b;
    }
    public boolean hasGodCommentShow(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, a2.b);
    }
    public boolean hasInteractSticker(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getInteractStickerType())? true: false;
       return b;
    }
    public boolean hasRewarded(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, k5.b);
    }
    public boolean hasShowVertically(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "279");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, m0.b);
    }
    public boolean hasVote(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "168");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getInteractStickerType() != b) {
          b = false;
       }
       return b;
    }
    public boolean isActivityTemplate(){
       return this.mEntity instanceof ActivityTemplateFeed;
    }
    public boolean isAd(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "207");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mEntity.get("AD") != null)? true: false;
       return b;
    }
    public boolean isAllowAdComment(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "146");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-570058679).o(this.mEntity);
    }
    public boolean isAllowComment(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "145");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = e.a(this.mEntity, PhotoMeta.class, g2.b);
       if (this.isAd()) {
          b = (b && this.isAllowAdComment())? true: false;
       }
    label_002f :
       return b;
    }
    public boolean isAllowPhotoDownload(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "144");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, h2.b);
    }
    public boolean isAlreadyConsumed(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "401");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, l5.b);
    }
    public boolean isAlreadyShowGodComment(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "397");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, m5.b);
    }
    public boolean isArticle(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "238");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (w1.r(this.mEntity) == PhotoType.ARTICLE_FEED)? true: false;
       return b;
    }
    public boolean isAtlasPhotos(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "260");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, ImageMeta.class, j0.b);
    }
    public boolean isAuthorSubscribed(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "419");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, PhotoMeta.class, n5.b);
       }
       return obj.booleanValue();
    }
    public boolean isChorus(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "267");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isChorusSource() || this.isChorusFollow())? true: false;
       return b;
    }
    public boolean isChorusFollow(){
       KaraokeChorusModel obj = PatchProxy.apply(null, this, QPhoto.class, "265");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getKaraokeChorusModel();
       boolean b = (obj != null && obj.mType == 2)? true: false;
       return b;
    }
    public boolean isChorusSource(){
       KaraokeChorusModel obj = PatchProxy.apply(null, this, QPhoto.class, "266");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getKaraokeChorusModel();
       boolean b = true;
       if (obj == null || obj.mType != b) {
          b = false;
       }
       return b;
    }
    public boolean isCityHotSpot(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "227");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (w1.r(this.mEntity) == PhotoType.CITY_HOT_SPOT)? true: false;
       return b;
    }
    public boolean isCloseLive(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "197");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, n0.b);
    }
    public boolean isCollected(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, o5.b);
    }
    public boolean isCoverPrefetched(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "205");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CoverMeta.class, j1.b);
    }
    public boolean isCreatedSearchCard(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "192");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, o0.b);
    }
    public boolean isDisallowShot(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "368");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, p5.b);
    }
    public boolean isEnablePaidQuestion(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "288");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, p0.b);
    }
    public boolean isEyeMax(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "372");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-570058679).f(this.mEntity);
    }
    public boolean isFeatureToFollowGuideShow(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "392");
       if (obj == PatchProxyResult.class) {
          obj = e.i(this.mEntity, PhotoMeta.class, q5.b, Boolean.FALSE);
       }
       return obj.booleanValue();
    }
    public boolean isFeedAggregateTemplate(){
       return this.mEntity instanceof AggregateTemplateFeed;
    }
    public boolean isFemale(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "52");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, User.class, k7.b);
       }
       return obj.booleanValue();
    }
    public boolean isFindTkTemplate(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "229");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.w2(this.mEntity);
    }
    public boolean isFriendsVisibility(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, i2.b);
    }
    public boolean isFromPrePage(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, q0.b);
    }
    public boolean isFusionVideo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.y2(this.mEntity);
    }
    public boolean isHdr(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "379");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isMine()) {
          this.updateLocalFileIfAny();
       }
       return e.a(this.mEntity, VideoMeta.class, v6.b);
    }
    public boolean isHlsVideo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "371");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, VideoMeta.class, b.b);
    }
    public boolean isImageType(){
       return this.mEntity instanceof ImageFeed;
    }
    public boolean isInappropriate(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "268");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, r5.b);
    }
    public boolean isInsertedBackgroundPlayItem(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, r0.b);
    }
    public boolean isIntelligenceAlbum(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "336");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, s5.b);
    }
    public boolean isKtv(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "262");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getKaraokeInfo() != null)? true: false;
       return b;
    }
    public boolean isKtvMv(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "264");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isKtv() && this.isVideoType())? true: false;
       return b;
    }
    public boolean isKtvSong(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "263");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isKtv() && this.isImageType())? true: false;
       return b;
    }
    public boolean isLiked(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, b2.b);
    }
    public boolean isLimitVisibility(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, j2.b);
    }
    public boolean isLimitedTimeVisibility(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, k2.b);
    }
    public boolean isLiveStream(){
       return this.mEntity instanceof LiveStreamFeed;
    }
    public boolean isLocalContentAggregateWeak(){
       return this.mEntity instanceof ContentAggregateWeakFeed;
    }
    public boolean isLocalCoverAggregateType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "237");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (w1.r(this.mEntity) == PhotoType.LOCAL_COVER_AGGREGATE_FEED)? true: false;
       return b;
    }
    public boolean isLocalFunTemplateType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "236");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.V2(this.mEntity);
    }
    public boolean isLocationPermissionFeed(){
       return this.mEntity instanceof LocationPermissionFeed;
    }
    public boolean isLogEndCoveredRegion(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "355");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, CommonMeta.class, s0.b);
       }
       return obj.booleanValue();
    }
    public boolean isLogStartCoveredRegion(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "353");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, CommonMeta.class, t0.b);
       }
       return obj.booleanValue();
    }
    public boolean isLongPhotos(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "259");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, ImageMeta.class, l0.b);
    }
    public boolean isLongVideo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (e.a(this.mEntity, VideoMeta.class, h7.b)) {
          return true;
       }
       return e.a(this.mEntity, VideoMeta.class, i7.b);
    }
    public boolean isManualHideSubscribeAuthor(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "403");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, t5.b);
    }
    public boolean isMessageGroupVisibility(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isPublic() && !TextUtils.x(this.getMessageGroupId()))? true: false;
       return b;
    }
    public boolean isMine(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "271");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.b3(this.mEntity);
    }
    public boolean isMoodType(){
       QPhoto obj = PatchProxy.apply(null, this, QPhoto.class, "226");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntity;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (PhotoType.fromInt(obj.a(CommonMeta.class).mType) == PhotoType.MOOD) {
          b = true;
       }
       return b;
    }
    public boolean isMusicRadioFeed(){
       return this.mEntity instanceof MusicRadioFeed;
    }
    public boolean isNasaRecommendUser(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "234");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (w1.r(this.mEntity) == PhotoType.NASA_FEATURED_RECOMMEND_USER)? true: false;
       return b;
    }
    public boolean isNeedRetryFreeTraffic(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "314");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, CommonMeta.class, u0.b);
       }
       return obj.booleanValue();
    }
    public boolean isNeedShowGodComment(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "399");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, u5.b);
    }
    public boolean isNewLiveMode(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "312");
       if (obj == PatchProxyResult.class) {
          obj = e.i(this.mEntity, LiveStreamModel.class, x7.b, Boolean.FALSE);
       }
       return obj.booleanValue();
    }
    public boolean isNoNeedToRequestPlcEntryStyleInfo(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "217");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, PhotoMeta.class, v5.b);
       }
       return obj.booleanValue();
    }
    public boolean isNonSlideAd(){
       PhotoAdvertisementInterface obj = PatchProxy.apply(null, this, QPhoto.class, "413");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getAdvertisement();
       boolean b = (obj != null && b.a(0x188c3889).i(obj))? true: false;
       return b;
    }
    public boolean isPYMKBigCardFeed(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "233");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.k3(this.mEntity);
    }
    public boolean isPauseStatus(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, w5.b);
    }
    public boolean isPayCourse(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "369");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, VideoFeed.class, l.b);
    }
    public boolean isPending(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, c2.b);
    }
    public boolean isPlayFailed(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, x5.b);
    }
    public boolean isPlayLiving(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "199");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, LiveStreamModel.class, y7.b);
    }
    public boolean isPrefetch(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, d2.b);
    }
    public boolean isPublic(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, e2.b);
    }
    public boolean isQuestionnaire(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "273");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getQuestionnaireInfo() != null)? true: false;
       return b;
    }
    public boolean isQuickCommentShownByDelay(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "390");
       if (obj == PatchProxyResult.class) {
          obj = e.i(this.mEntity, PhotoMeta.class, y5.b, Boolean.FALSE);
       }
       return obj.booleanValue();
    }
    public boolean isRecShowed(){
       QPhoto obj = PatchProxy.apply(null, this, QPhoto.class, "194");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntity;
       return e.a(obj, CommonMeta.class, obj.b);
    }
    public boolean isRecommendUserListFeed(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "232");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.r3(this.mEntity);
    }
    public boolean isRecreationPhoto(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "343");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, z5.b);
    }
    public boolean isRedPacket(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "241");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, LiveStreamModel.class, z7.b);
    }
    public boolean isSame(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "422");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof QPhoto) {
          return this.mEntity.isSame(p0.mEntity);
       }
       if (p0 instanceof BaseFeed) {
          return this.mEntity.isSame(p0);
       }
       return false;
    }
    public boolean isSdVideoValid(){
       CDNUrl[] obj = PatchProxy.apply(null, this, QPhoto.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getSdVideoUrl();
       boolean b = (obj != null && obj.length > 0)? true: false;
       return b;
    }
    public boolean isSerialPayPhoto(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "370");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, VideoFeed.class, b8.b);
    }
    public boolean isShareCountExp(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "378");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, a6.b);
    }
    public boolean isShareToFollow(){
       ShareToFollowModel obj = PatchProxy.apply(null, this, QPhoto.class, "364");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getShareToFollowModel();
       boolean b = (obj != null && obj.mCount > null)? true: false;
       return b;
    }
    public boolean isShowFansTop(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "208");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-570058679).e(this.mEntity);
    }
    public boolean isShowFollowingIntensify(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "150");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, b6.b);
    }
    public boolean isShowed(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "190");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, w0.b);
    }
    public boolean isShowedCoinReward(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "380");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, CommonMeta.class, x0.b);
       }
       return obj.booleanValue();
    }
    public boolean isSinglePhoto(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "261");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, ImageMeta.class, o1.b);
    }
    public boolean isSocailFamilarRelation(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "295");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, CommonMeta.class, y0.b);
       }
       return obj.booleanValue();
    }
    public boolean isSpecialUsersInvisibility(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, l2.b);
    }
    public boolean isSpecialUsersVisibility(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, m2.b);
    }
    public boolean isStatusLiked(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, UserStatus.class, o7.b);
    }
    public boolean isSupportDownloadType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "240");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.isVideoType() && (!this.isSinglePhoto() && (!this.isLongPhotos() && (this.isKtvSong() || this.isAtlasPhotos()))))? true: false;
       return b;
    }
    public boolean isTagTop(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, c6.b);
    }
    public boolean isTemplate(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "228");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.x3(this.mEntity);
    }
    public boolean isTemplateGame(){
       TemplateFeed obj = PatchProxy.apply(null, this, QPhoto.class, "231");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isTemplate()) {
          return b;
       }
       obj = this.mEntity.mTemplateFeedModel;
       if (obj != null && obj.mTemplateType == 8) {
          b = true;
       }
       return b;
    }
    public boolean isTopPhoto(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "269");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, d6.b);
    }
    public boolean isUnFollowPhoto(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "344");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, User.class, n7.b);
    }
    public boolean isUnknownType(){
       return this.mEntity instanceof UnknownFeed;
    }
    public boolean isUserStatusPhoto(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "342");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, e6.b);
    }
    public boolean isVideoAndNotKtv(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "239");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isVideoType() && !this.isKtv())? true: false;
       return b;
    }
    public boolean isVideoType(){
       QPhoto obj = PatchProxy.apply(null, this, QPhoto.class, "235");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntity;
       boolean b = (obj instanceof VideoFeed || r1.d2(obj))? true: false;
       return b;
    }
    public QComment newComment(String p0,String p1,String p2,User p3){
       User obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, QPhoto.class, "242");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mEntity.a(User.class);
       QComment qComment = new QComment();
       qComment.mUser = p3;
       qComment.mPhotoId = e.h(this.mEntity, CommonMeta.class, z0.b);
       qComment.mReplyToUserId = p1;
       qComment.mReplyToCommentId = p2;
       qComment.mComment = p0;
       qComment.mCreated = System.currentTimeMillis();
       qComment.setLocalCreated(true);
       if (obj != null) {
          qComment.mPhotoUserId = obj.getId();
       }
       return qComment;
    }
    public long numberOfCollects(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "111");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.e(this.mEntity, PhotoMeta.class, f6.b);
    }
    public int numberOfComments(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, g6.b);
    }
    public int numberOfDownload(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "123");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, h6.b);
    }
    public int numberOfLike(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "108");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, z1.b);
    }
    public int numberOfLikeOnLine(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "109");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, i6.b);
    }
    public int numberOfReview(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "107");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d.T()) {
          return l.e("KEY_PHOTO_REVIEW_COUNT", 0);
       }
       return e.c(this.mEntity, PhotoMeta.class, j6.b);
    }
    public int numberOfReward(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, k6.b);
    }
    public int numberOfShare(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "122");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d.T()) {
          return l.e("KEY_PHOTO_SHARE_COUNT", 0);
       }
       return e.c(this.mEntity, PhotoMeta.class, l6.b);
    }
    public int numberOfViewers(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "112");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, m6.b);
    }
    public t observePostChange(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "367");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mSubject.hide();
    }
    public boolean recognizeAsInvalidData(){
       boolean b;
       Object[] objArray;
       Iterator obj = PatchProxy.apply(null, this, QPhoto.class, "291");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QPhoto.sInvalidFeedCheckerList.iterator();
       while (true) {
          if (obj.hasNext()) {
             QPhoto$b uob = obj.next();
             if (uob.a(this.mEntity) != null) {
                return uob.a(this.mEntity).booleanValue();
             }
             continue ;
          }else {
             b = false;
             if (!this.isLiveStream() && !this.isAd()) {
                if (r1.B2(this.mEntity)) {
                   return b;
                }else if(r1.i2(this.mEntity)){
                   return b;
                }else if(r1.i3(this.mEntity)){
                   return b;
                }else if(r1.W2(this.mEntity)){
                   return b;
                }else if(r1.a3(this.mEntity)){
                   return b;
                }else if(!r1.I2(this.mEntity) && (r1.H2(this.mEntity) || r1.J2(this.mEntity))){
                   if (w1.r(this.mEntity) == PhotoType.NEW_TILE_PIC) {
                      return b;
                   }else if(r1.a2(this.mEntity)){
                      return b;
                   }else if(r1.y3(this.mEntity)){
                      return b;
                   }else if(r1.K2(this.mEntity)){
                      return b;
                   }else if(r1.k3(this.mEntity)){
                      return b;
                   }else if(this.isPending()){
                      objArray = new Object[b];
                      c.C().w("QPhotoFilter", "photo isPending, invalid", objArray);
                      return true;
                   }else if(j.h(this.getCoverThumbnailUrls()) && TextUtils.x(this.getCoverThumbnailUrl())){
                      objArray = new Object[b];
                      c.C().w("QPhotoFilter", "photo coverThumbnailUrl is null, invalid", objArray);
                      return true;
                   }else if(this.isVideoType() && (j.h(this.getVideoUrls()) && !TextUtils.x(this.getVideoUrl()))){
                      objArray = new Object[b];
                      c.C().w("QPhotoFilter", "photo videoUrl is null, invalid", objArray);
                      return true;
                   }else if(this.isVideoType() && this.mEntity.mExtMeta == null){
                      c.a(new QPhoto$a(this));
                   }
                   if (this.isAtlasPhotos() || (this.isLongPhotos() && q.f(this.getAtlasList()))) {
                      b = true;
                      break ;
                   }
                }
             }
             break ;
          }
       }
       return b;
    }
    public String recommendHintText(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "114");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, PhotoMeta.class, n6.b);
    }
    public String recommendHintTextSourceId(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "115");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, PhotoMeta.class, o6.b);
    }
    public String recommendHintTextSourceType(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "116");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, PhotoMeta.class, p6.b);
    }
    public int recreationSetting(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, PhotoMeta.class, q6.b);
    }
    public void setActionReportFetcher(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "319")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new u(p0));
       return;
    }
    public void setAdvertisement(PhotoAdvertisementInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "218")) {
          return;
       }
       this.mEntity.d("AD", p0);
       return;
    }
    public void setAlreadyConsumed(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "402")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new s1(p0));
       return;
    }
    public void setAlreadyShowGodComment(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "398")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new t1(p0));
       return;
    }
    public void setAtMePhotoPrivacyStatus(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "121")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new j(p0));
       return;
    }
    public boolean setAuthorSubscribed(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "420");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return e.h(this.mEntity, PhotoMeta.class, new u1(p0)).booleanValue();
    }
    public void setCacheType(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "19")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new k(p0));
       return;
    }
    public String setCaption(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, CommonMeta.class, new a0(p0));
    }
    public String setCaptionTitle(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f(this.mEntity, CommonMeta.class, new b0(p0));
    }
    public QPhoto setCloseLive(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "196");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, CommonMeta.class, new c1(p0));
       return this;
    }
    public void setColor(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "223")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new i(p0));
       return;
    }
    public void setCommentPanelDynamicTabsInfo(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "384")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new x0(p0));
       return;
    }
    public void setCommentPhotoInfoSucceed(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "383")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new v1(p0));
       return;
    }
    public void setCoverPrefetched(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "206")) {
          return;
       }
       e.h(this.mEntity, CoverMeta.class, new r1(p0));
       return;
    }
    public void setCoverThumbnailUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "220")) {
          return;
       }
       e.h(this.mEntity, CoverMeta.class, new o0(p0));
       return;
    }
    public void setCoverThumbnailUrls(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "281")) {
          return;
       }
       e.h(this.mEntity, CoverMeta.class, new k2(p0));
       return;
    }
    public void setCoverUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "221")) {
          return;
       }
       e.h(this.mEntity, CoverMeta.class, new q0(p0));
       return;
    }
    public void setCoverUrls(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "282")) {
          return;
       }
       e.h(this.mEntity, CoverMeta.class, new l2(p0));
       return;
    }
    public QPhoto setCreatedSearchCard(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "193");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, CommonMeta.class, new d1(p0));
       return this;
    }
    public void setCurrentPosition(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "3")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new t(p0));
       return;
    }
    public void setDirection(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "202")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new e0(p0));
       return;
    }
    public void setEnableCommentPhotoInfoRequest(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "387")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new x1(p0));
       return;
    }
    public void setEnableV4Head(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "71")) {
          return;
       }
       e.a(this.mEntity, PhotoMeta.class, new y1(p0));
       return;
    }
    public void setExpTag(String p0){
       e.h(this.mEntity, CommonMeta.class, new c0(p0));
    }
    public void setExtraSaveProgressTime(long p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, QPhoto.class, "68")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new s(p0));
       return;
    }
    public void setFeatureToFollowGuideShow(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "391")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new z1(p0));
       return;
    }
    public void setFeedStatus(PostStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "317")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new y(p0));
       return;
    }
    public void setFeedStreamType(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "345")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new p0(p0));
       return;
    }
    public void setFilterAbnormalPhotoReason(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "309")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new l(p0));
       return;
    }
    public void setFilterStatus(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "307")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new m(p0));
       return;
    }
    public void setFreeTraffic(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "44")) {
          return;
       }
       QPhoto tmEntity = this.mEntity;
       if (tmEntity instanceof LiveStreamFeed) {
          e.h(tmEntity, QLivePlayConfig.class, new b1(p0));
       }else {
          e.h(tmEntity, CommonMeta.class, new e1(p0));
       }
       return;
    }
    public void setFusionInfo(FusionInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "83")) {
          return;
       }
       r1.U4(this.mEntity, p0);
       return;
    }
    public QPhoto setFusionSDKFetch(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "81");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getFusionInfo() != null) {
          this.getFusionInfo().isEnableSDKFetch = p0;
       }
       return this;
    }
    public void setH265VideoUrls(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "286")) {
          return;
       }
       e.h(this.mEntity, VideoMeta.class, new n2(p0));
       return;
    }
    public void setIsBackgroundPlayPhoto(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "21")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new f1(p0));
       return;
    }
    public void setIsFromPrePage(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "6")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new g1(p0));
       return;
    }
    public void setIsInsertedBackgroundPlayItem(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "8")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new h1(p0));
       return;
    }
    public void setIsNonSlideAd(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "410")) {
          return;
       }
       PhotoAdvertisementInterface advertisemen = this.getAdvertisement();
       if (advertisemen != null) {
          b.a(0x188c3889).f(advertisemen, p0);
       }
       return;
    }
    public void setIsPending(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "34")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new a2(p0));
       return;
    }
    public QPhoto setListLoadSequenceID(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "183");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e.h(this.mEntity, CommonMeta.class, new d0(p0));
       return this;
    }
    public void setLiveStreamId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "174")) {
          return;
       }
       e.h(this.mEntity, LiveStreamModel.class, new z(p0));
       return;
    }
    public void setLocalVideoUrl(CDNUrl p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "225")) {
          return;
       }
       e.h(this.mEntity, VideoMeta.class, new x(p0));
       return;
    }
    public QPhoto setLogEndCoveredRegion(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "354");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, CommonMeta.class, new i1(p0));
       return this;
    }
    public void setLogReportContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "184")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new f0(p0));
       return;
    }
    public QPhoto setLogStartCoveredRegion(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "352");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, CommonMeta.class, new j1(p0));
       return this;
    }
    public void setManualHideSubscribeAuthor(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "404")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new b2(p0));
       return;
    }
    public void setMockFeedMagicFaceRecoId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "328")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new r0(p0));
       return;
    }
    public void setMockFeedMagicFaceRecoTaskId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "330")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new s0(p0));
       return;
    }
    public void setMockFeedPostAgainText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "326")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new t0(p0));
       return;
    }
    public void setMockFeedTarget(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "321")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new n(p0));
       return;
    }
    public void setMockFeedUploadSuccessText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "324")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new u0(p0));
       return;
    }
    public void setMusic(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "74")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new w(p0));
       return;
    }
    public void setNeedRetryFreeTraffic(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "315")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new k1(p0));
       return;
    }
    public void setNeedShowGodComment(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "400")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new c2(p0));
       return;
    }
    public void setNumberOfComments(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "119")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new o(p0));
       return;
    }
    public void setNumberOfLike(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "118")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new p(p0));
       return;
    }
    public void setNumberOfShares(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "120")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new q(p0));
       return;
    }
    public void setOverrideCoverThumbnailUrls(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "284")) {
          return;
       }
       e.h(this.mEntity, CoverMeta.class, new m2(p0));
       return;
    }
    public QPhoto setPageIndex(int p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, QPhoto.class, "180");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, CommonMeta.class, new a1(p0));
       return this;
    }
    public void setPauseStatus(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "70")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new d2(p0));
       return;
    }
    public void setPlayFailed(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "28")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new e2(p0));
       return;
    }
    public QPhoto setPlayLiving(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "198");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, LiveStreamModel.class, new z0(p0));
       return this;
    }
    public void setPlcEntryStyleInfo(PlcEntryStyleInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "335")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new v(p0));
       return;
    }
    public QPhoto setPosition(int p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, QPhoto.class, "200");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       r1.g5(this.mEntity, p0);
       return this;
    }
    public void setPositionInPage(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "32")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new l1(p0));
       return;
    }
    public void setPostWorkInfoId(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "331")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new r(p0));
       return;
    }
    public void setPrefetch(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "22")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new f2(p0));
       if (p0) {
          this.setCacheType(4);
       }
       return;
    }
    public void setPrefetchReason(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "26")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new v0(p0));
       return;
    }
    public void setProductsNeedBoostFansTop(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "316")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new m1(p0));
       return;
    }
    public QPhoto setPullDownRefreshTime(int p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, QPhoto.class, "201");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       r1.h5(this.mEntity, p0);
       return this;
    }
    public void setQuickCommentShownByDelay(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "389")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new g2(p0));
       return;
    }
    public void setRealActionSubBizTag(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "346")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new g0(p0));
       return;
    }
    public QPhoto setRecShowed(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "195");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, CommonMeta.class, new n1(p0));
       return this;
    }
    public void setRecentViewers(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "408")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new y0(p0));
       return;
    }
    public void setRecoTag(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "25")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new h0(p0));
       return;
    }
    public void setSdVideoUrl(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "224")) {
          return;
       }
       e.h(this.mEntity, VideoMeta.class, new o2(p0));
       return;
    }
    public QPhoto setSearchSessionId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "189");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e.h(this.mEntity, CommonMeta.class, new i0(p0));
       return this;
    }
    public QPhoto setSearchUssid(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhoto.class, "187");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e.h(this.mEntity, CommonMeta.class, new j0(p0));
       return this;
    }
    public void setServerExpTag(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "143")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new k0(p0));
       return;
    }
    public void setShareScene(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "138")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new l0(p0));
       return;
    }
    public void setShowFlowFeedback(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "333")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new i2(p0));
       return;
    }
    public QPhoto setShowed(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "191");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, CommonMeta.class, new o1(p0));
       return this;
    }
    public void setShowedCoinReward(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "381")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new p1(p0));
       return;
    }
    public void setSource(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "35")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new w1(p0));
       return;
    }
    public void setSource(String p0){
       e.h(this.mEntity, CommonMeta.class, new m0(p0));
    }
    public void setTagTop(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "73")) {
          return;
       }
       e.h(this.mEntity, PhotoMeta.class, new j2(p0));
       return;
    }
    public void setTopFeedIndex(int p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, QPhoto.class, "337")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new h2(p0));
       return;
    }
    public void setUser(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "55")) {
          return;
       }
       this.mEntity.e(User.class, p0);
       return;
    }
    public void setVerticalShown(boolean p0){
       if (PatchProxy.isSupport(QPhoto.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QPhoto.class, "280")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new q1(p0));
       return;
    }
    public void setVideoUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "222")) {
          return;
       }
       e.h(this.mEntity, VideoMeta.class, new w0(p0));
       return;
    }
    public void setVideoUrls(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "285")) {
          return;
       }
       e.h(this.mEntity, VideoMeta.class, new p2(p0));
       return;
    }
    public boolean shouldShowBottomComponentView(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "160");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, f2.b);
    }
    public boolean shouldShowViewersPage(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "113");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, r6.b);
    }
    public boolean showCoCreateIcon(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "418");
       if (obj == PatchProxyResult.class) {
          obj = e.h(this.mEntity, PhotoMeta.class, s6.b);
       }
       return obj.booleanValue();
    }
    public void startSyncWithActivity(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "362")) {
          return;
       }
       this.mEntity.startSyncWithActivity(p0);
       return;
    }
    public void startSyncWithFragment(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "361")) {
          return;
       }
       this.mEntity.startSyncWithFragment(p0);
       return;
    }
    public void startSyncWithFragment(t p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QPhoto.class, "360")) {
          return;
       }
       this.mEntity.startSyncWithFragment(p0, p1);
       return;
    }
    public void sync(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "357")) {
          return;
       }
       this.mEntity.sync(p0.mEntity);
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "393");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "photoId: "+this.getPhotoId()+", userID: "+this.getUserId();
    }
    public void updateLocalFileIfAny(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, QPhoto.class, "394")) {
          return;
       }
       String photoId = this.getPhotoId();
       int i = 0;
       if (TextUtils.x(photoId)) {
          objArray = new Object[i];
          c.C().t("mockData", "usingLocalFileFirst: photoId is empty "+photoId, objArray);
          return;
       }else {
          VideoMeta videoMeta = this.mEntity.a(VideoMeta.class);
          if (videoMeta == null) {
             Object[] objArray1 = new Object[i];
             c.C().A("mockData", "usingLocalFileFirst: no VideoMeta", objArray1);
             return;
          }else {
             File uFile = c0.e(videoMeta);
             if (b.S(uFile)) {
                objArray = new Object[i];
                c.C().w("mockData", "usingLocalFileFirst: already is local case "+uFile.getAbsolutePath(), objArray);
                return;
             }else {
                File uFile1 = new File(b.a(-1504323719).c(".video_cache"), d4.a(photoId));
                if (!uFile1.exists()) {
                   objArray = new Object[i];
                   c.C().w("mockData", "usingLocalFileFirst: do not exist "+uFile1, objArray);
                   return;
                }else {
                   this.setLocalVideoUrl(new CDNUrl("", uFile1.getAbsolutePath()));
                   objArray = new Object[i];
                   c.C().w("mockData", "usingLocalFileFirst: set local photo id="+photoId+"localFile="+uFile1, objArray);
                   return;
                }
             }
          }
       }
    }
    public void updatePostChange(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "366")) {
          return;
       }
       QPhoto tmSubject = this.mSubject;
       if (tmSubject == null) {
          return;
       }
       tmSubject.onNext(p0);
       return;
    }
    public void updateWithServer(QPhoto p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhoto.class, "358")) {
          return;
       }
       this.sync(p0);
       BaseFeed entity = p0.getEntity();
       if (this.mEntity.getClass() != entity.getClass()) {
          return;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = e.a(entity).iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj instanceof i) {
             hashMap.put(obj.getClass(), obj);
          }
       }
       iterator = e.a(this.mEntity).iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj instanceof i) {
             Object obj1 = hashMap.get(obj.getClass());
             if (obj1 instanceof i) {
                obj.updateWithServer(obj1);
             }
          }
       }
       return;
    }
    public void updateWithServer(Object p0){
       this.updateWithServer(p0);
    }
    public boolean useLive(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "124");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, PhotoMeta.class, t6.b);
    }
    public boolean useMultiRateV2(){
       Object obj = PatchProxy.apply(null, this, QPhoto.class, "373");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.isHlsVideo() && (e.a(this.mEntity, VideoMeta.class, w6.b) && !this.isPayCourse()))? true: false;
       return b;
    }
}
