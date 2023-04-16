package com.kwai.component.photo.detail.core.log.PhotoDetailLoggerEveHelper;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerEveHelper$expTagRegex$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.sdk.eve.proto.PlayEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.k2;
import k2b.u1;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import kotlin.text.Regex;
import java.lang.CharSequence;
import zsd.k;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import v40.a;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.proto.PlayEvent$Builder;
import wd5.k;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.CommonMeta;
import zp.a0;
import v40.b;
import com.kwai.sdk.eve.proto.HetuTag;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.eve.kit.api.Constants;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;

public final class PhotoDetailLoggerEveHelper	// class@000a28
{
    public static final p a;
    public static final PhotoDetailLoggerEveHelper b;

    static {
       PhotoDetailLoggerEveHelper.b = new PhotoDetailLoggerEveHelper();
       PhotoDetailLoggerEveHelper.a = s.c(PhotoDetailLoggerEveHelper$expTagRegex$2.INSTANCE);
    }
    public void PhotoDetailLoggerEveHelper(){
       super();
    }
    public final PlayEvent a(PhotoDetailLogger p0,QPhoto p1){
       boolean b;
       ContentType lIVE;
       String str4;
       String str5;
       Object obj = this;
       User obj1 = p0;
       Object obj2 = p1;
       PhotoDetailLoggerEveHelper photoDetailL = PhotoDetailLoggerEveHelper.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, photoDetailL, "3");
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       a.p(obj2, "photo");
       obj3 = null;
       if (obj1 != null) {
          ClientEvent$UrlPackage urlPackage = p0.getUrlPackage();
          if (urlPackage != null) {
             urlPackage = urlPackage.page2;
             if (urlPackage != null) {
             label_0032 :
                String str = "UNKNOWN2";
                if (urlPackage == null) {
                   str5 = str;
                }
                if (obj1 != null) {
                   ClientEvent$UrlPackage referUrlPack = p0.getReferUrlPackage();
                   if (referUrlPack != null) {
                      referUrlPack = referUrlPack.page2;
                      if (referUrlPack != null) {
                      label_004f :
                         if (referUrlPack == null) {
                            str4 = str;
                         }
                         if (obj1 != null) {
                            ClientEvent$UrlPackage urlPackage1 = p0.getUrlPackage();
                            if (urlPackage1 != null) {
                               urlPackage1 = urlPackage1.topPage;
                               if (urlPackage1 != null) {
                               label_0061 :
                                  Regex regex = PatchProxy.apply(obj3, obj, photoDetailL, "2");
                                  if (regex == patchProxyRe) {
                                     regex = PhotoDetailLoggerEveHelper.a.getValue();
                                  }
                                  int i = 0;
                                  if (regex != null) {
                                     String expTag = p1.getExpTag();
                                     a.o(expTag, "photo.expTag");
                                     k ok = Regex.find$default(regex, expTag, i, 2, obj3);
                                     if (ok != null) {
                                        expTag = ok.getValue();
                                        if (expTag != null) {
                                           String[] stringArray = new String[]{"_"};
                                           List list = StringsKt__StringsKt.H4(expTag, stringArray, false, 0, 6, null);
                                           if (list != null) {
                                              String str1 = CollectionsKt___CollectionsKt.e3(list);
                                              if (str1 != null) {
                                                 str = str1;
                                              }
                                           }
                                        }
                                     }
                                  }
                                  a.a.b("PlayEvent: "+urlPackage+", "+referUrlPack+", "+urlPackage1+", "+str);
                                  PlayEvent$Builder uBuilder = PlayEvent.newBuilder();
                                  uBuilder.setContentId(p1.getPhotoId());
                                  ContentType uContentType = PatchProxy.applyOneRefs(obj2, obj3, k.class, "1");
                                  if (uContentType != patchProxyRe) {
                                  }else if(p1.isLiveStream()){
                                     lIVE = ContentType.LIVE;
                                  }else if(p1.isVideoType()){
                                     lIVE = ContentType.PHOTO;
                                  }else {
                                     lIVE = ContentType.UNKNOWN1;
                                  }
                                  uContentType = lIVE;
                                  uBuilder.setContentType(uContentType);
                                  String userId = p1.getUserId();
                                  String str2 = "";
                                  if (userId == null) {
                                     userId = str2;
                                  }
                                  uBuilder.setAuthorId(userId);
                                  userId = p1.getExpTag();
                                  if (userId == null) {
                                     userId = str2;
                                  }
                                  uBuilder.setExpTag(userId);
                                  userId = p1.getListLoadSequenceID();
                                  if (userId != null) {
                                     str2 = userId;
                                  }
                                  uBuilder.setLlsid(str2);
                                  uBuilder.setPage(urlPackage);
                                  uBuilder.setReferPage(referUrlPack);
                                  uBuilder.setTopPage(urlPackage1);
                                  uBuilder.setPhotoRecoSource(str);
                                  if (obj1 != null) {
                                     uBuilder.setTimestamp(p0.getEnterTime());
                                     uBuilder.setTotalDurationMs(p0.getDuration());
                                     uBuilder.setPlayedDurationMs(p0.getActualPlayDuration());
                                     uBuilder.setPrepareDurationMs(p0.getPrepareTimeMs());
                                     uBuilder.setCommentStayDurationMs(p0.getCommentStayDuration());
                                     uBuilder.setEnterProfileCount(p0.getEntryAuthorProfileCnt());
                                     uBuilder.setClickPauseCount(p0.getClickPauseCnt());
                                     b = (p0.isClickTakeSameFrame() || p0.isClickTakeSameStyle())? true: false;
                                     uBuilder.setHudongStatus(b);
                                     if (p0.isClickAddBlacklist() || p0.isClickNegativePhoto()) {
                                        i = true;
                                     }
                                     uBuilder.setHateStatus(i);
                                     uBuilder.setDownloadStatus(p0.isClickDownload());
                                     uBuilder.setLandscapeStatus(p0.isHorizontalScreenPlay());
                                     uBuilder.setPlaySoundVolume(p0.getPlaySoundVolume());
                                     uBuilder.setAfkPlayedDurationMs(p0.getAFKPlayedDuration());
                                     uBuilder.setBufferDuration(p0.getEveBufferDuration());
                                     uBuilder.setStalledCount(p0.getEveStalledCount());
                                  }
                                  uBuilder.setFavStatus(p1.isCollected());
                                  uBuilder.setLikeStatus(p1.isLiked());
                                  obj1 = p1.getUser();
                                  a.o(obj1, "photo.user");
                                  uBuilder.setFollowStatus(obj1.isFollowingOrFollowRequesting());
                                  CommonMeta commonMeta = p1.getCommonMeta();
                                  if (commonMeta != null) {
                                     a.o(commonMeta, "it");
                                     uBuilder.setForwardStatus(commonMeta.getRankFeatures().h);
                                     uBuilder.setLiveWatchStatusValue(commonMeta.getRankFeatures().k);
                                     uBuilder.setEnterSideSlideStatus(commonMeta.getRankFeatures().m);
                                     uBuilder.setCommentStatus(commonMeta.getRankFeatures().n);
                                  }
                                  uBuilder.setHetuTag(b.a.a(obj2));
                                  GeneratedMessageLite generatedMes = uBuilder.build();
                                  a.o(generatedMes, "PlayEvent.newBuilder\(\).a¡­\(photo\)\n        }.build\(\)");
                                  return generatedMes;
                               }
                            }
                         }
                         String str3 = str;
                         goto label_0061 ;
                      }
                   }
                }
                k2 ok2 = u1.n();
                if (ok2 != null) {
                   ok2 = ok2.d;
                   goto label_004f ;
                }else {
                   str4 = obj3;
                   goto label_004f ;
                }
             }
          }
       }
       k2 ok21 = u1.j();
       if (ok21 != null) {
          ok21 = ok21.d;
          goto label_0032 ;
       }else {
          str5 = obj3;
          goto label_0032 ;
       }
    }
    public final void b(PhotoDetailLogger p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoDetailLoggerEveHelper.class, "1")) {
          return;
       }
       a.p(p1, "photo");
       if (!Constants.a()) {
          return;
       }
       EveManagerWrapper.e.n(this.a(p0, p1));
       return;
    }
}
