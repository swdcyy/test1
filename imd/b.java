package imd.b;
import hmd.d;
import imd.b$a;
import nsd.u;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.net.Uri;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import lnc.k1;
import mn6.a;
import android.content.Context;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import hmd.d$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo;
import jn6.c;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.sticker.RelayStickerUIData;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo$User;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import java.lang.Boolean;
import imd.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import qmd.i;
import imd.b$d;
import qmd.i$a;
import android.view.View;
import android.widget.FrameLayout;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.InteractStickerInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri$Builder;
import zf6.k;
import com.kuaishou.android.model.mix.CoverMeta;
import ekd.x0;
import java.io.File;
import qkd.b;
import xh7.b;
import qh7.b;
import qh7.a;
import brd.t;
import java.lang.UnsupportedOperationException;
import java.lang.Throwable;
import psb.e;
import psb.f;
import imd.b$b;
import ok.h;
import tl8.e;
import cjd.e;
import erd.o;
import imd.b$c;

public final class b implements d	// class@001024
{
    public final int a;
    public final BaseFeed b;
    public static final b$a c;

    static {
       b.c = new b$a(null);
    }
    public void b(BaseFeed p0){
       super();
       this.b = p0;
       this.a = 0x7f081b1b;
    }
    public void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       Uri data = p0.getData();
       if (data != null) {
          a.o(data, "intent.data ?: return");
          Object[] objArray = new Object[0];
          a.D().w("ChallengeInteractStickerViewHelperAdapter", "onIntent: photo = ["+this.b+"], data = ["+data+']', objArray);
          if (!data.isHierarchical()) {
             Object[] objArray1 = new Object[0];
             a.D().w("ChallengeInteractStickerViewHelperAdapter", "onIntent: !isHierarchical", objArray1);
             return;
          }else if(a.g(data.getQueryParameter("relayStickerAnswer"), "true")){
             String queryParamet = data.getQueryParameter("anchorId");
             k1.a(queryParamet, "ChallengeInteractStickerViewHelperAdapter", "onIntent: anchorId invalid");
             if (queryParamet != null) {
                a.o(queryParamet, "data.getQueryParameter\(S\x20\x02horId invalid\"\) ?: return\x00");
                this.e(queryParamet);
             }
          }
       }
       return;
    }
    public int b(){
       return this.a;
    }
    public void c(a p0,Context p1,InteractStickerInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "6")) {
          return;
       }
       a.p(p1, "context");
       a.p(p2, "data");
       if (!PatchProxy.applyVoidFourRefs(this, p0, p1, p2, null, d$a.class, "2")) {
          a.p(p1, "context");
          a.p(p2, "data");
       }
       return;
    }
    public InteractStickerWrapperView d(a p0,Context p1,InteractStickerInfo p2){
       String this;
       a a;
       String title;
       ChallengeStickerInfo$User userId;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       ChallengeStickerInfo$User obj3 = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ChallengeStickerInfo obj4 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "3");
       if (obj4 != patchProxyRe) {
          return obj4;
       }
       a.p(obj2, "context");
       a.p(obj3, "data");
       Object[] objArray = new Object[0];
       this = "ChallengeInteractStickerViewHelperAdapter";
       a.D().w(this, "initExpandView: helper = ["+obj1+"], context = ["+obj2+"], data = ["+obj3+']', objArray);
       obj4 = c.a(p2);
       k1.a(obj4, this, "initExpandView: illegal data");
       ChallengeStickerInfo uChallengeSt = obj4;
       e0 uoe0 = null;
       if (uChallengeSt == null) {
          return uoe0;
       }
       int i = (obj1 != null)? 2: 3;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          RelayStickerUIData relaySticker = PatchProxy.applyTwoRefs(uChallengeSt, Integer.valueOf(i), obj, uob, "4");
          if (relaySticker != patchProxyRe) {
          label_0089 :
             obj3 = relaySticker;
             InteractStickerWrapperView interactStic = new InteractStickerWrapperView(obj2, obj);
             interactStic.setRenderComplete(Boolean.FALSE);
             a = a.a;
             title = obj3.getTitle();
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(title, a, a.class, "1")) {
                a.p(title, "text");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SOLITAIRE_CHALLENGE_DIALOG";
                i3 oi3 = i3.f();
                oi3.d("text", title);
                uElementPack.params = oi3.e();
                u1.C0("", uoe0, 4, uElementPack, uoe0);
             }
             b$d uod = new b$d(this, interactStic, p0, obj3, uChallengeSt, p1);
             interactStic.addView(new i().h(obj2, obj3, v12));
             return interactStic;
          }
       }
       ArrayList uArrayList = new ArrayList();
       ChallengeStickerInfo userList = uChallengeSt.userList;
       title = "it.userId";
       if (userList != null) {
          Iterator iterator = userList.iterator();
          while (iterator.hasNext()) {
             ChallengeStickerInfo$User user = iterator.next();
             obj3 = user.userId;
             a.o(obj3, title);
             uArrayList.add(new RelayUserInfo(obj3, uoe0, user.userAvatar));
          }
       }
       userList = uChallengeSt.dynamicUser;
       if (userList != null) {
          userId = userList.userId;
          a.o(userId, title);
          uArrayList.add(new RelayUserInfo(userId, uoe0, userList.userAvatar));
       }
       ChallengeStickerInfo challengeTop = uChallengeSt.challengeTopic;
       a.o(challengeTop, "challengeTopic");
       RelayStickerUIData relaySticker1 = new RelayStickerUIData(challengeTop, uChallengeSt.joinUserCount, uArrayList, i, false, false, 0x3f733333, 0, false, 384, null);
       goto label_0089 ;
    }
    public final void e(String p0){
       InteractStickerInfo challengeId;
       CoverMeta uCoverMeta;
       Uri uri;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       char c = ']';
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("ChallengeInteractStickerViewHelperAdapter", "openParticipateInfoPage: photo = ["+this.b+"], anchorId = ["+p0+c, objArray);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       k1.a(uActivity, "ChallengeInteractStickerViewHelperAdapter", "openParticipateInfoPage: activity is null");
       if (uActivity != null) {
          b tb = this.b;
          String id = (tb != null)? tb.getId(): null;
          k1.a(id, "ChallengeInteractStickerViewHelperAdapter", "openParticipateInfoPage: photoId is null");
          if (id != null) {
             a.o(id, "photo?.id\n      .assertN\x20\x02otoId is null\"\) ?: return\x00");
             b tb1 = this.b;
             if (tb1 != null) {
                PhotoMeta photoMeta = tb1.a(PhotoMeta.class);
                if (photoMeta != null) {
                   photoMeta = photoMeta.mInteractStickerInfo;
                   if (photoMeta != null) {
                      challengeId = photoMeta.challengeId;
                   label_0078 :
                      k1.a(challengeId, "ChallengeInteractStickerViewHelperAdapter", "openParticipateInfoPage: challengeId is null");
                      if (challengeId != null) {
                         String str = (!TextUtils.x("slideFastToClose=1"))? "kwai://kds/react/bottom_sheet?bundleId=KwaiPostInteractStickerVideos&componentName=main&enableAnimation=YES&cornerRadius=16&height=0.75h&useActivity=1&keepPlaying=1&useBottomSheetV2=1&slideFastToClose=1": "kwai://kds/react/bottom_sheet?bundleId=KwaiPostInteractStickerVideos&componentName=main&enableAnimation=YES&cornerRadius=16&height=0.75h&useActivity=1&keepPlaying=1&useBottomSheetV2=1";
                         Uri$Builder uBuilder = Uri.parse(str).buildUpon();
                         uBuilder.appendQueryParameter("photoId", id);
                         Uri$Builder uBuilder1 = uBuilder;
                         uBuilder1 = uBuilder1.appendQueryParameter("challengeId", challengeId);
                         String str1 = (k.d())? "#2B2B2F": "#FFFFFF";
                         uBuilder1 = uBuilder1.appendQueryParameter("bgColor", str1);
                         if (p0 != null) {
                            uBuilder1.appendQueryParameter("anchorId", p0);
                         }
                         b tb2 = this.b;
                         if (tb2 != null) {
                            PhotoMeta photoMeta1 = tb2.a(PhotoMeta.class);
                            if (photoMeta1 != null) {
                               photoMeta1 = photoMeta1.mLocalVideoUrl;
                            label_00ca :
                               if (TextUtils.x(photoMeta1) ^ 0x01) {
                                  Object[] objArray1 = new Object[i];
                                  a.D().w("ChallengeInteractStickerViewHelperAdapter", "openParticipateInfoPage: is in mock feed now", objArray1);
                                  uBuilder1.appendQueryParameter("isMock", "true");
                                  tb2 = this.b;
                                  str1 = "";
                                  if (tb2 != null) {
                                     uCoverMeta = tb2.a(CoverMeta.class);
                                     if (uCoverMeta != null) {
                                        uCoverMeta = uCoverMeta.getCoverUrl();
                                        if (uCoverMeta != null) {
                                        label_00fc :
                                           uri = x0.f(uCoverMeta);
                                           if (uri != null) {
                                              uri = uri.getPath();
                                              if (uri != null) {
                                                 str1 = uri;
                                              }
                                           }
                                           a.o(str1, "SafetyUriUtil.parseUriFr\x20\x02verUrl ?: \"\"\)?.path ?: \"\"\x00");
                                           Object[] objArray2 = new Object[i];
                                           a.D().w("ChallengeInteractStickerViewHelperAdapter", "openParticipateInfoPage: mock cover path = "+str1, objArray2);
                                           if (b.S(new File(str1))) {
                                              uBuilder1.appendQueryParameter("photoCoverPath", str1);
                                           }
                                        }
                                     }
                                  }
                                  uCoverMeta = str1;
                                  goto label_00fc ;
                               }
                               uri = uBuilder1.build();
                               Object[] objArray3 = new Object[i];
                               a.D().w("ChallengeInteractStickerViewHelperAdapter", "openParticipateInfoPage: uri = ["+uri+c, objArray3);
                               a.b(new b(uActivity, uri.toString()), null);
                            }
                         }
                         tb2 = null;
                         goto label_00ca ;
                      }
                   }
                }
             }
             challengeId = null;
             goto label_0078 ;
          }
       }
    label_0165 :
       return;
    }
    public t getData(){
       t ot;
       StringBuilder obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "getData: photo = ["+this.b+']';
       if (this.b == null) {
          ot = t.error(new UnsupportedOperationException());
          a.o(ot, "Observable.error\(UnsupportedOperationException\(\)\)");
          return ot;
       }else {
          ot = f.a().d(3, this.b.getId(), e.f(this.b, PhotoMeta.class, b$b.b)).map(new e()).map(b$c.b);
          a.o(ot, "EditApiServiceManager.ge¡­ractStickerInfo\(\)\n      }");
          return ot;
       }
    }
    public void release(){
       PatchProxy.applyVoid(null, this, b.class, "7");
    }
}
